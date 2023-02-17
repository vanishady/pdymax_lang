# Generated from Pdaw.g4 by ANTLR 4.11.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .PdawParser import PdawParser
else:
    from PdawParser import PdawParser

# This class defines a complete listener for a parse tree produced by PdawParser.
class PdawListener(ParseTreeListener):

    # Enter a parse tree produced by PdawParser#prog.
    def enterProg(self, ctx:PdawParser.ProgContext):
        pass

    # Exit a parse tree produced by PdawParser#prog.
    def exitProg(self, ctx:PdawParser.ProgContext):
        pass


    # Enter a parse tree produced by PdawParser#patchstmt.
    def enterPatchstmt(self, ctx:PdawParser.PatchstmtContext):
        pass

    # Exit a parse tree produced by PdawParser#patchstmt.
    def exitPatchstmt(self, ctx:PdawParser.PatchstmtContext):
        pass


    # Enter a parse tree produced by PdawParser#funcdefstmt.
    def enterFuncdefstmt(self, ctx:PdawParser.FuncdefstmtContext):
        pass

    # Exit a parse tree produced by PdawParser#funcdefstmt.
    def exitFuncdefstmt(self, ctx:PdawParser.FuncdefstmtContext):
        pass


    # Enter a parse tree produced by PdawParser#returnstmt.
    def enterReturnstmt(self, ctx:PdawParser.ReturnstmtContext):
        pass

    # Exit a parse tree produced by PdawParser#returnstmt.
    def exitReturnstmt(self, ctx:PdawParser.ReturnstmtContext):
        pass


    # Enter a parse tree produced by PdawParser#stmt.
    def enterStmt(self, ctx:PdawParser.StmtContext):
        pass

    # Exit a parse tree produced by PdawParser#stmt.
    def exitStmt(self, ctx:PdawParser.StmtContext):
        pass


    # Enter a parse tree produced by PdawParser#blockstmt.
    def enterBlockstmt(self, ctx:PdawParser.BlockstmtContext):
        pass

    # Exit a parse tree produced by PdawParser#blockstmt.
    def exitBlockstmt(self, ctx:PdawParser.BlockstmtContext):
        pass


    # Enter a parse tree produced by PdawParser#dotdotstmt.
    def enterDotdotstmt(self, ctx:PdawParser.DotdotstmtContext):
        pass

    # Exit a parse tree produced by PdawParser#dotdotstmt.
    def exitDotdotstmt(self, ctx:PdawParser.DotdotstmtContext):
        pass


    # Enter a parse tree produced by PdawParser#callstmt.
    def enterCallstmt(self, ctx:PdawParser.CallstmtContext):
        pass

    # Exit a parse tree produced by PdawParser#callstmt.
    def exitCallstmt(self, ctx:PdawParser.CallstmtContext):
        pass


    # Enter a parse tree produced by PdawParser#nodedecl1.
    def enterNodedecl1(self, ctx:PdawParser.Nodedecl1Context):
        pass

    # Exit a parse tree produced by PdawParser#nodedecl1.
    def exitNodedecl1(self, ctx:PdawParser.Nodedecl1Context):
        pass


    # Enter a parse tree produced by PdawParser#nodedecl2.
    def enterNodedecl2(self, ctx:PdawParser.Nodedecl2Context):
        pass

    # Exit a parse tree produced by PdawParser#nodedecl2.
    def exitNodedecl2(self, ctx:PdawParser.Nodedecl2Context):
        pass


    # Enter a parse tree produced by PdawParser#nodedecl3.
    def enterNodedecl3(self, ctx:PdawParser.Nodedecl3Context):
        pass

    # Exit a parse tree produced by PdawParser#nodedecl3.
    def exitNodedecl3(self, ctx:PdawParser.Nodedecl3Context):
        pass


    # Enter a parse tree produced by PdawParser#nodedecl4.
    def enterNodedecl4(self, ctx:PdawParser.Nodedecl4Context):
        pass

    # Exit a parse tree produced by PdawParser#nodedecl4.
    def exitNodedecl4(self, ctx:PdawParser.Nodedecl4Context):
        pass


    # Enter a parse tree produced by PdawParser#simpledeclstmt.
    def enterSimpledeclstmt(self, ctx:PdawParser.SimpledeclstmtContext):
        pass

    # Exit a parse tree produced by PdawParser#simpledeclstmt.
    def exitSimpledeclstmt(self, ctx:PdawParser.SimpledeclstmtContext):
        pass


    # Enter a parse tree produced by PdawParser#list.
    def enterList(self, ctx:PdawParser.ListContext):
        pass

    # Exit a parse tree produced by PdawParser#list.
    def exitList(self, ctx:PdawParser.ListContext):
        pass


    # Enter a parse tree produced by PdawParser#listelem.
    def enterListelem(self, ctx:PdawParser.ListelemContext):
        pass

    # Exit a parse tree produced by PdawParser#listelem.
    def exitListelem(self, ctx:PdawParser.ListelemContext):
        pass


    # Enter a parse tree produced by PdawParser#slicedlist.
    def enterSlicedlist(self, ctx:PdawParser.SlicedlistContext):
        pass

    # Exit a parse tree produced by PdawParser#slicedlist.
    def exitSlicedlist(self, ctx:PdawParser.SlicedlistContext):
        pass


    # Enter a parse tree produced by PdawParser#connectionstmt.
    def enterConnectionstmt(self, ctx:PdawParser.ConnectionstmtContext):
        pass

    # Exit a parse tree produced by PdawParser#connectionstmt.
    def exitConnectionstmt(self, ctx:PdawParser.ConnectionstmtContext):
        pass


    # Enter a parse tree produced by PdawParser#multipleconn.
    def enterMultipleconn(self, ctx:PdawParser.MultipleconnContext):
        pass

    # Exit a parse tree produced by PdawParser#multipleconn.
    def exitMultipleconn(self, ctx:PdawParser.MultipleconnContext):
        pass


    # Enter a parse tree produced by PdawParser#singleconn.
    def enterSingleconn(self, ctx:PdawParser.SingleconnContext):
        pass

    # Exit a parse tree produced by PdawParser#singleconn.
    def exitSingleconn(self, ctx:PdawParser.SingleconnContext):
        pass


    # Enter a parse tree produced by PdawParser#singlenode.
    def enterSinglenode(self, ctx:PdawParser.SinglenodeContext):
        pass

    # Exit a parse tree produced by PdawParser#singlenode.
    def exitSinglenode(self, ctx:PdawParser.SinglenodeContext):
        pass


    # Enter a parse tree produced by PdawParser#parameters.
    def enterParameters(self, ctx:PdawParser.ParametersContext):
        pass

    # Exit a parse tree produced by PdawParser#parameters.
    def exitParameters(self, ctx:PdawParser.ParametersContext):
        pass


    # Enter a parse tree produced by PdawParser#typedparams.
    def enterTypedparams(self, ctx:PdawParser.TypedparamsContext):
        pass

    # Exit a parse tree produced by PdawParser#typedparams.
    def exitTypedparams(self, ctx:PdawParser.TypedparamsContext):
        pass


    # Enter a parse tree produced by PdawParser#argslist.
    def enterArgslist(self, ctx:PdawParser.ArgslistContext):
        pass

    # Exit a parse tree produced by PdawParser#argslist.
    def exitArgslist(self, ctx:PdawParser.ArgslistContext):
        pass


    # Enter a parse tree produced by PdawParser#typedargslist.
    def enterTypedargslist(self, ctx:PdawParser.TypedargslistContext):
        pass

    # Exit a parse tree produced by PdawParser#typedargslist.
    def exitTypedargslist(self, ctx:PdawParser.TypedargslistContext):
        pass


    # Enter a parse tree produced by PdawParser#arg.
    def enterArg(self, ctx:PdawParser.ArgContext):
        pass

    # Exit a parse tree produced by PdawParser#arg.
    def exitArg(self, ctx:PdawParser.ArgContext):
        pass


    # Enter a parse tree produced by PdawParser#typedarg.
    def enterTypedarg(self, ctx:PdawParser.TypedargContext):
        pass

    # Exit a parse tree produced by PdawParser#typedarg.
    def exitTypedarg(self, ctx:PdawParser.TypedargContext):
        pass


    # Enter a parse tree produced by PdawParser#suite.
    def enterSuite(self, ctx:PdawParser.SuiteContext):
        pass

    # Exit a parse tree produced by PdawParser#suite.
    def exitSuite(self, ctx:PdawParser.SuiteContext):
        pass


    # Enter a parse tree produced by PdawParser#operation.
    def enterOperation(self, ctx:PdawParser.OperationContext):
        pass

    # Exit a parse tree produced by PdawParser#operation.
    def exitOperation(self, ctx:PdawParser.OperationContext):
        pass


    # Enter a parse tree produced by PdawParser#ifstmt.
    def enterIfstmt(self, ctx:PdawParser.IfstmtContext):
        pass

    # Exit a parse tree produced by PdawParser#ifstmt.
    def exitIfstmt(self, ctx:PdawParser.IfstmtContext):
        pass


    # Enter a parse tree produced by PdawParser#testnumber.
    def enterTestnumber(self, ctx:PdawParser.TestnumberContext):
        pass

    # Exit a parse tree produced by PdawParser#testnumber.
    def exitTestnumber(self, ctx:PdawParser.TestnumberContext):
        pass


    # Enter a parse tree produced by PdawParser#testvar.
    def enterTestvar(self, ctx:PdawParser.TestvarContext):
        pass

    # Exit a parse tree produced by PdawParser#testvar.
    def exitTestvar(self, ctx:PdawParser.TestvarContext):
        pass


    # Enter a parse tree produced by PdawParser#testsliced.
    def enterTestsliced(self, ctx:PdawParser.TestslicedContext):
        pass

    # Exit a parse tree produced by PdawParser#testsliced.
    def exitTestsliced(self, ctx:PdawParser.TestslicedContext):
        pass


    # Enter a parse tree produced by PdawParser#ParensExpr.
    def enterParensExpr(self, ctx:PdawParser.ParensExprContext):
        pass

    # Exit a parse tree produced by PdawParser#ParensExpr.
    def exitParensExpr(self, ctx:PdawParser.ParensExprContext):
        pass


    # Enter a parse tree produced by PdawParser#testfunc.
    def enterTestfunc(self, ctx:PdawParser.TestfuncContext):
        pass

    # Exit a parse tree produced by PdawParser#testfunc.
    def exitTestfunc(self, ctx:PdawParser.TestfuncContext):
        pass


    # Enter a parse tree produced by PdawParser#MathExpr.
    def enterMathExpr(self, ctx:PdawParser.MathExprContext):
        pass

    # Exit a parse tree produced by PdawParser#MathExpr.
    def exitMathExpr(self, ctx:PdawParser.MathExprContext):
        pass


    # Enter a parse tree produced by PdawParser#TestExpr.
    def enterTestExpr(self, ctx:PdawParser.TestExprContext):
        pass

    # Exit a parse tree produced by PdawParser#TestExpr.
    def exitTestExpr(self, ctx:PdawParser.TestExprContext):
        pass


    # Enter a parse tree produced by PdawParser#forstmt.
    def enterForstmt(self, ctx:PdawParser.ForstmtContext):
        pass

    # Exit a parse tree produced by PdawParser#forstmt.
    def exitForstmt(self, ctx:PdawParser.ForstmtContext):
        pass


    # Enter a parse tree produced by PdawParser#varname.
    def enterVarname(self, ctx:PdawParser.VarnameContext):
        pass

    # Exit a parse tree produced by PdawParser#varname.
    def exitVarname(self, ctx:PdawParser.VarnameContext):
        pass



del PdawParser