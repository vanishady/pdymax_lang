# Generated from Pdlang.g4 by ANTLR 4.11.1
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
        4,1,56,274,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,
        2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,19,1,0,
        1,0,1,0,1,0,1,0,4,0,46,8,0,11,0,12,0,47,1,0,1,0,1,1,1,1,1,1,1,1,
        1,1,5,1,57,8,1,10,1,12,1,60,9,1,1,1,1,1,1,1,1,2,1,2,1,3,1,3,1,3,
        1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,
        1,3,1,3,1,3,3,3,89,8,3,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,4,3,4,100,
        8,4,1,5,1,5,3,5,104,8,5,1,5,1,5,1,6,1,6,1,6,5,6,111,8,6,10,6,12,
        6,114,9,6,1,6,1,6,5,6,118,8,6,10,6,12,6,121,9,6,1,6,1,6,1,6,5,6,
        126,8,6,10,6,12,6,129,9,6,3,6,131,8,6,1,7,1,7,3,7,135,8,7,1,8,1,
        8,1,8,3,8,140,8,8,3,8,142,8,8,1,9,1,9,1,9,1,9,1,9,1,9,3,9,150,8,
        9,1,10,1,10,1,10,1,10,1,10,1,10,1,10,1,10,3,10,160,8,10,1,11,1,11,
        1,11,4,11,165,8,11,11,11,12,11,166,1,12,1,12,1,12,1,12,1,12,1,12,
        1,12,1,12,1,12,3,12,178,8,12,1,13,1,13,1,13,3,13,183,8,13,1,13,1,
        13,1,13,3,13,188,8,13,5,13,190,8,13,10,13,12,13,193,9,13,1,13,1,
        13,1,13,3,13,198,8,13,3,13,200,8,13,1,14,1,14,1,14,1,14,1,14,1,14,
        1,14,5,14,209,8,14,10,14,12,14,212,9,14,1,14,1,14,1,15,1,15,1,15,
        1,15,1,15,1,15,1,15,1,15,1,15,5,15,225,8,15,10,15,12,15,228,9,15,
        1,15,1,15,1,15,3,15,233,8,15,1,15,1,15,1,16,1,16,1,16,1,16,1,16,
        1,16,1,16,1,17,1,17,4,17,246,8,17,11,17,12,17,247,1,18,1,18,1,18,
        1,18,1,18,1,18,3,18,256,8,18,1,18,1,18,1,18,1,18,1,18,1,18,5,18,
        264,8,18,10,18,12,18,267,9,18,1,19,1,19,1,19,3,19,272,8,19,1,19,
        0,1,36,20,0,2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36,38,
        0,3,3,0,33,34,36,37,41,44,2,0,33,34,36,38,2,0,7,8,29,32,293,0,40,
        1,0,0,0,2,51,1,0,0,0,4,64,1,0,0,0,6,88,1,0,0,0,8,99,1,0,0,0,10,101,
        1,0,0,0,12,130,1,0,0,0,14,134,1,0,0,0,16,141,1,0,0,0,18,143,1,0,
        0,0,20,159,1,0,0,0,22,161,1,0,0,0,24,177,1,0,0,0,26,199,1,0,0,0,
        28,201,1,0,0,0,30,215,1,0,0,0,32,236,1,0,0,0,34,243,1,0,0,0,36,255,
        1,0,0,0,38,271,1,0,0,0,40,41,5,9,0,0,41,42,5,49,0,0,42,45,5,54,0,
        0,43,46,3,2,1,0,44,46,3,6,3,0,45,43,1,0,0,0,45,44,1,0,0,0,46,47,
        1,0,0,0,47,45,1,0,0,0,47,48,1,0,0,0,48,49,1,0,0,0,49,50,5,1,0,0,
        50,1,1,0,0,0,51,52,5,10,0,0,52,53,5,49,0,0,53,54,5,25,0,0,54,58,
        5,54,0,0,55,57,3,6,3,0,56,55,1,0,0,0,57,60,1,0,0,0,58,56,1,0,0,0,
        58,59,1,0,0,0,59,61,1,0,0,0,60,58,1,0,0,0,61,62,3,4,2,0,62,63,5,
        54,0,0,63,3,1,0,0,0,64,65,5,26,0,0,65,5,1,0,0,0,66,67,3,8,4,0,67,
        68,5,54,0,0,68,89,1,0,0,0,69,70,3,20,10,0,70,71,5,54,0,0,71,89,1,
        0,0,0,72,73,3,22,11,0,73,74,5,54,0,0,74,89,1,0,0,0,75,76,3,28,14,
        0,76,77,5,54,0,0,77,89,1,0,0,0,78,79,3,30,15,0,79,80,5,54,0,0,80,
        89,1,0,0,0,81,82,3,32,16,0,82,83,5,54,0,0,83,89,1,0,0,0,84,85,3,
        38,19,0,85,86,5,54,0,0,86,89,1,0,0,0,87,89,5,54,0,0,88,66,1,0,0,
        0,88,69,1,0,0,0,88,72,1,0,0,0,88,75,1,0,0,0,88,78,1,0,0,0,88,81,
        1,0,0,0,88,84,1,0,0,0,88,87,1,0,0,0,89,7,1,0,0,0,90,91,5,49,0,0,
        91,92,5,2,0,0,92,93,5,45,0,0,93,100,3,10,5,0,94,95,5,45,0,0,95,100,
        3,10,5,0,96,97,5,49,0,0,97,98,5,2,0,0,98,100,3,16,8,0,99,90,1,0,
        0,0,99,94,1,0,0,0,99,96,1,0,0,0,100,9,1,0,0,0,101,103,5,23,0,0,102,
        104,3,12,6,0,103,102,1,0,0,0,103,104,1,0,0,0,104,105,1,0,0,0,105,
        106,5,24,0,0,106,11,1,0,0,0,107,112,3,14,7,0,108,109,5,3,0,0,109,
        111,3,14,7,0,110,108,1,0,0,0,111,114,1,0,0,0,112,110,1,0,0,0,112,
        113,1,0,0,0,113,119,1,0,0,0,114,112,1,0,0,0,115,116,5,3,0,0,116,
        118,3,18,9,0,117,115,1,0,0,0,118,121,1,0,0,0,119,117,1,0,0,0,119,
        120,1,0,0,0,120,131,1,0,0,0,121,119,1,0,0,0,122,127,3,18,9,0,123,
        124,5,3,0,0,124,126,3,18,9,0,125,123,1,0,0,0,126,129,1,0,0,0,127,
        125,1,0,0,0,127,128,1,0,0,0,128,131,1,0,0,0,129,127,1,0,0,0,130,
        107,1,0,0,0,130,122,1,0,0,0,131,13,1,0,0,0,132,135,5,50,0,0,133,
        135,3,16,8,0,134,132,1,0,0,0,134,133,1,0,0,0,135,15,1,0,0,0,136,
        142,5,51,0,0,137,139,7,0,0,0,138,140,5,51,0,0,139,138,1,0,0,0,139,
        140,1,0,0,0,140,142,1,0,0,0,141,136,1,0,0,0,141,137,1,0,0,0,142,
        17,1,0,0,0,143,144,5,48,0,0,144,149,5,2,0,0,145,146,5,45,0,0,146,
        150,3,10,5,0,147,150,3,16,8,0,148,150,5,49,0,0,149,145,1,0,0,0,149,
        147,1,0,0,0,149,148,1,0,0,0,150,19,1,0,0,0,151,152,5,49,0,0,152,
        153,5,4,0,0,153,160,3,18,9,0,154,155,5,45,0,0,155,156,3,10,5,0,156,
        157,5,4,0,0,157,158,3,18,9,0,158,160,1,0,0,0,159,151,1,0,0,0,159,
        154,1,0,0,0,160,21,1,0,0,0,161,164,3,26,13,0,162,163,5,11,0,0,163,
        165,3,26,13,0,164,162,1,0,0,0,165,166,1,0,0,0,166,164,1,0,0,0,166,
        167,1,0,0,0,167,23,1,0,0,0,168,169,5,49,0,0,169,170,5,2,0,0,170,
        171,5,45,0,0,171,178,3,10,5,0,172,173,5,45,0,0,173,178,3,10,5,0,
        174,175,5,49,0,0,175,176,5,2,0,0,176,178,3,16,8,0,177,168,1,0,0,
        0,177,172,1,0,0,0,177,174,1,0,0,0,178,25,1,0,0,0,179,182,5,29,0,
        0,180,183,5,49,0,0,181,183,3,24,12,0,182,180,1,0,0,0,182,181,1,0,
        0,0,183,191,1,0,0,0,184,187,5,3,0,0,185,188,5,49,0,0,186,188,3,24,
        12,0,187,185,1,0,0,0,187,186,1,0,0,0,188,190,1,0,0,0,189,184,1,0,
        0,0,190,193,1,0,0,0,191,189,1,0,0,0,191,192,1,0,0,0,192,194,1,0,
        0,0,193,191,1,0,0,0,194,200,5,30,0,0,195,198,5,49,0,0,196,198,3,
        24,12,0,197,195,1,0,0,0,197,196,1,0,0,0,198,200,1,0,0,0,199,179,
        1,0,0,0,199,197,1,0,0,0,200,27,1,0,0,0,201,202,5,21,0,0,202,203,
        5,49,0,0,203,204,5,22,0,0,204,205,5,49,0,0,205,206,5,25,0,0,206,
        210,5,54,0,0,207,209,3,6,3,0,208,207,1,0,0,0,209,212,1,0,0,0,210,
        208,1,0,0,0,210,211,1,0,0,0,211,213,1,0,0,0,212,210,1,0,0,0,213,
        214,3,4,2,0,214,29,1,0,0,0,215,216,5,12,0,0,216,217,3,36,18,0,217,
        218,5,5,0,0,218,226,3,34,17,0,219,220,5,13,0,0,220,221,3,36,18,0,
        221,222,5,5,0,0,222,223,3,34,17,0,223,225,1,0,0,0,224,219,1,0,0,
        0,225,228,1,0,0,0,226,224,1,0,0,0,226,227,1,0,0,0,227,232,1,0,0,
        0,228,226,1,0,0,0,229,230,5,14,0,0,230,231,5,5,0,0,231,233,3,34,
        17,0,232,229,1,0,0,0,232,233,1,0,0,0,233,234,1,0,0,0,234,235,5,20,
        0,0,235,31,1,0,0,0,236,237,5,15,0,0,237,238,5,51,0,0,238,239,5,6,
        0,0,239,240,5,5,0,0,240,241,3,34,17,0,241,242,5,20,0,0,242,33,1,
        0,0,0,243,245,5,54,0,0,244,246,3,6,3,0,245,244,1,0,0,0,246,247,1,
        0,0,0,247,245,1,0,0,0,247,248,1,0,0,0,248,35,1,0,0,0,249,250,6,18,
        -1,0,250,256,5,51,0,0,251,252,5,23,0,0,252,253,3,36,18,0,253,254,
        5,24,0,0,254,256,1,0,0,0,255,249,1,0,0,0,255,251,1,0,0,0,256,265,
        1,0,0,0,257,258,10,4,0,0,258,259,7,1,0,0,259,264,3,36,18,5,260,261,
        10,3,0,0,261,262,7,2,0,0,262,264,3,36,18,4,263,257,1,0,0,0,263,260,
        1,0,0,0,264,267,1,0,0,0,265,263,1,0,0,0,265,266,1,0,0,0,266,37,1,
        0,0,0,267,265,1,0,0,0,268,272,5,17,0,0,269,272,5,18,0,0,270,272,
        5,19,0,0,271,268,1,0,0,0,271,269,1,0,0,0,271,270,1,0,0,0,272,39,
        1,0,0,0,30,45,47,58,88,99,103,112,119,127,130,134,139,141,149,159,
        166,177,182,187,191,197,199,210,226,232,247,255,263,265,271
    ]

class PdlangParser ( Parser ):

    grammarFileName = "Pdlang.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "';'", "'='", "','", "'.'", "':'", "'rounds do'", 
                     "'>='", "'<='", "'patch'", "'block'", "'::'", "'if'", 
                     "'elif'", "'else'", "'for'", "'thisround'", "'break'", 
                     "'continue'", "'pass'", "'end'", "'recall'", "'to'", 
                     "'('", "')'", "'{'", "'}'", "'['", "']'", "'<'", "'>'", 
                     "'=='", "'!='", "'+'", "'-'", "'**'", "'*'", "'/'", 
                     "'%'", "'||'", "'&&'", "'-~'", "'+~'", "'/~'", "'*~'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "PATCH", "BLOCK", "CONNECT", "IF", "ELIF", 
                      "ELSE", "FOR", "THISROUND", "BREAK", "CONTINUE", "PASS", 
                      "END", "RECALL", "TO", "L_PAREN", "R_PAREN", "L_CURLY", 
                      "R_CURLY", "L_BRACKET", "R_BRACKET", "L_ANGLE", "R_ANGLE", 
                      "EQ", "NOT_EQ", "PLUS", "MINUS", "POW", "STAR", "DIV", 
                      "MOD", "OR", "AND", "SIGMINUS", "SIGPLUS", "SIGDIV", 
                      "SIGSTAR", "NODETYPE", "GENERALTYPE", "OBJTYPE", "INOUTID", 
                      "ID", "SYMBOL", "NUMBER", "INTEGER", "FLOAT", "NL", 
                      "WS", "COMMENT" ]

    RULE_prog = 0
    RULE_blockstmt = 1
    RULE_endofblock = 2
    RULE_stmt = 3
    RULE_declarationstmt = 4
    RULE_parameters = 5
    RULE_typedargslist = 6
    RULE_arg = 7
    RULE_operation = 8
    RULE_ioletbase = 9
    RULE_ioletdeclstmt = 10
    RULE_connectionstmt = 11
    RULE_declinside = 12
    RULE_connectionelem = 13
    RULE_recallstmt = 14
    RULE_ifstmt = 15
    RULE_forstmt = 16
    RULE_suite = 17
    RULE_expr = 18
    RULE_specialstmt = 19

    ruleNames =  [ "prog", "blockstmt", "endofblock", "stmt", "declarationstmt", 
                   "parameters", "typedargslist", "arg", "operation", "ioletbase", 
                   "ioletdeclstmt", "connectionstmt", "declinside", "connectionelem", 
                   "recallstmt", "ifstmt", "forstmt", "suite", "expr", "specialstmt" ]

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
    BLOCK=10
    CONNECT=11
    IF=12
    ELIF=13
    ELSE=14
    FOR=15
    THISROUND=16
    BREAK=17
    CONTINUE=18
    PASS=19
    END=20
    RECALL=21
    TO=22
    L_PAREN=23
    R_PAREN=24
    L_CURLY=25
    R_CURLY=26
    L_BRACKET=27
    R_BRACKET=28
    L_ANGLE=29
    R_ANGLE=30
    EQ=31
    NOT_EQ=32
    PLUS=33
    MINUS=34
    POW=35
    STAR=36
    DIV=37
    MOD=38
    OR=39
    AND=40
    SIGMINUS=41
    SIGPLUS=42
    SIGDIV=43
    SIGSTAR=44
    NODETYPE=45
    GENERALTYPE=46
    OBJTYPE=47
    INOUTID=48
    ID=49
    SYMBOL=50
    NUMBER=51
    INTEGER=52
    FLOAT=53
    NL=54
    WS=55
    COMMENT=56

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
            return self.getToken(PdlangParser.PATCH, 0)

        def ID(self):
            return self.getToken(PdlangParser.ID, 0)

        def NL(self):
            return self.getToken(PdlangParser.NL, 0)

        def blockstmt(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PdlangParser.BlockstmtContext)
            else:
                return self.getTypedRuleContext(PdlangParser.BlockstmtContext,i)


        def stmt(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PdlangParser.StmtContext)
            else:
                return self.getTypedRuleContext(PdlangParser.StmtContext,i)


        def getRuleIndex(self):
            return PdlangParser.RULE_prog

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

        localctx = PdlangParser.ProgContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_prog)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 40
            self.match(PdlangParser.PATCH)
            self.state = 41
            self.match(PdlangParser.ID)
            self.state = 42
            self.match(PdlangParser.NL)
            self.state = 45 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 45
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [10]:
                    self.state = 43
                    self.blockstmt()
                    pass
                elif token in [12, 15, 17, 18, 19, 21, 29, 45, 49, 54]:
                    self.state = 44
                    self.stmt()
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 47 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (((_la) & ~0x3f) == 0 and ((1 << _la) & 18612533374915584) != 0):
                    break

            self.state = 49
            self.match(PdlangParser.T__0)
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
            return self.getToken(PdlangParser.BLOCK, 0)

        def ID(self):
            return self.getToken(PdlangParser.ID, 0)

        def L_CURLY(self):
            return self.getToken(PdlangParser.L_CURLY, 0)

        def NL(self, i:int=None):
            if i is None:
                return self.getTokens(PdlangParser.NL)
            else:
                return self.getToken(PdlangParser.NL, i)

        def endofblock(self):
            return self.getTypedRuleContext(PdlangParser.EndofblockContext,0)


        def stmt(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PdlangParser.StmtContext)
            else:
                return self.getTypedRuleContext(PdlangParser.StmtContext,i)


        def getRuleIndex(self):
            return PdlangParser.RULE_blockstmt

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

        localctx = PdlangParser.BlockstmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_blockstmt)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 51
            self.match(PdlangParser.BLOCK)
            self.state = 52
            self.match(PdlangParser.ID)
            self.state = 53
            self.match(PdlangParser.L_CURLY)
            self.state = 54
            self.match(PdlangParser.NL)
            self.state = 58
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while ((_la) & ~0x3f) == 0 and ((1 << _la) & 18612533374914560) != 0:
                self.state = 55
                self.stmt()
                self.state = 60
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 61
            self.endofblock()
            self.state = 62
            self.match(PdlangParser.NL)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class EndofblockContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def R_CURLY(self):
            return self.getToken(PdlangParser.R_CURLY, 0)

        def getRuleIndex(self):
            return PdlangParser.RULE_endofblock

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterEndofblock" ):
                listener.enterEndofblock(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitEndofblock" ):
                listener.exitEndofblock(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitEndofblock" ):
                return visitor.visitEndofblock(self)
            else:
                return visitor.visitChildren(self)




    def endofblock(self):

        localctx = PdlangParser.EndofblockContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_endofblock)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 64
            self.match(PdlangParser.R_CURLY)
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
            return self.getTypedRuleContext(PdlangParser.DeclarationstmtContext,0)


        def NL(self):
            return self.getToken(PdlangParser.NL, 0)

        def ioletdeclstmt(self):
            return self.getTypedRuleContext(PdlangParser.IoletdeclstmtContext,0)


        def connectionstmt(self):
            return self.getTypedRuleContext(PdlangParser.ConnectionstmtContext,0)


        def recallstmt(self):
            return self.getTypedRuleContext(PdlangParser.RecallstmtContext,0)


        def ifstmt(self):
            return self.getTypedRuleContext(PdlangParser.IfstmtContext,0)


        def forstmt(self):
            return self.getTypedRuleContext(PdlangParser.ForstmtContext,0)


        def specialstmt(self):
            return self.getTypedRuleContext(PdlangParser.SpecialstmtContext,0)


        def getRuleIndex(self):
            return PdlangParser.RULE_stmt

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

        localctx = PdlangParser.StmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_stmt)
        try:
            self.state = 88
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,3,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 66
                self.declarationstmt()
                self.state = 67
                self.match(PdlangParser.NL)
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 69
                self.ioletdeclstmt()
                self.state = 70
                self.match(PdlangParser.NL)
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 72
                self.connectionstmt()
                self.state = 73
                self.match(PdlangParser.NL)
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 75
                self.recallstmt()
                self.state = 76
                self.match(PdlangParser.NL)
                pass

            elif la_ == 5:
                self.enterOuterAlt(localctx, 5)
                self.state = 78
                self.ifstmt()
                self.state = 79
                self.match(PdlangParser.NL)
                pass

            elif la_ == 6:
                self.enterOuterAlt(localctx, 6)
                self.state = 81
                self.forstmt()
                self.state = 82
                self.match(PdlangParser.NL)
                pass

            elif la_ == 7:
                self.enterOuterAlt(localctx, 7)
                self.state = 84
                self.specialstmt()
                self.state = 85
                self.match(PdlangParser.NL)
                pass

            elif la_ == 8:
                self.enterOuterAlt(localctx, 8)
                self.state = 87
                self.match(PdlangParser.NL)
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
            return PdlangParser.RULE_declarationstmt

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class FullDeclStmtContext(DeclarationstmtContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a PdlangParser.DeclarationstmtContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def ID(self):
            return self.getToken(PdlangParser.ID, 0)
        def NODETYPE(self):
            return self.getToken(PdlangParser.NODETYPE, 0)
        def parameters(self):
            return self.getTypedRuleContext(PdlangParser.ParametersContext,0)


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

        def __init__(self, parser, ctx:ParserRuleContext): # actually a PdlangParser.DeclarationstmtContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def NODETYPE(self):
            return self.getToken(PdlangParser.NODETYPE, 0)
        def parameters(self):
            return self.getTypedRuleContext(PdlangParser.ParametersContext,0)


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

        def __init__(self, parser, ctx:ParserRuleContext): # actually a PdlangParser.DeclarationstmtContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def ID(self):
            return self.getToken(PdlangParser.ID, 0)
        def operation(self):
            return self.getTypedRuleContext(PdlangParser.OperationContext,0)


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

        localctx = PdlangParser.DeclarationstmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_declarationstmt)
        try:
            self.state = 99
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,4,self._ctx)
            if la_ == 1:
                localctx = PdlangParser.FullDeclStmtContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 90
                self.match(PdlangParser.ID)
                self.state = 91
                self.match(PdlangParser.T__1)

                self.state = 92
                self.match(PdlangParser.NODETYPE)
                self.state = 93
                self.parameters()
                pass

            elif la_ == 2:
                localctx = PdlangParser.FastDeclStmtContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 94
                self.match(PdlangParser.NODETYPE)
                self.state = 95
                self.parameters()
                pass

            elif la_ == 3:
                localctx = PdlangParser.OpDeclStmtContext(self, localctx)
                self.enterOuterAlt(localctx, 3)
                self.state = 96
                self.match(PdlangParser.ID)
                self.state = 97
                self.match(PdlangParser.T__1)
                self.state = 98
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
            return self.getToken(PdlangParser.L_PAREN, 0)

        def R_PAREN(self):
            return self.getToken(PdlangParser.R_PAREN, 0)

        def typedargslist(self):
            return self.getTypedRuleContext(PdlangParser.TypedargslistContext,0)


        def getRuleIndex(self):
            return PdlangParser.RULE_parameters

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

        localctx = PdlangParser.ParametersContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_parameters)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 101
            self.match(PdlangParser.L_PAREN)
            self.state = 103
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if ((_la) & ~0x3f) == 0 and ((1 << _la) & 3692391974305792) != 0:
                self.state = 102
                self.typedargslist()


            self.state = 105
            self.match(PdlangParser.R_PAREN)
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
                return self.getTypedRuleContexts(PdlangParser.ArgContext)
            else:
                return self.getTypedRuleContext(PdlangParser.ArgContext,i)


        def ioletbase(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PdlangParser.IoletbaseContext)
            else:
                return self.getTypedRuleContext(PdlangParser.IoletbaseContext,i)


        def getRuleIndex(self):
            return PdlangParser.RULE_typedargslist

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

        localctx = PdlangParser.TypedargslistContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_typedargslist)
        self._la = 0 # Token type
        try:
            self.state = 130
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [33, 34, 36, 37, 41, 42, 43, 44, 50, 51]:
                self.enterOuterAlt(localctx, 1)
                self.state = 107
                self.arg()
                self.state = 112
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,6,self._ctx)
                while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                    if _alt==1:
                        self.state = 108
                        self.match(PdlangParser.T__2)
                        self.state = 109
                        self.arg() 
                    self.state = 114
                    self._errHandler.sync(self)
                    _alt = self._interp.adaptivePredict(self._input,6,self._ctx)

                self.state = 119
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==3:
                    self.state = 115
                    self.match(PdlangParser.T__2)
                    self.state = 116
                    self.ioletbase()
                    self.state = 121
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                pass
            elif token in [48]:
                self.enterOuterAlt(localctx, 2)
                self.state = 122
                self.ioletbase()
                self.state = 127
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==3:
                    self.state = 123
                    self.match(PdlangParser.T__2)
                    self.state = 124
                    self.ioletbase()
                    self.state = 129
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

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


    class ArgContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def SYMBOL(self):
            return self.getToken(PdlangParser.SYMBOL, 0)

        def operation(self):
            return self.getTypedRuleContext(PdlangParser.OperationContext,0)


        def getRuleIndex(self):
            return PdlangParser.RULE_arg

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

        localctx = PdlangParser.ArgContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_arg)
        try:
            self.state = 134
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [50]:
                self.enterOuterAlt(localctx, 1)
                self.state = 132
                self.match(PdlangParser.SYMBOL)
                pass
            elif token in [33, 34, 36, 37, 41, 42, 43, 44, 51]:
                self.enterOuterAlt(localctx, 2)
                self.state = 133
                self.operation()
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


    class OperationContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.op = None # Token

        def NUMBER(self):
            return self.getToken(PdlangParser.NUMBER, 0)

        def STAR(self):
            return self.getToken(PdlangParser.STAR, 0)

        def DIV(self):
            return self.getToken(PdlangParser.DIV, 0)

        def SIGSTAR(self):
            return self.getToken(PdlangParser.SIGSTAR, 0)

        def SIGDIV(self):
            return self.getToken(PdlangParser.SIGDIV, 0)

        def PLUS(self):
            return self.getToken(PdlangParser.PLUS, 0)

        def MINUS(self):
            return self.getToken(PdlangParser.MINUS, 0)

        def SIGPLUS(self):
            return self.getToken(PdlangParser.SIGPLUS, 0)

        def SIGMINUS(self):
            return self.getToken(PdlangParser.SIGMINUS, 0)

        def getRuleIndex(self):
            return PdlangParser.RULE_operation

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

        localctx = PdlangParser.OperationContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_operation)
        self._la = 0 # Token type
        try:
            self.state = 141
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [51]:
                self.enterOuterAlt(localctx, 1)
                self.state = 136
                self.match(PdlangParser.NUMBER)
                pass
            elif token in [33, 34, 36, 37, 41, 42, 43, 44]:
                self.enterOuterAlt(localctx, 2)
                self.state = 137
                localctx.op = self._input.LT(1)
                _la = self._input.LA(1)
                if not(((_la) & ~0x3f) == 0 and ((1 << _la) & 33217277067264) != 0):
                    localctx.op = self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 139
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==51:
                    self.state = 138
                    self.match(PdlangParser.NUMBER)


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


    class IoletbaseContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def INOUTID(self):
            return self.getToken(PdlangParser.INOUTID, 0)

        def NODETYPE(self):
            return self.getToken(PdlangParser.NODETYPE, 0)

        def parameters(self):
            return self.getTypedRuleContext(PdlangParser.ParametersContext,0)


        def operation(self):
            return self.getTypedRuleContext(PdlangParser.OperationContext,0)


        def ID(self):
            return self.getToken(PdlangParser.ID, 0)

        def getRuleIndex(self):
            return PdlangParser.RULE_ioletbase

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterIoletbase" ):
                listener.enterIoletbase(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitIoletbase" ):
                listener.exitIoletbase(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitIoletbase" ):
                return visitor.visitIoletbase(self)
            else:
                return visitor.visitChildren(self)




    def ioletbase(self):

        localctx = PdlangParser.IoletbaseContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_ioletbase)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 143
            self.match(PdlangParser.INOUTID)
            self.state = 144
            self.match(PdlangParser.T__1)
            self.state = 149
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [45]:
                self.state = 145
                self.match(PdlangParser.NODETYPE)
                self.state = 146
                self.parameters()
                pass
            elif token in [33, 34, 36, 37, 41, 42, 43, 44, 51]:
                self.state = 147
                self.operation()
                pass
            elif token in [49]:
                self.state = 148
                self.match(PdlangParser.ID)
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
            return self.getToken(PdlangParser.ID, 0)

        def ioletbase(self):
            return self.getTypedRuleContext(PdlangParser.IoletbaseContext,0)


        def NODETYPE(self):
            return self.getToken(PdlangParser.NODETYPE, 0)

        def parameters(self):
            return self.getTypedRuleContext(PdlangParser.ParametersContext,0)


        def getRuleIndex(self):
            return PdlangParser.RULE_ioletdeclstmt

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

        localctx = PdlangParser.IoletdeclstmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_ioletdeclstmt)
        try:
            self.state = 159
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [49]:
                self.enterOuterAlt(localctx, 1)
                self.state = 151
                self.match(PdlangParser.ID)
                self.state = 152
                self.match(PdlangParser.T__3)
                self.state = 153
                self.ioletbase()
                pass
            elif token in [45]:
                self.enterOuterAlt(localctx, 2)
                self.state = 154
                self.match(PdlangParser.NODETYPE)
                self.state = 155
                self.parameters()
                self.state = 156
                self.match(PdlangParser.T__3)
                self.state = 157
                self.ioletbase()
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
                return self.getTypedRuleContexts(PdlangParser.ConnectionelemContext)
            else:
                return self.getTypedRuleContext(PdlangParser.ConnectionelemContext,i)


        def CONNECT(self, i:int=None):
            if i is None:
                return self.getTokens(PdlangParser.CONNECT)
            else:
                return self.getToken(PdlangParser.CONNECT, i)

        def getRuleIndex(self):
            return PdlangParser.RULE_connectionstmt

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

        localctx = PdlangParser.ConnectionstmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_connectionstmt)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 161
            self.connectionelem()
            self.state = 164 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 162
                self.match(PdlangParser.CONNECT)
                self.state = 163
                self.connectionelem()
                self.state = 166 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==11):
                    break

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
            return PdlangParser.RULE_declinside

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class FullDeclStmtInsideContext(DeclinsideContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a PdlangParser.DeclinsideContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def ID(self):
            return self.getToken(PdlangParser.ID, 0)
        def NODETYPE(self):
            return self.getToken(PdlangParser.NODETYPE, 0)
        def parameters(self):
            return self.getTypedRuleContext(PdlangParser.ParametersContext,0)


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

        def __init__(self, parser, ctx:ParserRuleContext): # actually a PdlangParser.DeclinsideContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def ID(self):
            return self.getToken(PdlangParser.ID, 0)
        def operation(self):
            return self.getTypedRuleContext(PdlangParser.OperationContext,0)


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

        def __init__(self, parser, ctx:ParserRuleContext): # actually a PdlangParser.DeclinsideContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def NODETYPE(self):
            return self.getToken(PdlangParser.NODETYPE, 0)
        def parameters(self):
            return self.getTypedRuleContext(PdlangParser.ParametersContext,0)


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

        localctx = PdlangParser.DeclinsideContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_declinside)
        try:
            self.state = 177
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,16,self._ctx)
            if la_ == 1:
                localctx = PdlangParser.FullDeclStmtInsideContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 168
                self.match(PdlangParser.ID)
                self.state = 169
                self.match(PdlangParser.T__1)

                self.state = 170
                self.match(PdlangParser.NODETYPE)
                self.state = 171
                self.parameters()
                pass

            elif la_ == 2:
                localctx = PdlangParser.FastDeclStmtInsideContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 172
                self.match(PdlangParser.NODETYPE)
                self.state = 173
                self.parameters()
                pass

            elif la_ == 3:
                localctx = PdlangParser.OpDeclStmtInsideContext(self, localctx)
                self.enterOuterAlt(localctx, 3)
                self.state = 174
                self.match(PdlangParser.ID)
                self.state = 175
                self.match(PdlangParser.T__1)
                self.state = 176
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
            return self.getToken(PdlangParser.L_ANGLE, 0)

        def R_ANGLE(self):
            return self.getToken(PdlangParser.R_ANGLE, 0)

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(PdlangParser.ID)
            else:
                return self.getToken(PdlangParser.ID, i)

        def declinside(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PdlangParser.DeclinsideContext)
            else:
                return self.getTypedRuleContext(PdlangParser.DeclinsideContext,i)


        def getRuleIndex(self):
            return PdlangParser.RULE_connectionelem

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

        localctx = PdlangParser.ConnectionelemContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_connectionelem)
        self._la = 0 # Token type
        try:
            self.state = 199
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [29]:
                self.enterOuterAlt(localctx, 1)
                self.state = 179
                self.match(PdlangParser.L_ANGLE)
                self.state = 182
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,17,self._ctx)
                if la_ == 1:
                    self.state = 180
                    self.match(PdlangParser.ID)
                    pass

                elif la_ == 2:
                    self.state = 181
                    self.declinside()
                    pass


                self.state = 191
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==3:
                    self.state = 184
                    self.match(PdlangParser.T__2)
                    self.state = 187
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,18,self._ctx)
                    if la_ == 1:
                        self.state = 185
                        self.match(PdlangParser.ID)
                        pass

                    elif la_ == 2:
                        self.state = 186
                        self.declinside()
                        pass


                    self.state = 193
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 194
                self.match(PdlangParser.R_ANGLE)
                pass
            elif token in [45, 49]:
                self.enterOuterAlt(localctx, 2)
                self.state = 197
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,20,self._ctx)
                if la_ == 1:
                    self.state = 195
                    self.match(PdlangParser.ID)
                    pass

                elif la_ == 2:
                    self.state = 196
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


    class RecallstmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def RECALL(self):
            return self.getToken(PdlangParser.RECALL, 0)

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(PdlangParser.ID)
            else:
                return self.getToken(PdlangParser.ID, i)

        def TO(self):
            return self.getToken(PdlangParser.TO, 0)

        def L_CURLY(self):
            return self.getToken(PdlangParser.L_CURLY, 0)

        def NL(self):
            return self.getToken(PdlangParser.NL, 0)

        def endofblock(self):
            return self.getTypedRuleContext(PdlangParser.EndofblockContext,0)


        def stmt(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PdlangParser.StmtContext)
            else:
                return self.getTypedRuleContext(PdlangParser.StmtContext,i)


        def getRuleIndex(self):
            return PdlangParser.RULE_recallstmt

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

        localctx = PdlangParser.RecallstmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 28, self.RULE_recallstmt)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 201
            self.match(PdlangParser.RECALL)
            self.state = 202
            self.match(PdlangParser.ID)
            self.state = 203
            self.match(PdlangParser.TO)
            self.state = 204
            self.match(PdlangParser.ID)
            self.state = 205
            self.match(PdlangParser.L_CURLY)
            self.state = 206
            self.match(PdlangParser.NL)
            self.state = 210
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while ((_la) & ~0x3f) == 0 and ((1 << _la) & 18612533374914560) != 0:
                self.state = 207
                self.stmt()
                self.state = 212
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 213
            self.endofblock()
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
            return self.getToken(PdlangParser.IF, 0)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PdlangParser.ExprContext)
            else:
                return self.getTypedRuleContext(PdlangParser.ExprContext,i)


        def suite(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PdlangParser.SuiteContext)
            else:
                return self.getTypedRuleContext(PdlangParser.SuiteContext,i)


        def END(self):
            return self.getToken(PdlangParser.END, 0)

        def ELIF(self, i:int=None):
            if i is None:
                return self.getTokens(PdlangParser.ELIF)
            else:
                return self.getToken(PdlangParser.ELIF, i)

        def ELSE(self):
            return self.getToken(PdlangParser.ELSE, 0)

        def getRuleIndex(self):
            return PdlangParser.RULE_ifstmt

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

        localctx = PdlangParser.IfstmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 30, self.RULE_ifstmt)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 215
            self.match(PdlangParser.IF)
            self.state = 216
            self.expr(0)
            self.state = 217
            self.match(PdlangParser.T__4)
            self.state = 218
            self.suite()
            self.state = 226
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==13:
                self.state = 219
                self.match(PdlangParser.ELIF)
                self.state = 220
                self.expr(0)
                self.state = 221
                self.match(PdlangParser.T__4)
                self.state = 222
                self.suite()
                self.state = 228
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 232
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==14:
                self.state = 229
                self.match(PdlangParser.ELSE)
                self.state = 230
                self.match(PdlangParser.T__4)
                self.state = 231
                self.suite()


            self.state = 234
            self.match(PdlangParser.END)
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
            return self.getToken(PdlangParser.FOR, 0)

        def NUMBER(self):
            return self.getToken(PdlangParser.NUMBER, 0)

        def suite(self):
            return self.getTypedRuleContext(PdlangParser.SuiteContext,0)


        def END(self):
            return self.getToken(PdlangParser.END, 0)

        def getRuleIndex(self):
            return PdlangParser.RULE_forstmt

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

        localctx = PdlangParser.ForstmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 32, self.RULE_forstmt)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 236
            self.match(PdlangParser.FOR)
            self.state = 237
            self.match(PdlangParser.NUMBER)
            self.state = 238
            self.match(PdlangParser.T__5)
            self.state = 239
            self.match(PdlangParser.T__4)
            self.state = 240
            self.suite()
            self.state = 241
            self.match(PdlangParser.END)
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
            return self.getToken(PdlangParser.NL, 0)

        def stmt(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PdlangParser.StmtContext)
            else:
                return self.getTypedRuleContext(PdlangParser.StmtContext,i)


        def getRuleIndex(self):
            return PdlangParser.RULE_suite

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

        localctx = PdlangParser.SuiteContext(self, self._ctx, self.state)
        self.enterRule(localctx, 34, self.RULE_suite)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 243
            self.match(PdlangParser.NL)
            self.state = 245 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 244
                self.stmt()
                self.state = 247 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (((_la) & ~0x3f) == 0 and ((1 << _la) & 18612533374914560) != 0):
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
            return PdlangParser.RULE_expr

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)


    class NumberContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a PdlangParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def NUMBER(self):
            return self.getToken(PdlangParser.NUMBER, 0)

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


    class ParensExprContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a PdlangParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def L_PAREN(self):
            return self.getToken(PdlangParser.L_PAREN, 0)
        def expr(self):
            return self.getTypedRuleContext(PdlangParser.ExprContext,0)

        def R_PAREN(self):
            return self.getToken(PdlangParser.R_PAREN, 0)

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


    class MathExprContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a PdlangParser.ExprContext
            super().__init__(parser)
            self.op = None # Token
            self.copyFrom(ctx)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PdlangParser.ExprContext)
            else:
                return self.getTypedRuleContext(PdlangParser.ExprContext,i)

        def STAR(self):
            return self.getToken(PdlangParser.STAR, 0)
        def DIV(self):
            return self.getToken(PdlangParser.DIV, 0)
        def PLUS(self):
            return self.getToken(PdlangParser.PLUS, 0)
        def MINUS(self):
            return self.getToken(PdlangParser.MINUS, 0)
        def MOD(self):
            return self.getToken(PdlangParser.MOD, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMathExpr" ):
                listener.enterMathExpr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMathExpr" ):
                listener.exitMathExpr(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMathExpr" ):
                return visitor.visitMathExpr(self)
            else:
                return visitor.visitChildren(self)


    class TestExprContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a PdlangParser.ExprContext
            super().__init__(parser)
            self.testop = None # Token
            self.copyFrom(ctx)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PdlangParser.ExprContext)
            else:
                return self.getTypedRuleContext(PdlangParser.ExprContext,i)

        def EQ(self):
            return self.getToken(PdlangParser.EQ, 0)
        def NOT_EQ(self):
            return self.getToken(PdlangParser.NOT_EQ, 0)
        def R_ANGLE(self):
            return self.getToken(PdlangParser.R_ANGLE, 0)
        def L_ANGLE(self):
            return self.getToken(PdlangParser.L_ANGLE, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTestExpr" ):
                listener.enterTestExpr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTestExpr" ):
                listener.exitTestExpr(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTestExpr" ):
                return visitor.visitTestExpr(self)
            else:
                return visitor.visitChildren(self)



    def expr(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = PdlangParser.ExprContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 36
        self.enterRecursionRule(localctx, 36, self.RULE_expr, _p)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 255
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [51]:
                localctx = PdlangParser.NumberContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx

                self.state = 250
                self.match(PdlangParser.NUMBER)
                pass
            elif token in [23]:
                localctx = PdlangParser.ParensExprContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 251
                self.match(PdlangParser.L_PAREN)
                self.state = 252
                self.expr(0)
                self.state = 253
                self.match(PdlangParser.R_PAREN)
                pass
            else:
                raise NoViableAltException(self)

            self._ctx.stop = self._input.LT(-1)
            self.state = 265
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,28,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    self.state = 263
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,27,self._ctx)
                    if la_ == 1:
                        localctx = PdlangParser.MathExprContext(self, PdlangParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 257
                        if not self.precpred(self._ctx, 4):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 4)")
                        self.state = 258
                        localctx.op = self._input.LT(1)
                        _la = self._input.LA(1)
                        if not(((_la) & ~0x3f) == 0 and ((1 << _la) & 506806140928) != 0):
                            localctx.op = self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 259
                        self.expr(5)
                        pass

                    elif la_ == 2:
                        localctx = PdlangParser.TestExprContext(self, PdlangParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 260
                        if not self.precpred(self._ctx, 3):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 3)")
                        self.state = 261
                        localctx.testop = self._input.LT(1)
                        _la = self._input.LA(1)
                        if not(((_la) & ~0x3f) == 0 and ((1 << _la) & 8053064064) != 0):
                            localctx.testop = self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 262
                        self.expr(4)
                        pass

             
                self.state = 267
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,28,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx


    class SpecialstmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return PdlangParser.RULE_specialstmt

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class BreakstmtContext(SpecialstmtContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a PdlangParser.SpecialstmtContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def BREAK(self):
            return self.getToken(PdlangParser.BREAK, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBreakstmt" ):
                listener.enterBreakstmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBreakstmt" ):
                listener.exitBreakstmt(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitBreakstmt" ):
                return visitor.visitBreakstmt(self)
            else:
                return visitor.visitChildren(self)


    class ContinuestmtContext(SpecialstmtContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a PdlangParser.SpecialstmtContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def CONTINUE(self):
            return self.getToken(PdlangParser.CONTINUE, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterContinuestmt" ):
                listener.enterContinuestmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitContinuestmt" ):
                listener.exitContinuestmt(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitContinuestmt" ):
                return visitor.visitContinuestmt(self)
            else:
                return visitor.visitChildren(self)


    class PassstmtContext(SpecialstmtContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a PdlangParser.SpecialstmtContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def PASS(self):
            return self.getToken(PdlangParser.PASS, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPassstmt" ):
                listener.enterPassstmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPassstmt" ):
                listener.exitPassstmt(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPassstmt" ):
                return visitor.visitPassstmt(self)
            else:
                return visitor.visitChildren(self)



    def specialstmt(self):

        localctx = PdlangParser.SpecialstmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 38, self.RULE_specialstmt)
        try:
            self.state = 271
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [17]:
                localctx = PdlangParser.BreakstmtContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 268
                self.match(PdlangParser.BREAK)
                pass
            elif token in [18]:
                localctx = PdlangParser.ContinuestmtContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 269
                self.match(PdlangParser.CONTINUE)
                pass
            elif token in [19]:
                localctx = PdlangParser.PassstmtContext(self, localctx)
                self.enterOuterAlt(localctx, 3)
                self.state = 270
                self.match(PdlangParser.PASS)
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



    def sempred(self, localctx:RuleContext, ruleIndex:int, predIndex:int):
        if self._predicates == None:
            self._predicates = dict()
        self._predicates[18] = self.expr_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def expr_sempred(self, localctx:ExprContext, predIndex:int):
            if predIndex == 0:
                return self.precpred(self._ctx, 4)
         

            if predIndex == 1:
                return self.precpred(self._ctx, 3)
         



