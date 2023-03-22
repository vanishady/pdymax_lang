import sys
from antlr4 import*
from antlr4.CommonTokenStream import CommonTokenStream
from antlr4.InputStream import InputStream
from PdeasyLexer import PdeasyLexer
from PdeasyParser import PdeasyParser
from PdeasyListener import PdeasyListener
from PdeasyVisitor import PdeasyVisitor
from antlr4.tree.Tree import ParseTreeWalker

DISPATCH_TABLE = {
  'mulDiv': visitMulDivAddSub,
  'addSub': visitMulDivAddSub,
  'parens': visitParens,
  'int': visitInt
}

def dt_ast(tree):
  rule_name = tree.attr.name
  if rule_name in DISPATCH_TABLE:
    return DISPATCH_TABLE[rule_name](tree)
  else:
    return Tree({'type': '<CATCHALL>'}, [dt_ast(child) for child in tree.children])

def visitMulDivAddSub(tree):
  left, op, right = tree.children
  return Tree(
    {'type': 'op', 'kind': op.attr.name}, 
    [dt_ast(left), dt_ast(right)]
  )

def visitParens(tree):
  _, expr, _ = tree.children
  return dt_ast(expr)

def visitInt(tree):
  return Tree({'type': 'const', 'value': int(tree.children[0].attr.value)})


### ANTLR ###
lexer = PdeasyLexer(FileStream('input_eazy.txt'))
stream = CommonTokenStream(lexer)
parser = PdeasyParser(stream)
tree = parser.prog()

#listener = PdeasyListener()
#walker = ParseTreeWalker()
#walker.walk(listener, tree)

v = PdeasyVisitor()
v.visit(tree)
