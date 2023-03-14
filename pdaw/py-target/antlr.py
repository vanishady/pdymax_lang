import sys
from antlr4 import*
from antlr4.CommonTokenStream import CommonTokenStream
from antlr4.InputStream import InputStream
from PdawLexer import PdawLexer
from PdawParser import PdawParser
from PdawListener import PdawListener
import Visitor
from antlr4.tree.Tree import ParseTreeWalker

# get input filename 

fn=False
while fn==False:
    if len(sys.argv)!=2:
        fn = input('please enter input filename, i.e. <input.txt>: ')
        if '.' not in fn:
            fn = fn+'.txt'
    else:
        fn = sys.argv[1]

try:
    lexer = PdawLexer(FileStream(fn))
except FileNotFoundError:
    sys.exit(f'file {fn} does not exist.')

  
### ANTLR ###
lexer = PdawLexer(FileStream(fn))
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
            sink.issink = True
            if source not in connections:
                connections[source]=[sink]
            else:
                connections[source].append(sink)
    #allconnections.append(dict(sorted(connections.items())))
    allconnections.append(connections)


for connections in allconnections:
    x=40 #ogni volta che lo scope cambia, la pos si azzera
    y = 120
    for source in connections:
        if source.issink == False:
            y=120
        source.xpos = x
        source.ypos = y
        x = source.xpos
        for sink in connections[source]:
            sink.xpos = x
            sink.ypos = source.ypos+40
            x+=100
            
### PRINTER ###
res = '#N canvas 300 100 800 500 12 ;\r\n'
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
        res+=(f'#N canvas 0 0 400 400 {scope[1:]};\r\n')
        for node in scopes[scope]:
            if type(node)==Visitor.Node:
                res+=(node.printer())

        for conn in scopes[scope]:
            if type(conn)==Visitor.Connection:
                res+=(conn.printer())
        res+=(f'#X restore {x} {y} pd {scope[1:]};\r\n')
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

"""
for n in v.memory:
    print(type(n), n.spec())

    if type(n) in [Visitor.Node, Visitor.Connection, Visitor.SimpleVar, Visitor.Block]:
            print(type(n), n.spec())
"""

outfile = v.patch
output = open('outputs/'+outfile+'.pd', 'w')
output.write(res)
output.close()
print(f'generated file {outfile}.pd')
