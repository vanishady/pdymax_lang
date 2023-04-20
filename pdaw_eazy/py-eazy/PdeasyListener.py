# Generated from Pdeasy.g4 by ANTLR 4.11.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .PdeasyParser import PdeasyParser
else:
    from PdeasyParser import PdeasyParser

# This class defines a complete listener for a parse tree produced by PdeasyParser.
class PdeasyListener(ParseTreeListener):

    # Enter a parse tree produced by PdeasyParser#prog.
    def enterProg(self, ctx:PdeasyParser.ProgContext):
        pass

    # Exit a parse tree produced by PdeasyParser#prog.
    def exitProg(self, ctx:PdeasyParser.ProgContext):
        pass


    # Enter a parse tree produced by PdeasyParser#patchstmt.
    def enterPatchstmt(self, ctx:PdeasyParser.PatchstmtContext):
        pass

    # Exit a parse tree produced by PdeasyParser#patchstmt.
    def exitPatchstmt(self, ctx:PdeasyParser.PatchstmtContext):
        pass


    # Enter a parse tree produced by PdeasyParser#importstmt.
    def enterImportstmt(self, ctx:PdeasyParser.ImportstmtContext):
        pass

    # Exit a parse tree produced by PdeasyParser#importstmt.
    def exitImportstmt(self, ctx:PdeasyParser.ImportstmtContext):
        pass


    # Enter a parse tree produced by PdeasyParser#funcdefstmt.
    def enterFuncdefstmt(self, ctx:PdeasyParser.FuncdefstmtContext):
        pass

    # Exit a parse tree produced by PdeasyParser#funcdefstmt.
    def exitFuncdefstmt(self, ctx:PdeasyParser.FuncdefstmtContext):
        pass


    # Enter a parse tree produced by PdeasyParser#returnstmt.
    def enterReturnstmt(self, ctx:PdeasyParser.ReturnstmtContext):
        pass

    # Exit a parse tree produced by PdeasyParser#returnstmt.
    def exitReturnstmt(self, ctx:PdeasyParser.ReturnstmtContext):
        pass


    # Enter a parse tree produced by PdeasyParser#stmt.
    def enterStmt(self, ctx:PdeasyParser.StmtContext):
        pass

    # Exit a parse tree produced by PdeasyParser#stmt.
    def exitStmt(self, ctx:PdeasyParser.StmtContext):
        pass


    # Enter a parse tree produced by PdeasyParser#blockstmt.
    def enterBlockstmt(self, ctx:PdeasyParser.BlockstmtContext):
        pass

    # Exit a parse tree produced by PdeasyParser#blockstmt.
    def exitBlockstmt(self, ctx:PdeasyParser.BlockstmtContext):
        pass


    # Enter a parse tree produced by PdeasyParser#callstmt.
    def enterCallstmt(self, ctx:PdeasyParser.CallstmtContext):
        pass

    # Exit a parse tree produced by PdeasyParser#callstmt.
    def exitCallstmt(self, ctx:PdeasyParser.CallstmtContext):
        pass


    # Enter a parse tree produced by PdeasyParser#nodedecl1.
    def enterNodedecl1(self, ctx:PdeasyParser.Nodedecl1Context):
        pass

    # Exit a parse tree produced by PdeasyParser#nodedecl1.
    def exitNodedecl1(self, ctx:PdeasyParser.Nodedecl1Context):
        pass


    # Enter a parse tree produced by PdeasyParser#nodedecl2.
    def enterNodedecl2(self, ctx:PdeasyParser.Nodedecl2Context):
        pass

    # Exit a parse tree produced by PdeasyParser#nodedecl2.
    def exitNodedecl2(self, ctx:PdeasyParser.Nodedecl2Context):
        pass


    # Enter a parse tree produced by PdeasyParser#nodedecl3.
    def enterNodedecl3(self, ctx:PdeasyParser.Nodedecl3Context):
        pass

    # Exit a parse tree produced by PdeasyParser#nodedecl3.
    def exitNodedecl3(self, ctx:PdeasyParser.Nodedecl3Context):
        pass


    # Enter a parse tree produced by PdeasyParser#nodedecl4.
    def enterNodedecl4(self, ctx:PdeasyParser.Nodedecl4Context):
        pass

    # Exit a parse tree produced by PdeasyParser#nodedecl4.
    def exitNodedecl4(self, ctx:PdeasyParser.Nodedecl4Context):
        pass


    # Enter a parse tree produced by PdeasyParser#simpledecl.
    def enterSimpledecl(self, ctx:PdeasyParser.SimpledeclContext):
        pass

    # Exit a parse tree produced by PdeasyParser#simpledecl.
    def exitSimpledecl(self, ctx:PdeasyParser.SimpledeclContext):
        pass


    # Enter a parse tree produced by PdeasyParser#list.
    def enterList(self, ctx:PdeasyParser.ListContext):
        pass

    # Exit a parse tree produced by PdeasyParser#list.
    def exitList(self, ctx:PdeasyParser.ListContext):
        pass


    # Enter a parse tree produced by PdeasyParser#listelem.
    def enterListelem(self, ctx:PdeasyParser.ListelemContext):
        pass

    # Exit a parse tree produced by PdeasyParser#listelem.
    def exitListelem(self, ctx:PdeasyParser.ListelemContext):
        pass


    # Enter a parse tree produced by PdeasyParser#list_access.
    def enterList_access(self, ctx:PdeasyParser.List_accessContext):
        pass

    # Exit a parse tree produced by PdeasyParser#list_access.
    def exitList_access(self, ctx:PdeasyParser.List_accessContext):
        pass


    # Enter a parse tree produced by PdeasyParser#connectionstmt.
    def enterConnectionstmt(self, ctx:PdeasyParser.ConnectionstmtContext):
        pass

    # Exit a parse tree produced by PdeasyParser#connectionstmt.
    def exitConnectionstmt(self, ctx:PdeasyParser.ConnectionstmtContext):
        pass


    # Enter a parse tree produced by PdeasyParser#multipleconn.
    def enterMultipleconn(self, ctx:PdeasyParser.MultipleconnContext):
        pass

    # Exit a parse tree produced by PdeasyParser#multipleconn.
    def exitMultipleconn(self, ctx:PdeasyParser.MultipleconnContext):
        pass


    # Enter a parse tree produced by PdeasyParser#singleconn.
    def enterSingleconn(self, ctx:PdeasyParser.SingleconnContext):
        pass

    # Exit a parse tree produced by PdeasyParser#singleconn.
    def exitSingleconn(self, ctx:PdeasyParser.SingleconnContext):
        pass


    # Enter a parse tree produced by PdeasyParser#singlenode.
    def enterSinglenode(self, ctx:PdeasyParser.SinglenodeContext):
        pass

    # Exit a parse tree produced by PdeasyParser#singlenode.
    def exitSinglenode(self, ctx:PdeasyParser.SinglenodeContext):
        pass


    # Enter a parse tree produced by PdeasyParser#parameters.
    def enterParameters(self, ctx:PdeasyParser.ParametersContext):
        pass

    # Exit a parse tree produced by PdeasyParser#parameters.
    def exitParameters(self, ctx:PdeasyParser.ParametersContext):
        pass


    # Enter a parse tree produced by PdeasyParser#typedparams.
    def enterTypedparams(self, ctx:PdeasyParser.TypedparamsContext):
        pass

    # Exit a parse tree produced by PdeasyParser#typedparams.
    def exitTypedparams(self, ctx:PdeasyParser.TypedparamsContext):
        pass


    # Enter a parse tree produced by PdeasyParser#argslist.
    def enterArgslist(self, ctx:PdeasyParser.ArgslistContext):
        pass

    # Exit a parse tree produced by PdeasyParser#argslist.
    def exitArgslist(self, ctx:PdeasyParser.ArgslistContext):
        pass


    # Enter a parse tree produced by PdeasyParser#typedargslist.
    def enterTypedargslist(self, ctx:PdeasyParser.TypedargslistContext):
        pass

    # Exit a parse tree produced by PdeasyParser#typedargslist.
    def exitTypedargslist(self, ctx:PdeasyParser.TypedargslistContext):
        pass


    # Enter a parse tree produced by PdeasyParser#arg.
    def enterArg(self, ctx:PdeasyParser.ArgContext):
        pass

    # Exit a parse tree produced by PdeasyParser#arg.
    def exitArg(self, ctx:PdeasyParser.ArgContext):
        pass


    # Enter a parse tree produced by PdeasyParser#typedarg.
    def enterTypedarg(self, ctx:PdeasyParser.TypedargContext):
        pass

    # Exit a parse tree produced by PdeasyParser#typedarg.
    def exitTypedarg(self, ctx:PdeasyParser.TypedargContext):
        pass


    # Enter a parse tree produced by PdeasyParser#suite.
    def enterSuite(self, ctx:PdeasyParser.SuiteContext):
        pass

    # Exit a parse tree produced by PdeasyParser#suite.
    def exitSuite(self, ctx:PdeasyParser.SuiteContext):
        pass


    # Enter a parse tree produced by PdeasyParser#operation.
    def enterOperation(self, ctx:PdeasyParser.OperationContext):
        pass

    # Exit a parse tree produced by PdeasyParser#operation.
    def exitOperation(self, ctx:PdeasyParser.OperationContext):
        pass


    # Enter a parse tree produced by PdeasyParser#ifstmt.
    def enterIfstmt(self, ctx:PdeasyParser.IfstmtContext):
        pass

    # Exit a parse tree produced by PdeasyParser#ifstmt.
    def exitIfstmt(self, ctx:PdeasyParser.IfstmtContext):
        pass


    # Enter a parse tree produced by PdeasyParser#SubAdd.
    def enterSubAdd(self, ctx:PdeasyParser.SubAddContext):
        pass

    # Exit a parse tree produced by PdeasyParser#SubAdd.
    def exitSubAdd(self, ctx:PdeasyParser.SubAddContext):
        pass


    # Enter a parse tree produced by PdeasyParser#MulDiv.
    def enterMulDiv(self, ctx:PdeasyParser.MulDivContext):
        pass

    # Exit a parse tree produced by PdeasyParser#MulDiv.
    def exitMulDiv(self, ctx:PdeasyParser.MulDivContext):
        pass


    # Enter a parse tree produced by PdeasyParser#TestCall.
    def enterTestCall(self, ctx:PdeasyParser.TestCallContext):
        pass

    # Exit a parse tree produced by PdeasyParser#TestCall.
    def exitTestCall(self, ctx:PdeasyParser.TestCallContext):
        pass


    # Enter a parse tree produced by PdeasyParser#ParensExpr.
    def enterParensExpr(self, ctx:PdeasyParser.ParensExprContext):
        pass

    # Exit a parse tree produced by PdeasyParser#ParensExpr.
    def exitParensExpr(self, ctx:PdeasyParser.ParensExprContext):
        pass


    # Enter a parse tree produced by PdeasyParser#TestCompare.
    def enterTestCompare(self, ctx:PdeasyParser.TestCompareContext):
        pass

    # Exit a parse tree produced by PdeasyParser#TestCompare.
    def exitTestCompare(self, ctx:PdeasyParser.TestCompareContext):
        pass


    # Enter a parse tree produced by PdeasyParser#TestSym.
    def enterTestSym(self, ctx:PdeasyParser.TestSymContext):
        pass

    # Exit a parse tree produced by PdeasyParser#TestSym.
    def exitTestSym(self, ctx:PdeasyParser.TestSymContext):
        pass


    # Enter a parse tree produced by PdeasyParser#TestVar.
    def enterTestVar(self, ctx:PdeasyParser.TestVarContext):
        pass

    # Exit a parse tree produced by PdeasyParser#TestVar.
    def exitTestVar(self, ctx:PdeasyParser.TestVarContext):
        pass


    # Enter a parse tree produced by PdeasyParser#TestNum.
    def enterTestNum(self, ctx:PdeasyParser.TestNumContext):
        pass

    # Exit a parse tree produced by PdeasyParser#TestNum.
    def exitTestNum(self, ctx:PdeasyParser.TestNumContext):
        pass


    # Enter a parse tree produced by PdeasyParser#TestListAccess.
    def enterTestListAccess(self, ctx:PdeasyParser.TestListAccessContext):
        pass

    # Exit a parse tree produced by PdeasyParser#TestListAccess.
    def exitTestListAccess(self, ctx:PdeasyParser.TestListAccessContext):
        pass


    # Enter a parse tree produced by PdeasyParser#forstmt.
    def enterForstmt(self, ctx:PdeasyParser.ForstmtContext):
        pass

    # Exit a parse tree produced by PdeasyParser#forstmt.
    def exitForstmt(self, ctx:PdeasyParser.ForstmtContext):
        pass


    # Enter a parse tree produced by PdeasyParser#varname.
    def enterVarname(self, ctx:PdeasyParser.VarnameContext):
        pass

    # Exit a parse tree produced by PdeasyParser#varname.
    def exitVarname(self, ctx:PdeasyParser.VarnameContext):
        pass


    # Enter a parse tree produced by PdeasyParser#inlet.
    def enterInlet(self, ctx:PdeasyParser.InletContext):
        pass

    # Exit a parse tree produced by PdeasyParser#inlet.
    def exitInlet(self, ctx:PdeasyParser.InletContext):
        pass


    # Enter a parse tree produced by PdeasyParser#outlet.
    def enterOutlet(self, ctx:PdeasyParser.OutletContext):
        pass

    # Exit a parse tree produced by PdeasyParser#outlet.
    def exitOutlet(self, ctx:PdeasyParser.OutletContext):
        pass



del PdeasyParser