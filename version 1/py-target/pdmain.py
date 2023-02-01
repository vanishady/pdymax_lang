import sys
import random
import itertools
from antlr4 import*
from antlr4.CommonTokenStream import CommonTokenStream
from antlr4.InputStream import InputStream
from PdlangLexer import PdlangLexer
from PdlangParser import PdlangParser
from PdlangListener import PdlangListener
from antlr4.tree.Tree import ParseTreeWalker
from antlr4.error.ErrorListener import ErrorListener
import PdVisitor
        
class PrintListener(PdlangListener):
    def enterEveryRule(self, ctx):
        print(ctx.start, ctx.stop, PdlangParser.ruleNames[ctx.getRuleIndex()])

    def exitSuite(self, ctx):
        print(ctx.start, ctx.stop, 'end'+PdlangParser.ruleNames[ctx.getRuleIndex()])
### get input filename ###

fn=False
while fn==False:
    if len(sys.argv)!=2:
        fn = input('please enter input filename, i.e. <input.txt>: ')
    else:
        fn = sys.argv[1]

### LEXER AND PARSER WORK ###
try:
    lexer = PdlangLexer(FileStream(fn))
except FileNotFoundError:
    sys.exit(f'file {fn} does not exist.')
    
stream = CommonTokenStream(lexer)
parser = PdlangParser(stream)

tree = None
tree = parser.prog()

visitor = PdVisitor.CustomVisitor()
visitor.visit(tree)

#listener = PrintListener()
#walker = ParseTreeWalker()
#walker.walk(listener, tree)

"""
#see how nodes and connections are stored
for elem in visitor.memory:
    if type(elem)==PdVisitor.Node:
        print(elem.getNodeSpec())
    elif type(elem)==PdVisitor.Block:
        print(elem.makeString())
    else:
        print('wus that bro?? shouldn be here')
        print(elem)

for elem in visitor.connections:
    print(type(elem), elem.makeString())
"""

### FORMATTER ###

# 1. crea un dizionario 'scopelist' in cui ogni coppia chiave-valore corrisponde a:
#   (scope_nodo, id_nodo) : [id_nodo_connesso_1, id_nodo_connesso_2, ...] 

scopelist={}
#{('onoff', 0): [1], ('general', 1): [2], ('general', 3): [5, 6, 7, 8, 9], ...}
for elem in visitor.connections:
    scope = elem.getScope()
    if type(elem)==PdVisitor.Connection: #caso connessione singola per inlet/outlet
        connection = elem.makeString()
        connection=connection.split(' ')
        source=connection[2] #id source
        sink=connection[4] #id sink
        if (scope,int(source)) not in scopelist.keys():
            scopelist.update({(scope,int(source)):[int(sink)]})
        else:
            scopelist[(scope,int(source))].append(int(sink))
        
    else:
        parts = elem.makeString().split(';\r\n')
        for p in parts:
            p=p.split(' ')
            try:
                source=p[2]
                sink=p[4]
            except:
                continue
            if (scope,int(source)) not in scopelist.keys():
                scopelist.update({(scope,int(source)):[int(sink)]})
            else:
                scopelist[(scope,int(source))].append(int(sink))


# 2. chiama il metodo setPos(x,y) su ciascun nodo o blocco.

forcex=0
x=20
y=20

#sistemazione dei blocchi
for node in visitor.memory:
    if type(node)==PdVisitor.Block and node.isBlockEnd()==True:
        node.setPos(x,y)
        if x>600:
            x=20
            y+=40
        else:
            x+=200

#ritorno a capo dopo la sistemazione dei blocchi
x=20
y+=40

for node in visitor.memory:
    
    issource=False
    if type(node)!=PdVisitor.Node:
            continue
    scope = node.getScope()
    index = node.getIndex()

    #sistemazione di nodi da cui partono connessioni
    for k in scopelist.keys():
        if k[0]==scope and k[1]==index:
            issource=True
            node.setPos(x,y)
            x=node.getPosx()
            for n in scopelist[k]:
                for another in visitor.memory:
                    if type(another)!=PdVisitor.Node:
                        continue
                    if another.getIndex()==int(n) and another.getScope()==scope:
                        another.setPos(x,node.getPosy()+60)
                        x+=60
                        another.setSource(node)
            x=node.getPosx() #resetto la posizione a dove eravamo arrivati consultando la source
            
    #sistemazioni di nodi che non sono sink né source
    if issource==False:
        y+=40
        node.setPos([x+200 if x+200<800 else 0],max(node.getSourceY()+40,y))
           
### INTERPRETER WORK ###

result = '#N canvas 300 100 800 500 12 ;\r\n'


for elem in visitor.memory:
    #stampa dei nodi
    if type(elem)==PdVisitor.Node:
        line = elem.getNodeString()
        for char in line:
            if char not in ',"[]\'':
                result+= char
        result+= ';\r\n'
    elif type(elem)==PdVisitor.Block:
        if elem.isBlockEnd():
            #se l'elemento è la chiusura di un blocco, allora prima di stampare
            #la chiusura del blocco stesso vengono stampate le connessioni
            #relative allo scope (blockId)
            for c in visitor.connections:
                if c.getScope() == elem.getBlockId():
                    result+= c.makeString()
        result+=elem.makeString()

#vengono stampate le restanti connessioni 
for conn in visitor.connections:
    if conn.getScope()=='general':
        result+=conn.makeString()

outfile = visitor.getPatchName()
output = open('outputs/'+outfile+'.pd', 'w')
output.write(result)
output.close()

print(f'generated file {outfile}.pd')
