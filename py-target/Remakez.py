# Generated from Simple.g4 by ANTLR 4.11.1
from antlr4 import *
import itertools
import random
from copy import copy
if __name__ is not None and "." in __name__:
    from .SimpleParser import SimpleParser
    from .SimpleVisitor import SimpleVisitor
else:
    from SimpleParser import SimpleParser
    from SimpleVisitor import SimpleVisitor

# This class defines a complete generic visitor for a parse tree produced by SimpleParser.


class Block():

    def __init__(self, blockId, endofblock):
        self.endofblock = endofblock
        self.blockId = blockId
        self.posx=0
        self.posy=0

    def getBlockId(self):
        return self.blockId

    def isBlockEnd(self):
        return self.endofblock

    def makeString(self):
        if self.endofblock == True:
            return f'#X restore {self.posx} {self.posy} pd {self.blockId};\r\n'
        else:
            return f'#N canvas 697 62 450 300 {self.blockId} 0;\r\n'

    def setPos(self,x,y):
        self.posx=x
        self.posy=y


class Connection():

    def __init__(self, source, outlet, sink, inlet, scope):
        self.source = source
        self.outlet = outlet
        self.sink = sink
        self.inlet = inlet
        self.scope = scope

    def getSource(self):
        return self.source

    def getSink(self):
        return self.sink

    def getScope(self):
        return self.scope

    def setScope(self, scope):
        elf.scope = scope

    def makeString(self):
        return f'#X connect {self.source} {self.outlet} {self.sink} {self.inlet};\r\n'

class MultipleConn():

    def __init__(self, scope):
        self.connectednodes = []
        self.connectionscope = scope

    def getScope(self):
        return self.connectionscope

    def setScope(self, scope):
        self.connectionscope = scope

    def addNode(self, nodeId):
        self.connectednodes.append(nodeId)

    def addSeparator(self):
        self.connectednodes.append('|')

    def getConnections(self):
        parts = self.splitlist(self.connectednodes)
        return parts

    def splitlist(self, nodelist):
        if nodelist[0]=='|':
            nodelist = nodelist[1:]
        sep = '|'
        parts = [list(y) for x,y in itertools.groupby(nodelist, lambda z: z == sep) if not x]
        return parts

    def makeString(self):
        parts = self.splitlist(self.connectednodes)
        line = ''

        for c in range(len(parts)-1):
            p1, p2 = parts[c], parts[c+1]
            for source in p1:
                for sink in p2:
                    line += f'#X connect {source} 0 {sink} 0;\r\n'
        return line
        

class Node():

    variablenames = {}  # { scope1: [], scope2: [], ...}

    def __init__(self, index):
        self.index = index
        self.name = None
        self.nodetype = None
        self.args = []
        self.objtype = ''
        self.posx = 0
        self.posy = 0
        self.nodesIn = [] #list of sources connected to this node if node is sink
        self.scope = None

    #returns full node attributes
    def getNodeSpec(self):
        nodespec = {'id':self.index, 'name':self.name, 'nt':self.nodetype, 'args':self.args,
                    'objspec':self.objtype, 'x':self.posx, 'y':self.posy, 'scope':self.scope}
        return nodespec

    #set node name
    def setName(self, name):
        if name in self.variablenames[self.scope]:
            raise Exception(f'you cant use this name <{name}> again, use your imagination!')
        self.variablenames[self.scope].append(name)
        self.name = name

    #set object specific type; check if it exists in basic obj types first
    def setObjType(self, objtype):
        types = open('basicnodes.txt', 'r') 
        if objtype not in types.read():
            raise Exception(f'This object type <{objtype}> does not esist')
        self.objtype = objtype

    #set node type among general or objectt specific
    def setNodeType(self, nt):
        if nt.startswith('\\'):
            self.nodetype = 'obj'
            self.setObjType(nt[1:])
        else:
            self.nodetype = nt

    #set arguments
    def setArg(self, arg):
        self.args.append(arg)

    #def setScope
    def setScope(self, scope):
        self.scope = scope
        if scope not in self.variablenames:
            self.variablenames.update({scope: []})

    def setIndex(self, index):
        self.index = index

    def setPos(self, x, y):
        if y>self.posy:
            self.posy=y
        elif self.posy==0:
            self.posy=y

        if self.posx==0:
            self.posx=x

    def forcePos(self,x,y):
        self.posx=x
        self.posy=y

    def getName(self):
        return self.name

    def getPos(self):
        return self.posx, self.posy

    def getPosx(self):
        return self.posx
    
    def getPosy(self):
        return self.posy
    
    def getScope(self):
        return self.scope

    def getIndex(self):
        return self.index

    def setSource(self, node):
        self.nodesIn.append(node)

    def getSourceY(self):
        trace=0
        for n in self.nodesIn:
            if n.getPosy()>trace:
                trace=n.getPosy()
        return trace

    def getNodeString(self):
        if self.nodetype == 'floatatom':
            return f'#X {self.nodetype} {self.posx} {self.posy} 5 0 0 0 - - - 0'
        return f'#X {self.nodetype} {self.posx} {self.posy} {self.objtype} {[x for x in self.args]}'


class Remake(SimpleVisitor):

    def __init__(self):
        #variable storing declarations' count
        self.nodeIndex = -1
        self.generalNodeIndex = -1
        #memory is a list of Node() and Block()
        self.memory = [] 

        self.currscope = 'general'
        #self.connections is a list of Connection() and MultipleConn()
        self.connections = []
        self.parent = None

    #returns name of output file
    def getPatchName(self):
        return self.patch

    def setParent(self, node):
        self.parent = node

    def getParent(self):
        return self.parent

    def getImplicitId(self, nodeName):
        notfound = True
        for node in self.memory:
            try:
                if (node.getName() == nodeName) and (node.getScope() == self.currscope):
                    notfound = False
                    return node.getIndex()
            except:
                continue         
        if notfound == True:
            raise Exception (f'node <{nodeName}> does not exist')

    def getNodeFromId(self, nodeId):
        notfound = True
        for node in self.memory:
            try:
                if node.getIndex() == nodeId:
                    notfound = False
                    return node
            except:
                continue
        if notfound == True:
            raise Exception ('something\'s wrong I can feel it')

        
    # Visit a parse tree produced by SimpleParser#prog.
    def visitProg(self, ctx:SimpleParser.ProgContext):
        patch = ctx.ID().getText()
        self.patch = patch
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#blockstmt.
    def visitBlockstmt(self, ctx:SimpleParser.BlockstmtContext):
        self.generalNodeIndex = self.nodeIndex+1
        self.nodeIndex = -1
        blockId = ctx.ID().getText()
        self.currscope = blockId
        self.memory.append(Block(self.currscope, False))
        return self.visitChildren(ctx)

    # Visit a parse tree produced by SimpleParser#endofblock.
    def visitEndofblock(self, ctx:SimpleParser.EndofblockContext):
        self.nodeIndex = self.generalNodeIndex
        self.memory.append(Block(self.currscope, True))
        self.currscope = 'general'
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#stmt.
    def visitStmt(self, ctx:SimpleParser.StmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#FullDeclStmt.
    def visitFullDeclStmt(self, ctx:SimpleParser.FullDeclStmtContext):
        self.nodeIndex += 1
        self.memory.append(Node(self.nodeIndex))
        
        name = ctx.ID().getText()
        nt = ctx.NODETYPE().getText()
        
        self.memory[-1].setScope(self.currscope)
        self.memory[-1].setName(name)
        self.memory[-1].setNodeType(nt)

        self.setParent(self.nodeIndex) 

        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#FastDeclStmt.
    def visitFastDeclStmt(self, ctx:SimpleParser.FastDeclStmtContext):
        self.nodeIndex += 1
        self.memory.append(Node(self.nodeIndex))

        self.memory[-1].setScope(self.currscope)
        
        nt = ctx.NODETYPE().getText()
        self.memory[-1].setNodeType(nt)

        self.setParent(self.nodeIndex) 
        
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#OpDeclStmt.
    def visitOpDeclStmt(self, ctx:SimpleParser.OpDeclStmtContext):
        self.nodeIndex += 1
        self.memory.append(Node(self.nodeIndex))

        name = ctx.ID().getText()

        self.memory[-1].setScope(self.currscope)
        self.memory[-1].setName(name)
        self.memory[-1].setNodeType('obj')

        self.setParent(self.nodeIndex) 
            
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#parameters.
    def visitParameters(self, ctx:SimpleParser.ParametersContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#typedargslist.
    def visitTypedargslist(self, ctx:SimpleParser.TypedargslistContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#arg.
    def visitArg(self, ctx:SimpleParser.ArgContext):
        arg = None
        if ctx.SYMBOL():
            arg = ctx.SYMBOL().getText()
            try:
                self.memory[-1].setArg(arg)
            except:
                pass
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#operation.
    def visitOperation(self, ctx:SimpleParser.OperationContext):
        op = None
        if ctx.STAR(): op = '*'
        elif ctx.SIGSTAR(): op = '*~'
        elif ctx.DIV(): op = '/'
        elif ctx.SIGDIV(): op = '/~'
        elif ctx.PLUS(): op = '+'
        elif ctx.SIGPLUS(): op = '+~'
        elif ctx.MINUS(): op = '-'
        elif ctx.SIGMINUS(): op = '-~'

        if op:
            self.memory[-1].setArg(op)
            
        if ctx.NUMBER():
            self.memory[-1].setArg(ctx.NUMBER().getText())
        
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#ioletbase.
    def visitIoletbase(self, ctx:SimpleParser.IoletbaseContext):

        #calcolo dell'inlet/outlet
        outlet = False
        iolet = str(ctx.INOUTID())
        if '-' in iolet:
            outlet = True
        iolet = int(iolet[-1])-1

        #case 1: new node declaration
        # INOUTID = NODETYPE parameters | operation
        if not ctx.ID():
            self.nodeIndex += 1
            self.memory.append(Node(self.nodeIndex))
            self.memory[-1].setScope(self.currscope)
            if ctx.NODETYPE():
                nt = ctx.NODETYPE().getText()
                self.memory[-1].setNodeType(nt)
            elif ctx.operation():
                self.memory[-1].setNodeType('obj')

            if outlet is False:
                source = self.nodeIndex
                sink = self.getParent()
                 #node = self.getNodeFromId(source)
                 #node.setNodeOut(sink)
                self.connections.append(Connection(source, 0, sink, iolet, self.currscope))

            else:
                source = self.getParent()
                sink = self.nodeIndex
                #node = self.getNodeFromId(source)
                #node.setNodeOut(sink)
                self.connections.append(Connection(source, iolet, sink, 0, self.currscope))


        #case 2: connecting to an existing node
        # INOUTID = ID 
        if ctx.ID():
            name = ctx.ID().getText()
            if outlet is False:
                source = self.getImplicitId(name)
                sink = self.getParent()
                self.connections.append(Connection(source, 0, sink, iolet, self.currscope))

            else:
                source = self.getParent()
                sink = self.getImplicitId(name)
                self.connections.append(Connection(source, iolet, sink, 0, self.currscope))
     
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#ioletdeclstmt.
    def visitIoletdeclstmt(self, ctx:SimpleParser.IoletdeclstmtContext):
        #case 1: ID.ioletbase
        if ctx.ID():
            name = ctx.ID().getText()
            parentId = self.getImplicitId(name)
            self.setParent(parentId)

        #case 2: NODETYPE parameters . ioletbase
        else:
            self.nodeIndex += 1
            self.memory.append(Node(self.nodeIndex))
            self.memory[-1].setScope(self.currscope)

            nt = ctx.NODETYPE().getText()
            self.memory[-1].setNodeType(nt)
        
            self.setParent(self.nodeIndex)    
        
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#connectionstmt.
    def visitConnectionstmt(self, ctx:SimpleParser.ConnectionstmtContext):
        line = ctx.getText()
        if line:
            self.connections.append(MultipleConn(self.currscope))
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#FullDeclStmtInside.
    def visitFullDeclStmtInside(self, ctx:SimpleParser.FullDeclStmtInsideContext):
        #praticamente lo stesso codice di visitFullDeclStmt, ma con self.addToParentList(self.nodeIndex)
        self.nodeIndex += 1
        self.memory.append(Node(self.nodeIndex))
        
        name = ctx.ID().getText()
        nt = ctx.NODETYPE().getText()

        self.memory[-1].setScope(self.currscope)
        self.memory[-1].setName(name)
        self.memory[-1].setNodeType(nt)

        self.connections[-1].addNode(self.nodeIndex)

        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#FastDeclStmtInside.
    def visitFastDeclStmtInside(self, ctx:SimpleParser.FastDeclStmtInsideContext):
        self.nodeIndex += 1
        self.memory.append(Node(self.nodeIndex))

        nt = ctx.NODETYPE().getText()

        self.memory[-1].setScope(self.currscope)
        self.memory[-1].setNodeType(nt)

        self.connections[-1].addNode(self.nodeIndex)
        
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#OpDeclStmtInside.
    def visitOpDeclStmtInside(self, ctx:SimpleParser.OpDeclStmtInsideContext):
        self.nodeIndex += 1
        self.memory.append(Node(self.nodeIndex))
        
        name = ctx.ID().getText()
        
        self.memory[-1].setScope(self.currscope)
        self.memory[-1].setName(name)
        self.memory[-1].setNodeType('obj')

        self.connections[-1].addNode(self.nodeIndex)
        
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#connectionelem.
    def visitConnectionelem(self, ctx:SimpleParser.ConnectionelemContext):
        self.connections[-1].addSeparator()
        #catch nodes already declared
        for node in ctx.ID():
            name = node.getText()
            parent = self.getImplicitId(name)
            self.connections[-1].addNode(parent)
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#recallstmt.
    def visitRecallstmt(self, ctx:SimpleParser.RecallstmtContext):
        self.generalNodeIndex = self.nodeIndex+1
        self.nodeIndex = -1
        src=ctx.ID(0).getText()
        target=ctx.ID(1).getText()
        self.currscope=target
        self.memory.append(Block(self.currscope, False))

        #update memory
        for n in self.memory:
            if type(n)!=Node:
                continue
            if n.getScope()==src:
                newn = copy(n)
                self.nodeIndex+=1
                self.memory.append(newn)
                self.memory[-1].setIndex(self.nodeIndex)
                self.memory[-1].setScope(self.currscope)

        #update connections
        for conn in self.connections:
            if conn.getScope()==src:
                newconn = copy(conn)
                newconn.setScope(self.currscope)
                self.connections.append(newconn)
                
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#ifstmt.
    def visitIfstmt(self, ctx:SimpleParser.IfstmtContext):
        if self.visit(ctx.expr(0))==True:
            return self.visitSuite(ctx)
        else:
            pass
        #return self.visitChildren(ctx)
        
        


    # Visit a parse tree produced by SimpleParser#forstmt.
    def visitForstmt(self, ctx:SimpleParser.ForstmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#suite.
    def visitSuite(self, ctx:SimpleParser.SuiteContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#number.
    def visitNumber(self, ctx:SimpleParser.NumberContext):
        n= ctx.NUMBER().getText()
        n=int(n)
        return n


    # Visit a parse tree produced by SimpleParser#ParensExpr.
    def visitParensExpr(self, ctx:SimpleParser.ParensExprContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by SimpleParser#MathExpr.
    def visitMathExpr(self, ctx:SimpleParser.MathExprContext):
        left=self.visit(ctx.expr(0))
        right=self.visit(ctx.expr(1))
        
        if ctx.op.text == '+':
            self.res=int(left)+int(right)
        elif ctx.op.text == '-':
            self.res=int(left)-int(right)
        elif ctx.op.text == '*':
            self.res=int(left)*int(right)
        elif ctx.op.text == '/':
            self.res=int(left)/int(right)
        elif ctx.op.text == '%':
            self.res=int(left)%int(right)

        return self.res


    # Visit a parse tree produced by SimpleParser#TestExpr.
    def visitTestExpr(self, ctx:SimpleParser.TestExprContext):
        left = self.visit(ctx.expr(0))
        right = self.visit(ctx.expr(1))

        if ctx.testop.text == '==':
            if int(left)==int(right):
                self.eval=True
            else:
                self.eval=False
        elif ctx.testop.text == '!=':
            if int(left)!=int(right):
                self.eval=True
            else:
                self.eval=False
        elif ctx.testop.text == '>':
            if int(left)>int(right):
                self.eval=True
            else:
                self.eval=False
        elif ctx.testop.text == '>=':
            if int(left)>=int(right):
                self.eval=True
            else:
                self.eval=False
        elif ctx.testop.text == '<=':
            if int(left)<=int(right):
                self.eval=True
            else:
                self.eval=False
        elif ctx.testop.text == '<':
            if int(left)<int(right):
                self.eval=True
            else:
                self.eval=False
        
        return self.eval



del SimpleParser
