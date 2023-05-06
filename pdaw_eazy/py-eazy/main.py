import sys
from antlr4 import*
import tkinter as tk
from tkinter import filedialog
from antlr4.CommonTokenStream import CommonTokenStream
from antlr4.InputStream import InputStream
from PdeasyLexer import PdeasyLexer
from PdeasyParser import PdeasyParser
from PdeasyVisitor import PdeasyVisitor
from antlr4.tree.Tree import ParseTreeWalker
from ImportListener import ImportListener
from exceptions import *
from components import *
from formatter import *


#choose input file 
root = tk.Tk()
root.withdraw()
file_path = filedialog.askopenfilename()

### ANTLR ###
lexer = PdeasyLexer(FileStream(file_path))
stream = CommonTokenStream(lexer)
parser = PdeasyParser(stream)
tree = parser.prog()

#parse imported files
listener = ImportListener()
walker = ParseTreeWalker()
walker.walk(listener, tree)

#add imported files and parse input
try:
    v = PdeasyVisitor()
    for e in listener.callables:
        v.callables.append(e)
    v.visit(tree)
except AlreadyExistsException as e1:
    print(e1)
except NotFoundException as e2:
    print(e2)
except CallError as e3:
    print(e3)
except InvalidParameterException as e4:
    print(e4)
except MissingParameterException as e5:
    print(e5)
except TypeException as e6:
    print(e6)
except OutOfContextError as e7:
    print(e7)
except ConnectionError as e8:
    print(e8)
except InvalidNameException as e9:
    print(e9)
except AttributeError as e10:
    print(e10)
except ValueError as e11:
    print(e11)

#print data in intermediate form

"""
for st in v.memory:
    for var in st:
        print(type(var), var.spec())
        #var.fullspec()
        #print(f'\t')
"""

pdformatter = PdFormatter(v.memory, v.connections, v.patchname)
maxformatter = MaxFormatter(v.memory, v.connections, v.patchname)

