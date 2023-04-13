import sys
from antlr4 import*
from antlr4.CommonTokenStream import CommonTokenStream
from antlr4.InputStream import InputStream
from PdeasyLexer import PdeasyLexer
from PdeasyParser import PdeasyParser
from PdeasyVisitor import PdeasyVisitor
from antlr4.tree.Tree import ParseTreeWalker
from ImportListener import ImportListener


### ANTLR ###
lexer = PdeasyLexer(FileStream('input_eazy1.txt'))
stream = CommonTokenStream(lexer)
parser = PdeasyParser(stream)
tree = parser.prog()

#import files
listener = ImportListener()
walker = ParseTreeWalker()
walker.walk(listener, tree)

v = PdeasyVisitor()
for e in listener.callables:
    v.callables.append(e)
v.visit(tree)

for st in v.memory:
    for var in st:
        print(var.spec())
        #var.fullspec()
        #print(f'\t')

for c in v.connections:
    print(c)
    
 
