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

lexer = SimpleLexer(FileStream('input2.txt'))
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
### FORMATTER ###
xindex = 20
yindex = 20
for conn in visitor.connections:
    if type(conn) == Remakez.Connection:
        for node in visitor.memory:
            if type(node)==Remakez.Block:
                continue
            if node.getIndex() == conn.getSource() and node.getScope()==conn.getScope():
                source=node
                for anothernode in visitor.memory:
                    if type(anothernode)==Remakez.Block:
                        continue
                    if anothernode.getIndex() == conn.getSink() and anothernode.getScope()==conn.getScope():
                        sink=anothernode
                if source.getPos == None: #la pos non è ancora stata assegnata al node
                    node.setPos(xindex, yindex)
                yindex += 40
                sink.setPos(xindex, yindex)
            xindex=0
    if type(conn) == Remakez.MultipleConn:
        nodelist = conn.connectednodes
        parts = conn.splitlist(nodelist)
        xindex+=80
        for c in range(len(parts)-1):
            p1, p2 = parts[c], parts[c+1]
            yindex+=40
            for sourceId in p1:
                for sinkId in p2:
                    for node in visitor.memory:
                        if type(node)==Remakez.Block:
                            continue
                        if node.getIndex() == sourceId and node.getScope()==conn.getScope():
                            for anothernode in visitor.memory:
                                if type(anothernode)==Remakez.Block:
                                    continue
                                if anothernode.getIndex() == sinkId and anothernode.getScope()==conn.getScope():
                                    sink=anothernode
                            if node.getPos == None: #la pos non è ancora stata assegnata al node
                                node.setPos(xindex, yindex)
                            xindex += 40
                            sink.setPos(xindex, yindex)
            xindex = 20

"""
for node in visitor.memory:
    if type(node)==Remakez.Block:
        continue
    if node.getPos() == False:
        print('nonnn')
        node.setPos(random.randint(20,500),random.randint(20,500))
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
