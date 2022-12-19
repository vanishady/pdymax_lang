# Generated from Simple.g4 by ANTLR 4.11.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .SimpleParser import SimpleParser
else:
    from SimpleParser import SimpleParser

# This class defines a complete generic visitor for a parse tree produced by SimpleParser.


class SimpleVisitor(ParseTreeVisitor):

    def __init__(self):
        #create pd output file
        output = open("output.pd", "w")
        #write first line to pd file
        initline = '#N canvas 676 0 1366 725 12;'
        output.write(initline+'\r\n')
        #initialize memory as a dict
        self.memory = {}
        self.posx=0
        self.posy=0

    def switchnodetype(self, nodetype, x_pos=None, y_pos=None):
        #based on nodetype, return line to write to pd, including
        #[[chuncktype x_pos x_pos arg1 arg2 ...]]
        if nodetype == "message":
            return f'X msg {x_pos} {y_pos} tryharda'
        elif nodetype == "object":
            return f'X obj {x_pos} {y_pos}  *1'

    def writetofile(self, line):
        output = open("output.pd", "a")
        output.write('#'+ str(line) + ';\r\n')

    def positionalg(self):
        self.posx+= 40
        self.posy+= 40
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
        #node analysis
        name = ctx.ID().getText()
        nodetype = ctx.NODETYPE().getText()
        self.memory[name] = nodetype

        #positional algorithm
        x,y = self.positionalg()

        #write node to file
        self.writetofile(self.switchnodetype(nodetype,x,y))
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


    # Visit a parse tree produced by SimpleParser#expr.
    def visitExpr(self, ctx:SimpleParser.ExprContext):
        return self.visitChildren(ctx)



del SimpleParser
