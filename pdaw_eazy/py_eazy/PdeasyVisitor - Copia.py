# Generated from Pdeasy.g4 by ANTLR 4.11.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .PdeasyParser import PdeasyParser
else:
    from PdeasyParser import PdeasyParser

# This class defines a complete generic visitor for a parse tree produced by PdeasyParser.

class PdeasyVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by PdeasyParser#prog.
    def visitProg(self, ctx:PdeasyParser.ProgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdeasyParser#patchstmt.
    def visitPatchstmt(self, ctx:PdeasyParser.PatchstmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdeasyParser#importstmt.
    def visitImportstmt(self, ctx:PdeasyParser.ImportstmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdeasyParser#funcdefstmt.
    def visitFuncdefstmt(self, ctx:PdeasyParser.FuncdefstmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdeasyParser#returnstmt.
    def visitReturnstmt(self, ctx:PdeasyParser.ReturnstmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdeasyParser#stmt.
    def visitStmt(self, ctx:PdeasyParser.StmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdeasyParser#blockstmt.
    def visitBlockstmt(self, ctx:PdeasyParser.BlockstmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdeasyParser#callstmt.
    def visitCallstmt(self, ctx:PdeasyParser.CallstmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdeasyParser#nodedecl1.
    def visitNodedecl1(self, ctx:PdeasyParser.Nodedecl1Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdeasyParser#nodedecl2.
    def visitNodedecl2(self, ctx:PdeasyParser.Nodedecl2Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdeasyParser#nodedecl3.
    def visitNodedecl3(self, ctx:PdeasyParser.Nodedecl3Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdeasyParser#nodedecl4.
    def visitNodedecl4(self, ctx:PdeasyParser.Nodedecl4Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdeasyParser#simpledecl.
    def visitSimpledecl(self, ctx:PdeasyParser.SimpledeclContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdeasyParser#list.
    def visitList(self, ctx:PdeasyParser.ListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdeasyParser#listelem.
    def visitListelem(self, ctx:PdeasyParser.ListelemContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdeasyParser#list_access.
    def visitList_access(self, ctx:PdeasyParser.List_accessContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdeasyParser#connectionstmt.
    def visitConnectionstmt(self, ctx:PdeasyParser.ConnectionstmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdeasyParser#multipleconn.
    def visitMultipleconn(self, ctx:PdeasyParser.MultipleconnContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdeasyParser#singleconn.
    def visitSingleconn(self, ctx:PdeasyParser.SingleconnContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdeasyParser#singlenode.
    def visitSinglenode(self, ctx:PdeasyParser.SinglenodeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdeasyParser#parameters.
    def visitParameters(self, ctx:PdeasyParser.ParametersContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdeasyParser#typedparams.
    def visitTypedparams(self, ctx:PdeasyParser.TypedparamsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdeasyParser#argslist.
    def visitArgslist(self, ctx:PdeasyParser.ArgslistContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdeasyParser#typedargslist.
    def visitTypedargslist(self, ctx:PdeasyParser.TypedargslistContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdeasyParser#arg.
    def visitArg(self, ctx:PdeasyParser.ArgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdeasyParser#typedarg.
    def visitTypedarg(self, ctx:PdeasyParser.TypedargContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdeasyParser#suite.
    def visitSuite(self, ctx:PdeasyParser.SuiteContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdeasyParser#operation.
    def visitOperation(self, ctx:PdeasyParser.OperationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdeasyParser#ifstmt.
    def visitIfstmt(self, ctx:PdeasyParser.IfstmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdeasyParser#SubAdd.
    def visitSubAdd(self, ctx:PdeasyParser.SubAddContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdeasyParser#MulDiv.
    def visitMulDiv(self, ctx:PdeasyParser.MulDivContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdeasyParser#TestCall.
    def visitTestCall(self, ctx:PdeasyParser.TestCallContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdeasyParser#ParensExpr.
    def visitParensExpr(self, ctx:PdeasyParser.ParensExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdeasyParser#TestCompare.
    def visitTestCompare(self, ctx:PdeasyParser.TestCompareContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdeasyParser#TestSym.
    def visitTestSym(self, ctx:PdeasyParser.TestSymContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdeasyParser#TestVar.
    def visitTestVar(self, ctx:PdeasyParser.TestVarContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdeasyParser#TestNum.
    def visitTestNum(self, ctx:PdeasyParser.TestNumContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdeasyParser#TestListAccess.
    def visitTestListAccess(self, ctx:PdeasyParser.TestListAccessContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdeasyParser#node_expr.
    def visitNode_expr(self, ctx:PdeasyParser.Node_exprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdeasyParser#nodeptr.
    def visitNodeptr(self, ctx:PdeasyParser.NodeptrContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdeasyParser#forstmt.
    def visitForstmt(self, ctx:PdeasyParser.ForstmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdeasyParser#varname.
    def visitVarname(self, ctx:PdeasyParser.VarnameContext):
        return self.visitChildren(ctx)



del PdeasyParser