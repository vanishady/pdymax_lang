# Generated from Simple.g4 by ANTLR 4.11.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .SimpleParser import SimpleParser
else:
    from SimpleParser import SimpleParser

# This class defines a complete listener for a parse tree produced by SimpleParser.
class SimpleListener(ParseTreeListener):

    # Enter a parse tree produced by SimpleParser#prog.
    def enterProg(self, ctx:SimpleParser.ProgContext):
        pass

    # Exit a parse tree produced by SimpleParser#prog.
    def exitProg(self, ctx:SimpleParser.ProgContext):
        pass


    # Enter a parse tree produced by SimpleParser#stmt.
    def enterStmt(self, ctx:SimpleParser.StmtContext):
        pass

    # Exit a parse tree produced by SimpleParser#stmt.
    def exitStmt(self, ctx:SimpleParser.StmtContext):
        pass


    # Enter a parse tree produced by SimpleParser#declarationstmt.
    def enterDeclarationstmt(self, ctx:SimpleParser.DeclarationstmtContext):
        pass

    # Exit a parse tree produced by SimpleParser#declarationstmt.
    def exitDeclarationstmt(self, ctx:SimpleParser.DeclarationstmtContext):
        pass


    # Enter a parse tree produced by SimpleParser#connectionstmt.
    def enterConnectionstmt(self, ctx:SimpleParser.ConnectionstmtContext):
        pass

    # Exit a parse tree produced by SimpleParser#connectionstmt.
    def exitConnectionstmt(self, ctx:SimpleParser.ConnectionstmtContext):
        pass


    # Enter a parse tree produced by SimpleParser#ifstmt.
    def enterIfstmt(self, ctx:SimpleParser.IfstmtContext):
        pass

    # Exit a parse tree produced by SimpleParser#ifstmt.
    def exitIfstmt(self, ctx:SimpleParser.IfstmtContext):
        pass


    # Enter a parse tree produced by SimpleParser#forstmt.
    def enterForstmt(self, ctx:SimpleParser.ForstmtContext):
        pass

    # Exit a parse tree produced by SimpleParser#forstmt.
    def exitForstmt(self, ctx:SimpleParser.ForstmtContext):
        pass


    # Enter a parse tree produced by SimpleParser#subblockstmt.
    def enterSubblockstmt(self, ctx:SimpleParser.SubblockstmtContext):
        pass

    # Exit a parse tree produced by SimpleParser#subblockstmt.
    def exitSubblockstmt(self, ctx:SimpleParser.SubblockstmtContext):
        pass


    # Enter a parse tree produced by SimpleParser#suite.
    def enterSuite(self, ctx:SimpleParser.SuiteContext):
        pass

    # Exit a parse tree produced by SimpleParser#suite.
    def exitSuite(self, ctx:SimpleParser.SuiteContext):
        pass


    # Enter a parse tree produced by SimpleParser#expr.
    def enterExpr(self, ctx:SimpleParser.ExprContext):
        pass

    # Exit a parse tree produced by SimpleParser#expr.
    def exitExpr(self, ctx:SimpleParser.ExprContext):
        pass



del SimpleParser