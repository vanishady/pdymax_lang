# Generated from Pdeasy.g4 by ANTLR 4.11.1
from antlr4 import *
from antlr4.CommonTokenStream import CommonTokenStream
import sys
if __name__ is not None and "." in __name__:
    from .PdeasyParser import PdeasyParser
    from .PdeasyLexer import PdeasyLexer
    from .componentrs import *
    from .exceptions import *
else:
    from PdeasyParser import PdeasyParser
    from PdeasyLexer import PdeasyLexer
    from components import *
    from exceptions import *
    


###############
# visitor
###############


class PdeasyVisitor(ParseTreeVisitor):

    def __init__(self):
        self.symtable = SymbolTable('general') #current symbol table
        self.connections = Connections() #memorize connections in separate data structure
        self.memory = [self.symtable] #list of symbol tables
        self.callables = [] #list of functions and blocks with bodies
        self.restore = [self.symtable] #stack of symbol tables

    def enter(self, name):
        """enter a scope (aka symbol table)"""
        self.restore.append(self.symtable)
        found = False
        for st in self.memory:
            if name==st.name:
                self.symtable = st
                found = True
        if not found:
            self.symtable = SymbolTable(name)
            self.memory.append(self.symtable)

    def leavesymtable(self):
        """leave current symtable, restore previous symtable"""
        for st in self.memory:
            if self.restore[-1].name==st.name:
                self.symtable = st
        self.restore = self.restore[:-1]

    def samename(self, name1, name2):
        """check wether name1 and name2 have same prefix"""
        if name2 in name1:
            output = name1.replace(name2, '')
            if output.isnumeric(): return True
        return False


    # Visit a parse tree produced by PdeasyParser#prog.
    def visitProg(self, ctx:PdeasyParser.ProgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdeasyParser#patchstmt.
    def visitPatchstmt(self, ctx:PdeasyParser.PatchstmtContext):
        self.patchname = ctx.NAME().getText()


    # Visit a parse tree produced by PdeasyParser#importstmt.
    def visitImportstmt(self, ctx:PdeasyParser.ImportstmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PdeasyParser#funcdefstmt.
    def visitFuncdefstmt(self, ctx:PdeasyParser.FuncdefstmtContext):
        """add function body and details to self.callables"""
        name = ctx.NAME().getText()
        for fb in self.callables:
            if fb.name == name:
                raise AlreadyExistsException(ctx.start.line, name)
            
        func = Function()
        func.name = name
        func.body = ctx.suite()
        func.expargs = self.visit(ctx.typedparams())
        self.callables.append(func)
        


    # Visit a parse tree produced by PdeasyParser#returnstmt.
    def visitReturnstmt(self, ctx:PdeasyParser.ReturnstmtContext):
        """updates 'returns' field of called function. return in blocks is not handled yet"""
        found = False
        for elem in self.callables:
            if self.samename(self.symtable.name, elem.name) and type(elem)==Function:
                found = True
                elem.returns = self.visit(ctx.arg())

        if not found: raise OutOfContextError(ctx.start.line, 'returnstmt only makes sense into a function.')

            

    # Visit a parse tree produced by PdeasyParser#stmt.
    def visitStmt(self, ctx:PdeasyParser.StmtContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by PdeasyParser#flow_stmt.
    def visitFlow_stmt(self, ctx:PdeasyParser.Flow_stmtContext):
        if ctx.PASS(): return 'pass'
        elif ctx.CONTINUE(): return 'continue'
        elif ctx.BREAK(): return 'break'

    def visitBlockstmt(self, ctx:PdeasyParser.BlockstmtContext):
        """add block body and details to self.callables"""
        #check if block name is avaiable (two blocks in same patch cannot have same name)
        name = ctx.NAME().getText()

        for fb in self.callables:
            if fb.name == name:
                raise AlreadyExistsException(ctx.start.line, name)
            
        block = Block()
        block.name = name
        if ctx.suite():
            block.body = ctx.suite()
        block.expargs = self.visit(ctx.typedparams())
        self.callables.append(block)
            

    def visitCallstmt(self, ctx:PdeasyParser.CallstmtContext):
        """execute code inside called function/block. return value if it is a function"""
        callee_name = ctx.NAME().getText()

        #check if callee exists
        found = False
        for elem in self.callables:
            if elem.name == callee_name:
                elem.callnum += 1
                callee = elem
                callee_name = callee_name+str(elem.callnum)
                found = True
        if callee_name == 'len': return len(self.visit(ctx.parameters())[0])
        if callee_name == 'append':
            params = self.visit(ctx.parameters())
            params[0].append(params[1])
            return None
        if callee_name == 'copy':
            tocopy = self.visit(ctx.parameters())[0]
            if type(tocopy) not in [Node, SimpleVar]: raise TypeException(ctx.start.line, type(tocopy), 'node')
            if type(tocopy)==SimpleVar:
                if type(tocopy.value)!=Node: raise TypeException(ctx.start.line, type(tocopy.value), 'node')
                tocopy = tocopy.value
            newnode = Node()
            newnode.name = tocopy.name+'_copy'
            newnode.nodetype = tocopy.nodetype
            newnode.scope = self.symtable.name
            self.symtable.bind(newnode)
            return newnode
        if not found: raise NotFoundException(ctx.start.line, callee_name)
        if type(callee) == Block:
            blocknode = Node()
            blocknode.name = callee_name
            blocknode.nodetype = 'subpatch'
            blocknode.scope = self.symtable.name
            self.symtable.bind(blocknode)
        elif type(callee) == Function:
            callee.caller = self.symtable

        #check passed parameters and add to current symtable 
        vardecl = False
        params = self.visit(ctx.parameters())
        self.enter(callee_name) #change the scope!
        if type(callee)==Function:
            self.symtable.index = callee.caller.index #l'index nella funzione non deve azzerarsi
            self.symtable.caller = callee.caller.name
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
            elif callee.expargs[i][1]=='node':
                if type(params[i])==Node: vardecl = True
                elif (type(params[i])==SimpleVar and type(params[i].value)==Node):
                    params[i] = params[i].value
                    vardecl = True
                else: raise InvalidParameterException(ctx.start.line, type(params[i]), 'node')

            if vardecl == True:
                var = SimpleVar()
                var.name = callee.expargs[i][0]
                self.symtable.bind(var)
                var.value = params[i]
                var.scope = self.symtable.name
                vardecl = False
                        

        #execute body
        if callee.body != None:
            self.visit(callee.body)
        temp = self.symtable.index
        self.leavesymtable()

        if type(callee)==Function:
            self.symtable.index = temp #aggiorno l'index della current symtable con l'index a cui sono arrivata nella funzione
            return callee.returns
        if type(callee)==Block:
            return blocknode
        

    # Visit a parse tree produced by PdeasyParser#nodedecl1.
    def visitNodedecl1(self, ctx:PdeasyParser.Nodedecl1Context):
        """add node to current symbol table"""
        node = Node()
        node.name = self.visit(ctx.varname())
        node.nodetype = ctx.NAME().getText()
        if ctx.parameters():
            node.args = self.visit(ctx.parameters())
        node.scope = self.symtable.name
        self.symtable.bind(node)

    # Visit a parse tree produced by PdeasyParser#nodedecl2.
    def visitNodedecl2(self, ctx:PdeasyParser.Nodedecl2Context):
        """add node to current symbol table"""
        node = Node()
        node.nodetype = ctx.NAME().getText()
        if ctx.parameters():
            node.args = self.visit(ctx.parameters())
        node.scope = self.symtable.name
        self.symtable.bind(node)

    # Visit a parse tree produced by PdeasyParser#nodedecl3.
    def visitNodedecl3(self, ctx:PdeasyParser.Nodedecl3Context):
        """add node to current symbol table"""
        node = Node()
        node.nodetype = 'obj'
        node.args = self.visit(ctx.operation())
        node.scope = self.symtable.name
        self.symtable.bind(node)


    # Visit a parse tree produced by PdeasyParser#nodedecl4.
    def visitNodedecl4(self, ctx:PdeasyParser.Nodedecl4Context):
        """add node to current symbol table"""
        node = Node()
        node.name = self.visit(ctx.varname())
        node.nodetype = 'obj'
        node.args = self.visit(ctx.operation())
        node.scope = self.symtable.name
        self.symtable.bind(node)


    # Visit a parse tree produced by PdeasyParser#simpledecl.
    def visitSimpledecl(self, ctx:PdeasyParser.SimpledeclContext):
        """add simple variable to current symbol table"""
        var = SimpleVar()
        var.name = self.visit(ctx.varname())
        if ctx.expr():
            var.value = self.visit(ctx.expr()) #can be: node, int, float, symbol
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
        elif ctx.varname():
            vname = self.visit(ctx.varname())
            var = self.symtable.lookup(vname)
            if var==False: raise NotFoundException(ctx.start.line, vname)
            elif type(var)==Node: return var
            else: return var.value
        elif ctx.NAME():
            node = Node()
            node.nodetype = ctx.NAME().getText()
            node.args = self.visit(ctx.parameters())
            node.scope = self.symtable.name
            self.symtable.bind(node)
            return node
        elif ctx.operation():
            node = Node()
            node.nodetype = 'obj'
            node.args = self.visit(ctx.operation())
            node.scope = self.symtable.name
            self.symtable.bind(node)
            return node


    # Visit a parse tree produced by PdeasyParser#list_access.
    def visitList_access(self, ctx:PdeasyParser.List_accessContext):
        """
        return value of item indexed in a list.
        raise error if index out of range, variable not found, index non-numeric ...
        """
        vname = self.visit(ctx.varname()) #list varibale name


        var = self.symtable.lookup(vname) #look for list variable
        if var == False: raise NotFoundException(ctx.start.line, vname)
        index = self.visit(ctx.expr())
        if not isinstance(index, int): raise AttributeError(f'error at line: {ctx.start.line}\n cannot use non-integer variable as list index')

        return var.value[index] #can be: node, int, float, symbol

    # Visit a parse tree produced by PdeasyParser#connectionstmt.
    def visitConnectionstmt(self, ctx:PdeasyParser.ConnectionstmtContext):
        self.full_text = {}
        self.symtable.connscopes = []
        
        conn_scope = self.symtable.name

        #if current scope is function local, resolve connection in previous non-function scope
        for f in self.callables:
            if self.samename(self.symtable.name, f.name) and type(f)==Function:
                conn_scope = f.caller.name
        
        for i in range(len(ctx.connectionelem())-1):
            sourcelist = self.visit(ctx.connectionelem(i)) 
            sinklist = self.visit(ctx.connectionelem(i+1))

            for source in sourcelist:
                for sink in sinklist:
                    self.connections.addconnection([conn_scope, source['id'], source['out'],
                                                    sink['id'], sink['in']])



    # Visit a parse tree produced by PdeasyParser#multipleconn.
    def visitMultipleconn(self, ctx:PdeasyParser.MultipleconnContext):
        nodelist = []
        for i in range(len(ctx.singlenode())):
            nodelist.append(self.visit(ctx.singlenode(i)))
        return nodelist


    # Visit a parse tree produced by PdeasyParser#singleconn.
    # $a > $b / $a:2 > 1:$b / A() > B() / A():2 > 1:B()
    def visitSingleconn(self, ctx:PdeasyParser.SingleconnContext):
        return [self.visit(ctx.singlenode())]


    # Visit a parse tree produced by PdeasyParser#singlenode.
    def visitSinglenode(self, ctx:PdeasyParser.SinglenodeContext):
        #controllo che il nodo non sia già stato dichiarato alla visita precedente
        dont = False
        ctx_text = ctx.getText()
        if (ctx_text, ctx.start) in self.full_text:
            dont = True

        #gli inlet e outlet di default sono a 0
        nodeIn = 0
        nodeOut = 0
        node = False
        vname = None
        nodeId = ''

        if ctx.varname(): #riferimento a una variabile già esistente
            vname = self.visit(ctx.varname())
            node = self.symtable.lookup(vname)
            if node==False: raise NotFoundException(ctx.start.line, vname)
            elif type(node)==SimpleVar:
                if type(node.value) == Node: nodeId = node.value.index
                else: raise TypeException(ctx.start.line, type(node), 'node', f'\n cannot use simple variable in connection.')
            elif type(node)not in [Node]: raise TypeException(ctx.start.line, type(node), 'node', f'\n cannot use simple variable in connection.')
            else: nodeId = node.index

        elif ctx.list_access():
            node = self.visit(ctx.list_access())
            nodeId = node.index

        elif ctx.callstmt():
            if dont:
                nodeId = self.full_text[(ctx_text, ctx.start)]
            else:
                node = self.visit(ctx.callstmt())
                if type(node)not in [Node]: raise TypeException(ctx.start.line, type(node), 'node') 
                nodeId = node.index
                self.full_text.update({(ctx_text, ctx.start) : nodeId})

        elif ctx.simpledecl():
            if dont:
                nodeId = self.full_text[(ctx_text, ctx.start)]
            else:
                self.visit(ctx.simpledecl())
                vname=ctx.getText().split('=')
                vname=vname[0]
                node = self.symtable.lookup(vname)
                if node==False: raise NotFoundException(ctx.start.line, vname)
                elif type(node)==SimpleVar:
                    if type(node.value) == Node: nodeId = node.value.index
                    else: raise TypeException(ctx.start.line, type(node), 'node', f'\n cannot use simple variable in connection.')
                elif type(node)not in [Node]: raise TypeException(ctx.start.line, type(node), 'node', f'\n cannot use simple variable in connection.')
                else: nodeId = node.index
                self.full_text.update({(ctx_text, ctx.start) : nodeId})
                
        elif ctx.nodedecl():
            if dont:
                nodeId = self.full_text[(ctx_text, ctx.start)]
            else:
                self.visit(ctx.nodedecl())
                nodeId = self.symtable.index #l'index dell'ultimo nodo creato
                self.full_text.update({(ctx_text, ctx.start) : nodeId})

        #if node scope is a function, change the scope to f.caller. check for every node to be in same scope
        if node:
            if type(node)==SimpleVar: nodescope = node.value.scope
            else: nodescope = node.scope
        else:
            nodescope = self.symtable.name
            
        for f in self.callables:
            if self.samename(nodescope, f.name) and type(f)==Function:
                nodescope = f.caller.name
        self.symtable.connscopes.append(nodescope)
                
        for i in range (len(self.symtable.connscopes)-1):
            if self.symtable.connscopes[i]!=self.symtable.connscopes[i+1]: raise ConnectionError(ctx.start.line)     
        
            
        if ctx.inlet(): nodeIn = self.visit(ctx.inlet())
        if ctx.outlet(): nodeOut = self.visit(ctx.outlet())

        #print(nodeIn, [vname, nodeId], nodeOut, ctx.getText())
        return {'id':nodeId, 'in':nodeIn, 'out':nodeOut}


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
        if ctx.expr(): return self.visit(ctx.expr()) #simplevar
        elif ctx.operation(): #new node: operation
            node = Node()
            node.nodetype = 'obj'
            node.args = self.visit(ctx.operation())
            node.scope = self.symtable.name
            self.symtable.bind(node)
            return node
        elif ctx.NAME(): #new node: NAME parameters
            node = Node()
            node.nodetype = ctx.NAME().getText()
            if ctx.parameters():
                node.args = self.visit(ctx.parameters())
            node.scope = self.symtable.name
            self.symtable.bind(node)
            return node
        else: return self.visitChildren(ctx) #list


    # Visit a parse tree produced by PdeasyParser#typedarg.
    def visitTypedarg(self, ctx:PdeasyParser.TypedargContext):
        """
        return tuple of (name_of_expected_var : type_of_expected_var)
        types can be: floatn (means float), intn (means int), symbol (means symbol), list
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

        if ctx.expr():
            val = self.visit(ctx.expr())
            if not isinstance(val, (int, float)): raise AttributeError(f'error at line: {ctx.start.line}\n cannot use non-numeric variables in operation.')
            arglist.append(val)
        return arglist


    # Visit a parse tree produced by PdeasyParser#ifstmt.
    def visitIfstmt(self, ctx:PdeasyParser.IfstmtContext):
        """implements if-elif-else construct """
        if self.visit(ctx.comparison(0))==True:
            return self.visitSuite(ctx.suite(0))
        if ctx.ELIF():
            for i in range (len(ctx.ELIF())):
                if self.visit(ctx.comparison(i+1))==True:
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
        returns = self.visit(ctx.callstmt())
        if returns == None: raise CallError(ctx.start.line)
        return returns


    # Visit a parse tree produced by PdeasyParser#ParensExpr.
    def visitParensExpr(self, ctx:PdeasyParser.ParensExprContext):
        """returns expr inside parenthesis"""
        return self.visit(ctx.expr())


    # Visit a parse tree produced by PdeasyParser#comparison.
    def visitComparison(self, ctx:PdeasyParser.ComparisonContext):
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

        var = self.symtable.lookup(vname)
        if var==False: raise NotFoundException(ctx.start.line, vname)
        elif type(var)==Node: return var
        else: return var.value
             
        

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


    # Visit a parse tree produced by PdeasyParser#forstmt.
    def visitForstmt(self, ctx:PdeasyParser.ForstmtContext):
        """for loops"""
        vname = self.visit(ctx.varname())
        iterator = self.symtable.lookup(vname)
        if iterator == False:
            iterator = Iterator()
            self.symtable.bind(iterator)
            iterator.name = vname
            iterator.scope = self.symtable.name
        iterator.value = -1

        #get range len

        rangelen = self.visit(ctx.expr())
        if not isinstance(rangelen, int): raise TypeException(ctx.start.line, type(rangelen), 'int')
        for i in range(rangelen):
            iterator.value+=1
            instr = self.visitSuite(ctx.suite())
            if instr=='pass':
                pass
            elif instr=='break':
                break
            elif instr=='continue':
                continue
        iterator.value = -1

    # Visit a parse tree produced by PdeasyParser#varname.
    def visitVarname(self, ctx:PdeasyParser.VarnameContext):
        """return varname"""
        name = ctx.NAME().getText()
        if '~' in name: raise InvalidNameException(ctx.start.line, name)
        return name
    

    # Visit a parse tree produced by PdeasyParser#inlet.
    def visitInlet(self, ctx:PdeasyParser.InletContext):
        """return inlet number"""
        if ctx.NUMBER():
            if '.' in ctx.getText(): raise TypeException(ctx.line.start, 'floatn', 'intn')
            return int(ctx.NUMBER().getText())-1
        else:
            num = self.visit(ctx.expr())
            if not isinstance(num, int): raise TypeException(ctx.line.start, type(num), 'intn')
            return int(num)-1
    

    # Visit a parse tree produced by PdeasyParser#outlet.
    def visitOutlet(self, ctx:PdeasyParser.OutletContext):
        """return outlet number"""
        if ctx.NUMBER():
            if '.' in ctx.getText(): raise TypeException(ctx.line.start, 'floatn', 'intn')
            return int(ctx.NUMBER().getText())-1
        else:
            num = self.visit(ctx.expr())
            if not isinstance(num, int): raise TypeException(ctx.line.start, type(num), 'intn')
            return int(num)-1


del PdeasyParser
