# Generated from Simple.g4 by ANTLR 4.11.1
from antlr4 import *
import itertools
if __name__ is not None and "." in __name__:
    from .SimpleParser import SimpleParser
    from .SimpleVisitor import SimpleVisitor
else:
    from SimpleParser import SimpleParser
    from SimpleVisitor import SimpleVisitor

# This class defines a complete generic visitor for a parse tree produced by SimpleParser.

class Node():

    def __init__(self):
        self.name = None
        self.nodetype = None
        self.args = []
        self.objtype = ''
        self.posx = None
        self.posy = None

    def setName(self, name):
        self.name = name

    def setObjType(self, objtype):
        types = open('basicnodes.txt', 'r') 
        if objtype not in types.read():
            raise Exception(f'This object type <{objtype}> does not esist')
        self.objtype = objtype

    def setNodeType(self, nt):
        if nt.startswith('\\'):
            self.nodetype = 'obj'
            self.setObjType(nt[1:])
        else:
            self.nodetype = nt

    def setArg(self, arg):
        self.args.append(arg)

    def getName(self):
        return self.name

    def getPos(self):
        if (self.posx and self.posy) != None:
            return self.posx, self.posy
        return None

    def setPos(self, x, y):
        self.posx = x
        self.posy = y

    def getNodeString(self):
        return f'#X {self.nodetype} {self.posx} {self.posy} {self.objtype} {[x for x in self.args]}'


class Connection():

    def __init__(self):
        self.connectednodes = []
        self.xindex = 0
        self.yindex = 0

    def addNode(self, nodeId):
        self.connectednodes.append(nodeId)

    def addSeparator(self):
        self.connectednodes.append('|')

    def getConnections(self):
        #print(self.connectednodes)
        return self.connectednodes

    def splitlist(self, nodelist):
        sep = '|'
        parts = [list(y) for x,y in itertools.groupby(nodelist, lambda z: z == sep) if not x]
        return parts

    def getConnectionString(self):
        self.connectednodes = self.connectednodes[1:] #toglie il primo separatore
        parts = self.splitlist(self.connectednodes)
        line = ''

        for c in range(len(parts)-1):
            p1, p2 = parts[c], parts[c+1]
            for source in p1:
                for sink in p2:
                    line += f'#X connect {source} 0 {sink} 0;\r\n'
        return line

    
        

class MyVisitorz(SimpleVisitor):

    def __init__(self):
        self.declcount = -1
        self.memory = [] #list of Node()
        self.connections = '' #connections by inlets and outlets
        
        self.connectionstmts = [] #connections from connectionstmt; list of Connection()
        self.conncount = -1

        #self.n = 0
   
    def getImplicitId (self, nodeName):
        counter = -1
        for node in self.memory:
            counter += 1
            if node.getName() == nodeName:
                return counter
        raise Exception (f'node <{nodeName}> does not exist')

    def setParent(self, nodeId):
        self.parent = nodeId

    def addToParentList(self, nodeId):
        if self.conncount != -1:
            self.connectionstmts[self.conncount].addNode(nodeId)
        

    def getParent(self):
        return self.parent

        
    # Visit a parse tree produced by SimpleParser#prog.
    def visitProg(self, ctx:SimpleParser.ProgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#blockstmt.
    def visitBlockstmt(self, ctx:SimpleParser.BlockstmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#subblockstmt.
    def visitSubblockstmt(self, ctx:SimpleParser.SubblockstmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#stmt.
    def visitStmt(self, ctx:SimpleParser.StmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#FullDeclStmt.
    def visitFullDeclStmt(self, ctx:SimpleParser.FullDeclStmtContext):
        self.declcount += 1
        self.memory.append(Node())
        
        name = ctx.ID().getText()
        nt = ctx.NODETYPE().getText()
        self.memory[self.declcount].setName(name)
        self.memory[self.declcount].setNodeType(nt)

        self.setParent(self.declcount)
        
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#FastDeclStmt.
    def visitFastDeclStmt(self, ctx:SimpleParser.FastDeclStmtContext):
        self.declcount += 1
        self.memory.append(Node())

        nt = ctx.NODETYPE().getText()
        self.memory[self.declcount].setNodeType(nt)

        self.setParent(self.declcount)
        
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#OpDeclStmt.
    def visitOpDeclStmt(self, ctx:SimpleParser.OpDeclStmtContext):
        self.declcount += 1
        self.memory.append(Node())
        
        name = ctx.ID().getText()
        self.memory[self.declcount].setName(name)
        self.memory[self.declcount].setNodeType('obj')

        self.setParent(self.declcount)
            
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
        if ctx.NUMBER():
            arg = ctx.NUMBER().getText()
        elif ctx.SYMBOL():
            arg = ctx.SYMBOL().getText()
        self.memory[self.declcount].setArg(arg)
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
            self.memory[self.declcount].setArg(op)
        if ctx.NUMBER():
            self.memory[self.declcount].setArg(ctx.NUMBER().getText())
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#ioletdeclasarg.
    def visitIoletdeclasarg(self, ctx:SimpleParser.IoletdeclasargContext):

        outlet = False
        iolet = str(ctx.INOUTID())
        if '-' in iolet:
            outlet = True
        iolet = int(iolet[-1])-1

        #case 1: new node declaration
        # INOUTID = NODETYPE parameters | operation
        if not ctx.ID():
            self.declcount += 1
            self.memory.append(Node())
            if ctx.NODETYPE():
                nt = ctx.NODETYPE().getText()
                self.memory[self.declcount].setNodeType(nt)
            elif ctx.operation():
                self.memory[self.declcount].setNodeType('obj')

            if outlet is False:
                source = self.declcount
                sink = self.getParent()
                self.connections += f'#X connect {source} 0 {sink} {iolet};\r\n'
            else:
                source = self.getParent()
                sink = self.declcount
                self.connections += f'#X connect {source} {iolet} {sink} 0;\r\n'
            

        #case 2: connecting to an existing node
        # INOUTID = ID 
        if ctx.ID():
            name = ctx.ID().getText()
            if outlet is False:
                source = self.getImplicitId(name) #ottieni il numero del nodo ID
                sink = self.getParent()
                self.connections += f'#X connect {source} 0 {sink} {iolet};\r\n'
            else:
                source = self.getParent()
                sink = self.getImplicitId(name)
                self.connections += f'#X connect {source} {iolet} {sink} 0;\r\n'
    
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#ioletdeclstmt.
    def visitIoletdeclstmt(self, ctx:SimpleParser.IoletdeclstmtContext):
        #case 1: ID.ioletasarg
        if ctx.ID():
            name = ctx.ID().getText()
            parent = self.getImplicitId(name)
            self.setParent(parent)
        #case 2: NODETYPE parameters . ioletasarg
        else:
            self.declcount += 1
            self.memory.append(Node())

            nt = ctx.NODETYPE().getText()
            self.memory[self.declcount].setNodeType(nt)
        
            self.setParent(self.declcount)
            
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#connectionstmt.
    def visitConnectionstmt(self, ctx:SimpleParser.ConnectionstmtContext):
        line = ctx.getText()
        if line:
            self.connectionstmts.append(Connection())
            self.conncount += 1
        return self.visitChildren(ctx)

    # Visit a parse tree produced by SimpleParser#FullDeclStmtInside.
    def visitFullDeclStmtInside(self, ctx:SimpleParser.FullDeclStmtInsideContext):
        self.declcount += 1
        self.memory.append(Node())
        
        name = ctx.ID().getText()
        nt = ctx.NODETYPE().getText()
        self.memory[self.declcount].setName(name)
        self.memory[self.declcount].setNodeType(nt)

        self.addToParentList(self.declcount)
        
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#FastDeclStmtInside.
    def visitFastDeclStmtInside(self, ctx:SimpleParser.FastDeclStmtInsideContext):
        self.declcount += 1
        self.memory.append(Node())

        nt = ctx.NODETYPE().getText()
        self.memory[self.declcount].setNodeType(nt)

        self.addToParentList(self.declcount)

        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#OpDeclStmtInside.
    def visitOpDeclStmtInside(self, ctx:SimpleParser.OpDeclStmtInsideContext):
        self.declcount += 1
        self.memory.append(Node())
        
        name = ctx.ID().getText()
        self.memory[self.declcount].setName(name)
        self.memory[self.declcount].setNodeType('obj')

        self.addToParentList(self.declcount)
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#connectionelem.
    def visitConnectionelem(self, ctx:SimpleParser.ConnectionelemContext):
        self.connectionstmts[self.conncount].addSeparator()
        #catch nodes already declared
        for node in ctx.ID():
            name = node.getText()
            parent = self.getImplicitId(name)
            self.connectionstmts[self.conncount].addNode(parent)
            
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#disconnectionstmt.
    def visitDisconnectionstmt(self, ctx:SimpleParser.DisconnectionstmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#disconnectionelem.
    def visitDisconnectionelem(self, ctx:SimpleParser.DisconnectionelemContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#recallstmt.
    def visitRecallstmt(self, ctx:SimpleParser.RecallstmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#ifstmt.
    def visitIfstmt(self, ctx:SimpleParser.IfstmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#forstmt.
    def visitForstmt(self, ctx:SimpleParser.ForstmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#suite.
    def visitSuite(self, ctx:SimpleParser.SuiteContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#number.
    def visitNumber(self, ctx:SimpleParser.NumberContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#MulDiv.
    def visitMulDiv(self, ctx:SimpleParser.MulDivContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#AddSub.
    def visitAddSub(self, ctx:SimpleParser.AddSubContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#Test.
    def visitTest(self, ctx:SimpleParser.TestContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#Parens.
    def visitParens(self, ctx:SimpleParser.ParensContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#Logical.
    def visitLogical(self, ctx:SimpleParser.LogicalContext):
        return self.visitChildren(ctx)



del SimpleParser
