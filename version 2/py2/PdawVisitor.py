# Generated from Pdaw.g4 by ANTLR 4.11.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .PdawParser import PdawParser
else:
    from PdawParser import PdawParser

# This class defines a complete generic visitor for a parse tree produced by PdawParser.

class PdawVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by PdawParser#prog.
    def visitProg(self, ctx:PdawParser.ProgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#importstmt.
    def visitImportstmt(self, ctx:PdawParser.ImportstmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#patchstmt.
    def visitPatchstmt(self, ctx:PdawParser.PatchstmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#funcdefstmt.
    def visitFuncdefstmt(self, ctx:PdawParser.FuncdefstmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#returnstmt.
    def visitReturnstmt(self, ctx:PdawParser.ReturnstmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#stmt.
    def visitStmt(self, ctx:PdawParser.StmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#blockstmt.
    def visitBlockstmt(self, ctx:PdawParser.BlockstmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#dotdotstmt.
    def visitDotdotstmt(self, ctx:PdawParser.DotdotstmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#callstmt.
    def visitCallstmt(self, ctx:PdawParser.CallstmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#nodedecl1.
    def visitNodedecl1(self, ctx:PdawParser.Nodedecl1Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#nodedecl2.
    def visitNodedecl2(self, ctx:PdawParser.Nodedecl2Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#nodedecl3.
    def visitNodedecl3(self, ctx:PdawParser.Nodedecl3Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#nodedecl4.
    def visitNodedecl4(self, ctx:PdawParser.Nodedecl4Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#simpledeclstmt.
    def visitSimpledeclstmt(self, ctx:PdawParser.SimpledeclstmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#list.
    def visitList(self, ctx:PdawParser.ListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#listelem.
    def visitListelem(self, ctx:PdawParser.ListelemContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#slicedlist.
    def visitSlicedlist(self, ctx:PdawParser.SlicedlistContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#connectionstmt.
    def visitConnectionstmt(self, ctx:PdawParser.ConnectionstmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#multipleconn.
    def visitMultipleconn(self, ctx:PdawParser.MultipleconnContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#singleconn.
    def visitSingleconn(self, ctx:PdawParser.SingleconnContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#parameters.
    def visitParameters(self, ctx:PdawParser.ParametersContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#typedparams.
    def visitTypedparams(self, ctx:PdawParser.TypedparamsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#argslist.
    def visitArgslist(self, ctx:PdawParser.ArgslistContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#typedargslist.
    def visitTypedargslist(self, ctx:PdawParser.TypedargslistContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#arg.
    def visitArg(self, ctx:PdawParser.ArgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#typedarg.
    def visitTypedarg(self, ctx:PdawParser.TypedargContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#suite.
    def visitSuite(self, ctx:PdawParser.SuiteContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#operation.
    def visitOperation(self, ctx:PdawParser.OperationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#ifstmt.
    def visitIfstmt(self, ctx:PdawParser.IfstmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#testnumber.
    def visitTestnumber(self, ctx:PdawParser.TestnumberContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#testvar.
    def visitTestvar(self, ctx:PdawParser.TestvarContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#ParensExpr.
    def visitParensExpr(self, ctx:PdawParser.ParensExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#testfunc.
    def visitTestfunc(self, ctx:PdawParser.TestfuncContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#MathExpr.
    def visitMathExpr(self, ctx:PdawParser.MathExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#TestExpr.
    def visitTestExpr(self, ctx:PdawParser.TestExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#forstmt.
    def visitForstmt(self, ctx:PdawParser.ForstmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#eos.
    def visitEos(self, ctx:PdawParser.EosContext):
        return self.visitChildren(ctx)



del PdawParser