import sys
from antlr4 import*
from antlr4.CommonTokenStream import CommonTokenStream
from antlr4.InputStream import InputStream
from SimpleLexer import SimpleLexer
from SimpleParser import SimpleParser
from SimpleListener import SimpleListener
from antlr4.tree.Tree import ParseTreeWalker

class PrintListener(SimpleListener):
    def exitEveryRule(self, ctx):
        print(ctx.start, ctx.stop, SimpleParser.ruleNames[ctx.getRuleIndex()])

lexer = SimpleLexer(FileStream('input.txt'))
stream = CommonTokenStream(lexer)
parser = SimpleParser(stream)
tree = parser.prog()

print(tree.toStringTree(recog = parser))

listener = PrintListener()
ParseTreeWalker.DEFAULT.walk(listener, tree)

