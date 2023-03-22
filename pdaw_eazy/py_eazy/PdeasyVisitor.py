# Generated from Pdeasy.g4 by ANTLR 4.11.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .PdeasyParser import PdeasyParser
else:
    from PdeasyParser import PdeasyParser

###############
# exceptions
###############


class AlreadyExistsException(Exception):

    def __init__(self, lineno, varname):
        self._varname = varname
        self._lineno = lineno

    def __str__(self):
        return f'error at line: {self._lineno}\n <{self._varname}> already exists. Change name.'


###############
# variables
###############

class Function():

    def __init__(self):
        self._name = None
        self._body = None
        self._expargs = None #lista di tuple (vname, vtype)

    def spec(self):
        return self.name, self.expargs

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
    

class Block():

    def __init__(self):
        self._name = None
        self._index = None
        self._body = None
        self._expargs = None
        self._xpos = 0
        self._ypos = 0

    def spec(self):
        return self.name, self.expargs

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
    

class Node():

    """implements nodes"""

    def __init__(self):
        self._name = None
        self._index = None
        self._nodetype = None
        self._args = ''
        self._xpos = 0
        self._ypos = 0

    def spec(self):
        return self.name, self.index, self.nodetype, self.args

    @property
    def name(self):
        return self._name

    @name.setter
    def name(self, varname):
        self._name = varname


###############
# data structures
###############


class SymbolTable():

    """nodes and variables of a scope are stored in a symbol table"""

    def __init__(self, stname):
        self._symtable = [] #list of nodes/simplevars
        self._name = stname #name of symtable is name of scope
        self._index = -1

    def __iter__(self):
        return self._symtable.__iter__()

    def __next__(self):
        return self._symtable.__next__()

    def bind(self, variable):
        #check varname is not used
        try:
            for elem in self._symtable:
                if elem.name == variable.name and elem.name != None:
                    raise AlreadyExistsException('???', variable.name)
        except AlreadyExistsException as e:
            print(e)
        #store variable in symtable
        else:
            self._symtable.append(variable)
            #advance index in symtable if var is node
            if type(variable) == Node:
                self.index+=1
                variable.index = self.index

    def lookup(self, name):
        for var in self._symtable:
            if var.name == name:
                return var
        return False

    @property
    def name(self):
        return self._name

    @name.setter
    def name(self, stname):
        self._name = stname

    @property
    def index(self):
        return self._index

    @index.setter
    def index(self, nodeId):
        self._index = nodeId


        
###############
# interpreter
###############


class PdeasyVisitor(ParseTreeVisitor):

    def __init__(self):
        self.symtable = SymbolTable('general') #current symbol table
        self.memory = [self.symtable] #list of symbol tables
        self.callables = [] #list of functions and blocks with bodies

    def enter(self, name):
        found = False
        for st in self.memory:
            if name==st.name:
                self.symtable = st
                found = True
        if not found:
            self.symtable = SymbolTable(name)
            self.memory.append(self.symtable)

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
        name = ctx.NAME().getText()
        try:
            for fb in self.callables:
                if fb.name == name:
                    raise AlreadyExistsException(ctx.start.line, name)
                
        except AlreadyExistsException as e:
            print(e)

        else:
            func = Function()
            func.name = name
            func.body = ctx.suite()
            func.expargs = self.visit(ctx.typedparams())
            self.callables.append(func)
            

    # Visit a parse tree produced by PdeasyParser#returnstmt.
    def visitReturnstmt(self, ctx:PdeasyParser.ReturnstmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdeasyParser#stmt.
    def visitStmt(self, ctx:PdeasyParser.StmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdeasyParser#blockstmt.
    def visitBlockstmt(self, ctx:PdeasyParser.BlockstmtContext):
        #check if block name is avaiable (two blocks in same patch cannot have same name)
        name = ctx.NAME().getText()
        try:
            for fb in self.callables:
                if fb.name == name:
                    raise AlreadyExistsException(ctx.start.line, name)
                
        except AlreadyExistsException as e:
            print(e)

        else:
            block = Block()
            block.name = name
            block.body = ctx.suite()
            block.expargs = self.visit(ctx.typedparams())
            self.callables.append(block)
            

    # Visit a parse tree produced by PdeasyParser#callstmt.
    def visitCallstmt(self, ctx:PdeasyParser.CallstmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdeasyParser#nodedecl1.
    def visitNodedecl1(self, ctx:PdeasyParser.Nodedecl1Context):
        node = Node()
        self.symtable.bind(node)
        node.name = self.visit(ctx.varname())
        node.nodetype = ctx.NAME().getText()
        if ctx.parameters():
            node.args = self.visit(ctx.parameters()) 

    # Visit a parse tree produced by PdeasyParser#nodedecl2.
    def visitNodedecl2(self, ctx:PdeasyParser.Nodedecl2Context):
        node = Node()
        self.symtable.bind(node)
        node.nodetype = ctx.NAME().getText()
        if ctx.parameters():
            node.args = self.visit(ctx.parameters())

    # Visit a parse tree produced by PdeasyParser#nodedecl3.
    def visitNodedecl3(self, ctx:PdeasyParser.Nodedecl3Context):
        node = Node()
        self.symtable.bind(node)
        node.nodetype = 'obj'
        node.args = self.visit(ctx.operation())


    # Visit a parse tree produced by PdeasyParser#nodedecl4.
    def visitNodedecl4(self, ctx:PdeasyParser.Nodedecl4Context):
        node = Node()
        self.symtable.bind(node)
        node.name = self.visit(ctx.varname())
        node.nodetype = 'obj'
        node.args = self.visit(ctx.operation())


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
        if ctx.typedargslist():
            return self.visit(ctx.typedargslist())
        return []


    # Visit a parse tree produced by PdeasyParser#argslist.
    def visitArgslist(self, ctx:PdeasyParser.ArgslistContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdeasyParser#typedargslist.
    def visitTypedargslist(self, ctx:PdeasyParser.TypedargslistContext):
        typedlist = []
        for i in range (len(ctx.typedarg())):
            typedarg = self.visit(ctx.typedarg(i))
            typedlist.append(typedarg)
        return typedlist


    # Visit a parse tree produced by PdeasyParser#arg.
    def visitArg(self, ctx:PdeasyParser.ArgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdeasyParser#typedarg.
    def visitTypedarg(self, ctx:PdeasyParser.TypedargContext):
        vname = self.visit(ctx.varname())
        vtype = ctx.VARTYPE().getText()
        return (vname, vtype)


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


    # Visit a parse tree produced by PdeasyParser#forstmt.
    def visitForstmt(self, ctx:PdeasyParser.ForstmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdeasyParser#varname.
    def visitVarname(self, ctx:PdeasyParser.VarnameContext):
        return ctx.VARNAME().getText()



del PdeasyParser
