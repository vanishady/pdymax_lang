import sys
from antlr4 import*
from antlr4.CommonTokenStream import CommonTokenStream
from antlr4.InputStream import InputStream
from PdawLexer import PdawLexer
from PdawParser import PdawParser
from PdawListener import PdawListener
import Visitor
from antlr4.tree.Tree import ParseTreeWalker

class PrintListener(PdawListener):
    
    def exitEveryRule(self, ctx):
        print(ctx.start, ctx.stop, PdawParser.ruleNames[ctx.getRuleIndex()])


lexer = PdawLexer(FileStream('input3.txt'))
stream = CommonTokenStream(lexer)
parser = PdawParser(stream)
tree = parser.prog()

#print(tree.toStringTree(recog = parser))

v = Visitor.CustomVisitor()
#listener = PrintListener()
#ParseTreeWalker.DEFAULT.walk(listener, tree)

#for f in v.functions:
#    print(f)

v.visit(tree)

#attribuisci nuove posizioni ai nodi
scopes = {}
for n in v.memory:
    if type(n) in [Visitor.Node, Visitor.Connection]:
        if n.scope not in scopes:
            scopes[n.scope] = [n]
        else:
            scopes[n.scope].append(n)


###printer###
res = '#N canvas 0 0 400 400 12;\r\n'


for node in scopes['main']:
    if type(node)==Visitor.Node:
        res+=(node.printer())

    
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
        res+=(f'#X restore 120 120 pd {scope};\r\n')

for conn in scopes['main']:
    if type(conn)==Visitor.Connection:
        res+=(conn.printer())


"""
for n in v.memory:
    if type(n) in [Visitor.Node, Visitor.Connection]:
        print(n.printer())
"""


outfile = v.patch
output = open('outputs/'+outfile+'.pd', 'w')
output.write(res)
output.close()
print(f'generated file {outfile}.pd')
