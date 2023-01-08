# Generated from Simple.g4 by ANTLR 4.11.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .SimpleParser import SimpleParser
    from .SimpleVisitor import SimpleVisitor
else:
    from SimpleParser import SimpleParser
    from SimpleVisitor import SimpleVisitor

class Node():

    implicitList = []

    def __init__(self, implicitId:int):
        self.implicitId = implicitId
        self.implicitList.append(implicitId)
        self.id = None
        self.type = None
        self.connections = []
        self.posx = 0
        self.posy = 0
        self.inlets = []
        self.outlets = []
        self.args = []
        
        self.line = { 'ntype' : '' , 'name' : ''}

    def getImplicitId(self):
        return self.implicitId

    def setType(self, nodeType):
        self.type = nodeType
        if self.type == 'message':
            self.line['ntype'] = 'X msg'
        elif self.type == 'object':
            self.line['ntype'] = 'X obj'

    def setName(self, nodeName):
        self.id = nodeName

    def getName(self):
        return self.id

    def setPos(self, x, y):
        pass

    def setArgs(self, arg):
        pass

     

class Memory():

    def __init__(self):
        self.nodelist = {}

    def add(self, node):
        pass

    def access(self, nodeId):
        pass 

# This class defines a complete generic visitor for a parse tree produced by SimpleParser.

class MyVisitor(SimpleVisitor):

    def __init__(self):
        self.memory = {}
        self.varcount = -1
        self.posx = 0
        self.posy = 0
        self.connections = ''
        self.parent = None
        self.currNode = None

    def printmemo(self, count):
        return self.memory[count]

    def switchnodetype (self, nt):
        #STILL TO IMPLEMENT OTHER NODE TYPES
        if nt == 'message':
            nt = 'X msg'
        elif nt == 'object':
            nt = 'X obj'
        else:
            nt = None
        return nt

    def positionalg(self, node):
        self.posx+= 40
        self.posy+= 40
        self.memory[self.varcount]. append((self.posx, self.posy))
        node.setPos(self.posx,self.posy)
        return

    def setParent(self, var):
        self.parent = var
        return

    def getParent(self):
        return self.parent

    def getVarcount(self, identifier):
        for counter in self.memory:
            if self.memory[counter][0] == identifier:
                return counter
        return -1

    def checkVarname(self, identifier):
        for i in self.memory:
            if self.memory[i][0] == identifier:
                return 'bad', identifier
        return 'ok', identifier

    def passNode(self, node):
        self.currNode = node
        return

    def getNode():
        return self.currNode

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


    # Visit a parse tree produced by SimpleParser#declarationstmt.
    def visitDeclarationstmt(self, ctx:SimpleParser.DeclarationstmtContext):
        self.varcount+=1
        n = Node(self.varcount) ##
        self.setParent(self.varcount)
        if ctx.ID():
            name = ctx.ID().getText()
            a,b = self.checkVarname(name)
            if  a == 'bad':
                raise Exception('cannot reassign variable! var name already used', b)
            #ID = NODETYPE parameters
            if ctx.NODETYPE():
                nt = ctx.NODETYPE().getText()
            else:
                # ID = operation
                nt = 'object'
        else:
            #NODETYPE parameters
            name = str(self.varcount)
            nt = ctx.NODETYPE().getText()

        newnt = self.switchnodetype(nt)
        self.memory[self.varcount]=[name,newnt]
        
        n.setType(nt)#
        n.setName(name)#

        self.positionalg(n)
        self.passNode(n)
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#parameters.
    def visitParameters(self, ctx:SimpleParser.ParametersContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#typedargslist.
    def visitTypedargslist(self, ctx:SimpleParser.TypedargslistContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#arg.
    def visitArg(self, ctx:SimpleParser.ArgContext):
        n = self.getNode()
        if ctx.NUMBER():
            self.memory[self.varcount].append(ctx.NUMBER().getText())
            n.setArgs(ctx.NUMBER().getText())
        elif ctx.SYMBOL():
            self.memory[self.varcount].append(ctx.SYMBOL().getText())
            n.setArgs(ctx.SYMBOL().getText())
        else:
            print('unexpected arg type: expected number or symbol')
        return self.visitChildren(ctx)

    # Visit a parse tree produced by SimpleParser#operation.
    def visitOperation(self, ctx:SimpleParser.OperationContext):
        op = None
        if ctx.STAR(): op = '*'
        elif ctx.SIGSTAR(): '*~'
        elif ctx.DIV(): op = '/'
        elif ctx.SIGDIV(): op = '/~'
        elif ctx.PLUS(): op = '+'
        elif ctx.SIGPLUS(): op = '+~'
        elif ctx.MINUS(): op = '-'
        elif ctx.SIGMINUS(): op = '-~'

        if op:
            self.memory[self.varcount].append(op)
        if ctx.NUMBER(): self.memory[self.varcount].append(ctx.NUMBER().getText())
        return self.visitChildren(ctx)

    # Visit a parse tree produced by SimpleParser#ioletinsideparens.
    def visitIoletinsideparens(self, ctx:SimpleParser.IoletinsideparensContext):
        self.varcount+=1
        n = Node(self.varcount)
        
        if ctx.NODETYPE():
            #IONOUTID = NODETYPE parameters
            nt = ctx.NODETYPE().getText()
        else:
            #INOUTID = operation
            nt = 'object'
            
        name = str(self.varcount)
        newnt = self.switchnodetype(nt)
        self.memory[self.varcount]=[name,newnt]
        self.positionalg(n)

        iolet = str(ctx.INOUTID())
        if '-' in iolet:
            iolet = int(iolet[-1])-1
            self.connections+=f'#X connect {self.getParent()} {iolet} {self.varcount} 0;\r\n'
        else:
            iolet = int(iolet[-1])-1
            self.connections+=f'#X connect {self.varcount} 0 {self.getParent()} {iolet};\r\n'
          
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#ioletdeclstmt.
    def visitIoletdeclstmt(self, ctx:SimpleParser.IoletdeclstmtContext):
        #ID '.' INOUTID '=' (NODETYPE parameters | operation)
        if ctx.ID():
            identifier = ctx.ID().getText()
            identifiercount = self.getVarcount(identifier)
            if identifiercount == -1:
                raise Exception('cannot link inlet/outlet to unexisting node!')
            self.setParent(identifiercount)
        else:
            #NODETYPE parameters '.' ioletinsideparens
            self.varcount+=1
            n=Node(self.varcount)
            name = str(self.varcount)
            nt = ctx.NODETYPE().getText()
            newnt = self.switchnodetype(nt)
            self.memory[self.varcount]=[name,newnt]
            self.positionalg(n)
            self.setParent(self.varcount)

        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#connectionstmt.
    def visitConnectionstmt(self, ctx:SimpleParser.ConnectionstmtContext):
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
        self.memory[self.varcount].append(ctx.NUMBER().getText())
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#DynamicAssign.
    def visitDynamicAssign(self, ctx:SimpleParser.DynamicAssignContext):
        #self.visitDeclarationstmt(SimpleParser.DynamicAssignContext)
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#MulDiv.
    def visitMulDiv(self, ctx:SimpleParser.MulDivContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#AddSub.
    def visitAddSub(self, ctx:SimpleParser.AddSubContext):
        #left = self.visit(ctx.expr(0))
        #right = self.visit(ctx.expr(1))
        #print(left)
        #operator = ctx.op().getText()
        #if ctx.op.type == SimpleParser.ADD:
         #   print('+')
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


    # Visit a parse tree produced by SimpleParser#id.
    def visitId(self, ctx:SimpleParser.IdContext):
        return self.visitChildren(ctx)



del SimpleParser
