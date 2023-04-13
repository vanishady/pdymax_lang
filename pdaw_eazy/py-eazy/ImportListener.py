import sys
from antlr4 import*
from antlr4.CommonTokenStream import CommonTokenStream
from antlr4.InputStream import InputStream
from PdeasyLexer import PdeasyLexer
from PdeasyParser import PdeasyParser
from PdeasyVisitor import PdeasyVisitor
from antlr4.tree.Tree import ParseTreeWalker
from PdeasyListener import PdeasyListener

class ImportListener(PdeasyListener):

    def __init__(self):
        self.callables = []

    def enterImportstmt(self, ctx):
        file = ctx.NAME().getText()
        lexer1 = PdeasyLexer(FileStream(file+'.txt'))
        stream1 = CommonTokenStream(lexer1)
        parser1 = PdeasyParser(stream1)
        tree1 = parser1.prog()
        v1 = PdeasyVisitor()
        v1.visit(tree1)
        for e in v1.callables:
            self.callables.append(e)
