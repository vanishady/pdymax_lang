import sys
from antlr4 import*
from antlr4.CommonTokenStream import CommonTokenStream
from antlr4.InputStream import InputStream
from PdawLexer import PdawLexer
from PdawParser import PdawParser
from PdawListener import PdawListener
from antlr4.tree.Tree import ParseTreeWalker

class PrintListener(PdawListener):
    def exitEveryRule(self, ctx):
        print(ctx.start, ctx.stop, PdawParser.ruleNames[ctx.getRuleIndex()])

lexer = PdawLexer(FileStream('input1.txt'))
stream = CommonTokenStream(lexer)
parser = PdawParser(stream)
tree = parser.prog()

print(tree.toStringTree(recog = parser))

listener = PrintListener()
ParseTreeWalker.DEFAULT.walk(listener, tree)

