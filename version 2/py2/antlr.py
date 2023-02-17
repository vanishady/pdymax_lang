import sys
from antlr4 import*
from antlr4.CommonTokenStream import CommonTokenStream
from antlr4.InputStream import InputStream
from PdawLexer import PdawLexer
from PdawParser import PdawParser
from PdawListener import PdawListener
import Visitor
from antlr4.tree.Tree import ParseTreeWalker

### ANTLR ###

lexer = PdawLexer(FileStream('input2.txt'))
stream = CommonTokenStream(lexer)
parser = PdawParser(stream)
tree = parser.prog()

v = Visitor.CustomVisitor()
v.visit(tree)

#devide per scopes
scopes = {} #sia nodi che connessioni sono appesi nello scope relativo
for n in v.memory:
    if type(n) in [Visitor.Node, Visitor.Connection]:
        if n.scope not in scopes:
            scopes[n.scope] = [n]
        else:
            scopes[n.scope].append(n)

### FORMATTER ###
allconnections = [] #lista di connections
for scope in scopes:
    connections = {} #dizionario di connessioni presenti in uno scope, {source: [sink, sink, ...]}
    for elem in scopes[scope]:
        if type(elem)==Visitor.Connection:
            source = v.nodefromindex(scope,elem.source)
            sink = v.nodefromindex(scope,elem.sink)
            if source not in connections:
                connections[source]=[sink]
            else:
                connections[source].append(sink)
    #allconnections.append(dict(sorted(connections.items())))
    allconnections.append(connections)


for connections in allconnections:
    x=40 #ogni volta che lo scope cambia, la pos si azzera
    y=40
    for source in connections:
        source.xpos = x
        source.ypos = y
        x = source.xpos
        y+=40
        for sink in connections[source]:
            sink.xpos = x
            sink.ypos = y
            x+=100
            
            
### PRINTER ###
res = '#N canvas 0 0 400 400 12;\r\n'
x = 40
y = 40

try:
    for node in scopes['main']:
        if type(node)==Visitor.Node:
            res+=(node.printer())
except:
    pass

    
for scope in scopes:
    if scope == 'main':
        continue
    else:
        res+=(f'#N canvas 0 0 400 400 {scope};\r\n')
        for node in scopes[scope]:
            if type(node)==Visitor.Node:
                res+=(node.printer())

        for conn in scopes[scope]:
            if type(conn)==Visitor.Connection:
                res+=(conn.printer())
        res+=(f'#X restore {x} {y} pd {scope};\r\n')
        x+=100
        if x>600:
            x = 40
            y += 40

try:
    for conn in scopes['main']:
        if type(conn)==Visitor.Connection:
            res+=(conn.printer())
except:
    pass


for n in v.memory:
    if type(n) in [Visitor.Node, Visitor.Connection, Visitor.SimpleVar]:
            print(type(n), n.spec())



outfile = v.patch
output = open('outputs/'+outfile+'.pd', 'w')
output.write(res)
output.close()
print(f'generated file {outfile}.pd')
