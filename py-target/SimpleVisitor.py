# Generated from Simple.g4 by ANTLR 4.11.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .SimpleParser import SimpleParser
else:
    from SimpleParser import SimpleParser

# This class defines a complete generic visitor for a parse tree produced by SimpleParser.

class SimpleVisitor(ParseTreeVisitor):

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
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#FastDeclStmt.
    def visitFastDeclStmt(self, ctx:SimpleParser.FastDeclStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#OpDeclStmt.
    def visitOpDeclStmt(self, ctx:SimpleParser.OpDeclStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#parameters.
    def visitParameters(self, ctx:SimpleParser.ParametersContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#typedargslist.
    def visitTypedargslist(self, ctx:SimpleParser.TypedargslistContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#arg.
    def visitArg(self, ctx:SimpleParser.ArgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#operation.
    def visitOperation(self, ctx:SimpleParser.OperationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleParser#ioletdeclasarg.
    def visitIoletdeclasarg(self, ctx:SimpleParser.IoletdeclasargContext):
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