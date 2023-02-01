# Generated from Pdlang.g4 by ANTLR 4.11.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .PdlangParser import PdlangParser
else:
    from PdlangParser import PdlangParser

# This class defines a complete listener for a parse tree produced by PdlangParser.
class PdlangListener(ParseTreeListener):

    # Enter a parse tree produced by PdlangParser#prog.
    def enterProg(self, ctx:PdlangParser.ProgContext):
        pass

    # Exit a parse tree produced by PdlangParser#prog.
    def exitProg(self, ctx:PdlangParser.ProgContext):
        pass


    # Enter a parse tree produced by PdlangParser#blockstmt.
    def enterBlockstmt(self, ctx:PdlangParser.BlockstmtContext):
        pass

    # Exit a parse tree produced by PdlangParser#blockstmt.
    def exitBlockstmt(self, ctx:PdlangParser.BlockstmtContext):
        pass


    # Enter a parse tree produced by PdlangParser#endofblock.
    def enterEndofblock(self, ctx:PdlangParser.EndofblockContext):
        pass

    # Exit a parse tree produced by PdlangParser#endofblock.
    def exitEndofblock(self, ctx:PdlangParser.EndofblockContext):
        pass


    # Enter a parse tree produced by PdlangParser#stmt.
    def enterStmt(self, ctx:PdlangParser.StmtContext):
        pass

    # Exit a parse tree produced by PdlangParser#stmt.
    def exitStmt(self, ctx:PdlangParser.StmtContext):
        pass


    # Enter a parse tree produced by PdlangParser#FullDeclStmt.
    def enterFullDeclStmt(self, ctx:PdlangParser.FullDeclStmtContext):
        pass

    # Exit a parse tree produced by PdlangParser#FullDeclStmt.
    def exitFullDeclStmt(self, ctx:PdlangParser.FullDeclStmtContext):
        pass


    # Enter a parse tree produced by PdlangParser#FastDeclStmt.
    def enterFastDeclStmt(self, ctx:PdlangParser.FastDeclStmtContext):
        pass

    # Exit a parse tree produced by PdlangParser#FastDeclStmt.
    def exitFastDeclStmt(self, ctx:PdlangParser.FastDeclStmtContext):
        pass


    # Enter a parse tree produced by PdlangParser#OpDeclStmt.
    def enterOpDeclStmt(self, ctx:PdlangParser.OpDeclStmtContext):
        pass

    # Exit a parse tree produced by PdlangParser#OpDeclStmt.
    def exitOpDeclStmt(self, ctx:PdlangParser.OpDeclStmtContext):
        pass


    # Enter a parse tree produced by PdlangParser#parameters.
    def enterParameters(self, ctx:PdlangParser.ParametersContext):
        pass

    # Exit a parse tree produced by PdlangParser#parameters.
    def exitParameters(self, ctx:PdlangParser.ParametersContext):
        pass


    # Enter a parse tree produced by PdlangParser#typedargslist.
    def enterTypedargslist(self, ctx:PdlangParser.TypedargslistContext):
        pass

    # Exit a parse tree produced by PdlangParser#typedargslist.
    def exitTypedargslist(self, ctx:PdlangParser.TypedargslistContext):
        pass


    # Enter a parse tree produced by PdlangParser#arg.
    def enterArg(self, ctx:PdlangParser.ArgContext):
        pass

    # Exit a parse tree produced by PdlangParser#arg.
    def exitArg(self, ctx:PdlangParser.ArgContext):
        pass


    # Enter a parse tree produced by PdlangParser#operation.
    def enterOperation(self, ctx:PdlangParser.OperationContext):
        pass

    # Exit a parse tree produced by PdlangParser#operation.
    def exitOperation(self, ctx:PdlangParser.OperationContext):
        pass


    # Enter a parse tree produced by PdlangParser#ioletbase.
    def enterIoletbase(self, ctx:PdlangParser.IoletbaseContext):
        pass

    # Exit a parse tree produced by PdlangParser#ioletbase.
    def exitIoletbase(self, ctx:PdlangParser.IoletbaseContext):
        pass


    # Enter a parse tree produced by PdlangParser#ioletdeclstmt.
    def enterIoletdeclstmt(self, ctx:PdlangParser.IoletdeclstmtContext):
        pass

    # Exit a parse tree produced by PdlangParser#ioletdeclstmt.
    def exitIoletdeclstmt(self, ctx:PdlangParser.IoletdeclstmtContext):
        pass


    # Enter a parse tree produced by PdlangParser#connectionstmt.
    def enterConnectionstmt(self, ctx:PdlangParser.ConnectionstmtContext):
        pass

    # Exit a parse tree produced by PdlangParser#connectionstmt.
    def exitConnectionstmt(self, ctx:PdlangParser.ConnectionstmtContext):
        pass


    # Enter a parse tree produced by PdlangParser#FullDeclStmtInside.
    def enterFullDeclStmtInside(self, ctx:PdlangParser.FullDeclStmtInsideContext):
        pass

    # Exit a parse tree produced by PdlangParser#FullDeclStmtInside.
    def exitFullDeclStmtInside(self, ctx:PdlangParser.FullDeclStmtInsideContext):
        pass


    # Enter a parse tree produced by PdlangParser#FastDeclStmtInside.
    def enterFastDeclStmtInside(self, ctx:PdlangParser.FastDeclStmtInsideContext):
        pass

    # Exit a parse tree produced by PdlangParser#FastDeclStmtInside.
    def exitFastDeclStmtInside(self, ctx:PdlangParser.FastDeclStmtInsideContext):
        pass


    # Enter a parse tree produced by PdlangParser#OpDeclStmtInside.
    def enterOpDeclStmtInside(self, ctx:PdlangParser.OpDeclStmtInsideContext):
        pass

    # Exit a parse tree produced by PdlangParser#OpDeclStmtInside.
    def exitOpDeclStmtInside(self, ctx:PdlangParser.OpDeclStmtInsideContext):
        pass


    # Enter a parse tree produced by PdlangParser#connectionelem.
    def enterConnectionelem(self, ctx:PdlangParser.ConnectionelemContext):
        pass

    # Exit a parse tree produced by PdlangParser#connectionelem.
    def exitConnectionelem(self, ctx:PdlangParser.ConnectionelemContext):
        pass


    # Enter a parse tree produced by PdlangParser#recallstmt.
    def enterRecallstmt(self, ctx:PdlangParser.RecallstmtContext):
        pass

    # Exit a parse tree produced by PdlangParser#recallstmt.
    def exitRecallstmt(self, ctx:PdlangParser.RecallstmtContext):
        pass


    # Enter a parse tree produced by PdlangParser#ifstmt.
    def enterIfstmt(self, ctx:PdlangParser.IfstmtContext):
        pass

    # Exit a parse tree produced by PdlangParser#ifstmt.
    def exitIfstmt(self, ctx:PdlangParser.IfstmtContext):
        pass


    # Enter a parse tree produced by PdlangParser#forstmt.
    def enterForstmt(self, ctx:PdlangParser.ForstmtContext):
        pass

    # Exit a parse tree produced by PdlangParser#forstmt.
    def exitForstmt(self, ctx:PdlangParser.ForstmtContext):
        pass


    # Enter a parse tree produced by PdlangParser#suite.
    def enterSuite(self, ctx:PdlangParser.SuiteContext):
        pass

    # Exit a parse tree produced by PdlangParser#suite.
    def exitSuite(self, ctx:PdlangParser.SuiteContext):
        pass


    # Enter a parse tree produced by PdlangParser#number.
    def enterNumber(self, ctx:PdlangParser.NumberContext):
        pass

    # Exit a parse tree produced by PdlangParser#number.
    def exitNumber(self, ctx:PdlangParser.NumberContext):
        pass


    # Enter a parse tree produced by PdlangParser#ParensExpr.
    def enterParensExpr(self, ctx:PdlangParser.ParensExprContext):
        pass

    # Exit a parse tree produced by PdlangParser#ParensExpr.
    def exitParensExpr(self, ctx:PdlangParser.ParensExprContext):
        pass


    # Enter a parse tree produced by PdlangParser#MathExpr.
    def enterMathExpr(self, ctx:PdlangParser.MathExprContext):
        pass

    # Exit a parse tree produced by PdlangParser#MathExpr.
    def exitMathExpr(self, ctx:PdlangParser.MathExprContext):
        pass


    # Enter a parse tree produced by PdlangParser#TestExpr.
    def enterTestExpr(self, ctx:PdlangParser.TestExprContext):
        pass

    # Exit a parse tree produced by PdlangParser#TestExpr.
    def exitTestExpr(self, ctx:PdlangParser.TestExprContext):
        pass


    # Enter a parse tree produced by PdlangParser#breakstmt.
    def enterBreakstmt(self, ctx:PdlangParser.BreakstmtContext):
        pass

    # Exit a parse tree produced by PdlangParser#breakstmt.
    def exitBreakstmt(self, ctx:PdlangParser.BreakstmtContext):
        pass


    # Enter a parse tree produced by PdlangParser#continuestmt.
    def enterContinuestmt(self, ctx:PdlangParser.ContinuestmtContext):
        pass

    # Exit a parse tree produced by PdlangParser#continuestmt.
    def exitContinuestmt(self, ctx:PdlangParser.ContinuestmtContext):
        pass


    # Enter a parse tree produced by PdlangParser#passstmt.
    def enterPassstmt(self, ctx:PdlangParser.PassstmtContext):
        pass

    # Exit a parse tree produced by PdlangParser#passstmt.
    def exitPassstmt(self, ctx:PdlangParser.PassstmtContext):
        pass



del PdlangParser