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


"""     

    # Visit a parse tree produced by PdlangParser#forstmt.
    def visitForstmt(self, ctx:PdlangParser.ForstmtContext):
        if '.' in ctx.NUMBER().getText():
            raise Exception('integer only in for loops please')
        for i in range(int(ctx.NUMBER().getText())):
            if self.breakthis==True:
                self.breakthis=False
                break
            elif self.continuethis==True:
                self.continuethis=False
                continue
            elif self.passthis==True:
                self.passthis=False
                pass
            else:
                self.visitSuite(ctx.suite())
        #return self.visitChildren(ctx)
"""
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

#for n in v.memory:
    #if type(n)==Visitor.Node:
#    print(n.spec())

#outfile = v.patch
#output = open('outputs/'+outfile+'.pd', 'w')
#output.write(result)
#output.close()
#print(f'generated file {outfile}.pd')
