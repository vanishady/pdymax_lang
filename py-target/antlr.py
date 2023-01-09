import sys
from antlr4 import*
from antlr4.CommonTokenStream import CommonTokenStream
from antlr4.InputStream import InputStream
from SimpleLexer import SimpleLexer
from SimpleParser import SimpleParser
from SimpleListener import SimpleListener
from antlr4.tree.Tree import ParseTreeWalker
from antlr4.error.ErrorListener import ErrorListener
from MyVisitorz import MyVisitorz


### LEXER AND PARSER WORK ###

lexer = SimpleLexer(FileStream('input2.txt'))
stream = CommonTokenStream(lexer)
parser = SimpleParser(stream)

tree = None
tree = parser.prog()

visitor = MyVisitorz()
visitor.visit(tree)

### INTERPRETER WORK ###

output = open('output.pd', 'w')
output.write('#N canvas 676 207 681 509 12 ;\r\n')
output.close()

output = open('output.pd', 'a')

for elem in visitor.memory:
    line = elem.getNodeString()
    for char in line:
        if char not in ',"[]\'':
            output.write(char)
    output.write(';\r\n')


output.write(visitor.connections)

for elem in visitor.connectionstmts:
    output.write(elem.getConnectionString())

output.close()







