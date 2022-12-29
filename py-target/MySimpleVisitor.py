# Generated from Simple.g4 by ANTLR 4.11.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .SimpleParser import SimpleParser
    from .SimpleVisitor import SimpleVisitor
else:
    from SimpleParser import SimpleParser
    from SimpleVisitor import SimpleVisitor


# This class defines a complete generic visitor for a parse tree produced by SimpleParser.

class MySimpleVisitor(SimpleVisitor):

    def __init__(self):
        self.memory = {}
        self.varcount = 0
        self.posx = 0
        self.posy = 0

    def printmemo(self, count):
        return self.memory[count]

    def switchnodetype (self, nt):
        if nt == 'message':
            nt = 'X msg'
        elif nt == 'object':
            nt = 'X obj'
        else:
            nt = 'X msg'
        return nt

    def positionalg(self):
        self.posx+= 40
        self.posy+= 40
        self.memory[self.varcount]. append((self.posx, self.posy))
        return self.posx, self.posy

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
        if ctx.ID():
            name = ctx.ID().getText()
            #ID = NODETYPE parameters
            if ctx.NODETYPE():
                nt = ctx.NODETYPE().getText()
            else:
                # ID = expr
                nt = None
        else:
            #NODETYPE parameters
            name = str(self.varcount)
            nt = ctx.NODETYPE().getText()

        newnt = self.switchnodetype(nt)
        self.memory[self.varcount]=[name,newnt]

        x,y = self.positionalg()
        
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#parameters.
    def visitParameters(self, ctx:SimpleParser.ParametersContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#typedargslist.
    def visitTypedargslist(self, ctx:SimpleParser.TypedargslistContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#arg.
    def visitArg(self, ctx:SimpleParser.ArgContext):
        if ctx.NUMBER():
            self.memory[self.varcount].append(ctx.NUMBER().getText())
        elif ctx.SYMBOL():
            self.memory[self.varcount].append(ctx.SYMBOL().getText())
        else:
            print('unexpected type: args are only number or symbol')
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#ioletdeclstmt.
    def visitIoletdeclstmt(self, ctx:SimpleParser.IoletdeclstmtContext):
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
        left = self.visit(ctx.expr(0))
        right = self.visit(ctx.expr(1))
        print(left)
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
