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


    # Enter a parse tree produced by SimpleParser#blockstmt.
    def enterBlockstmt(self, ctx:SimpleParser.BlockstmtContext):
        pass

    # Exit a parse tree produced by SimpleParser#blockstmt.
    def exitBlockstmt(self, ctx:SimpleParser.BlockstmtContext):
        pass


    # Enter a parse tree produced by SimpleParser#subblockstmt.
    def enterSubblockstmt(self, ctx:SimpleParser.SubblockstmtContext):
        pass

    # Exit a parse tree produced by SimpleParser#subblockstmt.
    def exitSubblockstmt(self, ctx:SimpleParser.SubblockstmtContext):
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


    # Enter a parse tree produced by SimpleParser#parameters.
    def enterParameters(self, ctx:SimpleParser.ParametersContext):
        pass

    # Exit a parse tree produced by SimpleParser#parameters.
    def exitParameters(self, ctx:SimpleParser.ParametersContext):
        pass


    # Enter a parse tree produced by SimpleParser#typedargslist.
    def enterTypedargslist(self, ctx:SimpleParser.TypedargslistContext):
        pass

    # Exit a parse tree produced by SimpleParser#typedargslist.
    def exitTypedargslist(self, ctx:SimpleParser.TypedargslistContext):
        pass


    # Enter a parse tree produced by SimpleParser#arg.
    def enterArg(self, ctx:SimpleParser.ArgContext):
        pass

    # Exit a parse tree produced by SimpleParser#arg.
    def exitArg(self, ctx:SimpleParser.ArgContext):
        pass


    # Enter a parse tree produced by SimpleParser#ioletdeclstmt.
    def enterIoletdeclstmt(self, ctx:SimpleParser.IoletdeclstmtContext):
        pass

    # Exit a parse tree produced by SimpleParser#ioletdeclstmt.
    def exitIoletdeclstmt(self, ctx:SimpleParser.IoletdeclstmtContext):
        pass


    # Enter a parse tree produced by SimpleParser#connectionstmt.
    def enterConnectionstmt(self, ctx:SimpleParser.ConnectionstmtContext):
        pass

    # Exit a parse tree produced by SimpleParser#connectionstmt.
    def exitConnectionstmt(self, ctx:SimpleParser.ConnectionstmtContext):
        pass


    # Enter a parse tree produced by SimpleParser#recallstmt.
    def enterRecallstmt(self, ctx:SimpleParser.RecallstmtContext):
        pass

    # Exit a parse tree produced by SimpleParser#recallstmt.
    def exitRecallstmt(self, ctx:SimpleParser.RecallstmtContext):
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


    # Enter a parse tree produced by SimpleParser#suite.
    def enterSuite(self, ctx:SimpleParser.SuiteContext):
        pass

    # Exit a parse tree produced by SimpleParser#suite.
    def exitSuite(self, ctx:SimpleParser.SuiteContext):
        pass


    # Enter a parse tree produced by SimpleParser#number.
    def enterNumber(self, ctx:SimpleParser.NumberContext):
        pass

    # Exit a parse tree produced by SimpleParser#number.
    def exitNumber(self, ctx:SimpleParser.NumberContext):
        pass


    # Enter a parse tree produced by SimpleParser#symbol.
    def enterSymbol(self, ctx:SimpleParser.SymbolContext):
        pass

    # Exit a parse tree produced by SimpleParser#symbol.
    def exitSymbol(self, ctx:SimpleParser.SymbolContext):
        pass


    # Enter a parse tree produced by SimpleParser#DynamicAssign.
    def enterDynamicAssign(self, ctx:SimpleParser.DynamicAssignContext):
        pass

    # Exit a parse tree produced by SimpleParser#DynamicAssign.
    def exitDynamicAssign(self, ctx:SimpleParser.DynamicAssignContext):
        pass


    # Enter a parse tree produced by SimpleParser#MulDiv.
    def enterMulDiv(self, ctx:SimpleParser.MulDivContext):
        pass

    # Exit a parse tree produced by SimpleParser#MulDiv.
    def exitMulDiv(self, ctx:SimpleParser.MulDivContext):
        pass


    # Enter a parse tree produced by SimpleParser#AddSub.
    def enterAddSub(self, ctx:SimpleParser.AddSubContext):
        pass

    # Exit a parse tree produced by SimpleParser#AddSub.
    def exitAddSub(self, ctx:SimpleParser.AddSubContext):
        pass


    # Enter a parse tree produced by SimpleParser#Test.
    def enterTest(self, ctx:SimpleParser.TestContext):
        pass

    # Exit a parse tree produced by SimpleParser#Test.
    def exitTest(self, ctx:SimpleParser.TestContext):
        pass


    # Enter a parse tree produced by SimpleParser#Parens.
    def enterParens(self, ctx:SimpleParser.ParensContext):
        pass

    # Exit a parse tree produced by SimpleParser#Parens.
    def exitParens(self, ctx:SimpleParser.ParensContext):
        pass


    # Enter a parse tree produced by SimpleParser#Logical.
    def enterLogical(self, ctx:SimpleParser.LogicalContext):
        pass

    # Exit a parse tree produced by SimpleParser#Logical.
    def exitLogical(self, ctx:SimpleParser.LogicalContext):
        pass


    # Enter a parse tree produced by SimpleParser#id.
    def enterId(self, ctx:SimpleParser.IdContext):
        pass

    # Exit a parse tree produced by SimpleParser#id.
    def exitId(self, ctx:SimpleParser.IdContext):
        pass



del SimpleParser