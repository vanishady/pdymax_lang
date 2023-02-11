# Generated from Pdaw.g4 by ANTLR 4.11.1
from antlr4 import *
import sys
if __name__ is not None and "." in __name__:
    from .PdawParser import PdawParser
    from .PdawVisitor import PdawVisitor
else:
    from PdawParser import PdawParser
    from PdawVisitor import PdawVisitor

# This class defines a complete generic visitor for a parse tree produced by PdawParser.

class AlreadyExistsException(Exception):

    def __init__(self, varname, vartype=0):
        vartypes = ['function/block', 'node', 'variable']
        self._varname = varname
        self._vartype = vartypes[vartype]

    def __str__(self):
        return f'{self._vartype} <{self._varname}> already exists. Change name.'

class NotFoundException(Exception):

    def __init__(self, varname, isfunc=False):
        self._varname = varname
        self._isfunc = isfunc

    def __str__(self):
        if self._isfunc == True:
            return f'cannot find function/block {self._varname}'
        return f'cannot find variable {self._varname}'

class InvalidTypeException(Exception):

    def __init__(self, name):
        self._name = name

    def __str__(self):
        return f'invalid object type <{self._name}>'

class TypeException(Exception):

    def __init__(self, name):
        self._name = name

    def __str__(self):
        return f'cannot add node variable to list'
    

class Function():

    """ implements functions """

    def __init__(self):
        self._name = None
        self._expargs = [] #[ (vname, vtype), (vname, vtype),  ...]
        self._body = None
        self._returns = None

    def spec(self):
        return self.name, self.expargs

    @property
    def name(self):
        return self._name

    @name.setter
    def name(self, funcname):
        self._name = funcname

    @property
    def expargs(self):
        return self._expargs

    @expargs.setter
    def expargs(self, typedargs):
        self._expargs = typedargs

    @property
    def body(self):
        return self._body

    @body.setter
    def body(self, bodyctx):
        self._body = bodyctx

    @property
    def returns(self):
        return self._returns

    @returns.setter
    def returns(self, returnctx):
        self._returns = returnctx

class Block():

    """ implements blocks """

    def __init__(self):
        self._name = None
        self._expargs = [] #[ (vname, vtype), (vname, vtype),  ...]
        self._body = None
        self._dotdot = []

    def spec(self):
        return self.name, self.expargs

    @property
    def name(self):
        return self._name

    @name.setter
    def name(self, blockname):
        self._name = blockname

    @property
    def expargs(self):
        return self._expargs

    @expargs.setter
    def expargs(self, typedargs):
        self._expargs = typedargs

    @property
    def body(self):
        return self._body

    @body.setter
    def body(self, bodyctx):
        self._body = bodyctx

    @property
    def dotdot(self):
        return self._dotdot

    @dotdot.setter
    def dotdot(self, dotdotctx):
        self._dotdot.append(dotdotctx)

class SimpleVar():

    """implements int, float, symbol variables"""

    def __init__(self):
        self._name = None
        self._vartype = None
        self._value = None
        self._scope = None

    def spec(self):
        return self.name, self.scope, self.vartype, self.value

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

    @property
    def scope(self):
        return self._scope

    @scope.setter
    def scope(self, scopename):
        self._scope = scopename

class Node():

    """implements nodes"""

    def __init__(self):
        self._scope = None
        self._index = None
        self._name = None
        self._nodetype = None
        self._args = None

    def spec(self):
        return self.index, self.scope, self.name, self.nodetype, self.args

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
        try:
            objnodes = open('utils/basicnodes.txt', 'r')
            if ntype not in objnodes.read():
                raise InvalidTypeException(ntype)
        except InvalidTypeException as e:
            print(e)
        self._nodetype = ntype

    @property
    def args(self):
        return self._args

    @args.setter
    def args(self, arg):
        self._args = arg
    

class CustomVisitor(PdawVisitor):

    def __init__(self):
        self._patch = None
        self.memory = [] #memory of nodes and simple variables
        self.callables = [] #memory of functions and blocks
        self._index = -1 #index of node declarations
        self._currscope = 'main'
        self._prevscope = []

    def memorized(self, varname):
        #just ckecks if variable with given varname is in memory
        try:
            for var in self.memory:
                if var.name == varname:
                    return var
            raise NotFoundException(varname)
        except NotFoundException as e:
            print(e)
            sys.exit(1)
        
    # Visit a parse tree produced by PdawParser#prog.
    def visitProg(self, ctx:PdawParser.ProgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#importstmt.
    def visitImportstmt(self, ctx:PdawParser.ImportstmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#patchstmt.
    def visitPatchstmt(self, ctx:PdawParser.PatchstmtContext):
        self.patch = ctx.NAME().getText()
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#funcdefstmt.
    # funcdefstmt: FUNC NAME typedparams '{' suite returnstmt? NL* eos NL ; 
    def visitFuncdefstmt(self, ctx:PdawParser.FuncdefstmtContext):
        """i nodi creati in una funzione vengono stampati nello scope dove è stata
        chiamata la funzione. se il valore ritornato è un nodo, allora è agganciabile in
        un connectionstmt, altrimenti è una variabile utilizzabile come argomento ecc"""
        name = ctx.NAME().getText()
        #append function in self.callables memory
        try:
            for f in self.callables:
                if f.name == name:
                    raise AlreadyExistsException(name, 0)
            self.callables.append(Function())
        except AlreadyExistsException as e:
            print(e)

        bookmark = self.callables[-1]
        bookmark.name = name #store name
        bookmark.body = ctx.suite() #store function body ctx
        bookmark.expargs = self.visit(ctx.typedparams()) #store expected args
        if ctx.returnstmt():
            bookmark.returns = ctx.returnstmt() #store return ctx

        print(bookmark.spec())


    # Visit a parse tree produced by PdawParser#returnstmt.
    def visitReturnstmt(self, ctx:PdawParser.ReturnstmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#stmt.
    def visitStmt(self, ctx:PdawParser.StmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#blockstmt.
    # blockstmt: BLOCK NAME typedparams '{' suite dotdotstmt* NL* eos NL ;
    def visitBlockstmt(self, ctx:PdawParser.BlockstmtContext):
        name = ctx.NAME().getText()
        try:
            for f in self.callables:
                if f.name == name:
                    raise AlreadyExistsException(name, 0)
            self.callables.append(Block())
        except AlreadyExistsException as e:
            print(e)

        bookmark = self.callables[-1]
        bookmark.name = name #store name
        bookmark.body = ctx.suite() #store function body ctx
        bookmark.expargs = self.visit(ctx.typedparams()) #store expected args
        if ctx.dotdotstmt():
            for i in range(len(ctx.dotdotstmt())):
                bookmark.dotdot = ctx.dotdotstmt(i) #store dotdot ctx

        print(bookmark.spec())

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
        bookmark = self.memory[-1]
        bookmark.scope = self.currscope 
        bookmark.index = self.index 
        bookmark.name = ctx.VARNAME().getText()
        bookmark.nodetype = ctx.NAME().getText()
        if ctx.parameters():
            bookmark.args = self.visit(ctx.parameters())

        print(bookmark.spec())


    # Visit a parse tree produced by PdawParser#nodedecl2.
    # rule -> NAME parameters?
    def visitNodedecl2(self, ctx:PdawParser.Nodedecl2Context):
        self.index += 1
        self.memory.append(Node())
        bookmark = self.memory[-1]
        bookmark.scope = self.currscope 
        bookmark.index = self.index 
        bookmark.nodetype = ctx.NAME().getText()
        if ctx.parameters():
            bookmark.args = self.visit(ctx.parameters())

        print(bookmark.spec())


    # Visit a parse tree produced by PdawParser#nodedecl3.
    # rule -> operation
    def visitNodedecl3(self, ctx:PdawParser.Nodedecl3Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#nodedecl4.
    # rule -> VARNAME '=' operation
    def visitNodedecl4(self, ctx:PdawParser.Nodedecl4Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#simpledeclstmt.
    # rule -> VARNAME '=' SYMBOL | NUMBER | list | slicedlist | callstmt | expr
    def visitSimpledeclstmt(self, ctx:PdawParser.SimpledeclstmtContext):
        self.memory.append(SimpleVar())
        bookmark = self.memory[-1]
        bookmark.name = ctx.VARNAME().getText()
        bookmark.scope = self.currscope
        if ctx.SYMBOL():
            bookmark.value = ctx.SYMBOL().getText()[1:-1]
        elif ctx.NUMBER():
            if '.' in ctx.NUMBER().getText():
                bookmark.value = float(ctx.NUMBER().getText())
            else:
                bookmark.value = int(ctx.NUMBER().getText())
        elif ctx.slicedlist():
            bookmark.value = self.visit(ctx.slicedlist())
        elif ctx.callstmt():
            print('callstmt')
        elif ctx.expr():
            bookmark.value = self.visit(ctx.expr())
        else: #list
            bookmark.value = self.visitChildren(ctx)

        print(bookmark.spec())

    # Visit a parse tree produced by PdawParser#list.
    # : '[' (SYMBOL (',' SYMBOL)*)* ']' | '[' (NUMBER (',' NUMBER)*)* ']' | '[' (VARNAME (',' VARNAME)*)* ']' | mixedlist
    def visitList(self, ctx:PdawParser.ListContext):
        varlist = []
        for i in range(len(ctx.listelem())):
            varlist.append(self.visit(ctx.listelem(i)))
        return varlist

    # Visit a parse tree produced by PdawParser#listelem.
    def visitListelem(self, ctx:PdawParser.ListelemContext):
        if ctx.SYMBOL():
                return ctx.SYMBOL().getText()[1:-1]
        elif ctx.NUMBER():
            return ctx.NUMBER().getText()
        elif ctx.VARNAME():
            try:
                vname = ctx.VARNAME().getText()
                if type(self.memorized(vname))==Node:
                    raise TypeException   
            except TypeException as e:
                print(e)
            return self.memorized(ctx.VARNAME().getText()).value    


    # Visit a parse tree produced by PdawParser#slicedlist.
    def visitSlicedlist(self, ctx:PdawParser.SlicedlistContext):
        list_var = ctx.VARNAME(0).getText()

        try:
            list_var = self.memorized(list_var)    
            if ctx.VARNAME(1): #VARNAME '[' VARNAME ']' 
                num_var = ctx.VARNAME(1).getText()
                res = list_var.value[int(self.memorized(num_var).value)]
            elif ctx.NUMBER(): #VARNAME '[' NUMBER ']'
                num = ctx.NUMBER().getText()   
                res = list_var.value[int(num)]
                
        except AttributeError:
            print(f'cannot use non numeric variable as index in list slicing, at line: {ctx.getText()}')
        except IndexError:
            print(f'index out of range, at line: {ctx.getText()}')

        else:
            return res


    # Visit a parse tree produced by PdawParser#connectionstmt.
    def visitConnectionstmt(self, ctx:PdawParser.ConnectionstmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#connectionelem.
    def visitConnectionelem(self, ctx:PdawParser.ConnectionelemContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#parameters.
    def visitParameters(self, ctx:PdawParser.ParametersContext):
        return self.visit(ctx.argslist())


    # Visit a parse tree produced by PdawParser#typedparams.
    #  : '(' typedargslist? ')'
    def visitTypedparams(self, ctx:PdawParser.TypedparamsContext):
        return self.visit(ctx.typedargslist())


    # Visit a parse tree produced by PdawParser#argslist.
    def visitArgslist(self, ctx:PdawParser.ArgslistContext):
        arglist = []
        for i in range (len(ctx.arg())):
            arg = self.visit(ctx.arg(i))
            arglist.append(arg)
        return arglist


    # Visit a parse tree produced by PdawParser#typedargslist.
    #  : typedarg (',' typedarg)*
    def visitTypedargslist(self, ctx:PdawParser.TypedargslistContext):
        typedlist = []
        for i in range (len(ctx.typedarg())):
            typedarg = self.visit(ctx.typedarg(i))
            typedlist.append(typedarg)
        return typedlist


    # Visit a parse tree produced by PdawParser#arg.
    def visitArg(self, ctx:PdawParser.ArgContext):
        if ctx.SYMBOL(): 
            return ctx.SYMBOL().getText()[1:-1]
        elif ctx.NUMBER():
            return ctx.NUMBER().getText()
        elif ctx.VARNAME():
            vname = ctx.VARNAME().getText()
            if type(self.memorized(vname))==Node:
                raise Exception('argument cannot be node')
            if type(self.memorized(vname))==SimpleVar:
                return self.memorized(vname).value
        elif ctx.slicedlist():
            return self.visit(ctx.slicedlist())
        elif ctx.expr():
            return self.visit(ctx.expr())
        elif ctx.callstmt():
            print('callstmtttt')
        else: #list
            return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#typedarg.
    #  : VARNAME ':' VARTYPE
    def visitTypedarg(self, ctx:PdawParser.TypedargContext):
        vname = ctx.VARNAME().getText()
        vtype = ctx.VARTYPE().getText()
        return (vname, vtype)


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
        num = ctx.NUMBER().getText()
        if '.' in num:
            return float(num)
        return int(num)


    # Visit a parse tree produced by PdawParser#testvar.
    def visitTestvar(self, ctx:PdawParser.TestvarContext):
        vname = ctx.VARNAME().getText()
        try:
            if isinstance(self.memorized(vname).value, (float, int))==False:
                raise TypeException()
            
        except TypeException as e:
            print(f'cannot use non numeric variables in expressions')
        except AttributeError:
            print('cannot use nodes in expressions')
            sys.exit(1)
            
        else:
            if '.' in str(self.memorized(vname).value):
                return float(self.memorized(vname).value)
            return int(self.memorized(vname).value)


    # Visit a parse tree produced by PdawParser#ParensExpr.
    def visitParensExpr(self, ctx:PdawParser.ParensExprContext):
        return self.visit(ctx.expr())


    # Visit a parse tree produced by PdawParser#testfunc.
    def visitTestfunc(self, ctx:PdawParser.TestfuncContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#MathExpr.
    def visitMathExpr(self, ctx:PdawParser.MathExprContext):
        left=self.visit(ctx.expr(0))
        right=self.visit(ctx.expr(1))
        
        if ctx.op.text == '+':
            res=(left)+(right)
        elif ctx.op.text == '-':
            res=(left)-(right)
        elif ctx.op.text == '*':
            res=(left)*(right)
        elif ctx.op.text == '/':
            res=(left)/(right)
        elif ctx.op.text == '%':
            res=(left)%(right)

        return res


    # Visit a parse tree produced by PdawParser#TestExpr.
    def visitTestExpr(self, ctx:PdawParser.TestExprContext):
        left = self.visit(ctx.expr(0))
        right = self.visit(ctx.expr(1))

        if ctx.testop.text == '==':
            if (left)==(right):
                res=True
            else:
                res=False
        elif ctx.testop.text == '!=':
            if (left)!=(right):
                res=True
            else:
                res=False
        elif ctx.testop.text == '>':
            if (left)>(right):
                res=True
            else:
                res=False
        elif ctx.testop.text == '>=':
            if (left)>=(right):
                res=True
            else:
                res=False
        elif ctx.testop.text == '<=':
            if (left)<=(right):
                res=True
            else:
                res=False
        elif ctx.testop.text == '<':
            if (left)<(right):
                res=True
            else:
                res=False
        
        return res


    # Visit a parse tree produced by PdawParser#forstmt.
    def visitForstmt(self, ctx:PdawParser.ForstmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#eos.
    def visitEos(self, ctx:PdawParser.EosContext):
        return self.visitChildren(ctx)

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
        self.prevscope = self._currscope
        self._currscope = scope

    @property
    def prevscope(self):
        return self._prevscope

    @prevscope.setter
    def prevscope(self, scope):
        self._prevscope.append(scope)



del PdawParser
