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

class PrintListener(SimpleListener):

    def __init__(self):
        self.varcount = -1
        self.blockends = []

    def getBlockends(self):
        return self.blockends

    def enterFullDeclStmt(self, ctx):
        self.varcount+=1

    def enterFastDeclStmt(self, ctx):
        self.varcount+=1

    def enterOpDeclStmt(self, ctx):
        self.varcount+=1

    def enterIoletdeclasarg(self, ctx):
        if not ctx.ID():
            self.varcount+=1

    def enterIoletdeclstmt(self, ctx):
        if not ctx.ID():
            self.varcount+=1

    def enterFullDeclStmtInside(self, ctx):
        self.varcount+=1

    def enterFastDeclStmtInside(self, ctx):
        self.varcount+=1

    def enterOpDeclStmtInside(self, ctx):
        self.varcount+=1

    def exitBlockstmt(self, ctx):
        self.varcount+=1
        self.blockends.append(self.varcount)
        

### LEXER AND PARSER WORK ###

lexer = SimpleLexer(FileStream('input2.txt'))
stream = CommonTokenStream(lexer)
parser = SimpleParser(stream)

tree = None
tree = parser.prog()

visitor = MyVisitorz()
visitor.visit(tree)

listener = PrintListener()
walker = ParseTreeWalker()
walker.walk(listener, tree)
blockends=listener.getBlockends()

### INTERPRETER WORK ###

result = '#N canvas 676 207 681 509 12 ;\r\n'

#organize posx and posy for connected nodes
xindex = 0
yindex = 0
for elem in visitor.connectionstmts:
    parts = elem.getConnections()
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

#print node string to result
counter=-1
for elem in visitor.memory:
    counter+=1
    #se l'elemento in memoria è la dichiarazione di un blocco
    if type(elem) is str:
        result+=f'#N canvas 697 62 450 300 {elem} 0;\r\n'
        currblock=elem
        continue
    #se l'elemento in memoria è un nodo la cui posizione non è ancora settata
    if elem.getPos() == None:
        elem.setPos(random.randint(20, 500), random.randint(20, 500))
    line = elem.getNodeString()
    for char in line:
        if char not in ',"[]\'':
            result+= char
    result+= ';\r\n'
    #controlla che se ci sia da mettere la fine del blocco
    for num in blockends:
        if num == counter:
            result+=(f'#X restore 69 69 pd {currblock};\r\n')


#print first type of connection string to result
result+=visitor.connections

#print second type of connection string to result
for elem in visitor.connectionstmts:
    result+= elem.getConnectionString()
    


output = open('output.pd', 'w')
output.write(result)
output.close()








