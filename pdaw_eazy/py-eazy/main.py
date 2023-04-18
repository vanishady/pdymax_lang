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
v = PdeasyVisitor()
for e in listener.callables:
    v.callables.append(e)
v.visit(tree)

#print data in intermediate form 
for st in v.memory:
    for var in st:
        print(type(var), var.spec())
        #var.fullspec()
        #print(f'\t')

for c in v.connections:
    print(c)


    
 
