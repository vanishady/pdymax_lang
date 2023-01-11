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

    variablenames = {}

    def __init__(self, index):
        self.index = index
        self.name = None
        self.nodetype = None
        self.args = []
        self.objtype = ''
        self.posx = None
        self.posy = None
        self.nodesIn = []
        self.nodesOut = []
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
        self.variablenames[self.scope]+=name
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

    def setPos(self, x, y):
        self.posx = x
        self.posy = y

    def getName(self):
        return self.name

    def getPos(self):
        if (self.posx and self.posy) != None:
            return self.posx, self.posy
        return None

    def getNodeString(self):
        return f'#X {self.nodetype} {self.posx} {self.posy} {self.objtype} {[x for x in self.args]}'


class Remakez(SimpleVisitor):

    def __init__(self):
        #variable storing declarations' count
        self.nodeIndex = -1
        #memory is a list of Node() 
        self.memory = [] 

        self.currscope = 'general'

    #returns name of output file
    def getPatchName(self):
        return self.patch 

        
    # Visit a parse tree produced by SimpleParser#prog.
    def visitProg(self, ctx:SimpleParser.ProgContext):
        patch = ctx.ID().getText()
        self.patch = patch
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#blockstmt.
    def visitBlockstmt(self, ctx:SimpleParser.BlockstmtContext):
        blockId = ctx.ID().getText()
        self.currscope = blockId
        self.memory.append(blockId)
        return self.visitChildren(ctx)

    # Visit a parse tree produced by SimpleParser#endofblock.
    def visitEndofblock(self, ctx:SimpleParser.EndofblockContext):
        self.memory.append('end'+self.currscope)
        self.currscope = 'global'
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

        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#FastDeclStmt.
    def visitFastDeclStmt(self, ctx:SimpleParser.FastDeclStmtContext):
        self.nodeIndex += 1
        self.memory.append(Node(self.nodeIndex))

        self.memory[-1].setScope(self.currscope)
        
        nt = ctx.NODETYPE().getText()
        self.memory[-1].setNodeType(nt)
        

        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#OpDeclStmt.
    def visitOpDeclStmt(self, ctx:SimpleParser.OpDeclStmtContext):
        self.nodeIndex += 1
        self.memory.append(Node(self.nodeIndex))

        name = ctx.ID().getText()

        self.memory[-1].setScope(self.currscope)
        self.memory[-1].setName(name)
        self.memory[-1].setNodeType('floatatom')
            
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
            self.memory[-1].setArg(arg)
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
            self.memory[-1].setNodeType('obj')
            self.memory[-1].setArg(op)
            
        if ctx.NUMBER():
            self.memory[-1].setArg(ctx.NUMBER().getText())
        
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#ioletbase.
    def visitIoletbase(self, ctx:SimpleParser.IoletbaseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#ioletdeclstmt.
    def visitIoletdeclstmt(self, ctx:SimpleParser.IoletdeclstmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#connectionstmt.
    def visitConnectionstmt(self, ctx:SimpleParser.ConnectionstmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#FullDeclStmtInside.
    def visitFullDeclStmtInside(self, ctx:SimpleParser.FullDeclStmtInsideContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#FastDeclStmtInside.
    def visitFastDeclStmtInside(self, ctx:SimpleParser.FastDeclStmtInsideContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#OpDeclStmtInside.
    def visitOpDeclStmtInside(self, ctx:SimpleParser.OpDeclStmtInsideContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#connectionelem.
    def visitConnectionelem(self, ctx:SimpleParser.ConnectionelemContext):
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


    # Visit a parse tree produced by SimpleParser#ParensExpr.
    def visitParensExpr(self, ctx:SimpleParser.ParensExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#LogicalExpr.
    def visitLogicalExpr(self, ctx:SimpleParser.LogicalExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#MathExpr.
    def visitMathExpr(self, ctx:SimpleParser.MathExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#TestExpr.
    def visitTestExpr(self, ctx:SimpleParser.TestExprContext):
        return self.visitChildren(ctx)



del SimpleParser
