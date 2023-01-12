import sys
import random
import itertools
from antlr4 import*
from antlr4.CommonTokenStream import CommonTokenStream
from antlr4.InputStream import InputStream
from SimpleLexer import SimpleLexer
from SimpleParser import SimpleParser
from SimpleListener import SimpleListener
from antlr4.tree.Tree import ParseTreeWalker
from antlr4.error.ErrorListener import ErrorListener
import Remakez
        
### LEXER AND PARSER WORK ###

lexer = SimpleLexer(FileStream('input4.txt'))
stream = CommonTokenStream(lexer)
parser = SimpleParser(stream)

tree = None
tree = parser.prog()

visitor = Remakez.Remake()
visitor.visit(tree)

"""
#see how nodes and connections are stored
for elem in visitor.memory:
    if type(elem)==Remakez.Node:
        print(elem.getNodeSpec())
    elif type(elem)==Remakez.Block:
        print(elem.makeString())
    else:
        print('wus that bro?? shouldn be here')
        print(elem)

for elem in visitor.connections:
    print(type(elem), elem.makeString())
"""

### INTERPRETER WORK ###

result = '#N canvas 676 207 681 509 12 ;\r\n'

for elem in visitor.memory:
    if type(elem)==Remakez.Node:
        line = elem.getNodeString()
        for char in line:
            if char not in ',"[]\'':
                result+= char
        result+= ';\r\n'
    elif type(elem)==Remakez.Block: #è un blocco che inizia o finisce
        if elem.isBlockEnd():
            for c in visitor.connections:
                if c.getScope() == elem.getBlockId():
                    result+= c.makeString()
        result+=elem.makeString()
  
for conn in visitor.connections:
    if conn.getScope()=='general':
        result+=conn.makeString()

outfile = visitor.getPatchName()
output = open(outfile+'.pd', 'w')
output.write(result)
output.close()
#print('OUTPUT.PD\r\n')
#print(result)
