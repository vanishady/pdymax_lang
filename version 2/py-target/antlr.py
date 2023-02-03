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

    def enterImportstmt(self, ctx):
        anotherlexer = PdawLexer(FileStream(''))


lexer = PdawLexer(FileStream('input2.txt'))
stream = CommonTokenStream(lexer)
parser = PdawParser(stream)
tree = parser.prog()

#print(tree.toStringTree(recog = parser))

#listener = PrintListener()
#ParseTreeWalker.DEFAULT.walk(listener, tree)

v = Visitor.CustomVisitor()
v.visit(tree)

for n in v.memory:
    #if type(n)==Visitor.Node:
    print(n.spec())
