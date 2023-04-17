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

class CallSyntaxError(Exception):

    def __init__(self, lineno, name):
        self._lineno = lineno
        self._name = name

    def __str__(self):
        return f'error at line: {self._lineno}\n wrong syntax in calling block <{self._name}>' 

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

    def __init__(self, lineno, used=None, expected=None):
        self._lineno = lineno
        self._used = used
        self._expected = expected

    def __str__(self):
        return f'error at line: {self._lineno}\n expected type {self._expected}, found type {self._used}'

    
class OutOfContextError(Exception):

    def __init__(self, lineno, details = None):
        self._lineno = lineno
        self._details = details
        if details == None: self._details = 'seems like you used a statement out of its right context.'

    def __str__(self):
        return f'error at line: {self._lineno}\n {self._details}'
