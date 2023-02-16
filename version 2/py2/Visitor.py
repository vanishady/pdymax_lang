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

class InvalidParametersException(Exception):

    def __init__(self, expected, given):
        self._expected = expected
        self._given = given

    def __str__(self):
        return f'{type(self)}, expected: {self._expected} \n found: {self._given}'
    
class AlreadyExistsException(Exception):

    def __init__(self, lineno, varname, vartype=0):
        vartypes = ['function/block', 'variable']
        self._varname = varname
        self._vartype = vartypes[vartype]
        self._lineno = lineno

    def __str__(self):
        return f'error at line: {self._lineno}\n{self._vartype} <{self._varname}> already exists. Change name.'

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

    def __init__(self, lineno, name, err):
        self._name = name
        self._lineno = lineno
        self._err = err

    def __str__(self):
        return f'error at line: {self._lineno}\n'+self._err


class Iterator():

    """implements iterators"""

    def __init__(self):
        self._name = None
        self._value = -1
        self._scope = None

    def spec(self):
        return self.scope, self.name, self.value

    @property
    def name(self):
        return self._name

    @name.setter
    def name(self, itername):
        self._name = itername

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
    def scope(self, iterscope):
        self._scope = iterscope

class Connection():

    """implements connections"""

    def __init__(self, scope, source, outlet, sink, inlet):
        self._scope = scope
        self._source = source
        self._outlet = outlet
        self._sink = sink
        self._inlet = inlet

    def spec(self):
        return self.scope, self.source, self.outlet[3:], self.sink, self.inlet[2:]

    def printer(self):
        return f'#X connect {self.source} {self.outlet[3:]} {self.sink} {self.inlet[2:]};\r\n'

    @property
    def source(self):
        return self._source

    @source.setter
    def source(self, nodeId):
        self._source = nodeId

    @property
    def outlet(self):
        return self._outlet

    @outlet.setter
    def outlet(self, iolet):
        self._outlet = iolet

    @property
    def sink(self):
        return self._sink

    @sink.setter
    def sink(self, nodeId):
        self._sink = nodeId

    @property
    def inlet(self):
        return self._inlet

    @inlet.setter
    def inlet(self, iolet):
        self._inlet = iolet

    @property
    def scope(self):
        return self._scope

    @scope.setter
    def scope(self, scopename):
        self._scope = scopename

class Function():

    """ implements functions """

    def __init__(self):
        self._name = None
        self._expargs = [] #[ (vname, vtype), (vname, vtype),  ...]
        self._body = None
        self._returns = None
        self._callnum = 0

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

    @property
    def callnum(self):
        return self._callnum

    @callnum.setter
    def callnum(self, num):
        self._callnum = num

class Block():

    """ implements blocks """

    def __init__(self):
        self._name = None
        self._expargs = [] #[ (vname, vtype), (vname, vtype),  ...]
        self._body = None
        self._dotdot = []
        self._callnum = 0
        self._resume = None #scope in which block was summoned

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

    @property
    def callnum(self):
        return self._callnum

    @callnum.setter
    def callnum(self, num):
        self._callnum = num

    @property
    def resume(self):
        return self._resume

    @resume.setter
    def resume(self, scope):
        self._resume = scope

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
        self._args = ''
        self._xpos = 0
        self._ypos = 0

    def spec(self):
        return self.index, self.scope, self.name, self.nodetype, self.args

    def printer(self):
        #caso nodi non oggetto
        if self.nodetype in ['floatatom','symbolatom','text','msg','array','coords','obj']:
            result = ''
            if self.nodetype == 'floatatom':
                result = '5 0 0 0 - - -'
            else:
                for char in self.args:
                    if char not in ',"[]\'':
                        result+= char
                    result+=' '
            return f'#X {self.nodetype} {self.xpos} {self.ypos} {result};\r\n'
        else:
            result = ''
            if self.nodetype == 'bng':
                result = '19 250 50 0 empty empty empty 0 -10 0 12 #fcfcfc #000000 #000000'
            elif self.nodetype == 'tgl':
                result = '19 0 empty empty empty 0 -10 0 12 #fcfcfc #000000 #000000 0 1'
            else:
                for char in self.args:
                    if char not in ',"[]\'':
                        result+= char
                    result+= ' '
            return f'#X obj {self.xpos} {self.ypos} {self.nodetype} {result};\r\n'
        
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
            if ntype in ['floatatom','symbolatom','text','msg','array','coords']:
                pass
            elif ntype in ['bng','tgl','bang','toggle','nbx','vsl','hsl','vu','vradio','hradio','cnv']:
                if ntype=='bang': ntype = 'bng'
                if ntype=='toggle': ntype = 'tgl'
                pass
            elif ntype not in objnodes.read():
                raise InvalidTypeException(ntype)
            
        except InvalidTypeException as e:
            print(e)
            
        self._nodetype = ntype

    @property
    def args(self):
        return self._args

    @args.setter
    def args(self, arglist):
        newlist = []
        for a in arglist:
            a = str(a)
            newlist.append(a)
        self._args = newlist

    @property
    def xpos(self):
        return self._xpos

    @xpos.setter
    def xpos(self, x):
        self._xpos = x

    @property
    def ypos(self):
        return self._ypos

    @ypos.setter
    def ypos(self, y):
        self._ypos = y

    

class CustomVisitor(PdawVisitor):

    def __init__(self):
        self._patch = None
        self.memory = [] #memory of nodes and simple variables
        self.callables = [] #memory of functions and blocks
        self._index = -1 #index of node declarations
        self._mainIndex = -1
        self._currscope = 'main'
        self._prevscope = []

    def memorized(self, varname):
        #just ckecks if variable with given varname is in memory, and returns var
        try:
            for var in self.memory:
                if type(var)==Connection:
                    continue
                if var.name == varname and var.scope==self.currscope:
                    return var
            raise NotFoundException(varname)
        except NotFoundException as e:
            print(e)
            sys.exit(1)

    def alreadyexists(self, varname):
       for var in self.memory:
            if type(var)==Connection:
                continue
            if (var.name == varname and var.scope == self.currscope):
                return True
       return False
        
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
                    raise AlreadyExistsException(ctx.start.line, name, 0)
            self.callables.append(Function())
        except AlreadyExistsException as e:
            print(e)
            sys.exit(1)

        bookmark = self.callables[-1]
        bookmark.name = name #store name
        bookmark.body = ctx.suite() #store function body ctx
        bookmark.expargs = self.visit(ctx.typedparams()) #store expected args
        if ctx.returnstmt():
            bookmark.returns = ctx.returnstmt() #store return ctx

        print(type(bookmark), bookmark.spec())


    # Visit a parse tree produced by PdawParser#returnstmt.
    def visitReturnstmt(self, ctx:PdawParser.ReturnstmtContext):
        vname = ctx.VARNAME().getText()
        retval = self.memorized(vname).value
        self.currscope = self.prevscope
        return retval


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
                    raise AlreadyExistsException(ctx.start.line, name, 0)
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

        print(type(bookmark), bookmark.spec())

    # Visit a parse tree produced by PdawParser#dotdotstmt.
    def visitDotdotstmt(self, ctx:PdawParser.DotdotstmtContext):
        for b in self.callables:
            if self.currscope.startswith(b.name): #siamo nello scope clock1, clock2 ecc.
                self.currscope = b.resume #torna allo scope dove il nodo è stato chiamato
                if b.resume == 'main':
                    self.index = self.mainIndex #torno all'indice del main
        self.visitChildren(ctx)


    # Visit a parse tree produced by PdawParser#callstmt.
    # callstmt: '@' NAME parameters ; 
    def visitCallstmt(self, ctx:PdawParser.CallstmtContext):
        callee = None
        fname = ctx.NAME().getText()
        #check if called func/block exists
        try:
            for f in self.callables:
                if f.name == fname:
                    callee = f
                    callee.callnum += 1
                    if type(callee)==Block:
                        callee.resume = self.currscope
            if callee == None:
                raise NotFoundException(fname, True)

        except NotFoundException as e:
            print(e, True)

        #check passed parameters 
        try:
            params = self.visit(ctx.parameters())
            if len(params)!= len(callee.expargs):
                raise InvalidParametersException(callee.expargs, ctx.parameters().getText())
        except InvalidParametersException as e:
            print(e)
            sys.exit(1)
        except AttributeError: #case params = ()
            params = []

        try:
            if len(params)!=len(callee.expargs):
                raise InvalidParametersException(callee.expargs, params)
        except InvalidParametersException as e:
            print(e)
            sys.exit(1)

        #assign given parameters to expected + type check
        self.currscope = callee.name+str(callee.callnum)
        
        for i in range(len(params)):
            try: 
                if callee.expargs[i][1]=='intn':
                    params[i]=int(params[i])
                elif callee.expargs[i][1]=='floatn':
                    params[i]=float(params[i])
                elif callee.expargs[i][1]=='symbol':
                    params[i]=str(params[i])
                    
                self.memory.append(SimpleVar())
                self.memory[-1].name = callee.expargs[i][0]
                self.memory[-1].scope = self.currscope
                self.memory[-1].value = params[i]

            except ValueError:
                print(f'wrong parameter type! expected: <{callee.expargs[i][1]}>, found: <{params[i]}>')
                sys.exit(1)

        #function called
        if type(callee)==Function:
            self.visit(callee.body)
            return self.visit(callee.returns)

        #block called
        if type(callee)==Block:
            self.mainIndex = self.index
            self.index = -1
            self.visit(callee.body)
            for i in range(len(callee.dotdot)):
                self.visit(callee.dotdot[i])
            return None


    # Visit a parse tree produced by PdawParser#nodedecl1.
    # rule -> VARNAME '=' NAME parameters?
    def visitNodedecl1(self, ctx:PdawParser.Nodedecl1Context):
        try:
            if self.alreadyexists(ctx.VARNAME().getText()):
                raise AlreadyExistsException(ctx.start.line, ctx.VARNAME().getText(), 1)
        except AlreadyExistsException as e:
            print(e)
            sys.exit(1)
            
        self.index += 1
        self.memory.append(Node())
        bookmark = self.memory[-1]
        bookmark.scope = self.currscope 
        bookmark.index = self.index 
        bookmark.name = ctx.VARNAME().getText()
        bookmark.nodetype = ctx.NAME().getText()
        if ctx.parameters():
            bookmark.args = self.visit(ctx.parameters())

        print(type(bookmark), bookmark.spec())


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

        print(type(bookmark), bookmark.spec())


    # Visit a parse tree produced by PdawParser#nodedecl3.
    # rule -> operation
    def visitNodedecl3(self, ctx:PdawParser.Nodedecl3Context):
        self.index += 1
        self.memory.append(Node())
        bookmark = self.memory[-1]
        bookmark.scope = self.currscope 
        bookmark.index = self.index
        bookmark.nodetype = 'obj'
        bookmark.args = self.visit(ctx.operation())

        print(type(bookmark), bookmark.spec())


    # Visit a parse tree produced by PdawParser#nodedecl4.
    # rule -> VARNAME '=' operation
    def visitNodedecl4(self, ctx:PdawParser.Nodedecl4Context):
        try:
            if self.alreadyexists(ctx.VARNAME().getText()):
                raise AlreadyExistsException(ctx.start.line, ctx.VARNAME().getText(), 1)
        except AlreadyExistsException as e:
            print(e)
            sys.exit(1)
            
        self.index += 1
        self.memory.append(Node())
        bookmark = self.memory[-1]
        bookmark.scope = self.currscope 
        bookmark.index = self.index
        bookmark.name = ctx.VARNAME().getText()
        bookmark.nodetype = 'obj'
        bookmark.args = self.visit(ctx.operation())

        print(type(bookmark), bookmark.spec())


    # Visit a parse tree produced by PdawParser#simpledeclstmt.
    # rule -> VARNAME '=' SYMBOL | NUMBER | list | slicedlist | callstmt | expr
    def visitSimpledeclstmt(self, ctx:PdawParser.SimpledeclstmtContext):
        try:
            if self.alreadyexists(ctx.VARNAME().getText()):
                raise AlreadyExistsException(ctx.start.line, ctx.VARNAME().getText(), 1)
        except AlreadyExistsException as e:
            print(e)
            sys.exit(1)

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
            bookmark.value = self.visit(ctx.callstmt())
        elif ctx.expr():
            bookmark.value = self.visit(ctx.expr())
        else: #list
            bookmark.value = self.visitChildren(ctx)

        print(type(bookmark), bookmark.spec())

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
                    err_str = 'cannot add node variable to list'
                    raise TypeException(ctx.start.line, vname, err_str) 
            except TypeException as e:
                print(e)
                sys.exit(1)
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
            sys.exit(1)

        else:
            return res


    # Visit a parse tree produced by PdawParser#connectionstmt.
    # connectionelem (CONNECT connectionelem)+
    def visitConnectionstmt(self, ctx:PdawParser.ConnectionstmtContext):
        self.full_text = {}
        
        for i in range(len(ctx.connectionelem())-1):
            sourcelist = self.visit(ctx.connectionelem(i)) # [(node_id, out1)]
            sinklist = self.visit(ctx.connectionelem(i+1)) # [(node_id, in1), (node_id, out2)]

            #controllino del primo giro
            if i == 0:
                for (source,outlet) in sourcelist:
                    if outlet.startswith('in'):
                        print('warning: as a source, u should spec outlets, not inlets!')
            #controllino dell'ultimo giro:
            if i == len(ctx.connectionelem())-2:
                for sink,inlet in sinklist:
                    if inlet.startswith('out'):
                        print('warning: as a sink, u should spec inlets, not outlets!')
                        
            for (source,outlet) in sourcelist:
                for (sink,inlet) in sinklist:
                    if outlet.startswith('in') or outlet=='':
                        outlet = 'out1'
                    if inlet.startswith('out') or inlet=='':
                        #in questo caso in realtà l'out serve quando il nodo sarà source
                        #ovvero al prossimo connectionelem(i)
                        inlet = 'in1'
                    #print(f'#X connect {source} {outlet} {sink} {inlet}')
                    conn = Connection(self.currscope, source, outlet, sink, inlet)
                    self.memory.append(conn)
                    print(type(conn), conn.spec())
                   

    # Visit a parse tree produced by PdawParser#multipleconn.
    # '[' (VARNAME | nodedeclstmt) ('.'IOLET)? (',' (VARNAME | nodedeclstmt) ('.'IOLET)?)* ']'
    def visitMultipleconn(self, ctx:PdawParser.MultipleconnContext):
        nodelist = []
        for i in range(len(ctx.singlenode())):
            nodelist.append(self.visit(ctx.singlenode(i)))
        return nodelist


    # Visit a parse tree produced by PdawParser#singleconn.
    # (VARNAME | nodedeclstmt)('.'IOLET)? #singleconn
    def visitSingleconn(self, ctx:PdawParser.SingleconnContext):
        nodelist = []
        nodelist.append(self.visit(ctx.singlenode()))
        return nodelist

    # Visit a parse tree produced by PdawParser#singlenode.
    # this method is called when visiting a single node inside connection
    def visitSinglenode(self, ctx:PdawParser.SinglenodeContext):
        #controllo che il nodo non sia già stato dichiarato alla visita precedente
        dont = False
        ctx_text = ctx.getText()
        if (ctx_text, ctx.start) in self.full_text:
            dont = True

        iolet = ''

        try:
            vname = ''
            if ctx.nodedeclstmt():
                if dont == True:
                    node_id = self.full_text[(ctx_text, ctx.start)]
                else:
                    node_id = self.index+1
                    self.visit(ctx.nodedeclstmt())
                    self.full_text.update({(ctx_text, ctx.start) : node_id})
            elif ctx.VARNAME():
                vname = ctx.VARNAME().getText()
                node_id = self.memorized(vname).index

        except AttributeError:
            if vname == '':
                print('an error occourred in memory')
            else:
                print(f'cannot use {type(self.memorized(vname))} in connections')
                sys.exit(1)
            
        if ctx.IOLET():
            iolet = ctx.IOLET().getText()
        
        return (node_id, iolet)


    # Visit a parse tree produced by PdawParser#parameters.
    def visitParameters(self, ctx:PdawParser.ParametersContext):
        return self.visit(ctx.argslist())


    # Visit a parse tree produced by PdawParser#typedparams.
    #  : '(' typedargslist? ')'
    def visitTypedparams(self, ctx:PdawParser.TypedparamsContext):
        if ctx.typedargslist():
            return self.visit(ctx.typedargslist())
        return []


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
            if type(self.memorized(vname)) in [SimpleVar, Iterator]:
                return self.memorized(vname).value
                
        elif ctx.slicedlist():
            return self.visit(ctx.slicedlist())
        elif ctx.expr():
            return self.visit(ctx.expr())
        elif ctx.callstmt():
            value = self.visit(ctx.callstmt())
            if value==None:
                raise Exception('cannot call a block as argument')
            return value
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
        arglist = []
        arglist.append(ctx.op.text)
        if ctx.NUMBER():
            arglist.append(ctx.NUMBER().getText())
        return arglist


    # Visit a parse tree produced by PdawParser#ifstmt.
    # IF expr ':' suite (ELIF expr ':' suite)* (ELSE ':' suite)? END
    def visitIfstmt(self, ctx:PdawParser.IfstmtContext):
        if self.visit(ctx.expr(0))==True:
            return self.visitSuite(ctx.suite(0))
        if ctx.ELIF():
            for i in range (len(ctx.ELIF())):
                if self.visit(ctx.expr(i+1))==True:
                    return self.visitSuite(ctx.suite(i+1))
        if ctx.ELSE():
            lastsuite = len(ctx.suite())-1
            return self.visitSuite(ctx.suite(lastsuite))

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
                err_str = 'cannot use non numeric variables in expressions'
                raise TypeException(ctx.start.line, vname, err_str)
            
        except TypeException as e:
            print(f'error at line: {ctx.start.line}\n ')
        except AttributeError:
            print(e)
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
        return self.visit(ctx.callstmt())


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
    # FOR VARNAME 'in range' (NUMBER | callstmt | VARNAME) ':' suite END
    def visitForstmt(self, ctx:PdawParser.ForstmtContext):
        name = ctx.VARNAME(0).getText()
        if self.alreadyexists(name):
            bookmark = self.memorized(name)
        else: 
            self.memory.append(Iterator())
            bookmark = self.memory[-1]
            bookmark.name = name
            bookmark.scope = self.currscope

        bookmark.value = -1
        print(type(bookmark), bookmark.spec())

        #get range len
        try:
            if ctx.NUMBER():
                if '.' in ctx.NUMBER().getText():
                    rangelen = ctx.NUMBER().getText().split('.')
                    rangelen = int(rangelen[0])
                    print('warning: cannot use float variables as range len, will use {rangelen} instead')
                else:
                    rangelen = int(ctx.NUMBER().getText())
            elif ctx.callstmt():
                rangelen = int(self.visit(ctx.callstmt()))
            elif ctx.VARNAME(1):
                vname = ctx.VARNAME(1).getText()
                if type(self.memorized(vname)) == Node:
                    err_str = 'cannot use node variables as range len'
                    raise TypeException(ctx.start.line, vname, err_str)
                if isinstance(self.memorized(vname).value, int):
                    rangelen = int(self.memorized(vname).value)
                elif isinstance(self.memorized(vname).value, float):
                    rangelen = int(self.memorized(vname).value)
                    print('warning: cannot use float variables as range len, will use {rangelen} instead')
                else:
                    raise TypeException(ctx.start.line, vname, 'wrong type used as range len')
                
        except TypeException as e:
            print(e)
            sys.exit(1)

        #visit suite
        for i in range(rangelen):
            bookmark.value+=1
            self.visitSuite(ctx.suite())

        bookmark.value = -1

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
    def mainIndex(self):
        return self._mainIndex

    @mainIndex.setter
    def mainIndex(self, nodeindex):
        self._mainIndex = nodeindex

    @property
    def currscope(self):
        return self._currscope

    @currscope.setter
    def currscope(self, scope):
        self.prevscope = self._currscope
        self._currscope = scope

    @property
    def prevscope(self):
        latestscope = self._prevscope[-1]
        self._prevscope = self._prevscope[:-1]
        return latestscope

    @prevscope.setter
    def prevscope(self, scope):
        self._prevscope.append(scope)



del PdawParser
