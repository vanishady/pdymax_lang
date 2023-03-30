import sys
from antlr4 import*
from antlr4.CommonTokenStream import CommonTokenStream
from antlr4.InputStream import InputStream
from PdeasyLexer import PdeasyLexer
from PdeasyParser import PdeasyParser
from PdeasyListener import PdeasyListener
from PdeasyVisitor import PdeasyVisitor
from antlr4.tree.Tree import ParseTreeWalker


### ANTLR ###
lexer = PdeasyLexer(FileStream('input_eazy.txt'))
stream = CommonTokenStream(lexer)
parser = PdeasyParser(stream)
tree = parser.prog()

#listener = PdeasyListener()
#walker = ParseTreeWalker()
#walker.walk(listener, tree)

v = PdeasyVisitor()
v.visit(tree)

for st in v.memory:
    for var in st:
        print(var.spec())
        #var.fullspec()
        #print(f'\t')
