###############
# variables
###############

class Iterator():

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
    

class Function():

    def __init__(self):
        self._name = None
        self._body = None
        self._expargs = None #lista di tuple (vname, vtype)
        self._returns = None

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

    @property
    def returns(self):
        return self._returns

    @returns.setter
    def returns(self, val):
        self._returns = val
    

class Block():

    def __init__(self):
        self._name = None
        self._alias = None
        self._index = None
        self._body = None
        self._expargs = None
        self._xpos = 0
        self._ypos = 0

    def spec(self):
        return self.expargs, self.name

    @property
    def alias(self):
        return self._alias

    @alias.setter
    def alias(self, name):
        self._alias = name

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
        self._scope = None

    def spec(self):
        return self.scope,self.name, self.index, self.nodetype, self.args

    def fullspec(self):
        specdict = {'name':self.name,
                    'index':self.index,
                    'nodetype': self.nodetype,
                    'args':self.args}
        for key, value in specdict.items():
            print(key, ' : ', value)

    @property
    def name(self):
        return self._name

    @name.setter
    def name(self, varname):
        self._name = varname

    @property
    def args(self):
        return self._args

    @args.setter
    def args(self, nodeargs):
        self._args = nodeargs

    @property
    def scope(self):
        return self._scope

    @scope.setter
    def scope(self, currscope):
        self._scope = currscope


class SimpleVar():

    """implements simple vars: integer, float, symbol."""

    def __init__(self):
        self._name = None
        self._value = None

    def spec(self):
        return self.scope, self.name, self.value

    def fullspec(self):
        specdict = {'name':self.name,
                    'value':self.value}
        for key, value in specdict.items():
            print(key, ' : ', value)

    @property
    def name(self):
        return self._name

    @name.setter
    def name(self, varname):
        self._name = varname

    @property
    def value(self):
        return self._value

    @value.setter
    def value(self, val):
        self._value = val



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
            if type(variable) in [Node]:
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

