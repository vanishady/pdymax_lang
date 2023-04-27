###############
# exceptions
###############

class AlreadyExistsException(Exception):

    def __init__(self, lineno, varname):
        self._varname = varname
        self._lineno = lineno

    def __str__(self):
        return f'error at line: {self._lineno}\n <{self._varname}> already exists. Change name.'

class NotFoundException(Exception):

    def __init__(self, lineno, varname):
        self._varname = varname
        self._lineno = lineno

    def __str__(self):
        return f'error at line: {self._lineno}\n <{self._varname}> does not exist in this scope'

class CallError(Exception):

    def __init__(self, lineno):
        self._lineno = lineno

    def __str__(self):
        return f'error at line: {self._lineno}\n cannot use block call in normal expressions.>' 

class InvalidParameterException(Exception):

    def __init__(self, lineno, passed=None, expected=None):
        self._lineno = lineno
        self._passed = passed
        self._expected = expected

    def __str__(self):
        return f'error at line: {self._lineno}\n expected {self._expected}, found {self._passed}'

class MissingParameterException(Exception):

    def __init__(self, lineno, passed=None, expected=None):
        self._lineno = lineno

    def __str__(self):
        return f'error at line: {self._lineno}\n missing some args to pass to function/block'

class TypeException(Exception):

    def __init__(self, lineno, used=None, expected=None, details=''):
        self._lineno = lineno
        self._used = used
        self._expected = expected
        self._details = details

    def __str__(self):
        return f'error at line: {self._lineno}\n expected type {self._expected}, found type {self._used} {self._details}\n'

    
class OutOfContextError(Exception):

    def __init__(self, lineno, details = None):
        self._lineno = lineno
        self._details = details
        if details == None: self._details = 'seems like you used a statement out of its proper context.'

    def __str__(self):
        return f'error at line: {self._lineno}\n {self._details}'

class ConnectionError(Exception):

    def __init__(self, lineno, details = None):
        self._lineno = lineno
        self._details = details
        if details == None: self._details = 'all nodes in connection must belong to same block.'

    def __str__(self):
        return f'error at line: {self._lineno}\n {self._details}'

class InvalidNodeError(Exception):

    def __init__(self, lineno, nt):
        self._lineno = lineno
        self._nt = nt

    def __str__(self):
        return f'error at line: {self._lineno}\n {self._nt} is not a supported node type. Check pd/maxMSP doc.'
    
class InvalidNameException(Exception):

    def __init__(self, lineno, name):
        self._lineno = lineno
        self._name = name
        
    def __str__(self):
        return f'error at line: {self._lineno}\n {self._name} is not valid. Use another name.'
