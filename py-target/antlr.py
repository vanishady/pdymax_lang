import sys
from antlr4 import*
from antlr4.CommonTokenStream import CommonTokenStream
from antlr4.InputStream import InputStream
from SimpleLexer import SimpleLexer
from SimpleParser import SimpleParser
from SimpleListener import SimpleListener
from antlr4.tree.Tree import ParseTreeWalker
from antlr4.error.ErrorListener import ErrorListener
from SimpleVisitor import SimpleVisitor

class PrintListener(SimpleListener):
    def exitEveryRule(self, ctx):
        print(ctx.start, ctx.stop, SimpleParser.ruleNames[ctx.getRuleIndex()])

class PrintLexerErrorListener(ErrorListener):
    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        print(f'Lexer error: {line=}, {column=}, {msg=}, exception={e}')

class PrintParserErrorListener(ErrorListener):
    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        print(f'Parser error: {line=}, {column=}, {msg=}, exception={e}, rules={recognizer.getRuleInvocationStack()}') 


### LEXER AND PARSER WORK###

lexer = SimpleLexer(FileStream('input2.txt'))
lexer.removeErrorListeners()
lexer.addErrorListener(PrintLexerErrorListener())

stream = CommonTokenStream(lexer)

parser = SimpleParser(stream)
parser.removeErrorListeners()
parser.addErrorListener(PrintParserErrorListener())

tree = None
tree = parser.prog()
#print(tree.toStringTree(recog = parser))

visitor = SimpleVisitor()
visitor.visit(tree)

listener = PrintListener()
ParseTreeWalker.DEFAULT.walk(listener, tree)


