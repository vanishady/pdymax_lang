# Generated from Pdeasy.g4 by ANTLR 4.11.1
from antlr4 import *
import sys
if __name__ is not None and "." in __name__:
    from .PdeasyParser import PdeasyParser
    from .componentrs import *
    from .exceptions import *
else:
    from PdeasyParser import PdeasyParser
    from components import *
    from exceptions import * 


###############
# visitor
###############


class PdeasyVisitor(ParseTreeVisitor):

    def __init__(self):
        self.symtable = SymbolTable('general') #current symbol table
        self.memory = [self.symtable] #list of symbol tables
        self.callables = [] #list of functions and blocks with bodies
        self.restore = None

    def enter(self, name):
        """enter a scope (aka symbol table)"""
        self.restore = self.symtable
        found = False
        for st in self.memory:
            if name==st.name:
                self.symtable = st
                found = True
        if not found:
            self.symtable = SymbolTable(name)
            self.memory.append(self.symtable)

    def leavesymtable(self):
        self.symtable = self.restore

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
        """add function body and details to self.callables"""
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
        """updates 'returns' field of called function. return in blocks is not handled yet"""
        for elem in self.callables:
            if elem.name == self.symtable.name:
                try:
                    if ctx.varname():
                        vname = self.visit(ctx.varname())
                        var = self.symtable.lookup(vname)
                        if var==False: raise NotFoundException(ctx.start.line, vname)
                        if type(var)==Node:
                            elem.returns = var
                        elif type(var)==Noderef:
                            elem.returns = var.target
                        else:
                            elem.returns = var.value
                    elif ctx.expr():
                        elem.returns = self.visit(ctx.expr())
                    else:
                        self.visitChildren(ctx)
                        
                except NotFoundException as e:
                    print(e)


    # Visit a parse tree produced by PdeasyParser#stmt.
    def visitStmt(self, ctx:PdeasyParser.StmtContext):
        return self.visitChildren(ctx)

    def visitBlockstmt(self, ctx:PdeasyParser.BlockstmtContext):
        """add block body and details to self.callables"""
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
        """execute code inside called function/block. return value if it is a function"""
        callee_name = ctx.NAME().getText()
        callee_alias = ''

        #check if callee exists, and good syntax
        try:
            found = False
            for elem in self.callables:
                if elem.name == callee_name:
                    callee = elem
                    found = True
            if callee_name == 'len': return len(self.visit(ctx.parameters())[0])
            if not found: raise NotFoundException(ctx.start.line, callee_name)
            if ctx.AS() and type(callee)==Function: raise CallError(ctx.start.line, callee_name)
            if type(callee)==Block: #if block is called, bind block to symtable. bc blocks in pd are also nodes
                callee_alias = self.visit(ctx.varname())
                blocknode = Node()
                blocknode.name = callee_alias
                self.symtable.bind(blocknode)
                blocknode.nodetype = 'subpatch'
                blocknode.scope = self.symtable.name

        except NotFoundException as e:
            print(e)
            
        except CallError as e:
            print(e)   

        except AttributeError:
            print(f'error at line: {ctx.start.line}\n block must be called with an alias')
            sys.exit(1)

        #check passed parameters and add to current symtable 
        try:
            vardecl = False
            params = self.visit(ctx.parameters())
            self.enter(callee_name) #change the scope!
            if len(params)!=len(callee.expargs): raise MissingParameterException(ctx.start.line)
            for i in range (len(params)):
                if callee.expargs[i][1]=='intn':
                    if isinstance(params[i], int): vardecl = True
                    else: raise InvalidParameterException(ctx.start.line, type(params[i]), 'intn')
                elif callee.expargs[i][1]=='floatn':
                    if isinstance(params[i], float): vardecl = True
                    else: raise InvalidParameterException(ctx.start.line, type(params[i]), 'floatn')
                elif callee.expargs[i][1]=='symbol':
                    if isinstance(params[i], str): vardecl = True
                    else: raise InvalidParameterException(ctx.start.line, type(params[i]), 'symbol')
                elif callee.expargs[i][1]=='list':
                    if isinstance(params[i], list): vardecl = True
                    else: raise InvalidParameterException(ctx.start.line, type(params[i]), 'list')
                elif callee.expargs[i][1]=='noderef':
                    if isinstance(params[i], Node):
                        nr = Noderef()
                        nr.name = callee.expargs[i][0]
                        nr.target = params[i]
                        nr.scope = self.symtable.name
                        self.symtable.bind(nr)
                    else: raise InvalidParameterException(ctx.start.line, type(params[i]), 'noderef')

                if vardecl == True:
                    var = SimpleVar()
                    var.name = callee.expargs[i][0]
                    self.symtable.bind(var)
                    var.value = params[i]
                    var.scope = self.symtable.name
                    vardecl = False
                        
        except InvalidParameterException as e:
            print(e)

        except MissingParameterException as e:
            print(e)


        #execute body
        self.visit(callee.body)
        self.leavesymtable()

        if type(callee)==Function:
            return callee.returns


    # Visit a parse tree produced by PdeasyParser#nodedecl1.
    def visitNodedecl1(self, ctx:PdeasyParser.Nodedecl1Context):
        """add node to current symbol table"""
        node = Node()
        node.name = self.visit(ctx.varname())
        self.symtable.bind(node)
        node.nodetype = ctx.NAME().getText()
        if ctx.parameters():
            node.args = self.visit(ctx.parameters())
        node.scope = self.symtable.name

    # Visit a parse tree produced by PdeasyParser#nodedecl2.
    def visitNodedecl2(self, ctx:PdeasyParser.Nodedecl2Context):
        """add node to current symbol table"""
        node = Node()
        self.symtable.bind(node)
        node.nodetype = ctx.NAME().getText()
        if ctx.parameters():
            node.args = self.visit(ctx.parameters())
        node.scope = self.symtable.name

    # Visit a parse tree produced by PdeasyParser#nodedecl3.
    def visitNodedecl3(self, ctx:PdeasyParser.Nodedecl3Context):
        """add node to current symbol table"""
        node = Node()
        self.symtable.bind(node)
        node.nodetype = 'obj'
        node.args = self.visit(ctx.operation())
        node.scope = self.symtable.name


    # Visit a parse tree produced by PdeasyParser#nodedecl4.
    def visitNodedecl4(self, ctx:PdeasyParser.Nodedecl4Context):
        """add node to current symbol table"""
        node = Node()
        node.name = self.visit(ctx.varname())
        self.symtable.bind(node)
        node.nodetype = 'obj'
        node.args = self.visit(ctx.operation())
        node.scope = self.symtable.name


    # Visit a parse tree produced by PdeasyParser#simpledecl.
    def visitSimpledecl(self, ctx:PdeasyParser.SimpledeclContext):
        """add simple variable to current symbol table"""
        var = SimpleVar()
        var.name = self.visit(ctx.varname())
        if ctx.expr():
            var.value = self.visit(ctx.expr())
        else:
            var.value = self.visitChildren(ctx)
        var.scope = self.symtable.name
        self.symtable.bind(var)


    # Visit a parse tree produced by PdeasyParser#list.
    def visitList(self, ctx:PdeasyParser.ListContext):
        """return list"""
        varlist = []
        for i in range(len(ctx.listelem())):
            varlist.append(self.visit(ctx.listelem(i)))
        return varlist


    # Visit a parse tree produced by PdeasyParser#listelem.
    def visitListelem(self, ctx:PdeasyParser.ListelemContext):
        """return symbol, number or value of a given simple variable"""
        if ctx.SYMBOL():
            return ctx.SYMBOL().getText()[1:-1]
        elif ctx.NUMBER():
            num = ctx.NUMBER().getText()
            if '.' in num: return float(num)
            else: return int(num)
        else:
            vname = self.visit(ctx.varname())
            try:
                var = self.symtable.lookup(vname)
                if var==False: raise NotFoundException(ctx.start.line, vname)
                elif type(var)==Node: raise AttributeError
            except NotFoundException as e:
                print(e)
                return None
            except AttributeError:
                print(f'error at line: {ctx.start.line}\n cannot add node to list')
                return None
            else:
                return var.value


    # Visit a parse tree produced by PdeasyParser#list_access.
    def visitList_access(self, ctx:PdeasyParser.List_accessContext):
        """
        return value of item indexed in a list.
        raise error if index out of range, variable not found, index non-numeric ...
        """
        vname = self.visit(ctx.varname(0))

        try:
            var = self.symtable.lookup(vname)
            if var == False: raise NotFoundException(ctx.start.line, vname)
            if ctx.varname(1): 
                vname2 = self.visit(ctx.varname(1))
                var2 = self.symtable.lookup(vname2)
                if var2 == False: raise NotFoundException(ctx.start.line, vname2)
                index = var2.value
                if not isinstance(index, int): raise AttributeError
            elif ctx.NUMBER():
                if '.' in ctx.NUMBER().getText(): raise AttributeError
                index = int(ctx.NUMBER().getText())

        except AttributeError:
            print(f'error at line: {ctx.start.line}\n cannot use non-integer variable as list index') 
            return None
        except NotFoundException as e:
            print(e)
            return None

        else:
            try:
                return var.value[index]
            except IndexError:
                print(f'error at line: {ctx.start.line}\n index out of range accessing list <{vname}>')
                sys.exit(1)

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
        """return list of args or empty list"""
        if ctx.argslist(): return self.visit(ctx.argslist())
        return []


    # Visit a parse tree produced by PdeasyParser#typedparams.
    def visitTypedparams(self, ctx:PdeasyParser.TypedparamsContext):
        """return list of typedargs or empty list"""
        if ctx.typedargslist(): return self.visit(ctx.typedargslist())
        return []


    # Visit a parse tree produced by PdeasyParser#argslist.
    def visitArgslist(self, ctx:PdeasyParser.ArgslistContext):
        """return list of node/call arguments"""
        arglist = []
        for i in range (len(ctx.arg())):
            arg = self.visit(ctx.arg(i))
            arglist.append(arg)
        return arglist


    # Visit a parse tree produced by PdeasyParser#typedargslist.
    def visitTypedargslist(self, ctx:PdeasyParser.TypedargslistContext):
        """return list of typed args. typed args are tuples (varname:vartype)"""
        typedlist = []
        for i in range (len(ctx.typedarg())):
            typedarg = self.visit(ctx.typedarg(i))
            typedlist.append(typedarg)
        return typedlist


    # Visit a parse tree produced by PdeasyParser#arg.
    def visitArg(self, ctx:PdeasyParser.ArgContext):
        """return argument value"""
        if ctx.expr(): return self.visit(ctx.expr())
        elif ctx.noderef(): return self.visit(ctx.noderef())
        else: return self.visitChildren(ctx)


    # Visit a parse tree produced by PdeasyParser#typedarg.
    def visitTypedarg(self, ctx:PdeasyParser.TypedargContext):
        """
        return tuple of (name_of_expected_var : type_of_expected_var)
        types can be: floatn (means float), intn (means int), symbol (means symbol), noderef, list
        """
        vname = self.visit(ctx.varname())
        vtype = ctx.VARTYPE().getText()
        return (vname, vtype)


    # Visit a parse tree produced by PdeasyParser#suite.
    def visitSuite(self, ctx:PdeasyParser.SuiteContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdeasyParser#operation.
    def visitOperation(self, ctx:PdeasyParser.OperationContext):
        """
        return list containing operator and number following the operator.
        number can be: literal, value stored in a simpple variable, value stored in list element.
        """
        arglist = []
        arglist.append(ctx.op.text)
        try:
            if ctx.NUMBER():
                num = ctx.NUMBER().getText()
                if '.' in num: num = float(num)
                else: num = int(num)
                arglist.append(num)
            elif ctx.varname():
                vname = self.visit(ctx.varname())
                var = self.symtable.lookup(vname)
                if var==False: raise NotFoundException(ctx.start.line, vname)
                if not isinstance(var.value, (int, float)): raise AttributeError
                arglist.append(var.value)
            elif ctx.list_access():
                val = self.visit(ctx.list_access())
                if not isinstance(val, (int, float)): raise AttributeError
                arglist.append(val)
            return arglist

        except NotFoundException as e:
            print(e)

        except AttributeError:
            print(f'error at line: {ctx.start.line}\n cannot use non-numeric variables in operation.')


    # Visit a parse tree produced by PdeasyParser#ifstmt.
    def visitIfstmt(self, ctx:PdeasyParser.IfstmtContext):
        """implements if-elif-else construct """
        if self.visit(ctx.expr(0))==True:
            return self.visitSuite(ctx.suite(0))
        if ctx.ELIF():
            for i in range (len(ctx.ELIF())):
                if self.visit(ctx.expr(i+1))==True:
                    return self.visitSuite(ctx.suite(i+1))
        if ctx.ELSE():
            lastsuite = len(ctx.suite())-1
            return self.visitSuite(ctx.suite(lastsuite))

    # Visit a parse tree produced by PdeasyParser#SubAdd.
    def visitSubAdd(self, ctx:PdeasyParser.SubAddContext):
        """return sub/add result"""
        left=self.visit(ctx.expr(0))
        right=self.visit(ctx.expr(1))
        
        if ctx.op.text == '+':
            res=(left)+(right)
        elif ctx.op.text == '-':
            res=(left)-(right)

        return res


    # Visit a parse tree produced by PdeasyParser#MulDiv.
    def visitMulDiv(self, ctx:PdeasyParser.MulDivContext):
        """return mul/div result"""
        left=self.visit(ctx.expr(0))
        right=self.visit(ctx.expr(1))
        
        if ctx.op.text == '*':
            res=(left)*(right)
        elif ctx.op.text == '/':
            res=(left)/(right)
        elif ctx.op.text == '%':
            res=(left)%(right)

        return res


    # Visit a parse tree produced by PdeasyParser#TestCall.
    def visitTestCall(self, ctx:PdeasyParser.TestCallContext):
        """return value returned by function call. None if a block was called"""
        return self.visit(ctx.callstmt())


    # Visit a parse tree produced by PdeasyParser#ParensExpr.
    def visitParensExpr(self, ctx:PdeasyParser.ParensExprContext):
        """returns expr inside parenthesis"""
        return self.visit(ctx.expr())


    # Visit a parse tree produced by PdeasyParser#TestCompare.
    def visitTestCompare(self, ctx:PdeasyParser.TestCompareContext):
        """return True or False after comparing"""
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


    # Visit a parse tree produced by PdeasyParser#TestSym.
    def visitTestSym(self, ctx:PdeasyParser.TestSymContext):
        """return symbol"""
        return ctx.SYMBOL().getText()[1:-1]


    # Visit a parse tree produced by PdeasyParser#TestVar.
    def visitTestVar(self, ctx:PdeasyParser.TestVarContext):
        """returns value of a simple variable. raise exception if given variable is node."""
        vname = self.visit(ctx.varname())
        try:
            var = self.symtable.lookup(vname)
            if var==False: raise NotFoundException(ctx.start.line, vname)
            elif type(var)==Node: raise AttributeError
        except NotFoundException as e:
            print(e)
            sys.exit(1)
        except AttributeError:
            print(f'error at line: {ctx.start.line}\n cannot use node in normal expressions.')
            sys.exit(1)
        else:
            return var.value
        

    # Visit a parse tree produced by PdeasyParser#TestNum.
    def visitTestNum(self, ctx:PdeasyParser.TestNumContext):
        """returns int or float number"""
        num = ctx.NUMBER().getText()
        if '.' in num: return float(num)
        return int(num)


    # Visit a parse tree produced by PdeasyParser#TestListAccess.
    def visitTestListAccess(self, ctx:PdeasyParser.TestListAccessContext):
        """return item indexed in list"""
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdeasyParser#noderef.
    def visitNoderef(self, ctx:PdeasyParser.NoderefContext):
        """returns a node variable"""
        vname = self.visit(ctx.varname())
        var = self.symtable.lookup(vname)
        try:
            if var==False: raise NotFoundException(ctx.start.line, vname)
            if type(var) not in [Node, Block]: raise AttributeError
        except AttributeError:
            print(f'error at line: {ctx.start.line}\n pointer must point at some node')
            return None
        except NotFoundException as e:
            print(e)
            return None
        else:
            return var 


    # Visit a parse tree produced by PdeasyParser#forstmt.
    def visitForstmt(self, ctx:PdeasyParser.ForstmtContext):
        """for loops"""
        vname = self.visit(ctx.varname(0))
        iterator = self.symtable.lookup(vname)
        if iterator == False:
            iterator = Iterator()
            self.symtable.bind(iterator)
            iterator.name = vname
            iterator.scope = self.symtable.name
        iterator.value = -1

        #get range len
        try:
            if ctx.NUMBER():
                num = ctx.NUMBER().getText()
                if '.' in num: raise TypeException(ctx.start.line, type(num), 'int')
                rangelen = int(num)
            elif ctx.callstmt():
                rangelen = int(self.visit(ctx.callstmt()))
            elif ctx.varname(1):
                vname1 = self.visit(ctx.varname(1))
                var = self.symtable.lookup(vname1)
                if var == False: raise NotFoundException(ctx.start.line, vname1)
                rangelen = var.value
                if not isinstance(rangelen, int): raise TypeException(ctx.start.line, type(num), 'int')
                
            elif ctx.list_access():
                rangelen = int(self.visit(ctx.list_access()))
                
        except TypeException as e1:
            print(e1)

        except NotFoundException as e2:
            print(e2)

        else:
            for i in range(rangelen):
                iterator.value+=1
                self.visitSuite(ctx.suite())
            iterator.value = -1

    # Visit a parse tree produced by PdeasyParser#varname.
    def visitVarname(self, ctx:PdeasyParser.VarnameContext):
        """return varname"""
        return ctx.VARNAME().getText()



del PdeasyParser
