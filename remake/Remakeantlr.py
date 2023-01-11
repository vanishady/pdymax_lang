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
from Remakez import Remakez
        
### LEXER AND PARSER WORK ###

lexer = SimpleLexer(FileStream('input3.txt'))
stream = CommonTokenStream(lexer)
parser = SimpleParser(stream)

tree = None
tree = parser.prog()

visitor = Remakez()
visitor.visit(tree)

### INTERPRETER WORK ###

result = '#N canvas 676 207 681 509 12 ;\r\n'


#print node string to result
counter=-1
for elem in visitor.memory:
    try:
        print(elem.getNodeSpec())
    except:
        continue

    line = elem.getNodeString()
    for char in line:
        if char not in ',"[]\'':
            result+= char
    result+= ';\r\n'

#outfile = visitor.getPatchName()
#output = open(outfile+'.pd', 'w')
#output.write(result)
#output.close()
print('OUTPUT.PD\r\n')
print(result)
