from antlr4 import *
import itertools
import random
from copy import copy
if __name__ is not None and "." in __name__:
    from .PdlangParser import PdlangParser
    from .PdlangVisitor import PdlangVisitor
else:
    from PdlangParser import PdlangParser
    from PdlangVisitor import PdlangVisitor

class Block():

    """
    This class implements a block for puredata.
    """

    def __init__(self, blockId, endofblock):
        self.endofblock = endofblock
        self.blockId = blockId
        self.posx=0
        self.posy=0

    def getBlockId(self) -> str: 
        """returns block id"""
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

    def getPos(self):
        return self.posx, self.posy


class Connection():

    """
    This class implements a single connection for puredata.
    """

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

    """
    This class implements a series of connection for puredata.
    """

    def __init__(self, scope):
        self.connectednodes = [] #costruita in questo modo: id1 id2 | id3 | id4 id5 ... sono nodi connessi
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

    """
    This class implements a node declaration for puredata.
    """

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
        if name in self.variablenames[self.scope]: #controllo dei duplicati
            raise Exception(f'you cant use this name <{name}> again, use your imagination!')
        self.variablenames[self.scope].append(name)
        self.name = name

    #set object specific type; check if it exists in basic obj types first
    def setObjType(self, objtype):
        types = open('utils/basicnodes.txt', 'r') 
        if objtype not in types.read(): #controllo basilare, sicuramente da upgradare
            raise Exception(f'This object type <{objtype}> does not esist')
        self.objtype = objtype

    #set node type among general or objectt specific
    def setNodeType(self, nt):
        if nt.startswith('\\'):
            self.nodetype = 'obj'
            self.setObjType(nt[1:])
        else:
            self.nodetype = nt

    def setArg(self, arg):
        self.args.append(arg)

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

    def setSource(self, node):
        self.nodesIn.append(node)

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

    def getSourceY(self):
        """
        returns y pos of nodesource with max y (=0 if node is not connected to any source)
        """ 
        trace=0
        for n in self.nodesIn:
            if n.getPosy()>trace:
                trace=n.getPosy()
        return trace

    def getNodeString(self):
        """
        returns a node declaration string in the format of pd files
        """
        if self.nodetype == 'floatatom':
            return f'#X {self.nodetype} {self.posx} {self.posy} 5 0 0 0 - - - 0'
        return f'#X {self.nodetype} {self.posx} {self.posy} {self.objtype} {[x for x in self.args]}'


class CustomVisitor(PdlangVisitor):

    """
    This class extends automatically generated module Pdlang Visitor.
    """

    def __init__(self):
        self.nodeIndex = -1 #variable storing nodes count, resets when inside a new block
        self.generalNodeIndex = -1 #variable stornig nodes count inside main patch (scope:general)
        self.memory = [] #memory is a list of Node() and Block()

        self.currscope = 'general' 
        
        self.connections = [] #self.connections is a list of Connection() and MultipleConn()
        self.parent = None #temporarily stores source node for a sink

        self.breakthis = False #flag for break stmt
        self.continuethis = False #flag for continue stmt
        self.passthis = False #flag for pass stmt
        

    #############################
    #getter and setter methods
    #############################

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
            except AttributeError:
                continue #continues bc node found was a block() instance  
        if notfound == True:
            raise Exception (f'node <{nodeName}> does not exist')

    def getNodeFromId(self, nodeId:str):
        notfound = True
        for node in self.memory:
            try:
                if node.getIndex() == nodeId:
                    notfound = False
                    return node
            except AttributeError:
                continue
        if notfound == True:
            raise Exception ('something\'s wrong I can feel it')


    #############################
    #visit methods
    #############################
        
    # Visit a parse tree produced by PdlangParser#prog.
    def visitProg(self, ctx:PdlangParser.ProgContext):
        patch = ctx.ID().getText()
        self.patch = patch
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdlangParser#blockstmt.
    def visitBlockstmt(self, ctx:PdlangParser.BlockstmtContext):
        self.generalNodeIndex = self.nodeIndex+1 #general nodeIndex is augmented by 1 bc a block itself has index in pd
        self.nodeIndex = -1 #each time a new block is declared, nodeIndex resets
        blockId = ctx.ID().getText()
        self.currscope = blockId
        self.memory.append(Block(self.currscope, False))
        return self.visitChildren(ctx)

    # Visit a parse tree produced by PdlangParser#endofblock.
    def visitEndofblock(self, ctx:PdlangParser.EndofblockContext):
        self.nodeIndex = self.generalNodeIndex #each time a block is left, nodeIndex is set to generalNodeIndex
        self.memory.append(Block(self.currscope, True))
        self.currscope = 'general'
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdlangParser#stmt.
    def visitStmt(self, ctx:PdlangParser.StmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdlangParser#FullDeclStmt.
    def visitFullDeclStmt(self, ctx:PdlangParser.FullDeclStmtContext):
        """
        rule: ID '=' (NODETYPE parameters) 
        """
        self.nodeIndex += 1
        self.memory.append(Node(self.nodeIndex))
        
        name = ctx.ID().getText()
        nt = ctx.NODETYPE().getText()
        
        self.memory[-1].setScope(self.currscope)
        self.memory[-1].setName(name)
        self.memory[-1].setNodeType(nt)

        self.setParent(self.nodeIndex) 

        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdlangParser#FastDeclStmt.
    def visitFastDeclStmt(self, ctx:PdlangParser.FastDeclStmtContext):
        """
        rule: NODETYPE parameters
        """
        self.nodeIndex += 1
        self.memory.append(Node(self.nodeIndex))

        self.memory[-1].setScope(self.currscope)
        
        nt = ctx.NODETYPE().getText()
        self.memory[-1].setNodeType(nt)

        self.setParent(self.nodeIndex) 
        
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdlangParser#OpDeclStmt.
    def visitOpDeclStmt(self, ctx:PdlangParser.OpDeclStmtContext):
        """
        rule: ID '=' operation
        """
        self.nodeIndex += 1
        self.memory.append(Node(self.nodeIndex))

        name = ctx.ID().getText()

        self.memory[-1].setScope(self.currscope)
        self.memory[-1].setName(name)
        self.memory[-1].setNodeType('obj') #nodetype is automatically set to obj

        self.setParent(self.nodeIndex) 
            
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdlangParser#parameters.
    def visitParameters(self, ctx:PdlangParser.ParametersContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdlangParser#typedargslist.
    def visitTypedargslist(self, ctx:PdlangParser.TypedargslistContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdlangParser#arg.
    def visitArg(self, ctx:PdlangParser.ArgContext):
        arg = None
        if ctx.SYMBOL():
            arg = ctx.SYMBOL().getText()
            try:
                self.memory[-1].setArg(arg)
            except AttributeError:
                pass
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdlangParser#operation.
    def visitOperation(self, ctx:PdlangParser.OperationContext):
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


    # Visit a parse tree produced by PdlangParser#ioletbase.
    def visitIoletbase(self, ctx:PdlangParser.IoletbaseContext):
        """
        rule: ioletbase (only appears indise ioletdeclstmt)
        """

        #calcolo dell'inlet/outlet
        outlet = False
        iolet = str(ctx.INOUTID())
        if '-' in iolet:
            outlet = True
        iolet = int(iolet[-1])-1

        #case 1: new node declaration (connecting to a brand new node)
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
                self.connections.append(Connection(source, 0, sink, iolet, self.currscope))

            else:
                source = self.getParent()
                sink = self.nodeIndex
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


    # Visit a parse tree produced by PdlangParser#ioletdeclstmt.
    def visitIoletdeclstmt(self, ctx:PdlangParser.IoletdeclstmtContext):
        """
        rule: ID '.' ioletbase | NODETYPE parameters '.' ioletbase
        """
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


    # Visit a parse tree produced by PdlangParser#connectionstmt.
    def visitConnectionstmt(self, ctx:PdlangParser.ConnectionstmtContext):
        """
        rule: connectionelem (CONNECT connectionelem)+
        """
        line = ctx.getText()
        if line:
            self.connections.append(MultipleConn(self.currscope))
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdlangParser#FullDeclStmtInside.
    def visitFullDeclStmtInside(self, ctx:PdlangParser.FullDeclStmtInsideContext):
        """
        rule: ID '=' (NODETYPE parameters) #FullDeclStmtInside 
        """
        #praticamente lo stesso codice di visitFullDeclStmt, ma con il nodo che viene aggiunto alla connessione attuale (che è una MultipleConn())
        #insomma se il nodo viene dichiarato dinamicamente all'interno di una connessione, deve essere aggiunto alla connessione attuale oltre che in memoria
        self.nodeIndex += 1
        self.memory.append(Node(self.nodeIndex))
        
        name = ctx.ID().getText()
        nt = ctx.NODETYPE().getText()

        self.memory[-1].setScope(self.currscope)
        self.memory[-1].setName(name)
        self.memory[-1].setNodeType(nt)

        self.connections[-1].addNode(self.nodeIndex)

        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdlangParser#FastDeclStmtInside.
    def visitFastDeclStmtInside(self, ctx:PdlangParser.FastDeclStmtInsideContext):
        """
        rule: NODETYPE parameters #FastDeclStmtInside
        """
        self.nodeIndex += 1
        self.memory.append(Node(self.nodeIndex))

        nt = ctx.NODETYPE().getText()

        self.memory[-1].setScope(self.currscope)
        self.memory[-1].setNodeType(nt)

        self.connections[-1].addNode(self.nodeIndex)
        
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdlangParser#OpDeclStmtInside.
    def visitOpDeclStmtInside(self, ctx:PdlangParser.OpDeclStmtInsideContext):
        """
        rule: ID '=' operation #OpDeclStmtInside
        """
        self.nodeIndex += 1
        self.memory.append(Node(self.nodeIndex))
        
        name = ctx.ID().getText()
        
        self.memory[-1].setScope(self.currscope)
        self.memory[-1].setName(name)
        self.memory[-1].setNodeType('obj')

        self.connections[-1].addNode(self.nodeIndex)
        
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdlangParser#connectionelem.
    def visitConnectionelem(self, ctx:PdlangParser.ConnectionelemContext):
        """
        rule: '<' (ID | declinside) (',' (ID | declinside))* '>' | (ID | declinside)
        """
        self.connections[-1].addSeparator()
        #catch nodes already declared
        for node in ctx.ID():
            name = node.getText()
            parent = self.getImplicitId(name)
            self.connections[-1].addNode(parent)
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdlangParser#recallstmt.
    def visitRecallstmt(self, ctx:PdlangParser.RecallstmtContext):
        """
        rule: RECALL ID TO ID '{' NL stmt* endofblock 
        """
        self.generalNodeIndex = self.nodeIndex+1
        self.nodeIndex = -1
        src=ctx.ID(0).getText() #blockId of block that is going to be copied
        target=ctx.ID(1).getText() #blockId of target block (new block)
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


    # Visit a parse tree produced by PdlangParser#ifstmt.
    def visitIfstmt(self, ctx:PdlangParser.IfstmtContext):
        """
        rule: IF expr ':' suite (ELIF expr ':' suite)* (ELSE ':' suite)? END
        """
        if self.visit(ctx.expr(0))==True:
            return self.visitSuite(ctx.suite(0))
        if ctx.ELIF():
            for cont in range (len(ctx.ELIF())):
                if self.visit(ctx.expr(cont+1))==True:
                    return self.visitSuite(ctx.suite(cont+1))
            if ctx.ELSE():
                return self.visitSuite(ctx.suite(len(ctx.ELIF())+1))
        #return self.visitChildren(ctx)
        

    # Visit a parse tree produced by PdlangParser#forstmt.
    def visitForstmt(self, ctx:PdlangParser.ForstmtContext):
        """
        rule: FOR NUMBER 'rounds do' ':' suite END
        """
        if '.' in ctx.NUMBER().getText():
            raise Exception('integer only in for loops please')
        for i in range(int(ctx.NUMBER().getText())):
            if self.breakthis==True:
                self.breakthis=False
                break
            elif self.continuethis==True:
                self.continuethis=False
                continue
            elif self.passthis==True:
                self.passthis=False
                pass
            else:
                self.visitSuite(ctx.suite())
        #return self.visitChildren(ctx)


    # Visit a parse tree produced by PdlangParser#suite.
    def visitSuite(self, ctx:PdlangParser.SuiteContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by PdlangParser#number.
    def visitNumber(self, ctx:PdlangParser.NumberContext):
        n= ctx.NUMBER().getText()
        if '.' in n:
            n = float(n)
        else: n=int(n)
        return n


    # Visit a parse tree produced by PdlangParser#ParensExpr.
    def visitParensExpr(self, ctx:PdlangParser.ParensExprContext):
        return self.visit(ctx.expr())

    # Visit a parse tree produced by PdlangParser#MathExpr.
    def visitMathExpr(self, ctx:PdlangParser.MathExprContext):
        left=self.visit(ctx.expr(0))
        right=self.visit(ctx.expr(1))
        
        if ctx.op.text == '+':
            self.res=(left)+(right)
        elif ctx.op.text == '-':
            self.res=(left)-(right)
        elif ctx.op.text == '*':
            self.res=(left)*(right)
        elif ctx.op.text == '/':
            self.res=(left)/(right)
        elif ctx.op.text == '%':
            self.res=(left)%(right)

        return self.res


    # Visit a parse tree produced by PdlangParser#TestExpr.
    def visitTestExpr(self, ctx:PdlangParser.TestExprContext):
        left = self.visit(ctx.expr(0))
        right = self.visit(ctx.expr(1))

        if ctx.testop.text == '==':
            if (left)==(right):
                self.eval=True
            else:
                self.eval=False
        elif ctx.testop.text == '!=':
            if (left)!=(right):
                self.eval=True
            else:
                self.eval=False
        elif ctx.testop.text == '>':
            if (left)>(right):
                self.eval=True
            else:
                self.eval=False
        elif ctx.testop.text == '>=':
            if (left)>=(right):
                self.eval=True
            else:
                self.eval=False
        elif ctx.testop.text == '<=':
            if (left)<=(right):
                self.eval=True
            else:
                self.eval=False
        elif ctx.testop.text == '<':
            if (left)<(right):
                self.eval=True
            else:
                self.eval=False
        
        return self.eval
    

    # Visit a parse tree produced by PdlangParser#breakstmt.
    def visitBreakstmt(self, ctx:PdlangParser.BreakstmtContext):
        self.breakthis = True


    # Visit a parse tree produced by PdlangParser#continuestmt.
    def visitContinuestmt(self, ctx:PdlangParser.ContinuestmtContext):
        self.continuethis=True


    # Visit a parse tree produced by PdlangParser#passstmt.
    def visitPassstmt(self, ctx:PdlangParser.PassstmtContext):
        self.passthis=True



del PdlangParser
