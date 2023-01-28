# Generated from Pdlang.g4 by ANTLR 4.11.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .PdlangParser import PdlangParser
else:
    from PdlangParser import PdlangParser

# This class defines a complete generic visitor for a parse tree produced by PdlangParser.

class PdlangVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by PdlangParser#prog.
    def visitProg(self, ctx:PdlangParser.ProgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdlangParser#blockstmt.
    def visitBlockstmt(self, ctx:PdlangParser.BlockstmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdlangParser#endofblock.
    def visitEndofblock(self, ctx:PdlangParser.EndofblockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdlangParser#stmt.
    def visitStmt(self, ctx:PdlangParser.StmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdlangParser#FullDeclStmt.
    def visitFullDeclStmt(self, ctx:PdlangParser.FullDeclStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdlangParser#FastDeclStmt.
    def visitFastDeclStmt(self, ctx:PdlangParser.FastDeclStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdlangParser#OpDeclStmt.
    def visitOpDeclStmt(self, ctx:PdlangParser.OpDeclStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdlangParser#parameters.
    def visitParameters(self, ctx:PdlangParser.ParametersContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdlangParser#typedargslist.
    def visitTypedargslist(self, ctx:PdlangParser.TypedargslistContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdlangParser#arg.
    def visitArg(self, ctx:PdlangParser.ArgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdlangParser#operation.
    def visitOperation(self, ctx:PdlangParser.OperationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdlangParser#ioletbase.
    def visitIoletbase(self, ctx:PdlangParser.IoletbaseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdlangParser#ioletdeclstmt.
    def visitIoletdeclstmt(self, ctx:PdlangParser.IoletdeclstmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdlangParser#connectionstmt.
    def visitConnectionstmt(self, ctx:PdlangParser.ConnectionstmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdlangParser#FullDeclStmtInside.
    def visitFullDeclStmtInside(self, ctx:PdlangParser.FullDeclStmtInsideContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdlangParser#FastDeclStmtInside.
    def visitFastDeclStmtInside(self, ctx:PdlangParser.FastDeclStmtInsideContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdlangParser#OpDeclStmtInside.
    def visitOpDeclStmtInside(self, ctx:PdlangParser.OpDeclStmtInsideContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdlangParser#connectionelem.
    def visitConnectionelem(self, ctx:PdlangParser.ConnectionelemContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdlangParser#recallstmt.
    def visitRecallstmt(self, ctx:PdlangParser.RecallstmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdlangParser#ifstmt.
    def visitIfstmt(self, ctx:PdlangParser.IfstmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdlangParser#forstmt.
    def visitForstmt(self, ctx:PdlangParser.ForstmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdlangParser#suite.
    def visitSuite(self, ctx:PdlangParser.SuiteContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdlangParser#number.
    def visitNumber(self, ctx:PdlangParser.NumberContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdlangParser#ParensExpr.
    def visitParensExpr(self, ctx:PdlangParser.ParensExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdlangParser#MathExpr.
    def visitMathExpr(self, ctx:PdlangParser.MathExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdlangParser#TestExpr.
    def visitTestExpr(self, ctx:PdlangParser.TestExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdlangParser#breakstmt.
    def visitBreakstmt(self, ctx:PdlangParser.BreakstmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdlangParser#continuestmt.
    def visitContinuestmt(self, ctx:PdlangParser.ContinuestmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdlangParser#passstmt.
    def visitPassstmt(self, ctx:PdlangParser.PassstmtContext):
        return self.visitChildren(ctx)



del PdlangParser
