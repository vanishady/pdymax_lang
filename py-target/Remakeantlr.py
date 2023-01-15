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

#{('onoff', 0): [1], ('general', 1): [2], ('general', 3): [5, 6, 7, 8, 9], ...}
scopelist={}
for elem in visitor.connections:
    #print(type(elem), elem.getScope(), elem.makeString())
    scope = elem.getScope()
    if type(elem)==Remakez.Connection:
        connection = elem.makeString()
        connection=connection.split(' ')
        source=connection[2]
        sink=connection[4]
        #print(scope,source, sink)
        if (scope,int(source)) not in scopelist.keys():
            scopelist.update({(scope,int(source)):[int(sink)]})
        else:
            scopelist[(scope,int(source))].append(int(sink))
        #print(scopelist[(scope,int(source))])
        
    else:
        parts = elem.makeString().split(';\r\n')
        for p in parts:
            p=p.split(' ')
            try:
                source=p[2]
                sink=p[4]
                #print(scope,source, sink)
            except:
                continue
            if (scope,int(source)) not in scopelist.keys():
                scopelist.update({(scope,int(source)):[int(sink)]})
            else:
                scopelist[(scope,int(source))].append(int(sink))
            #print(scopelist[(scope,int(source))])

forcex=0
x=20
y=20

#prima sistemo i nodi che sono subbatch (block)
for node in visitor.memory:
    if type(node)==Remakez.Block and node.isBlockEnd()==True:
        node.setPos(x,y)
        if x>600:
            x=20
            y+=40
        else:
            x+=200

x=20
y+=40

#poi sistemo i nodi che sono connessi ad altri nodi
for node in visitor.memory:
    issource=False
    if type(node)!=Remakez.Node:
            continue
    scope = node.getScope()
    index = node.getIndex()

    for k in scopelist.keys():
        if k[0]==scope and k[1]==index:
            issource=True
            node.setPos(x,y)
            x=node.getPosx()
            for n in scopelist[k]:
                for another in visitor.memory:
                    if type(another)!=Remakez.Node:
                        continue
                    if another.getIndex()==int(n) and another.getScope()==scope:
                        another.setPos(x,node.getPosy()+60)
                        x+=60
                        another.setSource(node)
            x=node.getPosx()
    #se i nodi non sono connessi a niente, li sistemo così     
    if issource==False:
        if forcex>800:
            forcex=0
            y+=40
        forcex+=x
        srcy= node.getSourceY()
        node.setPos(forcex+100,srcy+60)
        if srcy == 0:
            node.forcePos(forcex+100,y+60)



    
            
### INTERPRETER WORK ###

result = '#N canvas 676 207 681 509 12 ;\r\n'

for elem in visitor.memory:
    if type(elem)==Remakez.Node:
        line = elem.getNodeString()
        for char in line:
            if char not in ',"[]\'':
                result+= char
        result+= ';\r\n'
    elif type(elem)==Remakez.Block:
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
