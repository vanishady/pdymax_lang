# Generated from Pdeasy.g4 by ANTLR 4.11.1
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,50,324,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,
        2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,19,2,20,
        7,20,2,21,7,21,2,22,7,22,2,23,7,23,2,24,7,24,2,25,7,25,2,26,7,26,
        2,27,7,27,2,28,7,28,1,0,1,0,5,0,61,8,0,10,0,12,0,64,9,0,1,0,5,0,
        67,8,0,10,0,12,0,70,9,0,1,0,5,0,73,8,0,10,0,12,0,76,9,0,1,0,1,0,
        1,1,1,1,1,1,1,2,1,2,1,2,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,4,1,4,1,4,
        3,4,96,8,4,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,3,5,106,8,5,1,6,1,6,1,
        6,1,6,1,6,1,6,1,6,1,7,1,7,1,7,1,7,1,7,3,7,120,8,7,1,8,1,8,1,8,1,
        8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,3,8,134,8,8,1,9,1,9,1,9,1,9,1,
        9,1,9,1,9,1,9,3,9,144,8,9,1,10,1,10,1,10,1,10,5,10,150,8,10,10,10,
        12,10,153,9,10,5,10,155,8,10,10,10,12,10,158,9,10,1,10,1,10,1,11,
        1,11,1,11,3,11,165,8,11,1,12,1,12,1,12,1,12,1,12,1,12,1,12,1,12,
        1,12,1,12,3,12,177,8,12,1,13,1,13,1,13,4,13,182,8,13,11,13,12,13,
        183,1,14,1,14,1,14,1,14,5,14,190,8,14,10,14,12,14,193,9,14,1,14,
        1,14,1,14,3,14,198,8,14,1,15,1,15,3,15,202,8,15,1,15,1,15,3,15,206,
        8,15,1,16,1,16,3,16,210,8,16,1,16,1,16,1,17,1,17,3,17,216,8,17,1,
        17,1,17,1,18,1,18,1,18,5,18,223,8,18,10,18,12,18,226,9,18,1,19,1,
        19,1,19,5,19,231,8,19,10,19,12,19,234,9,19,1,20,1,20,1,20,3,20,239,
        8,20,1,21,1,21,1,21,1,21,1,22,4,22,246,8,22,11,22,12,22,247,1,23,
        1,23,1,23,1,23,1,23,3,23,255,8,23,1,23,1,23,1,24,1,24,1,24,1,24,
        1,24,1,24,1,24,1,24,1,24,5,24,268,8,24,10,24,12,24,271,9,24,1,24,
        1,24,1,24,3,24,276,8,24,1,24,1,24,1,25,1,25,1,25,1,25,1,25,1,25,
        1,25,1,25,1,25,1,25,3,25,290,8,25,1,25,1,25,1,25,1,25,1,25,1,25,
        1,25,1,25,1,25,5,25,301,8,25,10,25,12,25,304,9,25,1,26,1,26,1,26,
        1,27,1,27,1,27,1,27,1,27,1,27,1,27,3,27,316,8,27,1,27,1,27,1,27,
        1,27,1,28,1,28,1,28,0,1,50,29,0,2,4,6,8,10,12,14,16,18,20,22,24,
        26,28,30,32,34,36,38,40,42,44,46,48,50,52,54,56,0,4,1,0,14,22,2,
        0,14,15,22,22,1,0,18,19,2,0,23,27,34,34,344,0,58,1,0,0,0,2,79,1,
        0,0,0,4,82,1,0,0,0,6,85,1,0,0,0,8,92,1,0,0,0,10,105,1,0,0,0,12,107,
        1,0,0,0,14,114,1,0,0,0,16,133,1,0,0,0,18,143,1,0,0,0,20,145,1,0,
        0,0,22,164,1,0,0,0,24,176,1,0,0,0,26,178,1,0,0,0,28,197,1,0,0,0,
        30,201,1,0,0,0,32,207,1,0,0,0,34,213,1,0,0,0,36,219,1,0,0,0,38,227,
        1,0,0,0,40,238,1,0,0,0,42,240,1,0,0,0,44,245,1,0,0,0,46,249,1,0,
        0,0,48,258,1,0,0,0,50,289,1,0,0,0,52,305,1,0,0,0,54,308,1,0,0,0,
        56,321,1,0,0,0,58,62,3,2,1,0,59,61,3,4,2,0,60,59,1,0,0,0,61,64,1,
        0,0,0,62,60,1,0,0,0,62,63,1,0,0,0,63,68,1,0,0,0,64,62,1,0,0,0,65,
        67,3,6,3,0,66,65,1,0,0,0,67,70,1,0,0,0,68,66,1,0,0,0,68,69,1,0,0,
        0,69,74,1,0,0,0,70,68,1,0,0,0,71,73,3,10,5,0,72,71,1,0,0,0,73,76,
        1,0,0,0,74,72,1,0,0,0,74,75,1,0,0,0,75,77,1,0,0,0,76,74,1,0,0,0,
        77,78,5,1,0,0,78,1,1,0,0,0,79,80,5,29,0,0,80,81,5,43,0,0,81,3,1,
        0,0,0,82,83,5,30,0,0,83,84,5,43,0,0,84,5,1,0,0,0,85,86,5,31,0,0,
        86,87,5,43,0,0,87,88,3,34,17,0,88,89,5,2,0,0,89,90,3,44,22,0,90,
        91,5,3,0,0,91,7,1,0,0,0,92,95,5,33,0,0,93,96,3,56,28,0,94,96,3,50,
        25,0,95,93,1,0,0,0,95,94,1,0,0,0,95,96,1,0,0,0,96,9,1,0,0,0,97,106,
        3,12,6,0,98,106,3,26,13,0,99,106,3,14,7,0,100,106,3,16,8,0,101,106,
        3,18,9,0,102,106,3,48,24,0,103,106,3,54,27,0,104,106,3,8,4,0,105,
        97,1,0,0,0,105,98,1,0,0,0,105,99,1,0,0,0,105,100,1,0,0,0,105,101,
        1,0,0,0,105,102,1,0,0,0,105,103,1,0,0,0,105,104,1,0,0,0,106,11,1,
        0,0,0,107,108,5,32,0,0,108,109,5,43,0,0,109,110,3,34,17,0,110,111,
        5,2,0,0,111,112,3,44,22,0,112,113,5,3,0,0,113,13,1,0,0,0,114,115,
        5,4,0,0,115,116,5,43,0,0,116,119,3,32,16,0,117,118,5,40,0,0,118,
        120,3,56,28,0,119,117,1,0,0,0,119,120,1,0,0,0,120,15,1,0,0,0,121,
        122,3,56,28,0,122,123,5,5,0,0,123,124,5,43,0,0,124,125,3,32,16,0,
        125,134,1,0,0,0,126,127,5,43,0,0,127,134,3,32,16,0,128,134,3,46,
        23,0,129,130,3,56,28,0,130,131,5,5,0,0,131,132,3,46,23,0,132,134,
        1,0,0,0,133,121,1,0,0,0,133,126,1,0,0,0,133,128,1,0,0,0,133,129,
        1,0,0,0,134,17,1,0,0,0,135,136,3,56,28,0,136,137,5,6,0,0,137,138,
        3,50,25,0,138,144,1,0,0,0,139,140,3,56,28,0,140,141,5,6,0,0,141,
        142,3,20,10,0,142,144,1,0,0,0,143,135,1,0,0,0,143,139,1,0,0,0,144,
        19,1,0,0,0,145,156,5,7,0,0,146,151,3,22,11,0,147,148,5,8,0,0,148,
        150,3,22,11,0,149,147,1,0,0,0,150,153,1,0,0,0,151,149,1,0,0,0,151,
        152,1,0,0,0,152,155,1,0,0,0,153,151,1,0,0,0,154,146,1,0,0,0,155,
        158,1,0,0,0,156,154,1,0,0,0,156,157,1,0,0,0,157,159,1,0,0,0,158,
        156,1,0,0,0,159,160,5,9,0,0,160,21,1,0,0,0,161,165,5,45,0,0,162,
        165,5,46,0,0,163,165,3,56,28,0,164,161,1,0,0,0,164,162,1,0,0,0,164,
        163,1,0,0,0,165,23,1,0,0,0,166,167,3,56,28,0,167,168,5,7,0,0,168,
        169,3,56,28,0,169,170,5,9,0,0,170,177,1,0,0,0,171,172,3,56,28,0,
        172,173,5,7,0,0,173,174,5,46,0,0,174,175,5,9,0,0,175,177,1,0,0,0,
        176,166,1,0,0,0,176,171,1,0,0,0,177,25,1,0,0,0,178,181,3,28,14,0,
        179,180,5,34,0,0,180,182,3,28,14,0,181,179,1,0,0,0,182,183,1,0,0,
        0,183,181,1,0,0,0,183,184,1,0,0,0,184,27,1,0,0,0,185,186,5,7,0,0,
        186,191,3,30,15,0,187,188,5,8,0,0,188,190,3,30,15,0,189,187,1,0,
        0,0,190,193,1,0,0,0,191,189,1,0,0,0,191,192,1,0,0,0,192,194,1,0,
        0,0,193,191,1,0,0,0,194,195,5,9,0,0,195,198,1,0,0,0,196,198,3,30,
        15,0,197,185,1,0,0,0,197,196,1,0,0,0,198,29,1,0,0,0,199,202,3,56,
        28,0,200,202,3,16,8,0,201,199,1,0,0,0,201,200,1,0,0,0,202,205,1,
        0,0,0,203,204,5,10,0,0,204,206,5,42,0,0,205,203,1,0,0,0,205,206,
        1,0,0,0,206,31,1,0,0,0,207,209,5,11,0,0,208,210,3,36,18,0,209,208,
        1,0,0,0,209,210,1,0,0,0,210,211,1,0,0,0,211,212,5,12,0,0,212,33,
        1,0,0,0,213,215,5,11,0,0,214,216,3,38,19,0,215,214,1,0,0,0,215,216,
        1,0,0,0,216,217,1,0,0,0,217,218,5,12,0,0,218,35,1,0,0,0,219,224,
        3,40,20,0,220,221,5,8,0,0,221,223,3,40,20,0,222,220,1,0,0,0,223,
        226,1,0,0,0,224,222,1,0,0,0,224,225,1,0,0,0,225,37,1,0,0,0,226,224,
        1,0,0,0,227,232,3,42,21,0,228,229,5,8,0,0,229,231,3,42,21,0,230,
        228,1,0,0,0,231,234,1,0,0,0,232,230,1,0,0,0,232,233,1,0,0,0,233,
        39,1,0,0,0,234,232,1,0,0,0,235,239,3,50,25,0,236,239,3,20,10,0,237,
        239,3,52,26,0,238,235,1,0,0,0,238,236,1,0,0,0,238,237,1,0,0,0,239,
        41,1,0,0,0,240,241,3,56,28,0,241,242,5,13,0,0,242,243,5,41,0,0,243,
        43,1,0,0,0,244,246,3,10,5,0,245,244,1,0,0,0,246,247,1,0,0,0,247,
        245,1,0,0,0,247,248,1,0,0,0,248,45,1,0,0,0,249,250,7,0,0,0,250,254,
        5,11,0,0,251,255,5,46,0,0,252,255,3,56,28,0,253,255,3,24,12,0,254,
        251,1,0,0,0,254,252,1,0,0,0,254,253,1,0,0,0,254,255,1,0,0,0,255,
        256,1,0,0,0,256,257,5,12,0,0,257,47,1,0,0,0,258,259,5,36,0,0,259,
        260,3,50,25,0,260,261,5,13,0,0,261,269,3,44,22,0,262,263,5,37,0,
        0,263,264,3,50,25,0,264,265,5,13,0,0,265,266,3,44,22,0,266,268,1,
        0,0,0,267,262,1,0,0,0,268,271,1,0,0,0,269,267,1,0,0,0,269,270,1,
        0,0,0,270,275,1,0,0,0,271,269,1,0,0,0,272,273,5,38,0,0,273,274,5,
        13,0,0,274,276,3,44,22,0,275,272,1,0,0,0,275,276,1,0,0,0,276,277,
        1,0,0,0,277,278,5,35,0,0,278,49,1,0,0,0,279,280,6,25,-1,0,280,290,
        5,46,0,0,281,290,5,45,0,0,282,290,3,56,28,0,283,290,3,14,7,0,284,
        290,3,24,12,0,285,286,5,11,0,0,286,287,3,50,25,0,287,288,5,12,0,
        0,288,290,1,0,0,0,289,279,1,0,0,0,289,281,1,0,0,0,289,282,1,0,0,
        0,289,283,1,0,0,0,289,284,1,0,0,0,289,285,1,0,0,0,290,302,1,0,0,
        0,291,292,10,9,0,0,292,293,7,1,0,0,293,301,3,50,25,10,294,295,10,
        8,0,0,295,296,7,2,0,0,296,301,3,50,25,9,297,298,10,7,0,0,298,299,
        7,3,0,0,299,301,3,50,25,8,300,291,1,0,0,0,300,294,1,0,0,0,300,297,
        1,0,0,0,301,304,1,0,0,0,302,300,1,0,0,0,302,303,1,0,0,0,303,51,1,
        0,0,0,304,302,1,0,0,0,305,306,5,14,0,0,306,307,3,56,28,0,307,53,
        1,0,0,0,308,309,5,39,0,0,309,310,3,56,28,0,310,315,5,28,0,0,311,
        316,5,46,0,0,312,316,3,14,7,0,313,316,3,56,28,0,314,316,3,24,12,
        0,315,311,1,0,0,0,315,312,1,0,0,0,315,313,1,0,0,0,315,314,1,0,0,
        0,316,317,1,0,0,0,317,318,5,13,0,0,318,319,3,44,22,0,319,320,5,35,
        0,0,320,55,1,0,0,0,321,322,5,44,0,0,322,57,1,0,0,0,30,62,68,74,95,
        105,119,133,143,151,156,164,176,183,191,197,201,205,209,215,224,
        232,238,247,254,269,275,289,300,302,315
    ]

class PdeasyParser ( Parser ):

    grammarFileName = "Pdeasy.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "';'", "'{'", "'}'", "'@'", "':='", "'='", 
                     "'['", "','", "']'", "'.'", "'('", "')'", "':'", "'*'", 
                     "'/'", "'*~'", "'/~'", "'+'", "'-'", "'+~'", "'-~'", 
                     "'%'", "'=='", "'!='", "'>='", "'<'", "'<='", "'in range'", 
                     "'patch'", "'import'", "'func'", "'block'", "'return'", 
                     "'>'", "'end'", "'if'", "'elif'", "'else'", "'for'", 
                     "'as'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "PATCH", "IMPORT", "FUNC", "BLOCK", "RETURN", 
                      "CONNECT", "END", "IF", "ELIF", "ELSE", "FOR", "AS", 
                      "VARTYPE", "IOLET", "NAME", "VARNAME", "SYMBOL", "NUMBER", 
                      "INTEGER", "FLOAT", "WS", "COMMENT" ]

    RULE_prog = 0
    RULE_patchstmt = 1
    RULE_importstmt = 2
    RULE_funcdefstmt = 3
    RULE_returnstmt = 4
    RULE_stmt = 5
    RULE_blockstmt = 6
    RULE_callstmt = 7
    RULE_nodedecl = 8
    RULE_simpledecl = 9
    RULE_list = 10
    RULE_listelem = 11
    RULE_list_access = 12
    RULE_connectionstmt = 13
    RULE_connectionelem = 14
    RULE_singlenode = 15
    RULE_parameters = 16
    RULE_typedparams = 17
    RULE_argslist = 18
    RULE_typedargslist = 19
    RULE_arg = 20
    RULE_typedarg = 21
    RULE_suite = 22
    RULE_operation = 23
    RULE_ifstmt = 24
    RULE_expr = 25
    RULE_noderef = 26
    RULE_forstmt = 27
    RULE_varname = 28

    ruleNames =  [ "prog", "patchstmt", "importstmt", "funcdefstmt", "returnstmt", 
                   "stmt", "blockstmt", "callstmt", "nodedecl", "simpledecl", 
                   "list", "listelem", "list_access", "connectionstmt", 
                   "connectionelem", "singlenode", "parameters", "typedparams", 
                   "argslist", "typedargslist", "arg", "typedarg", "suite", 
                   "operation", "ifstmt", "expr", "noderef", "forstmt", 
                   "varname" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    T__8=9
    T__9=10
    T__10=11
    T__11=12
    T__12=13
    T__13=14
    T__14=15
    T__15=16
    T__16=17
    T__17=18
    T__18=19
    T__19=20
    T__20=21
    T__21=22
    T__22=23
    T__23=24
    T__24=25
    T__25=26
    T__26=27
    T__27=28
    PATCH=29
    IMPORT=30
    FUNC=31
    BLOCK=32
    RETURN=33
    CONNECT=34
    END=35
    IF=36
    ELIF=37
    ELSE=38
    FOR=39
    AS=40
    VARTYPE=41
    IOLET=42
    NAME=43
    VARNAME=44
    SYMBOL=45
    NUMBER=46
    INTEGER=47
    FLOAT=48
    WS=49
    COMMENT=50

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.11.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def patchstmt(self):
            return self.getTypedRuleContext(PdeasyParser.PatchstmtContext,0)


        def importstmt(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PdeasyParser.ImportstmtContext)
            else:
                return self.getTypedRuleContext(PdeasyParser.ImportstmtContext,i)


        def funcdefstmt(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PdeasyParser.FuncdefstmtContext)
            else:
                return self.getTypedRuleContext(PdeasyParser.FuncdefstmtContext,i)


        def stmt(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PdeasyParser.StmtContext)
            else:
                return self.getTypedRuleContext(PdeasyParser.StmtContext,i)


        def getRuleIndex(self):
            return PdeasyParser.RULE_prog

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterProg" ):
                listener.enterProg(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitProg" ):
                listener.exitProg(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitProg" ):
                return visitor.visitProg(self)
            else:
                return visitor.visitChildren(self)




    def prog(self):

        localctx = PdeasyParser.ProgContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_prog)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 58
            self.patchstmt()
            self.state = 62
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==30:
                self.state = 59
                self.importstmt()
                self.state = 64
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 68
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==31:
                self.state = 65
                self.funcdefstmt()
                self.state = 70
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 74
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while ((_la) & ~0x3f) == 0 and ((1 << _la) & 27019647631504) != 0:
                self.state = 71
                self.stmt()
                self.state = 76
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 77
            self.match(PdeasyParser.T__0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class PatchstmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def PATCH(self):
            return self.getToken(PdeasyParser.PATCH, 0)

        def NAME(self):
            return self.getToken(PdeasyParser.NAME, 0)

        def getRuleIndex(self):
            return PdeasyParser.RULE_patchstmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPatchstmt" ):
                listener.enterPatchstmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPatchstmt" ):
                listener.exitPatchstmt(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPatchstmt" ):
                return visitor.visitPatchstmt(self)
            else:
                return visitor.visitChildren(self)




    def patchstmt(self):

        localctx = PdeasyParser.PatchstmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_patchstmt)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 79
            self.match(PdeasyParser.PATCH)
            self.state = 80
            self.match(PdeasyParser.NAME)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ImportstmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def IMPORT(self):
            return self.getToken(PdeasyParser.IMPORT, 0)

        def NAME(self):
            return self.getToken(PdeasyParser.NAME, 0)

        def getRuleIndex(self):
            return PdeasyParser.RULE_importstmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterImportstmt" ):
                listener.enterImportstmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitImportstmt" ):
                listener.exitImportstmt(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitImportstmt" ):
                return visitor.visitImportstmt(self)
            else:
                return visitor.visitChildren(self)




    def importstmt(self):

        localctx = PdeasyParser.ImportstmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_importstmt)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 82
            self.match(PdeasyParser.IMPORT)
            self.state = 83
            self.match(PdeasyParser.NAME)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FuncdefstmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def FUNC(self):
            return self.getToken(PdeasyParser.FUNC, 0)

        def NAME(self):
            return self.getToken(PdeasyParser.NAME, 0)

        def typedparams(self):
            return self.getTypedRuleContext(PdeasyParser.TypedparamsContext,0)


        def suite(self):
            return self.getTypedRuleContext(PdeasyParser.SuiteContext,0)


        def getRuleIndex(self):
            return PdeasyParser.RULE_funcdefstmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFuncdefstmt" ):
                listener.enterFuncdefstmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFuncdefstmt" ):
                listener.exitFuncdefstmt(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFuncdefstmt" ):
                return visitor.visitFuncdefstmt(self)
            else:
                return visitor.visitChildren(self)




    def funcdefstmt(self):

        localctx = PdeasyParser.FuncdefstmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_funcdefstmt)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 85
            self.match(PdeasyParser.FUNC)
            self.state = 86
            self.match(PdeasyParser.NAME)
            self.state = 87
            self.typedparams()
            self.state = 88
            self.match(PdeasyParser.T__1)
            self.state = 89
            self.suite()
            self.state = 90
            self.match(PdeasyParser.T__2)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ReturnstmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def RETURN(self):
            return self.getToken(PdeasyParser.RETURN, 0)

        def varname(self):
            return self.getTypedRuleContext(PdeasyParser.VarnameContext,0)


        def expr(self):
            return self.getTypedRuleContext(PdeasyParser.ExprContext,0)


        def getRuleIndex(self):
            return PdeasyParser.RULE_returnstmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterReturnstmt" ):
                listener.enterReturnstmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitReturnstmt" ):
                listener.exitReturnstmt(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitReturnstmt" ):
                return visitor.visitReturnstmt(self)
            else:
                return visitor.visitChildren(self)




    def returnstmt(self):

        localctx = PdeasyParser.ReturnstmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_returnstmt)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 92
            self.match(PdeasyParser.RETURN)
            self.state = 95
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,3,self._ctx)
            if la_ == 1:
                self.state = 93
                self.varname()

            elif la_ == 2:
                self.state = 94
                self.expr(0)


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def blockstmt(self):
            return self.getTypedRuleContext(PdeasyParser.BlockstmtContext,0)


        def connectionstmt(self):
            return self.getTypedRuleContext(PdeasyParser.ConnectionstmtContext,0)


        def callstmt(self):
            return self.getTypedRuleContext(PdeasyParser.CallstmtContext,0)


        def nodedecl(self):
            return self.getTypedRuleContext(PdeasyParser.NodedeclContext,0)


        def simpledecl(self):
            return self.getTypedRuleContext(PdeasyParser.SimpledeclContext,0)


        def ifstmt(self):
            return self.getTypedRuleContext(PdeasyParser.IfstmtContext,0)


        def forstmt(self):
            return self.getTypedRuleContext(PdeasyParser.ForstmtContext,0)


        def returnstmt(self):
            return self.getTypedRuleContext(PdeasyParser.ReturnstmtContext,0)


        def getRuleIndex(self):
            return PdeasyParser.RULE_stmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStmt" ):
                listener.enterStmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStmt" ):
                listener.exitStmt(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStmt" ):
                return visitor.visitStmt(self)
            else:
                return visitor.visitChildren(self)




    def stmt(self):

        localctx = PdeasyParser.StmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_stmt)
        try:
            self.state = 105
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,4,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 97
                self.blockstmt()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 98
                self.connectionstmt()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 99
                self.callstmt()
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 100
                self.nodedecl()
                pass

            elif la_ == 5:
                self.enterOuterAlt(localctx, 5)
                self.state = 101
                self.simpledecl()
                pass

            elif la_ == 6:
                self.enterOuterAlt(localctx, 6)
                self.state = 102
                self.ifstmt()
                pass

            elif la_ == 7:
                self.enterOuterAlt(localctx, 7)
                self.state = 103
                self.forstmt()
                pass

            elif la_ == 8:
                self.enterOuterAlt(localctx, 8)
                self.state = 104
                self.returnstmt()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BlockstmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def BLOCK(self):
            return self.getToken(PdeasyParser.BLOCK, 0)

        def NAME(self):
            return self.getToken(PdeasyParser.NAME, 0)

        def typedparams(self):
            return self.getTypedRuleContext(PdeasyParser.TypedparamsContext,0)


        def suite(self):
            return self.getTypedRuleContext(PdeasyParser.SuiteContext,0)


        def getRuleIndex(self):
            return PdeasyParser.RULE_blockstmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBlockstmt" ):
                listener.enterBlockstmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBlockstmt" ):
                listener.exitBlockstmt(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitBlockstmt" ):
                return visitor.visitBlockstmt(self)
            else:
                return visitor.visitChildren(self)




    def blockstmt(self):

        localctx = PdeasyParser.BlockstmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_blockstmt)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 107
            self.match(PdeasyParser.BLOCK)
            self.state = 108
            self.match(PdeasyParser.NAME)
            self.state = 109
            self.typedparams()
            self.state = 110
            self.match(PdeasyParser.T__1)
            self.state = 111
            self.suite()
            self.state = 112
            self.match(PdeasyParser.T__2)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CallstmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NAME(self):
            return self.getToken(PdeasyParser.NAME, 0)

        def parameters(self):
            return self.getTypedRuleContext(PdeasyParser.ParametersContext,0)


        def AS(self):
            return self.getToken(PdeasyParser.AS, 0)

        def varname(self):
            return self.getTypedRuleContext(PdeasyParser.VarnameContext,0)


        def getRuleIndex(self):
            return PdeasyParser.RULE_callstmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCallstmt" ):
                listener.enterCallstmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCallstmt" ):
                listener.exitCallstmt(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCallstmt" ):
                return visitor.visitCallstmt(self)
            else:
                return visitor.visitChildren(self)




    def callstmt(self):

        localctx = PdeasyParser.CallstmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_callstmt)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 114
            self.match(PdeasyParser.T__3)
            self.state = 115
            self.match(PdeasyParser.NAME)
            self.state = 116
            self.parameters()
            self.state = 119
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,5,self._ctx)
            if la_ == 1:
                self.state = 117
                self.match(PdeasyParser.AS)
                self.state = 118
                self.varname()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class NodedeclContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return PdeasyParser.RULE_nodedecl

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class Nodedecl3Context(NodedeclContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a PdeasyParser.NodedeclContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def operation(self):
            return self.getTypedRuleContext(PdeasyParser.OperationContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterNodedecl3" ):
                listener.enterNodedecl3(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitNodedecl3" ):
                listener.exitNodedecl3(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitNodedecl3" ):
                return visitor.visitNodedecl3(self)
            else:
                return visitor.visitChildren(self)


    class Nodedecl2Context(NodedeclContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a PdeasyParser.NodedeclContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def NAME(self):
            return self.getToken(PdeasyParser.NAME, 0)
        def parameters(self):
            return self.getTypedRuleContext(PdeasyParser.ParametersContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterNodedecl2" ):
                listener.enterNodedecl2(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitNodedecl2" ):
                listener.exitNodedecl2(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitNodedecl2" ):
                return visitor.visitNodedecl2(self)
            else:
                return visitor.visitChildren(self)


    class Nodedecl1Context(NodedeclContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a PdeasyParser.NodedeclContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def varname(self):
            return self.getTypedRuleContext(PdeasyParser.VarnameContext,0)

        def NAME(self):
            return self.getToken(PdeasyParser.NAME, 0)
        def parameters(self):
            return self.getTypedRuleContext(PdeasyParser.ParametersContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterNodedecl1" ):
                listener.enterNodedecl1(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitNodedecl1" ):
                listener.exitNodedecl1(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitNodedecl1" ):
                return visitor.visitNodedecl1(self)
            else:
                return visitor.visitChildren(self)


    class Nodedecl4Context(NodedeclContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a PdeasyParser.NodedeclContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def varname(self):
            return self.getTypedRuleContext(PdeasyParser.VarnameContext,0)

        def operation(self):
            return self.getTypedRuleContext(PdeasyParser.OperationContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterNodedecl4" ):
                listener.enterNodedecl4(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitNodedecl4" ):
                listener.exitNodedecl4(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitNodedecl4" ):
                return visitor.visitNodedecl4(self)
            else:
                return visitor.visitChildren(self)



    def nodedecl(self):

        localctx = PdeasyParser.NodedeclContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_nodedecl)
        try:
            self.state = 133
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,6,self._ctx)
            if la_ == 1:
                localctx = PdeasyParser.Nodedecl1Context(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 121
                self.varname()
                self.state = 122
                self.match(PdeasyParser.T__4)
                self.state = 123
                self.match(PdeasyParser.NAME)
                self.state = 124
                self.parameters()
                pass

            elif la_ == 2:
                localctx = PdeasyParser.Nodedecl2Context(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 126
                self.match(PdeasyParser.NAME)
                self.state = 127
                self.parameters()
                pass

            elif la_ == 3:
                localctx = PdeasyParser.Nodedecl3Context(self, localctx)
                self.enterOuterAlt(localctx, 3)
                self.state = 128
                self.operation()
                pass

            elif la_ == 4:
                localctx = PdeasyParser.Nodedecl4Context(self, localctx)
                self.enterOuterAlt(localctx, 4)
                self.state = 129
                self.varname()
                self.state = 130
                self.match(PdeasyParser.T__4)
                self.state = 131
                self.operation()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SimpledeclContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def varname(self):
            return self.getTypedRuleContext(PdeasyParser.VarnameContext,0)


        def expr(self):
            return self.getTypedRuleContext(PdeasyParser.ExprContext,0)


        def list_(self):
            return self.getTypedRuleContext(PdeasyParser.ListContext,0)


        def getRuleIndex(self):
            return PdeasyParser.RULE_simpledecl

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSimpledecl" ):
                listener.enterSimpledecl(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSimpledecl" ):
                listener.exitSimpledecl(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSimpledecl" ):
                return visitor.visitSimpledecl(self)
            else:
                return visitor.visitChildren(self)




    def simpledecl(self):

        localctx = PdeasyParser.SimpledeclContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_simpledecl)
        try:
            self.state = 143
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,7,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 135
                self.varname()
                self.state = 136
                self.match(PdeasyParser.T__5)
                self.state = 137
                self.expr(0)
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 139
                self.varname()
                self.state = 140
                self.match(PdeasyParser.T__5)
                self.state = 141
                self.list_()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ListContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def listelem(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PdeasyParser.ListelemContext)
            else:
                return self.getTypedRuleContext(PdeasyParser.ListelemContext,i)


        def getRuleIndex(self):
            return PdeasyParser.RULE_list

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterList" ):
                listener.enterList(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitList" ):
                listener.exitList(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitList" ):
                return visitor.visitList(self)
            else:
                return visitor.visitChildren(self)




    def list_(self):

        localctx = PdeasyParser.ListContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_list)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 145
            self.match(PdeasyParser.T__6)
            self.state = 156
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while ((_la) & ~0x3f) == 0 and ((1 << _la) & 123145302310912) != 0:
                self.state = 146
                self.listelem()
                self.state = 151
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==8:
                    self.state = 147
                    self.match(PdeasyParser.T__7)
                    self.state = 148
                    self.listelem()
                    self.state = 153
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 158
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 159
            self.match(PdeasyParser.T__8)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ListelemContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def SYMBOL(self):
            return self.getToken(PdeasyParser.SYMBOL, 0)

        def NUMBER(self):
            return self.getToken(PdeasyParser.NUMBER, 0)

        def varname(self):
            return self.getTypedRuleContext(PdeasyParser.VarnameContext,0)


        def getRuleIndex(self):
            return PdeasyParser.RULE_listelem

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterListelem" ):
                listener.enterListelem(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitListelem" ):
                listener.exitListelem(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitListelem" ):
                return visitor.visitListelem(self)
            else:
                return visitor.visitChildren(self)




    def listelem(self):

        localctx = PdeasyParser.ListelemContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_listelem)
        try:
            self.state = 164
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [45]:
                self.enterOuterAlt(localctx, 1)
                self.state = 161
                self.match(PdeasyParser.SYMBOL)
                pass
            elif token in [46]:
                self.enterOuterAlt(localctx, 2)
                self.state = 162
                self.match(PdeasyParser.NUMBER)
                pass
            elif token in [44]:
                self.enterOuterAlt(localctx, 3)
                self.state = 163
                self.varname()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class List_accessContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def varname(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PdeasyParser.VarnameContext)
            else:
                return self.getTypedRuleContext(PdeasyParser.VarnameContext,i)


        def NUMBER(self):
            return self.getToken(PdeasyParser.NUMBER, 0)

        def getRuleIndex(self):
            return PdeasyParser.RULE_list_access

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterList_access" ):
                listener.enterList_access(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitList_access" ):
                listener.exitList_access(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitList_access" ):
                return visitor.visitList_access(self)
            else:
                return visitor.visitChildren(self)




    def list_access(self):

        localctx = PdeasyParser.List_accessContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_list_access)
        try:
            self.state = 176
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,11,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 166
                self.varname()
                self.state = 167
                self.match(PdeasyParser.T__6)
                self.state = 168
                self.varname()
                self.state = 169
                self.match(PdeasyParser.T__8)
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 171
                self.varname()
                self.state = 172
                self.match(PdeasyParser.T__6)
                self.state = 173
                self.match(PdeasyParser.NUMBER)
                self.state = 174
                self.match(PdeasyParser.T__8)
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ConnectionstmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def connectionelem(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PdeasyParser.ConnectionelemContext)
            else:
                return self.getTypedRuleContext(PdeasyParser.ConnectionelemContext,i)


        def CONNECT(self, i:int=None):
            if i is None:
                return self.getTokens(PdeasyParser.CONNECT)
            else:
                return self.getToken(PdeasyParser.CONNECT, i)

        def getRuleIndex(self):
            return PdeasyParser.RULE_connectionstmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterConnectionstmt" ):
                listener.enterConnectionstmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitConnectionstmt" ):
                listener.exitConnectionstmt(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitConnectionstmt" ):
                return visitor.visitConnectionstmt(self)
            else:
                return visitor.visitChildren(self)




    def connectionstmt(self):

        localctx = PdeasyParser.ConnectionstmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_connectionstmt)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 178
            self.connectionelem()
            self.state = 181 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 179
                self.match(PdeasyParser.CONNECT)
                self.state = 180
                self.connectionelem()
                self.state = 183 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==34):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ConnectionelemContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return PdeasyParser.RULE_connectionelem

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class MultipleconnContext(ConnectionelemContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a PdeasyParser.ConnectionelemContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def singlenode(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PdeasyParser.SinglenodeContext)
            else:
                return self.getTypedRuleContext(PdeasyParser.SinglenodeContext,i)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMultipleconn" ):
                listener.enterMultipleconn(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMultipleconn" ):
                listener.exitMultipleconn(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMultipleconn" ):
                return visitor.visitMultipleconn(self)
            else:
                return visitor.visitChildren(self)


    class SingleconnContext(ConnectionelemContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a PdeasyParser.ConnectionelemContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def singlenode(self):
            return self.getTypedRuleContext(PdeasyParser.SinglenodeContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSingleconn" ):
                listener.enterSingleconn(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSingleconn" ):
                listener.exitSingleconn(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSingleconn" ):
                return visitor.visitSingleconn(self)
            else:
                return visitor.visitChildren(self)



    def connectionelem(self):

        localctx = PdeasyParser.ConnectionelemContext(self, self._ctx, self.state)
        self.enterRule(localctx, 28, self.RULE_connectionelem)
        self._la = 0 # Token type
        try:
            self.state = 197
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [7]:
                localctx = PdeasyParser.MultipleconnContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 185
                self.match(PdeasyParser.T__6)
                self.state = 186
                self.singlenode()
                self.state = 191
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==8:
                    self.state = 187
                    self.match(PdeasyParser.T__7)
                    self.state = 188
                    self.singlenode()
                    self.state = 193
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 194
                self.match(PdeasyParser.T__8)
                pass
            elif token in [14, 15, 16, 17, 18, 19, 20, 21, 22, 43, 44]:
                localctx = PdeasyParser.SingleconnContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 196
                self.singlenode()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SinglenodeContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def varname(self):
            return self.getTypedRuleContext(PdeasyParser.VarnameContext,0)


        def nodedecl(self):
            return self.getTypedRuleContext(PdeasyParser.NodedeclContext,0)


        def IOLET(self):
            return self.getToken(PdeasyParser.IOLET, 0)

        def getRuleIndex(self):
            return PdeasyParser.RULE_singlenode

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSinglenode" ):
                listener.enterSinglenode(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSinglenode" ):
                listener.exitSinglenode(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSinglenode" ):
                return visitor.visitSinglenode(self)
            else:
                return visitor.visitChildren(self)




    def singlenode(self):

        localctx = PdeasyParser.SinglenodeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 30, self.RULE_singlenode)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 201
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,15,self._ctx)
            if la_ == 1:
                self.state = 199
                self.varname()
                pass

            elif la_ == 2:
                self.state = 200
                self.nodedecl()
                pass


            self.state = 205
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==10:
                self.state = 203
                self.match(PdeasyParser.T__9)
                self.state = 204
                self.match(PdeasyParser.IOLET)


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ParametersContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def argslist(self):
            return self.getTypedRuleContext(PdeasyParser.ArgslistContext,0)


        def getRuleIndex(self):
            return PdeasyParser.RULE_parameters

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterParameters" ):
                listener.enterParameters(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitParameters" ):
                listener.exitParameters(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitParameters" ):
                return visitor.visitParameters(self)
            else:
                return visitor.visitChildren(self)




    def parameters(self):

        localctx = PdeasyParser.ParametersContext(self, self._ctx, self.state)
        self.enterRule(localctx, 32, self.RULE_parameters)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 207
            self.match(PdeasyParser.T__10)
            self.state = 209
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if ((_la) & ~0x3f) == 0 and ((1 << _la) & 123145302329488) != 0:
                self.state = 208
                self.argslist()


            self.state = 211
            self.match(PdeasyParser.T__11)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TypedparamsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def typedargslist(self):
            return self.getTypedRuleContext(PdeasyParser.TypedargslistContext,0)


        def getRuleIndex(self):
            return PdeasyParser.RULE_typedparams

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTypedparams" ):
                listener.enterTypedparams(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTypedparams" ):
                listener.exitTypedparams(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTypedparams" ):
                return visitor.visitTypedparams(self)
            else:
                return visitor.visitChildren(self)




    def typedparams(self):

        localctx = PdeasyParser.TypedparamsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 34, self.RULE_typedparams)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 213
            self.match(PdeasyParser.T__10)
            self.state = 215
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==44:
                self.state = 214
                self.typedargslist()


            self.state = 217
            self.match(PdeasyParser.T__11)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ArgslistContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def arg(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PdeasyParser.ArgContext)
            else:
                return self.getTypedRuleContext(PdeasyParser.ArgContext,i)


        def getRuleIndex(self):
            return PdeasyParser.RULE_argslist

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterArgslist" ):
                listener.enterArgslist(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitArgslist" ):
                listener.exitArgslist(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitArgslist" ):
                return visitor.visitArgslist(self)
            else:
                return visitor.visitChildren(self)




    def argslist(self):

        localctx = PdeasyParser.ArgslistContext(self, self._ctx, self.state)
        self.enterRule(localctx, 36, self.RULE_argslist)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 219
            self.arg()
            self.state = 224
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==8:
                self.state = 220
                self.match(PdeasyParser.T__7)
                self.state = 221
                self.arg()
                self.state = 226
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TypedargslistContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def typedarg(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PdeasyParser.TypedargContext)
            else:
                return self.getTypedRuleContext(PdeasyParser.TypedargContext,i)


        def getRuleIndex(self):
            return PdeasyParser.RULE_typedargslist

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTypedargslist" ):
                listener.enterTypedargslist(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTypedargslist" ):
                listener.exitTypedargslist(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTypedargslist" ):
                return visitor.visitTypedargslist(self)
            else:
                return visitor.visitChildren(self)




    def typedargslist(self):

        localctx = PdeasyParser.TypedargslistContext(self, self._ctx, self.state)
        self.enterRule(localctx, 38, self.RULE_typedargslist)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 227
            self.typedarg()
            self.state = 232
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==8:
                self.state = 228
                self.match(PdeasyParser.T__7)
                self.state = 229
                self.typedarg()
                self.state = 234
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ArgContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expr(self):
            return self.getTypedRuleContext(PdeasyParser.ExprContext,0)


        def list_(self):
            return self.getTypedRuleContext(PdeasyParser.ListContext,0)


        def noderef(self):
            return self.getTypedRuleContext(PdeasyParser.NoderefContext,0)


        def getRuleIndex(self):
            return PdeasyParser.RULE_arg

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterArg" ):
                listener.enterArg(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitArg" ):
                listener.exitArg(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitArg" ):
                return visitor.visitArg(self)
            else:
                return visitor.visitChildren(self)




    def arg(self):

        localctx = PdeasyParser.ArgContext(self, self._ctx, self.state)
        self.enterRule(localctx, 40, self.RULE_arg)
        try:
            self.state = 238
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [4, 11, 44, 45, 46]:
                self.enterOuterAlt(localctx, 1)
                self.state = 235
                self.expr(0)
                pass
            elif token in [7]:
                self.enterOuterAlt(localctx, 2)
                self.state = 236
                self.list_()
                pass
            elif token in [14]:
                self.enterOuterAlt(localctx, 3)
                self.state = 237
                self.noderef()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TypedargContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def varname(self):
            return self.getTypedRuleContext(PdeasyParser.VarnameContext,0)


        def VARTYPE(self):
            return self.getToken(PdeasyParser.VARTYPE, 0)

        def getRuleIndex(self):
            return PdeasyParser.RULE_typedarg

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTypedarg" ):
                listener.enterTypedarg(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTypedarg" ):
                listener.exitTypedarg(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTypedarg" ):
                return visitor.visitTypedarg(self)
            else:
                return visitor.visitChildren(self)




    def typedarg(self):

        localctx = PdeasyParser.TypedargContext(self, self._ctx, self.state)
        self.enterRule(localctx, 42, self.RULE_typedarg)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 240
            self.varname()
            self.state = 241
            self.match(PdeasyParser.T__12)
            self.state = 242
            self.match(PdeasyParser.VARTYPE)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SuiteContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def stmt(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PdeasyParser.StmtContext)
            else:
                return self.getTypedRuleContext(PdeasyParser.StmtContext,i)


        def getRuleIndex(self):
            return PdeasyParser.RULE_suite

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSuite" ):
                listener.enterSuite(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSuite" ):
                listener.exitSuite(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSuite" ):
                return visitor.visitSuite(self)
            else:
                return visitor.visitChildren(self)




    def suite(self):

        localctx = PdeasyParser.SuiteContext(self, self._ctx, self.state)
        self.enterRule(localctx, 44, self.RULE_suite)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 245 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 244
                self.stmt()
                self.state = 247 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (((_la) & ~0x3f) == 0 and ((1 << _la) & 27019647631504) != 0):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class OperationContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.op = None # Token

        def NUMBER(self):
            return self.getToken(PdeasyParser.NUMBER, 0)

        def varname(self):
            return self.getTypedRuleContext(PdeasyParser.VarnameContext,0)


        def list_access(self):
            return self.getTypedRuleContext(PdeasyParser.List_accessContext,0)


        def getRuleIndex(self):
            return PdeasyParser.RULE_operation

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterOperation" ):
                listener.enterOperation(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitOperation" ):
                listener.exitOperation(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitOperation" ):
                return visitor.visitOperation(self)
            else:
                return visitor.visitChildren(self)




    def operation(self):

        localctx = PdeasyParser.OperationContext(self, self._ctx, self.state)
        self.enterRule(localctx, 46, self.RULE_operation)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 249
            localctx.op = self._input.LT(1)
            _la = self._input.LA(1)
            if not(((_la) & ~0x3f) == 0 and ((1 << _la) & 8372224) != 0):
                localctx.op = self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
            self.state = 250
            self.match(PdeasyParser.T__10)
            self.state = 254
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,23,self._ctx)
            if la_ == 1:
                self.state = 251
                self.match(PdeasyParser.NUMBER)

            elif la_ == 2:
                self.state = 252
                self.varname()

            elif la_ == 3:
                self.state = 253
                self.list_access()


            self.state = 256
            self.match(PdeasyParser.T__11)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class IfstmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def IF(self):
            return self.getToken(PdeasyParser.IF, 0)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PdeasyParser.ExprContext)
            else:
                return self.getTypedRuleContext(PdeasyParser.ExprContext,i)


        def suite(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PdeasyParser.SuiteContext)
            else:
                return self.getTypedRuleContext(PdeasyParser.SuiteContext,i)


        def END(self):
            return self.getToken(PdeasyParser.END, 0)

        def ELIF(self, i:int=None):
            if i is None:
                return self.getTokens(PdeasyParser.ELIF)
            else:
                return self.getToken(PdeasyParser.ELIF, i)

        def ELSE(self):
            return self.getToken(PdeasyParser.ELSE, 0)

        def getRuleIndex(self):
            return PdeasyParser.RULE_ifstmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterIfstmt" ):
                listener.enterIfstmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitIfstmt" ):
                listener.exitIfstmt(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitIfstmt" ):
                return visitor.visitIfstmt(self)
            else:
                return visitor.visitChildren(self)




    def ifstmt(self):

        localctx = PdeasyParser.IfstmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 48, self.RULE_ifstmt)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 258
            self.match(PdeasyParser.IF)
            self.state = 259
            self.expr(0)
            self.state = 260
            self.match(PdeasyParser.T__12)
            self.state = 261
            self.suite()
            self.state = 269
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==37:
                self.state = 262
                self.match(PdeasyParser.ELIF)
                self.state = 263
                self.expr(0)
                self.state = 264
                self.match(PdeasyParser.T__12)
                self.state = 265
                self.suite()
                self.state = 271
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 275
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==38:
                self.state = 272
                self.match(PdeasyParser.ELSE)
                self.state = 273
                self.match(PdeasyParser.T__12)
                self.state = 274
                self.suite()


            self.state = 277
            self.match(PdeasyParser.END)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return PdeasyParser.RULE_expr

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)


    class SubAddContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a PdeasyParser.ExprContext
            super().__init__(parser)
            self.op = None # Token
            self.copyFrom(ctx)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PdeasyParser.ExprContext)
            else:
                return self.getTypedRuleContext(PdeasyParser.ExprContext,i)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSubAdd" ):
                listener.enterSubAdd(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSubAdd" ):
                listener.exitSubAdd(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSubAdd" ):
                return visitor.visitSubAdd(self)
            else:
                return visitor.visitChildren(self)


    class MulDivContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a PdeasyParser.ExprContext
            super().__init__(parser)
            self.op = None # Token
            self.copyFrom(ctx)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PdeasyParser.ExprContext)
            else:
                return self.getTypedRuleContext(PdeasyParser.ExprContext,i)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMulDiv" ):
                listener.enterMulDiv(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMulDiv" ):
                listener.exitMulDiv(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMulDiv" ):
                return visitor.visitMulDiv(self)
            else:
                return visitor.visitChildren(self)


    class TestCallContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a PdeasyParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def callstmt(self):
            return self.getTypedRuleContext(PdeasyParser.CallstmtContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTestCall" ):
                listener.enterTestCall(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTestCall" ):
                listener.exitTestCall(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTestCall" ):
                return visitor.visitTestCall(self)
            else:
                return visitor.visitChildren(self)


    class ParensExprContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a PdeasyParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expr(self):
            return self.getTypedRuleContext(PdeasyParser.ExprContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterParensExpr" ):
                listener.enterParensExpr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitParensExpr" ):
                listener.exitParensExpr(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitParensExpr" ):
                return visitor.visitParensExpr(self)
            else:
                return visitor.visitChildren(self)


    class TestCompareContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a PdeasyParser.ExprContext
            super().__init__(parser)
            self.testop = None # Token
            self.copyFrom(ctx)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PdeasyParser.ExprContext)
            else:
                return self.getTypedRuleContext(PdeasyParser.ExprContext,i)

        def CONNECT(self):
            return self.getToken(PdeasyParser.CONNECT, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTestCompare" ):
                listener.enterTestCompare(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTestCompare" ):
                listener.exitTestCompare(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTestCompare" ):
                return visitor.visitTestCompare(self)
            else:
                return visitor.visitChildren(self)


    class TestSymContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a PdeasyParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def SYMBOL(self):
            return self.getToken(PdeasyParser.SYMBOL, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTestSym" ):
                listener.enterTestSym(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTestSym" ):
                listener.exitTestSym(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTestSym" ):
                return visitor.visitTestSym(self)
            else:
                return visitor.visitChildren(self)


    class TestVarContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a PdeasyParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def varname(self):
            return self.getTypedRuleContext(PdeasyParser.VarnameContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTestVar" ):
                listener.enterTestVar(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTestVar" ):
                listener.exitTestVar(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTestVar" ):
                return visitor.visitTestVar(self)
            else:
                return visitor.visitChildren(self)


    class TestNumContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a PdeasyParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def NUMBER(self):
            return self.getToken(PdeasyParser.NUMBER, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTestNum" ):
                listener.enterTestNum(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTestNum" ):
                listener.exitTestNum(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTestNum" ):
                return visitor.visitTestNum(self)
            else:
                return visitor.visitChildren(self)


    class TestListAccessContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a PdeasyParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def list_access(self):
            return self.getTypedRuleContext(PdeasyParser.List_accessContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTestListAccess" ):
                listener.enterTestListAccess(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTestListAccess" ):
                listener.exitTestListAccess(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTestListAccess" ):
                return visitor.visitTestListAccess(self)
            else:
                return visitor.visitChildren(self)



    def expr(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = PdeasyParser.ExprContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 50
        self.enterRecursionRule(localctx, 50, self.RULE_expr, _p)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 289
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,26,self._ctx)
            if la_ == 1:
                localctx = PdeasyParser.TestNumContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx

                self.state = 280
                self.match(PdeasyParser.NUMBER)
                pass

            elif la_ == 2:
                localctx = PdeasyParser.TestSymContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 281
                self.match(PdeasyParser.SYMBOL)
                pass

            elif la_ == 3:
                localctx = PdeasyParser.TestVarContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 282
                self.varname()
                pass

            elif la_ == 4:
                localctx = PdeasyParser.TestCallContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 283
                self.callstmt()
                pass

            elif la_ == 5:
                localctx = PdeasyParser.TestListAccessContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 284
                self.list_access()
                pass

            elif la_ == 6:
                localctx = PdeasyParser.ParensExprContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 285
                self.match(PdeasyParser.T__10)
                self.state = 286
                self.expr(0)
                self.state = 287
                self.match(PdeasyParser.T__11)
                pass


            self._ctx.stop = self._input.LT(-1)
            self.state = 302
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,28,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    self.state = 300
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,27,self._ctx)
                    if la_ == 1:
                        localctx = PdeasyParser.MulDivContext(self, PdeasyParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 291
                        if not self.precpred(self._ctx, 9):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 9)")
                        self.state = 292
                        localctx.op = self._input.LT(1)
                        _la = self._input.LA(1)
                        if not(((_la) & ~0x3f) == 0 and ((1 << _la) & 4243456) != 0):
                            localctx.op = self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 293
                        self.expr(10)
                        pass

                    elif la_ == 2:
                        localctx = PdeasyParser.SubAddContext(self, PdeasyParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 294
                        if not self.precpred(self._ctx, 8):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 8)")
                        self.state = 295
                        localctx.op = self._input.LT(1)
                        _la = self._input.LA(1)
                        if not(_la==18 or _la==19):
                            localctx.op = self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 296
                        self.expr(9)
                        pass

                    elif la_ == 3:
                        localctx = PdeasyParser.TestCompareContext(self, PdeasyParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 297
                        if not self.precpred(self._ctx, 7):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 7)")
                        self.state = 298
                        localctx.testop = self._input.LT(1)
                        _la = self._input.LA(1)
                        if not(((_la) & ~0x3f) == 0 and ((1 << _la) & 17439916032) != 0):
                            localctx.testop = self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 299
                        self.expr(8)
                        pass

             
                self.state = 304
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,28,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx


    class NoderefContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def varname(self):
            return self.getTypedRuleContext(PdeasyParser.VarnameContext,0)


        def getRuleIndex(self):
            return PdeasyParser.RULE_noderef

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterNoderef" ):
                listener.enterNoderef(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitNoderef" ):
                listener.exitNoderef(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitNoderef" ):
                return visitor.visitNoderef(self)
            else:
                return visitor.visitChildren(self)




    def noderef(self):

        localctx = PdeasyParser.NoderefContext(self, self._ctx, self.state)
        self.enterRule(localctx, 52, self.RULE_noderef)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 305
            self.match(PdeasyParser.T__13)
            self.state = 306
            self.varname()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ForstmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def FOR(self):
            return self.getToken(PdeasyParser.FOR, 0)

        def varname(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PdeasyParser.VarnameContext)
            else:
                return self.getTypedRuleContext(PdeasyParser.VarnameContext,i)


        def suite(self):
            return self.getTypedRuleContext(PdeasyParser.SuiteContext,0)


        def END(self):
            return self.getToken(PdeasyParser.END, 0)

        def NUMBER(self):
            return self.getToken(PdeasyParser.NUMBER, 0)

        def callstmt(self):
            return self.getTypedRuleContext(PdeasyParser.CallstmtContext,0)


        def list_access(self):
            return self.getTypedRuleContext(PdeasyParser.List_accessContext,0)


        def getRuleIndex(self):
            return PdeasyParser.RULE_forstmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterForstmt" ):
                listener.enterForstmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitForstmt" ):
                listener.exitForstmt(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitForstmt" ):
                return visitor.visitForstmt(self)
            else:
                return visitor.visitChildren(self)




    def forstmt(self):

        localctx = PdeasyParser.ForstmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 54, self.RULE_forstmt)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 308
            self.match(PdeasyParser.FOR)
            self.state = 309
            self.varname()
            self.state = 310
            self.match(PdeasyParser.T__27)
            self.state = 315
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,29,self._ctx)
            if la_ == 1:
                self.state = 311
                self.match(PdeasyParser.NUMBER)
                pass

            elif la_ == 2:
                self.state = 312
                self.callstmt()
                pass

            elif la_ == 3:
                self.state = 313
                self.varname()
                pass

            elif la_ == 4:
                self.state = 314
                self.list_access()
                pass


            self.state = 317
            self.match(PdeasyParser.T__12)
            self.state = 318
            self.suite()
            self.state = 319
            self.match(PdeasyParser.END)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class VarnameContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def VARNAME(self):
            return self.getToken(PdeasyParser.VARNAME, 0)

        def getRuleIndex(self):
            return PdeasyParser.RULE_varname

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVarname" ):
                listener.enterVarname(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVarname" ):
                listener.exitVarname(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitVarname" ):
                return visitor.visitVarname(self)
            else:
                return visitor.visitChildren(self)




    def varname(self):

        localctx = PdeasyParser.VarnameContext(self, self._ctx, self.state)
        self.enterRule(localctx, 56, self.RULE_varname)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 321
            self.match(PdeasyParser.VARNAME)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx



    def sempred(self, localctx:RuleContext, ruleIndex:int, predIndex:int):
        if self._predicates == None:
            self._predicates = dict()
        self._predicates[25] = self.expr_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def expr_sempred(self, localctx:ExprContext, predIndex:int):
            if predIndex == 0:
                return self.precpred(self._ctx, 9)
         

            if predIndex == 1:
                return self.precpred(self._ctx, 8)
         

            if predIndex == 2:
                return self.precpred(self._ctx, 7)
         




