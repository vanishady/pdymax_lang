# Generated from Simple.g4 by ANTLR 4.11.1
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
        4,1,59,312,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,
        2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,19,2,20,
        7,20,1,0,1,0,1,0,5,0,46,8,0,10,0,12,0,49,9,0,1,0,1,0,1,0,1,0,1,0,
        4,0,56,8,0,11,0,12,0,57,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,5,1,68,8,
        1,10,1,12,1,71,9,1,1,1,1,1,1,1,1,2,1,2,1,2,1,2,1,2,5,2,81,8,2,10,
        2,12,2,84,9,2,1,2,1,2,1,2,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,
        3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,3,
        3,114,8,3,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,4,3,4,125,8,4,1,5,1,
        5,3,5,129,8,5,1,5,1,5,1,6,1,6,1,6,5,6,136,8,6,10,6,12,6,139,9,6,
        1,6,1,6,5,6,143,8,6,10,6,12,6,146,9,6,1,7,1,7,1,8,1,8,1,8,3,8,153,
        8,8,3,8,155,8,8,1,9,1,9,1,9,1,9,1,9,1,9,3,9,163,8,9,1,10,1,10,1,
        10,1,10,1,10,1,10,1,10,1,10,3,10,173,8,10,1,11,1,11,1,11,4,11,178,
        8,11,11,11,12,11,179,1,11,3,11,183,8,11,1,12,1,12,1,12,1,12,1,12,
        1,12,1,12,1,12,1,12,3,12,194,8,12,1,13,1,13,1,13,3,13,199,8,13,1,
        13,1,13,1,13,3,13,204,8,13,5,13,206,8,13,10,13,12,13,209,9,13,1,
        13,1,13,1,13,3,13,214,8,13,3,13,216,8,13,1,14,1,14,1,14,4,14,221,
        8,14,11,14,12,14,222,1,15,1,15,1,15,1,15,5,15,229,8,15,10,15,12,
        15,232,9,15,1,15,1,15,3,15,236,8,15,1,16,1,16,1,16,1,16,1,16,1,16,
        1,16,1,16,5,16,246,8,16,10,16,12,16,249,9,16,1,16,1,16,1,17,1,17,
        1,17,1,17,1,17,1,17,1,17,1,17,1,17,5,17,262,8,17,10,17,12,17,265,
        9,17,1,17,1,17,1,17,3,17,270,8,17,1,17,1,17,1,18,1,18,1,18,1,18,
        1,18,1,18,1,18,1,19,1,19,4,19,283,8,19,11,19,12,19,284,1,20,1,20,
        1,20,1,20,1,20,1,20,3,20,293,8,20,1,20,1,20,1,20,1,20,1,20,1,20,
        1,20,1,20,1,20,1,20,1,20,1,20,5,20,307,8,20,10,20,12,20,310,9,20,
        1,20,0,1,40,21,0,2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,
        36,38,40,0,6,1,0,53,54,3,0,36,37,39,40,44,47,2,0,39,40,46,47,2,0,
        36,37,44,45,3,0,7,8,32,35,41,41,1,0,42,43,337,0,47,1,0,0,0,2,61,
        1,0,0,0,4,75,1,0,0,0,6,113,1,0,0,0,8,124,1,0,0,0,10,126,1,0,0,0,
        12,132,1,0,0,0,14,147,1,0,0,0,16,154,1,0,0,0,18,156,1,0,0,0,20,172,
        1,0,0,0,22,182,1,0,0,0,24,193,1,0,0,0,26,215,1,0,0,0,28,217,1,0,
        0,0,30,235,1,0,0,0,32,237,1,0,0,0,34,252,1,0,0,0,36,273,1,0,0,0,
        38,280,1,0,0,0,40,292,1,0,0,0,42,43,5,10,0,0,43,44,5,52,0,0,44,46,
        5,57,0,0,45,42,1,0,0,0,46,49,1,0,0,0,47,45,1,0,0,0,47,48,1,0,0,0,
        48,50,1,0,0,0,49,47,1,0,0,0,50,51,5,9,0,0,51,52,5,52,0,0,52,55,5,
        57,0,0,53,56,3,2,1,0,54,56,3,6,3,0,55,53,1,0,0,0,55,54,1,0,0,0,56,
        57,1,0,0,0,57,55,1,0,0,0,57,58,1,0,0,0,58,59,1,0,0,0,59,60,5,1,0,
        0,60,1,1,0,0,0,61,62,5,11,0,0,62,63,5,52,0,0,63,64,5,28,0,0,64,69,
        5,57,0,0,65,68,3,6,3,0,66,68,3,4,2,0,67,65,1,0,0,0,67,66,1,0,0,0,
        68,71,1,0,0,0,69,67,1,0,0,0,69,70,1,0,0,0,70,72,1,0,0,0,71,69,1,
        0,0,0,72,73,5,29,0,0,73,74,5,57,0,0,74,3,1,0,0,0,75,76,5,12,0,0,
        76,77,5,52,0,0,77,78,5,28,0,0,78,82,5,57,0,0,79,81,3,6,3,0,80,79,
        1,0,0,0,81,84,1,0,0,0,82,80,1,0,0,0,82,83,1,0,0,0,83,85,1,0,0,0,
        84,82,1,0,0,0,85,86,5,29,0,0,86,87,5,57,0,0,87,5,1,0,0,0,88,89,3,
        8,4,0,89,90,5,57,0,0,90,114,1,0,0,0,91,92,3,20,10,0,92,93,5,57,0,
        0,93,114,1,0,0,0,94,95,3,22,11,0,95,96,5,57,0,0,96,114,1,0,0,0,97,
        98,3,32,16,0,98,99,5,57,0,0,99,114,1,0,0,0,100,101,3,34,17,0,101,
        102,5,57,0,0,102,114,1,0,0,0,103,104,3,36,18,0,104,105,5,57,0,0,
        105,114,1,0,0,0,106,107,5,20,0,0,107,114,5,57,0,0,108,109,5,21,0,
        0,109,114,5,57,0,0,110,111,5,22,0,0,111,114,5,57,0,0,112,114,5,57,
        0,0,113,88,1,0,0,0,113,91,1,0,0,0,113,94,1,0,0,0,113,97,1,0,0,0,
        113,100,1,0,0,0,113,103,1,0,0,0,113,106,1,0,0,0,113,108,1,0,0,0,
        113,110,1,0,0,0,113,112,1,0,0,0,114,7,1,0,0,0,115,116,5,52,0,0,116,
        117,5,2,0,0,117,118,5,48,0,0,118,125,3,10,5,0,119,120,5,48,0,0,120,
        125,3,10,5,0,121,122,5,52,0,0,122,123,5,2,0,0,123,125,3,16,8,0,124,
        115,1,0,0,0,124,119,1,0,0,0,124,121,1,0,0,0,125,9,1,0,0,0,126,128,
        5,26,0,0,127,129,3,12,6,0,128,127,1,0,0,0,128,129,1,0,0,0,129,130,
        1,0,0,0,130,131,5,27,0,0,131,11,1,0,0,0,132,137,3,14,7,0,133,134,
        5,3,0,0,134,136,3,14,7,0,135,133,1,0,0,0,136,139,1,0,0,0,137,135,
        1,0,0,0,137,138,1,0,0,0,138,144,1,0,0,0,139,137,1,0,0,0,140,141,
        5,3,0,0,141,143,3,18,9,0,142,140,1,0,0,0,143,146,1,0,0,0,144,142,
        1,0,0,0,144,145,1,0,0,0,145,13,1,0,0,0,146,144,1,0,0,0,147,148,7,
        0,0,0,148,15,1,0,0,0,149,155,5,54,0,0,150,152,7,1,0,0,151,153,5,
        54,0,0,152,151,1,0,0,0,152,153,1,0,0,0,153,155,1,0,0,0,154,149,1,
        0,0,0,154,150,1,0,0,0,155,17,1,0,0,0,156,157,5,51,0,0,157,162,5,
        2,0,0,158,159,5,48,0,0,159,163,3,10,5,0,160,163,3,16,8,0,161,163,
        5,52,0,0,162,158,1,0,0,0,162,160,1,0,0,0,162,161,1,0,0,0,163,19,
        1,0,0,0,164,165,5,52,0,0,165,166,5,4,0,0,166,173,3,18,9,0,167,168,
        5,48,0,0,168,169,3,10,5,0,169,170,5,4,0,0,170,171,3,18,9,0,171,173,
        1,0,0,0,172,164,1,0,0,0,172,167,1,0,0,0,173,21,1,0,0,0,174,177,3,
        26,13,0,175,176,5,13,0,0,176,178,3,26,13,0,177,175,1,0,0,0,178,179,
        1,0,0,0,179,177,1,0,0,0,179,180,1,0,0,0,180,183,1,0,0,0,181,183,
        1,0,0,0,182,174,1,0,0,0,182,181,1,0,0,0,183,23,1,0,0,0,184,185,5,
        52,0,0,185,186,5,2,0,0,186,187,5,48,0,0,187,194,3,10,5,0,188,189,
        5,48,0,0,189,194,3,10,5,0,190,191,5,52,0,0,191,192,5,2,0,0,192,194,
        3,16,8,0,193,184,1,0,0,0,193,188,1,0,0,0,193,190,1,0,0,0,194,25,
        1,0,0,0,195,198,5,32,0,0,196,199,5,52,0,0,197,199,3,24,12,0,198,
        196,1,0,0,0,198,197,1,0,0,0,199,207,1,0,0,0,200,203,5,3,0,0,201,
        204,5,52,0,0,202,204,3,24,12,0,203,201,1,0,0,0,203,202,1,0,0,0,204,
        206,1,0,0,0,205,200,1,0,0,0,206,209,1,0,0,0,207,205,1,0,0,0,207,
        208,1,0,0,0,208,210,1,0,0,0,209,207,1,0,0,0,210,216,5,33,0,0,211,
        214,5,52,0,0,212,214,3,24,12,0,213,211,1,0,0,0,213,212,1,0,0,0,214,
        216,1,0,0,0,215,195,1,0,0,0,215,213,1,0,0,0,216,27,1,0,0,0,217,220,
        3,30,15,0,218,219,5,14,0,0,219,221,3,30,15,0,220,218,1,0,0,0,221,
        222,1,0,0,0,222,220,1,0,0,0,222,223,1,0,0,0,223,29,1,0,0,0,224,225,
        5,32,0,0,225,230,5,52,0,0,226,227,5,3,0,0,227,229,5,52,0,0,228,226,
        1,0,0,0,229,232,1,0,0,0,230,228,1,0,0,0,230,231,1,0,0,0,231,233,
        1,0,0,0,232,230,1,0,0,0,233,236,5,33,0,0,234,236,5,52,0,0,235,224,
        1,0,0,0,235,234,1,0,0,0,236,31,1,0,0,0,237,238,5,24,0,0,238,239,
        5,52,0,0,239,240,5,25,0,0,240,241,5,52,0,0,241,242,5,28,0,0,242,
        247,5,57,0,0,243,246,3,6,3,0,244,246,3,4,2,0,245,243,1,0,0,0,245,
        244,1,0,0,0,246,249,1,0,0,0,247,245,1,0,0,0,247,248,1,0,0,0,248,
        250,1,0,0,0,249,247,1,0,0,0,250,251,5,29,0,0,251,33,1,0,0,0,252,
        253,5,15,0,0,253,254,3,40,20,0,254,255,5,5,0,0,255,263,3,38,19,0,
        256,257,5,16,0,0,257,258,3,40,20,0,258,259,5,5,0,0,259,260,3,38,
        19,0,260,262,1,0,0,0,261,256,1,0,0,0,262,265,1,0,0,0,263,261,1,0,
        0,0,263,264,1,0,0,0,264,269,1,0,0,0,265,263,1,0,0,0,266,267,5,17,
        0,0,267,268,5,5,0,0,268,270,3,38,19,0,269,266,1,0,0,0,269,270,1,
        0,0,0,270,271,1,0,0,0,271,272,5,23,0,0,272,35,1,0,0,0,273,274,5,
        18,0,0,274,275,5,55,0,0,275,276,5,6,0,0,276,277,5,5,0,0,277,278,
        3,38,19,0,278,279,5,23,0,0,279,37,1,0,0,0,280,282,5,57,0,0,281,283,
        3,6,3,0,282,281,1,0,0,0,283,284,1,0,0,0,284,282,1,0,0,0,284,285,
        1,0,0,0,285,39,1,0,0,0,286,287,6,20,-1,0,287,293,5,54,0,0,288,289,
        5,26,0,0,289,290,3,40,20,0,290,291,5,27,0,0,291,293,1,0,0,0,292,
        286,1,0,0,0,292,288,1,0,0,0,293,308,1,0,0,0,294,295,10,6,0,0,295,
        296,7,2,0,0,296,307,3,40,20,7,297,298,10,5,0,0,298,299,7,3,0,0,299,
        307,3,40,20,6,300,301,10,4,0,0,301,302,7,4,0,0,302,307,3,40,20,5,
        303,304,10,3,0,0,304,305,7,5,0,0,305,307,3,40,20,4,306,294,1,0,0,
        0,306,297,1,0,0,0,306,300,1,0,0,0,306,303,1,0,0,0,307,310,1,0,0,
        0,308,306,1,0,0,0,308,309,1,0,0,0,309,41,1,0,0,0,310,308,1,0,0,0,
        34,47,55,57,67,69,82,113,124,128,137,144,152,154,162,172,179,182,
        193,198,203,207,213,215,222,230,235,245,247,263,269,284,292,306,
        308
    ]

class SimpleParser ( Parser ):

    grammarFileName = "Simple.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "';'", "'='", "','", "'.'", "':'", "'rounds do'", 
                     "'>='", "'<='", "'patch'", "'include'", "'block'", 
                     "'subblock'", "'::'", "<INVALID>", "'if'", "'elif'", 
                     "'else'", "'for'", "'thisround'", "'break'", "'continue'", 
                     "'pass'", "'end'", "'recall'", "'to'", "'('", "')'", 
                     "'{'", "'}'", "'['", "']'", "'<'", "'>'", "'=='", "'!='", 
                     "'+'", "'-'", "'**'", "'*'", "'/'", "'%'", "'||'", 
                     "'&&'", "'-~'", "'+~'", "'/~'", "'*~'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "PATCH", "INCLUDE", "BLOCK", "SUBBLOCK", 
                      "CONNECT", "DISCONNECT", "IF", "ELIF", "ELSE", "FOR", 
                      "THISROUND", "BREAK", "CONTINUE", "PASS", "END", "RECALL", 
                      "TO", "L_PAREN", "R_PAREN", "L_CURLY", "R_CURLY", 
                      "L_BRACKET", "R_BRACKET", "L_ANGLE", "R_ANGLE", "EQ", 
                      "NOT_EQ", "PLUS", "MINUS", "POW", "STAR", "DIV", "MOD", 
                      "OR", "AND", "SIGMINUS", "SIGPLUS", "SIGDIV", "SIGSTAR", 
                      "NODETYPE", "GENERALTYPE", "OBJTYPE", "INOUTID", "ID", 
                      "SYMBOL", "NUMBER", "INTEGER", "FLOAT", "NL", "WS", 
                      "COMMENT" ]

    RULE_prog = 0
    RULE_blockstmt = 1
    RULE_subblockstmt = 2
    RULE_stmt = 3
    RULE_declarationstmt = 4
    RULE_parameters = 5
    RULE_typedargslist = 6
    RULE_arg = 7
    RULE_operation = 8
    RULE_ioletdeclasarg = 9
    RULE_ioletdeclstmt = 10
    RULE_connectionstmt = 11
    RULE_declinside = 12
    RULE_connectionelem = 13
    RULE_disconnectionstmt = 14
    RULE_disconnectionelem = 15
    RULE_recallstmt = 16
    RULE_ifstmt = 17
    RULE_forstmt = 18
    RULE_suite = 19
    RULE_expr = 20

    ruleNames =  [ "prog", "blockstmt", "subblockstmt", "stmt", "declarationstmt", 
                   "parameters", "typedargslist", "arg", "operation", "ioletdeclasarg", 
                   "ioletdeclstmt", "connectionstmt", "declinside", "connectionelem", 
                   "disconnectionstmt", "disconnectionelem", "recallstmt", 
                   "ifstmt", "forstmt", "suite", "expr" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    PATCH=9
    INCLUDE=10
    BLOCK=11
    SUBBLOCK=12
    CONNECT=13
    DISCONNECT=14
    IF=15
    ELIF=16
    ELSE=17
    FOR=18
    THISROUND=19
    BREAK=20
    CONTINUE=21
    PASS=22
    END=23
    RECALL=24
    TO=25
    L_PAREN=26
    R_PAREN=27
    L_CURLY=28
    R_CURLY=29
    L_BRACKET=30
    R_BRACKET=31
    L_ANGLE=32
    R_ANGLE=33
    EQ=34
    NOT_EQ=35
    PLUS=36
    MINUS=37
    POW=38
    STAR=39
    DIV=40
    MOD=41
    OR=42
    AND=43
    SIGMINUS=44
    SIGPLUS=45
    SIGDIV=46
    SIGSTAR=47
    NODETYPE=48
    GENERALTYPE=49
    OBJTYPE=50
    INOUTID=51
    ID=52
    SYMBOL=53
    NUMBER=54
    INTEGER=55
    FLOAT=56
    NL=57
    WS=58
    COMMENT=59

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

        def PATCH(self):
            return self.getToken(SimpleParser.PATCH, 0)

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(SimpleParser.ID)
            else:
                return self.getToken(SimpleParser.ID, i)

        def NL(self, i:int=None):
            if i is None:
                return self.getTokens(SimpleParser.NL)
            else:
                return self.getToken(SimpleParser.NL, i)

        def INCLUDE(self, i:int=None):
            if i is None:
                return self.getTokens(SimpleParser.INCLUDE)
            else:
                return self.getToken(SimpleParser.INCLUDE, i)

        def blockstmt(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SimpleParser.BlockstmtContext)
            else:
                return self.getTypedRuleContext(SimpleParser.BlockstmtContext,i)


        def stmt(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SimpleParser.StmtContext)
            else:
                return self.getTypedRuleContext(SimpleParser.StmtContext,i)


        def getRuleIndex(self):
            return SimpleParser.RULE_prog

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

        localctx = SimpleParser.ProgContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_prog)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 47
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==10:
                self.state = 42
                self.match(SimpleParser.INCLUDE)
                self.state = 43
                self.match(SimpleParser.ID)
                self.state = 44
                self.match(SimpleParser.NL)
                self.state = 49
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 50
            self.match(SimpleParser.PATCH)
            self.state = 51
            self.match(SimpleParser.ID)
            self.state = 52
            self.match(SimpleParser.NL)
            self.state = 55 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 55
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [11]:
                    self.state = 53
                    self.blockstmt()
                    pass
                elif token in [15, 18, 20, 21, 22, 24, 32, 48, 52, 57]:
                    self.state = 54
                    self.stmt()
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 57 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (((_la) & ~0x3f) == 0 and ((1 << _la) & 148900266999318528) != 0):
                    break

            self.state = 59
            self.match(SimpleParser.T__0)
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
            return self.getToken(SimpleParser.BLOCK, 0)

        def ID(self):
            return self.getToken(SimpleParser.ID, 0)

        def L_CURLY(self):
            return self.getToken(SimpleParser.L_CURLY, 0)

        def NL(self, i:int=None):
            if i is None:
                return self.getTokens(SimpleParser.NL)
            else:
                return self.getToken(SimpleParser.NL, i)

        def R_CURLY(self):
            return self.getToken(SimpleParser.R_CURLY, 0)

        def stmt(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SimpleParser.StmtContext)
            else:
                return self.getTypedRuleContext(SimpleParser.StmtContext,i)


        def subblockstmt(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SimpleParser.SubblockstmtContext)
            else:
                return self.getTypedRuleContext(SimpleParser.SubblockstmtContext,i)


        def getRuleIndex(self):
            return SimpleParser.RULE_blockstmt

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

        localctx = SimpleParser.BlockstmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_blockstmt)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 61
            self.match(SimpleParser.BLOCK)
            self.state = 62
            self.match(SimpleParser.ID)
            self.state = 63
            self.match(SimpleParser.L_CURLY)
            self.state = 64
            self.match(SimpleParser.NL)
            self.state = 69
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while ((_la) & ~0x3f) == 0 and ((1 << _la) & 148900266999320576) != 0:
                self.state = 67
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [15, 18, 20, 21, 22, 24, 32, 48, 52, 57]:
                    self.state = 65
                    self.stmt()
                    pass
                elif token in [12]:
                    self.state = 66
                    self.subblockstmt()
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 71
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 72
            self.match(SimpleParser.R_CURLY)
            self.state = 73
            self.match(SimpleParser.NL)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SubblockstmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def SUBBLOCK(self):
            return self.getToken(SimpleParser.SUBBLOCK, 0)

        def ID(self):
            return self.getToken(SimpleParser.ID, 0)

        def L_CURLY(self):
            return self.getToken(SimpleParser.L_CURLY, 0)

        def NL(self, i:int=None):
            if i is None:
                return self.getTokens(SimpleParser.NL)
            else:
                return self.getToken(SimpleParser.NL, i)

        def R_CURLY(self):
            return self.getToken(SimpleParser.R_CURLY, 0)

        def stmt(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SimpleParser.StmtContext)
            else:
                return self.getTypedRuleContext(SimpleParser.StmtContext,i)


        def getRuleIndex(self):
            return SimpleParser.RULE_subblockstmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSubblockstmt" ):
                listener.enterSubblockstmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSubblockstmt" ):
                listener.exitSubblockstmt(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSubblockstmt" ):
                return visitor.visitSubblockstmt(self)
            else:
                return visitor.visitChildren(self)




    def subblockstmt(self):

        localctx = SimpleParser.SubblockstmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_subblockstmt)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 75
            self.match(SimpleParser.SUBBLOCK)
            self.state = 76
            self.match(SimpleParser.ID)
            self.state = 77
            self.match(SimpleParser.L_CURLY)
            self.state = 78
            self.match(SimpleParser.NL)
            self.state = 82
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while ((_la) & ~0x3f) == 0 and ((1 << _la) & 148900266999316480) != 0:
                self.state = 79
                self.stmt()
                self.state = 84
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 85
            self.match(SimpleParser.R_CURLY)
            self.state = 86
            self.match(SimpleParser.NL)
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

        def declarationstmt(self):
            return self.getTypedRuleContext(SimpleParser.DeclarationstmtContext,0)


        def NL(self):
            return self.getToken(SimpleParser.NL, 0)

        def ioletdeclstmt(self):
            return self.getTypedRuleContext(SimpleParser.IoletdeclstmtContext,0)


        def connectionstmt(self):
            return self.getTypedRuleContext(SimpleParser.ConnectionstmtContext,0)


        def recallstmt(self):
            return self.getTypedRuleContext(SimpleParser.RecallstmtContext,0)


        def ifstmt(self):
            return self.getTypedRuleContext(SimpleParser.IfstmtContext,0)


        def forstmt(self):
            return self.getTypedRuleContext(SimpleParser.ForstmtContext,0)


        def BREAK(self):
            return self.getToken(SimpleParser.BREAK, 0)

        def CONTINUE(self):
            return self.getToken(SimpleParser.CONTINUE, 0)

        def PASS(self):
            return self.getToken(SimpleParser.PASS, 0)

        def getRuleIndex(self):
            return SimpleParser.RULE_stmt

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

        localctx = SimpleParser.StmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_stmt)
        try:
            self.state = 113
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,6,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 88
                self.declarationstmt()
                self.state = 89
                self.match(SimpleParser.NL)
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 91
                self.ioletdeclstmt()
                self.state = 92
                self.match(SimpleParser.NL)
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 94
                self.connectionstmt()
                self.state = 95
                self.match(SimpleParser.NL)
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 97
                self.recallstmt()
                self.state = 98
                self.match(SimpleParser.NL)
                pass

            elif la_ == 5:
                self.enterOuterAlt(localctx, 5)
                self.state = 100
                self.ifstmt()
                self.state = 101
                self.match(SimpleParser.NL)
                pass

            elif la_ == 6:
                self.enterOuterAlt(localctx, 6)
                self.state = 103
                self.forstmt()
                self.state = 104
                self.match(SimpleParser.NL)
                pass

            elif la_ == 7:
                self.enterOuterAlt(localctx, 7)
                self.state = 106
                self.match(SimpleParser.BREAK)
                self.state = 107
                self.match(SimpleParser.NL)
                pass

            elif la_ == 8:
                self.enterOuterAlt(localctx, 8)
                self.state = 108
                self.match(SimpleParser.CONTINUE)
                self.state = 109
                self.match(SimpleParser.NL)
                pass

            elif la_ == 9:
                self.enterOuterAlt(localctx, 9)
                self.state = 110
                self.match(SimpleParser.PASS)
                self.state = 111
                self.match(SimpleParser.NL)
                pass

            elif la_ == 10:
                self.enterOuterAlt(localctx, 10)
                self.state = 112
                self.match(SimpleParser.NL)
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class DeclarationstmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return SimpleParser.RULE_declarationstmt

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class FullDeclStmtContext(DeclarationstmtContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a SimpleParser.DeclarationstmtContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def ID(self):
            return self.getToken(SimpleParser.ID, 0)
        def NODETYPE(self):
            return self.getToken(SimpleParser.NODETYPE, 0)
        def parameters(self):
            return self.getTypedRuleContext(SimpleParser.ParametersContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFullDeclStmt" ):
                listener.enterFullDeclStmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFullDeclStmt" ):
                listener.exitFullDeclStmt(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFullDeclStmt" ):
                return visitor.visitFullDeclStmt(self)
            else:
                return visitor.visitChildren(self)


    class FastDeclStmtContext(DeclarationstmtContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a SimpleParser.DeclarationstmtContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def NODETYPE(self):
            return self.getToken(SimpleParser.NODETYPE, 0)
        def parameters(self):
            return self.getTypedRuleContext(SimpleParser.ParametersContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFastDeclStmt" ):
                listener.enterFastDeclStmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFastDeclStmt" ):
                listener.exitFastDeclStmt(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFastDeclStmt" ):
                return visitor.visitFastDeclStmt(self)
            else:
                return visitor.visitChildren(self)


    class OpDeclStmtContext(DeclarationstmtContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a SimpleParser.DeclarationstmtContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def ID(self):
            return self.getToken(SimpleParser.ID, 0)
        def operation(self):
            return self.getTypedRuleContext(SimpleParser.OperationContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterOpDeclStmt" ):
                listener.enterOpDeclStmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitOpDeclStmt" ):
                listener.exitOpDeclStmt(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitOpDeclStmt" ):
                return visitor.visitOpDeclStmt(self)
            else:
                return visitor.visitChildren(self)



    def declarationstmt(self):

        localctx = SimpleParser.DeclarationstmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_declarationstmt)
        try:
            self.state = 124
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,7,self._ctx)
            if la_ == 1:
                localctx = SimpleParser.FullDeclStmtContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 115
                self.match(SimpleParser.ID)
                self.state = 116
                self.match(SimpleParser.T__1)

                self.state = 117
                self.match(SimpleParser.NODETYPE)
                self.state = 118
                self.parameters()
                pass

            elif la_ == 2:
                localctx = SimpleParser.FastDeclStmtContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 119
                self.match(SimpleParser.NODETYPE)
                self.state = 120
                self.parameters()
                pass

            elif la_ == 3:
                localctx = SimpleParser.OpDeclStmtContext(self, localctx)
                self.enterOuterAlt(localctx, 3)
                self.state = 121
                self.match(SimpleParser.ID)
                self.state = 122
                self.match(SimpleParser.T__1)
                self.state = 123
                self.operation()
                pass


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

        def L_PAREN(self):
            return self.getToken(SimpleParser.L_PAREN, 0)

        def R_PAREN(self):
            return self.getToken(SimpleParser.R_PAREN, 0)

        def typedargslist(self):
            return self.getTypedRuleContext(SimpleParser.TypedargslistContext,0)


        def getRuleIndex(self):
            return SimpleParser.RULE_parameters

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

        localctx = SimpleParser.ParametersContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_parameters)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 126
            self.match(SimpleParser.L_PAREN)
            self.state = 128
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==53 or _la==54:
                self.state = 127
                self.typedargslist()


            self.state = 130
            self.match(SimpleParser.R_PAREN)
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

        def arg(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SimpleParser.ArgContext)
            else:
                return self.getTypedRuleContext(SimpleParser.ArgContext,i)


        def ioletdeclasarg(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SimpleParser.IoletdeclasargContext)
            else:
                return self.getTypedRuleContext(SimpleParser.IoletdeclasargContext,i)


        def getRuleIndex(self):
            return SimpleParser.RULE_typedargslist

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

        localctx = SimpleParser.TypedargslistContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_typedargslist)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 132
            self.arg()
            self.state = 137
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,9,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 133
                    self.match(SimpleParser.T__2)
                    self.state = 134
                    self.arg() 
                self.state = 139
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,9,self._ctx)

            self.state = 144
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==3:
                self.state = 140
                self.match(SimpleParser.T__2)
                self.state = 141
                self.ioletdeclasarg()
                self.state = 146
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

        def SYMBOL(self):
            return self.getToken(SimpleParser.SYMBOL, 0)

        def NUMBER(self):
            return self.getToken(SimpleParser.NUMBER, 0)

        def getRuleIndex(self):
            return SimpleParser.RULE_arg

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

        localctx = SimpleParser.ArgContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_arg)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 147
            _la = self._input.LA(1)
            if not(_la==53 or _la==54):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
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
            return self.getToken(SimpleParser.NUMBER, 0)

        def STAR(self):
            return self.getToken(SimpleParser.STAR, 0)

        def DIV(self):
            return self.getToken(SimpleParser.DIV, 0)

        def SIGSTAR(self):
            return self.getToken(SimpleParser.SIGSTAR, 0)

        def SIGDIV(self):
            return self.getToken(SimpleParser.SIGDIV, 0)

        def PLUS(self):
            return self.getToken(SimpleParser.PLUS, 0)

        def MINUS(self):
            return self.getToken(SimpleParser.MINUS, 0)

        def SIGPLUS(self):
            return self.getToken(SimpleParser.SIGPLUS, 0)

        def SIGMINUS(self):
            return self.getToken(SimpleParser.SIGMINUS, 0)

        def getRuleIndex(self):
            return SimpleParser.RULE_operation

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

        localctx = SimpleParser.OperationContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_operation)
        self._la = 0 # Token type
        try:
            self.state = 154
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [54]:
                self.enterOuterAlt(localctx, 1)
                self.state = 149
                self.match(SimpleParser.NUMBER)
                pass
            elif token in [36, 37, 39, 40, 44, 45, 46, 47]:
                self.enterOuterAlt(localctx, 2)
                self.state = 150
                localctx.op = self._input.LT(1)
                _la = self._input.LA(1)
                if not(((_la) & ~0x3f) == 0 and ((1 << _la) & 265738216538112) != 0):
                    localctx.op = self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 152
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==54:
                    self.state = 151
                    self.match(SimpleParser.NUMBER)


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


    class IoletdeclasargContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def INOUTID(self):
            return self.getToken(SimpleParser.INOUTID, 0)

        def NODETYPE(self):
            return self.getToken(SimpleParser.NODETYPE, 0)

        def parameters(self):
            return self.getTypedRuleContext(SimpleParser.ParametersContext,0)


        def operation(self):
            return self.getTypedRuleContext(SimpleParser.OperationContext,0)


        def ID(self):
            return self.getToken(SimpleParser.ID, 0)

        def getRuleIndex(self):
            return SimpleParser.RULE_ioletdeclasarg

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterIoletdeclasarg" ):
                listener.enterIoletdeclasarg(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitIoletdeclasarg" ):
                listener.exitIoletdeclasarg(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitIoletdeclasarg" ):
                return visitor.visitIoletdeclasarg(self)
            else:
                return visitor.visitChildren(self)




    def ioletdeclasarg(self):

        localctx = SimpleParser.IoletdeclasargContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_ioletdeclasarg)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 156
            self.match(SimpleParser.INOUTID)
            self.state = 157
            self.match(SimpleParser.T__1)
            self.state = 162
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [48]:
                self.state = 158
                self.match(SimpleParser.NODETYPE)
                self.state = 159
                self.parameters()
                pass
            elif token in [36, 37, 39, 40, 44, 45, 46, 47, 54]:
                self.state = 160
                self.operation()
                pass
            elif token in [52]:
                self.state = 161
                self.match(SimpleParser.ID)
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


    class IoletdeclstmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(SimpleParser.ID, 0)

        def ioletdeclasarg(self):
            return self.getTypedRuleContext(SimpleParser.IoletdeclasargContext,0)


        def NODETYPE(self):
            return self.getToken(SimpleParser.NODETYPE, 0)

        def parameters(self):
            return self.getTypedRuleContext(SimpleParser.ParametersContext,0)


        def getRuleIndex(self):
            return SimpleParser.RULE_ioletdeclstmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterIoletdeclstmt" ):
                listener.enterIoletdeclstmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitIoletdeclstmt" ):
                listener.exitIoletdeclstmt(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitIoletdeclstmt" ):
                return visitor.visitIoletdeclstmt(self)
            else:
                return visitor.visitChildren(self)




    def ioletdeclstmt(self):

        localctx = SimpleParser.IoletdeclstmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_ioletdeclstmt)
        try:
            self.state = 172
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [52]:
                self.enterOuterAlt(localctx, 1)
                self.state = 164
                self.match(SimpleParser.ID)
                self.state = 165
                self.match(SimpleParser.T__3)
                self.state = 166
                self.ioletdeclasarg()
                pass
            elif token in [48]:
                self.enterOuterAlt(localctx, 2)
                self.state = 167
                self.match(SimpleParser.NODETYPE)
                self.state = 168
                self.parameters()
                self.state = 169
                self.match(SimpleParser.T__3)
                self.state = 170
                self.ioletdeclasarg()
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


    class ConnectionstmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def connectionelem(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SimpleParser.ConnectionelemContext)
            else:
                return self.getTypedRuleContext(SimpleParser.ConnectionelemContext,i)


        def CONNECT(self, i:int=None):
            if i is None:
                return self.getTokens(SimpleParser.CONNECT)
            else:
                return self.getToken(SimpleParser.CONNECT, i)

        def getRuleIndex(self):
            return SimpleParser.RULE_connectionstmt

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

        localctx = SimpleParser.ConnectionstmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_connectionstmt)
        self._la = 0 # Token type
        try:
            self.state = 182
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [32, 48, 52]:
                self.enterOuterAlt(localctx, 1)
                self.state = 174
                self.connectionelem()
                self.state = 177 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while True:
                    self.state = 175
                    self.match(SimpleParser.CONNECT)
                    self.state = 176
                    self.connectionelem()
                    self.state = 179 
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if not (_la==13):
                        break

                pass
            elif token in [57]:
                self.enterOuterAlt(localctx, 2)

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


    class DeclinsideContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return SimpleParser.RULE_declinside

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class FullDeclStmtInsideContext(DeclinsideContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a SimpleParser.DeclinsideContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def ID(self):
            return self.getToken(SimpleParser.ID, 0)
        def NODETYPE(self):
            return self.getToken(SimpleParser.NODETYPE, 0)
        def parameters(self):
            return self.getTypedRuleContext(SimpleParser.ParametersContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFullDeclStmtInside" ):
                listener.enterFullDeclStmtInside(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFullDeclStmtInside" ):
                listener.exitFullDeclStmtInside(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFullDeclStmtInside" ):
                return visitor.visitFullDeclStmtInside(self)
            else:
                return visitor.visitChildren(self)


    class OpDeclStmtInsideContext(DeclinsideContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a SimpleParser.DeclinsideContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def ID(self):
            return self.getToken(SimpleParser.ID, 0)
        def operation(self):
            return self.getTypedRuleContext(SimpleParser.OperationContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterOpDeclStmtInside" ):
                listener.enterOpDeclStmtInside(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitOpDeclStmtInside" ):
                listener.exitOpDeclStmtInside(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitOpDeclStmtInside" ):
                return visitor.visitOpDeclStmtInside(self)
            else:
                return visitor.visitChildren(self)


    class FastDeclStmtInsideContext(DeclinsideContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a SimpleParser.DeclinsideContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def NODETYPE(self):
            return self.getToken(SimpleParser.NODETYPE, 0)
        def parameters(self):
            return self.getTypedRuleContext(SimpleParser.ParametersContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFastDeclStmtInside" ):
                listener.enterFastDeclStmtInside(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFastDeclStmtInside" ):
                listener.exitFastDeclStmtInside(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFastDeclStmtInside" ):
                return visitor.visitFastDeclStmtInside(self)
            else:
                return visitor.visitChildren(self)



    def declinside(self):

        localctx = SimpleParser.DeclinsideContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_declinside)
        try:
            self.state = 193
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,17,self._ctx)
            if la_ == 1:
                localctx = SimpleParser.FullDeclStmtInsideContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 184
                self.match(SimpleParser.ID)
                self.state = 185
                self.match(SimpleParser.T__1)

                self.state = 186
                self.match(SimpleParser.NODETYPE)
                self.state = 187
                self.parameters()
                pass

            elif la_ == 2:
                localctx = SimpleParser.FastDeclStmtInsideContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 188
                self.match(SimpleParser.NODETYPE)
                self.state = 189
                self.parameters()
                pass

            elif la_ == 3:
                localctx = SimpleParser.OpDeclStmtInsideContext(self, localctx)
                self.enterOuterAlt(localctx, 3)
                self.state = 190
                self.match(SimpleParser.ID)
                self.state = 191
                self.match(SimpleParser.T__1)
                self.state = 192
                self.operation()
                pass


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

        def L_ANGLE(self):
            return self.getToken(SimpleParser.L_ANGLE, 0)

        def R_ANGLE(self):
            return self.getToken(SimpleParser.R_ANGLE, 0)

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(SimpleParser.ID)
            else:
                return self.getToken(SimpleParser.ID, i)

        def declinside(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SimpleParser.DeclinsideContext)
            else:
                return self.getTypedRuleContext(SimpleParser.DeclinsideContext,i)


        def getRuleIndex(self):
            return SimpleParser.RULE_connectionelem

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterConnectionelem" ):
                listener.enterConnectionelem(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitConnectionelem" ):
                listener.exitConnectionelem(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitConnectionelem" ):
                return visitor.visitConnectionelem(self)
            else:
                return visitor.visitChildren(self)




    def connectionelem(self):

        localctx = SimpleParser.ConnectionelemContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_connectionelem)
        self._la = 0 # Token type
        try:
            self.state = 215
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [32]:
                self.enterOuterAlt(localctx, 1)
                self.state = 195
                self.match(SimpleParser.L_ANGLE)
                self.state = 198
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,18,self._ctx)
                if la_ == 1:
                    self.state = 196
                    self.match(SimpleParser.ID)
                    pass

                elif la_ == 2:
                    self.state = 197
                    self.declinside()
                    pass


                self.state = 207
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==3:
                    self.state = 200
                    self.match(SimpleParser.T__2)
                    self.state = 203
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,19,self._ctx)
                    if la_ == 1:
                        self.state = 201
                        self.match(SimpleParser.ID)
                        pass

                    elif la_ == 2:
                        self.state = 202
                        self.declinside()
                        pass


                    self.state = 209
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 210
                self.match(SimpleParser.R_ANGLE)
                pass
            elif token in [48, 52]:
                self.enterOuterAlt(localctx, 2)
                self.state = 213
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,21,self._ctx)
                if la_ == 1:
                    self.state = 211
                    self.match(SimpleParser.ID)
                    pass

                elif la_ == 2:
                    self.state = 212
                    self.declinside()
                    pass


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


    class DisconnectionstmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def disconnectionelem(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SimpleParser.DisconnectionelemContext)
            else:
                return self.getTypedRuleContext(SimpleParser.DisconnectionelemContext,i)


        def DISCONNECT(self, i:int=None):
            if i is None:
                return self.getTokens(SimpleParser.DISCONNECT)
            else:
                return self.getToken(SimpleParser.DISCONNECT, i)

        def getRuleIndex(self):
            return SimpleParser.RULE_disconnectionstmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDisconnectionstmt" ):
                listener.enterDisconnectionstmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDisconnectionstmt" ):
                listener.exitDisconnectionstmt(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDisconnectionstmt" ):
                return visitor.visitDisconnectionstmt(self)
            else:
                return visitor.visitChildren(self)




    def disconnectionstmt(self):

        localctx = SimpleParser.DisconnectionstmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 28, self.RULE_disconnectionstmt)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 217
            self.disconnectionelem()
            self.state = 220 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 218
                self.match(SimpleParser.DISCONNECT)
                self.state = 219
                self.disconnectionelem()
                self.state = 222 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==14):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class DisconnectionelemContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def L_ANGLE(self):
            return self.getToken(SimpleParser.L_ANGLE, 0)

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(SimpleParser.ID)
            else:
                return self.getToken(SimpleParser.ID, i)

        def R_ANGLE(self):
            return self.getToken(SimpleParser.R_ANGLE, 0)

        def getRuleIndex(self):
            return SimpleParser.RULE_disconnectionelem

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDisconnectionelem" ):
                listener.enterDisconnectionelem(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDisconnectionelem" ):
                listener.exitDisconnectionelem(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDisconnectionelem" ):
                return visitor.visitDisconnectionelem(self)
            else:
                return visitor.visitChildren(self)




    def disconnectionelem(self):

        localctx = SimpleParser.DisconnectionelemContext(self, self._ctx, self.state)
        self.enterRule(localctx, 30, self.RULE_disconnectionelem)
        self._la = 0 # Token type
        try:
            self.state = 235
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [32]:
                self.enterOuterAlt(localctx, 1)
                self.state = 224
                self.match(SimpleParser.L_ANGLE)
                self.state = 225
                self.match(SimpleParser.ID)
                self.state = 230
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==3:
                    self.state = 226
                    self.match(SimpleParser.T__2)
                    self.state = 227
                    self.match(SimpleParser.ID)
                    self.state = 232
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 233
                self.match(SimpleParser.R_ANGLE)
                pass
            elif token in [52]:
                self.enterOuterAlt(localctx, 2)
                self.state = 234
                self.match(SimpleParser.ID)
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


    class RecallstmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def RECALL(self):
            return self.getToken(SimpleParser.RECALL, 0)

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(SimpleParser.ID)
            else:
                return self.getToken(SimpleParser.ID, i)

        def TO(self):
            return self.getToken(SimpleParser.TO, 0)

        def L_CURLY(self):
            return self.getToken(SimpleParser.L_CURLY, 0)

        def NL(self):
            return self.getToken(SimpleParser.NL, 0)

        def R_CURLY(self):
            return self.getToken(SimpleParser.R_CURLY, 0)

        def stmt(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SimpleParser.StmtContext)
            else:
                return self.getTypedRuleContext(SimpleParser.StmtContext,i)


        def subblockstmt(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SimpleParser.SubblockstmtContext)
            else:
                return self.getTypedRuleContext(SimpleParser.SubblockstmtContext,i)


        def getRuleIndex(self):
            return SimpleParser.RULE_recallstmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterRecallstmt" ):
                listener.enterRecallstmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitRecallstmt" ):
                listener.exitRecallstmt(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitRecallstmt" ):
                return visitor.visitRecallstmt(self)
            else:
                return visitor.visitChildren(self)




    def recallstmt(self):

        localctx = SimpleParser.RecallstmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 32, self.RULE_recallstmt)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 237
            self.match(SimpleParser.RECALL)
            self.state = 238
            self.match(SimpleParser.ID)
            self.state = 239
            self.match(SimpleParser.TO)
            self.state = 240
            self.match(SimpleParser.ID)
            self.state = 241
            self.match(SimpleParser.L_CURLY)
            self.state = 242
            self.match(SimpleParser.NL)
            self.state = 247
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while ((_la) & ~0x3f) == 0 and ((1 << _la) & 148900266999320576) != 0:
                self.state = 245
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [15, 18, 20, 21, 22, 24, 32, 48, 52, 57]:
                    self.state = 243
                    self.stmt()
                    pass
                elif token in [12]:
                    self.state = 244
                    self.subblockstmt()
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 249
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 250
            self.match(SimpleParser.R_CURLY)
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
            return self.getToken(SimpleParser.IF, 0)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SimpleParser.ExprContext)
            else:
                return self.getTypedRuleContext(SimpleParser.ExprContext,i)


        def suite(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SimpleParser.SuiteContext)
            else:
                return self.getTypedRuleContext(SimpleParser.SuiteContext,i)


        def END(self):
            return self.getToken(SimpleParser.END, 0)

        def ELIF(self, i:int=None):
            if i is None:
                return self.getTokens(SimpleParser.ELIF)
            else:
                return self.getToken(SimpleParser.ELIF, i)

        def ELSE(self):
            return self.getToken(SimpleParser.ELSE, 0)

        def getRuleIndex(self):
            return SimpleParser.RULE_ifstmt

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

        localctx = SimpleParser.IfstmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 34, self.RULE_ifstmt)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 252
            self.match(SimpleParser.IF)
            self.state = 253
            self.expr(0)
            self.state = 254
            self.match(SimpleParser.T__4)
            self.state = 255
            self.suite()
            self.state = 263
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==16:
                self.state = 256
                self.match(SimpleParser.ELIF)
                self.state = 257
                self.expr(0)
                self.state = 258
                self.match(SimpleParser.T__4)
                self.state = 259
                self.suite()
                self.state = 265
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 269
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==17:
                self.state = 266
                self.match(SimpleParser.ELSE)
                self.state = 267
                self.match(SimpleParser.T__4)
                self.state = 268
                self.suite()


            self.state = 271
            self.match(SimpleParser.END)
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
            return self.getToken(SimpleParser.FOR, 0)

        def INTEGER(self):
            return self.getToken(SimpleParser.INTEGER, 0)

        def suite(self):
            return self.getTypedRuleContext(SimpleParser.SuiteContext,0)


        def END(self):
            return self.getToken(SimpleParser.END, 0)

        def getRuleIndex(self):
            return SimpleParser.RULE_forstmt

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

        localctx = SimpleParser.ForstmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 36, self.RULE_forstmt)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 273
            self.match(SimpleParser.FOR)
            self.state = 274
            self.match(SimpleParser.INTEGER)
            self.state = 275
            self.match(SimpleParser.T__5)
            self.state = 276
            self.match(SimpleParser.T__4)
            self.state = 277
            self.suite()
            self.state = 278
            self.match(SimpleParser.END)
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

        def NL(self):
            return self.getToken(SimpleParser.NL, 0)

        def stmt(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SimpleParser.StmtContext)
            else:
                return self.getTypedRuleContext(SimpleParser.StmtContext,i)


        def getRuleIndex(self):
            return SimpleParser.RULE_suite

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

        localctx = SimpleParser.SuiteContext(self, self._ctx, self.state)
        self.enterRule(localctx, 38, self.RULE_suite)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 280
            self.match(SimpleParser.NL)
            self.state = 282 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 281
                self.stmt()
                self.state = 284 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (((_la) & ~0x3f) == 0 and ((1 << _la) & 148900266999316480) != 0):
                    break

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
            return SimpleParser.RULE_expr

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)


    class NumberContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a SimpleParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def NUMBER(self):
            return self.getToken(SimpleParser.NUMBER, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterNumber" ):
                listener.enterNumber(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitNumber" ):
                listener.exitNumber(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitNumber" ):
                return visitor.visitNumber(self)
            else:
                return visitor.visitChildren(self)


    class MulDivContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a SimpleParser.ExprContext
            super().__init__(parser)
            self.op = None # Token
            self.copyFrom(ctx)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SimpleParser.ExprContext)
            else:
                return self.getTypedRuleContext(SimpleParser.ExprContext,i)

        def STAR(self):
            return self.getToken(SimpleParser.STAR, 0)
        def DIV(self):
            return self.getToken(SimpleParser.DIV, 0)
        def SIGSTAR(self):
            return self.getToken(SimpleParser.SIGSTAR, 0)
        def SIGDIV(self):
            return self.getToken(SimpleParser.SIGDIV, 0)

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


    class AddSubContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a SimpleParser.ExprContext
            super().__init__(parser)
            self.op = None # Token
            self.copyFrom(ctx)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SimpleParser.ExprContext)
            else:
                return self.getTypedRuleContext(SimpleParser.ExprContext,i)

        def PLUS(self):
            return self.getToken(SimpleParser.PLUS, 0)
        def MINUS(self):
            return self.getToken(SimpleParser.MINUS, 0)
        def SIGPLUS(self):
            return self.getToken(SimpleParser.SIGPLUS, 0)
        def SIGMINUS(self):
            return self.getToken(SimpleParser.SIGMINUS, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAddSub" ):
                listener.enterAddSub(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAddSub" ):
                listener.exitAddSub(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAddSub" ):
                return visitor.visitAddSub(self)
            else:
                return visitor.visitChildren(self)


    class TestContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a SimpleParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SimpleParser.ExprContext)
            else:
                return self.getTypedRuleContext(SimpleParser.ExprContext,i)

        def EQ(self):
            return self.getToken(SimpleParser.EQ, 0)
        def NOT_EQ(self):
            return self.getToken(SimpleParser.NOT_EQ, 0)
        def R_ANGLE(self):
            return self.getToken(SimpleParser.R_ANGLE, 0)
        def L_ANGLE(self):
            return self.getToken(SimpleParser.L_ANGLE, 0)
        def MOD(self):
            return self.getToken(SimpleParser.MOD, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTest" ):
                listener.enterTest(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTest" ):
                listener.exitTest(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTest" ):
                return visitor.visitTest(self)
            else:
                return visitor.visitChildren(self)


    class ParensContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a SimpleParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def L_PAREN(self):
            return self.getToken(SimpleParser.L_PAREN, 0)
        def expr(self):
            return self.getTypedRuleContext(SimpleParser.ExprContext,0)

        def R_PAREN(self):
            return self.getToken(SimpleParser.R_PAREN, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterParens" ):
                listener.enterParens(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitParens" ):
                listener.exitParens(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitParens" ):
                return visitor.visitParens(self)
            else:
                return visitor.visitChildren(self)


    class LogicalContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a SimpleParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SimpleParser.ExprContext)
            else:
                return self.getTypedRuleContext(SimpleParser.ExprContext,i)

        def AND(self):
            return self.getToken(SimpleParser.AND, 0)
        def OR(self):
            return self.getToken(SimpleParser.OR, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLogical" ):
                listener.enterLogical(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLogical" ):
                listener.exitLogical(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLogical" ):
                return visitor.visitLogical(self)
            else:
                return visitor.visitChildren(self)



    def expr(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = SimpleParser.ExprContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 40
        self.enterRecursionRule(localctx, 40, self.RULE_expr, _p)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 292
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [54]:
                localctx = SimpleParser.NumberContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx

                self.state = 287
                self.match(SimpleParser.NUMBER)
                pass
            elif token in [26]:
                localctx = SimpleParser.ParensContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 288
                self.match(SimpleParser.L_PAREN)
                self.state = 289
                self.expr(0)
                self.state = 290
                self.match(SimpleParser.R_PAREN)
                pass
            else:
                raise NoViableAltException(self)

            self._ctx.stop = self._input.LT(-1)
            self.state = 308
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,33,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    self.state = 306
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,32,self._ctx)
                    if la_ == 1:
                        localctx = SimpleParser.MulDivContext(self, SimpleParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 294
                        if not self.precpred(self._ctx, 6):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 6)")
                        self.state = 295
                        localctx.op = self._input.LT(1)
                        _la = self._input.LA(1)
                        if not(((_la) & ~0x3f) == 0 and ((1 << _la) & 212755499974656) != 0):
                            localctx.op = self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 296
                        self.expr(7)
                        pass

                    elif la_ == 2:
                        localctx = SimpleParser.AddSubContext(self, SimpleParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 297
                        if not self.precpred(self._ctx, 5):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 5)")
                        self.state = 298
                        localctx.op = self._input.LT(1)
                        _la = self._input.LA(1)
                        if not(((_la) & ~0x3f) == 0 and ((1 << _la) & 52982716563456) != 0):
                            localctx.op = self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 299
                        self.expr(6)
                        pass

                    elif la_ == 3:
                        localctx = SimpleParser.TestContext(self, SimpleParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 300
                        if not self.precpred(self._ctx, 4):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 4)")
                        self.state = 301
                        _la = self._input.LA(1)
                        if not(((_la) & ~0x3f) == 0 and ((1 << _la) & 2263447765376) != 0):
                            self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 302
                        self.expr(5)
                        pass

                    elif la_ == 4:
                        localctx = SimpleParser.LogicalContext(self, SimpleParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 303
                        if not self.precpred(self._ctx, 3):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 3)")
                        self.state = 304
                        _la = self._input.LA(1)
                        if not(_la==42 or _la==43):
                            self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 305
                        self.expr(4)
                        pass

             
                self.state = 310
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,33,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx



    def sempred(self, localctx:RuleContext, ruleIndex:int, predIndex:int):
        if self._predicates == None:
            self._predicates = dict()
        self._predicates[20] = self.expr_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def expr_sempred(self, localctx:ExprContext, predIndex:int):
            if predIndex == 0:
                return self.precpred(self._ctx, 6)
         

            if predIndex == 1:
                return self.precpred(self._ctx, 5)
         

            if predIndex == 2:
                return self.precpred(self._ctx, 4)
         

            if predIndex == 3:
                return self.precpred(self._ctx, 3)
         




