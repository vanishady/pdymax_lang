# Generated from Pdaw.g4 by ANTLR 4.11.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .PdawParser import PdawParser
    from .PdawVisitor import PdawVisitor
else:
    from PdawParser import PdawParser
    from PdawVisitor import PdawVisitor


class NotFoundException(Exception):

    def __init__(self):
        pass

class TypeException(Exception):

    def __init__(self):
        pass

# This class defines a complete generic visitor for a parse tree produced by PdawParser.
class SimpleVar():

    def __init__(self):
        self._name = None
        self._vartype = None
        self._value = None

    def spec(self):
        return self.name, self.vartype, self.value

    def addvalue(self, val):
        self.value.append(val)

    @property
    def name(self):
        return self._name

    @name.setter
    def name(self, varname):
        self._name = varname

    @property
    def vartype(self):
        return self._vartype

    @vartype.setter
    def vartype(self, vtype):
        self._vartype = vtype

    @property
    def value(self):
        return self._value

    @value.setter
    def value(self, val):
        self._value = val


class Node():

    def __init__(self):
        self._scope = None
        self._index = None
        self._name = None
        self._nodetype = None
        self._args = []

    def spec(self):
        return self.index, self.scope, self.index, self.name, self.nodetype, self.args

    @property
    def scope(self):
        return self._scope

    @scope.setter
    def scope(self, nodescope):
        self._scope = nodescope

    @property
    def index(self):
        return self._index

    @index.setter
    def index(self, nodeindex):
        self._index = nodeindex

    @property
    def name(self):
        return self._name

    @name.setter
    def name(self, varname):
        self._name = varname

    @property
    def nodetype(self):
        return self._nodetype

    @nodetype.setter
    def nodetype(self, ntype):
        self._nodetype = ntype

    @property
    def args(self):
        return self._args

    @args.setter
    def args(self, arg):
        self._args.append(arg)

class CustomVisitor(PdawVisitor):

    def __init__(self):
        self._patch = None
        self.memory = [] #memory is a list of node(), normal variables and block()
        self._index = -1
        self._currscope = 'general'

    def inMemory(self, varname):
        for var in self.memory:
            if var.name == varname:
                return True
        return False

    # Visit a parse tree produced by PdawParser#prog.
    def visitProg(self, ctx:PdawParser.ProgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#importstmt.
    def visitImportstmt(self, ctx:PdawParser.ImportstmtContext):
        module = ctx.NAME().getText() #get imported module name
        #importa il file già compilato??
        #devo aggiungere alla memoria tutte le variabili però. no??
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#patchstmt.
    def visitPatchstmt(self, ctx:PdawParser.PatchstmtContext):
        self.patch = ctx.NAME().getText() #assign patch name

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
        self.currscope = ctx.NAME().getText()
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#dotdotstmt.
    def visitDotdotstmt(self, ctx:PdawParser.DotdotstmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#callstmt.
    def visitCallstmt(self, ctx:PdawParser.CallstmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#nodedecl1.
    # rule -> VARNAME '=' NAME parameters?
    def visitNodedecl1(self, ctx:PdawParser.Nodedecl1Context):
        self.index += 1
        self.memory.append(Node())
        self.memory[-1].scope = self.currscope
        self.memory[-1].index = self.index
        self.memory[-1].name = ctx.VARNAME().getText()
        self.memory[-1].nodetype = ctx.NAME().getText()
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#nodedecl2.
    # rule -> NAME parameters? 
    def visitNodedecl2(self, ctx:PdawParser.Nodedecl2Context):
        self.index += 1
        self.memory.append(Node())
        self.memory[-1].scope = self.currscope
        self.memory[-1].index = self.index
        self.memory[-1].nodetype = ctx.NAME().getText()
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#nodedecl3.
    # rule -> operation
    def visitNodedecl3(self, ctx:PdawParser.Nodedecl3Context):
        self.index += 1
        self.memory.append(Node())
        self.memory[-1].scope = self.currscope
        self.memory[-1].index = self.index
        self.memory[-1].nodetype = 'obj'
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#nodedecl4.
    # rule -> VARNAME '=' operation
    def visitNodedecl4(self, ctx:PdawParser.Nodedecl4Context):
        self.index += 1
        self.memory.append(Node())
        self.memory[-1].scope = self.currscope
        self.memory[-1].index = self.index
        self.memory[-1].name = ctx.VARNAME().getText()
        self.memory[-1].nodetype = 'obj'
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#simpledeclstmt.
    def visitSimpledeclstmt(self, ctx:PdawParser.SimpledeclstmtContext):
        self.memory.append(SimpleVar())
        self.memory[-1].name = ctx.VARNAME().getText()
        if ctx.SYMBOL():
            self.memory[-1].value = ctx.SYMBOL().getText()
        elif ctx.NUMBER():
            self.memory[-1].value = ctx.NUMBER().getText()
        else:
            return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#list.
    def visitList(self, ctx:PdawParser.ListContext):
    #per ora facciamo che una lista può essere solo di symbol o numbers
        self.memory[-1].value = []
        if ctx.SYMBOL():
            for elem in ctx.SYMBOL():
                self.memory[-1].addvalue(elem.getText()[1:-1])
        elif ctx.NUMBER():
            for elem in ctx.NUMBER():
                self.memory[-1].addvalue(elem.getText())
        else:
            for elem in ctx.VARNAME():
                try:
                    if self.inMemory(elem.getText())==False:
                        raise NotFoundException
                    for n in self.memory:
                        if n.name == elem.getText() and type(n)==Node:
                            raise TypeException
                    else:
                        self.memory[-1].addvalue(elem.getText())
                except NotFoundException:
                    print(f'cannot find variable {elem.getText()}')
                except TypeException:
                    print(f'cannot add node variables to list[] type')


    # Visit a parse tree produced by PdawParser#slicedlist.
    def visitSlicedlist(self, ctx:PdawParser.SlicedlistContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#connectionstmt.
    def visitConnectionstmt(self, ctx:PdawParser.ConnectionstmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#connectionelem.
    def visitConnectionelem(self, ctx:PdawParser.ConnectionelemContext):
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
        if ctx.SYMBOL(): 
            self.memory[-1].args = ctx.SYMBOL().getText()[1:-1]
        if ctx.NUMBER():
            self.memory[-1].args = ctx.NUMBER().getText()

        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#typedarg.
    def visitTypedarg(self, ctx:PdawParser.TypedargContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#suite.
    def visitSuite(self, ctx:PdawParser.SuiteContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#operation.
    def visitOperation(self, ctx:PdawParser.OperationContext):
        self.memory[-1].args = ctx.op.text
        if ctx.NUMBER():
            self.memory[-1].args = ctx.NUMBER().getText()
            
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

    #getter and setter

    @property
    def patch(self):
        return self._patch

    @patch.setter
    def patch(self, patchname):
        self._patch = patchname

    @property
    def index(self):
        return self._index

    @index.setter
    def index(self, nodeindex):
        self._index = nodeindex

    @property
    def currscope(self):
        return self._currscope

    @currscope.setter
    def currscope(self, scope):
        self._currscope = scope



del PdawParser
