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

result = '#N canvas 676 207 681 509 12 ;\r\n'

###ptrovaaaaa
xindex = 0
yindex = 0
for elem in visitor.connectionstmts:
    connectz = elem.getConnections()
    connectz = connectz[1:]
    sep = '|'
    parts = [list(y) for x,y in itertools.groupby(connectz, lambda z: z == sep) if not x]
    for c in range(len(parts)-1):
            p1, p2 = parts[c], parts[c+1]
            for nodeId in p1:
                xindex += 40
                node = visitor.memory[nodeId]
                node.setPos(xindex, yindex)
            yindex+=40
            xindex = 0
            for nodeId in p2:
                xindex += 40
                node = visitor.memory[nodeId]
                node.setPos(xindex, yindex)
#fine provaaaaa

for elem in visitor.memory:
    if elem.getPos() == None:
        elem.setPos(random.randint(20, 500), random.randint(20, 500))
    line = elem.getNodeString()
    for char in line:
        if char not in ',"[]\'':
            result+= char
    result+= ';\r\n'


result+=visitor.connections

for elem in visitor.connectionstmts:
    result+= elem.getConnectionString()
    


output = open('output.pd', 'w')
output.write(result)
output.close()
print(result)







