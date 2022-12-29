// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SimpleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, PATCH=9, 
		INCLUDE=10, BLOCK=11, SUBBLOCK=12, CONNECT=13, DISCONNECT=14, IF=15, ELIF=16, 
		ELSE=17, FOR=18, THISROUND=19, BREAK=20, CONTINUE=21, PASS=22, END=23, 
		RECALL=24, TO=25, L_PAREN=26, R_PAREN=27, L_CURLY=28, R_CURLY=29, L_BRACKET=30, 
		R_BRACKET=31, L_ANGLE=32, R_ANGLE=33, EQ=34, NOT_EQ=35, PLUS=36, MINUS=37, 
		POW=38, STAR=39, DIV=40, MOD=41, OR=42, AND=43, SIGMINUS=44, SIGPLUS=45, 
		SIGDIV=46, SIGSTAR=47, NODETYPE=48, INOUTID=49, ID=50, SYMBOL=51, NUMBER=52, 
		INTEGER=53, FLOAT=54, NL=55, WS=56, COMMENT=57;
	public static final int
		RULE_prog = 0, RULE_blockstmt = 1, RULE_subblockstmt = 2, RULE_stmt = 3, 
		RULE_declarationstmt = 4, RULE_parameters = 5, RULE_typedargslist = 6, 
		RULE_arg = 7, RULE_ioletdeclstmt = 8, RULE_connectionstmt = 9, RULE_recallstmt = 10, 
		RULE_ifstmt = 11, RULE_forstmt = 12, RULE_suite = 13, RULE_expr = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "blockstmt", "subblockstmt", "stmt", "declarationstmt", "parameters", 
			"typedargslist", "arg", "ioletdeclstmt", "connectionstmt", "recallstmt", 
			"ifstmt", "forstmt", "suite", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "','", "'.'", "':'", "'rounds do'", "'>='", "'<='", 
			"'patch'", "'include'", "'block'", "'subblock'", "'::'", null, "'if'", 
			"'elif'", "'else'", "'for'", "'thisround'", "'break'", "'continue'", 
			"'pass'", "'end'", "'recall'", "'to'", "'('", "')'", "'{'", "'}'", "'['", 
			"']'", "'<'", "'>'", "'=='", "'!='", "'+'", "'-'", "'**'", "'*'", "'/'", 
			"'%'", "'||'", "'&&'", "'-~'", "'+~'", "'/~'", "'*~'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "PATCH", "INCLUDE", 
			"BLOCK", "SUBBLOCK", "CONNECT", "DISCONNECT", "IF", "ELIF", "ELSE", "FOR", 
			"THISROUND", "BREAK", "CONTINUE", "PASS", "END", "RECALL", "TO", "L_PAREN", 
			"R_PAREN", "L_CURLY", "R_CURLY", "L_BRACKET", "R_BRACKET", "L_ANGLE", 
			"R_ANGLE", "EQ", "NOT_EQ", "PLUS", "MINUS", "POW", "STAR", "DIV", "MOD", 
			"OR", "AND", "SIGMINUS", "SIGPLUS", "SIGDIV", "SIGSTAR", "NODETYPE", 
			"INOUTID", "ID", "SYMBOL", "NUMBER", "INTEGER", "FLOAT", "NL", "WS", 
			"COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode PATCH() { return getToken(SimpleParser.PATCH, 0); }
		public List<TerminalNode> ID() { return getTokens(SimpleParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SimpleParser.ID, i);
		}
		public List<TerminalNode> NL() { return getTokens(SimpleParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SimpleParser.NL, i);
		}
		public List<TerminalNode> INCLUDE() { return getTokens(SimpleParser.INCLUDE); }
		public TerminalNode INCLUDE(int i) {
			return getToken(SimpleParser.INCLUDE, i);
		}
		public List<BlockstmtContext> blockstmt() {
			return getRuleContexts(BlockstmtContext.class);
		}
		public BlockstmtContext blockstmt(int i) {
			return getRuleContext(BlockstmtContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INCLUDE) {
				{
				{
				setState(30);
				match(INCLUDE);
				setState(31);
				match(ID);
				setState(32);
				match(NL);
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
			match(PATCH);
			setState(39);
			match(ID);
			setState(40);
			match(NL);
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(43);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BLOCK:
					{
					setState(41);
					blockstmt();
					}
					break;
				case IF:
				case FOR:
				case BREAK:
				case CONTINUE:
				case PASS:
				case RECALL:
				case L_ANGLE:
				case NODETYPE:
				case ID:
				case NL:
					{
					setState(42);
					stmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 37436176221898752L) != 0 );
			setState(47);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockstmtContext extends ParserRuleContext {
		public TerminalNode BLOCK() { return getToken(SimpleParser.BLOCK, 0); }
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode L_CURLY() { return getToken(SimpleParser.L_CURLY, 0); }
		public List<TerminalNode> NL() { return getTokens(SimpleParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SimpleParser.NL, i);
		}
		public TerminalNode R_CURLY() { return getToken(SimpleParser.R_CURLY, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<SubblockstmtContext> subblockstmt() {
			return getRuleContexts(SubblockstmtContext.class);
		}
		public SubblockstmtContext subblockstmt(int i) {
			return getRuleContext(SubblockstmtContext.class,i);
		}
		public BlockstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterBlockstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitBlockstmt(this);
		}
	}

	public final BlockstmtContext blockstmt() throws RecognitionException {
		BlockstmtContext _localctx = new BlockstmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_blockstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(BLOCK);
			setState(50);
			match(ID);
			setState(51);
			match(L_CURLY);
			setState(52);
			match(NL);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 37436176221900800L) != 0) {
				{
				setState(55);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
				case FOR:
				case BREAK:
				case CONTINUE:
				case PASS:
				case RECALL:
				case L_ANGLE:
				case NODETYPE:
				case ID:
				case NL:
					{
					setState(53);
					stmt();
					}
					break;
				case SUBBLOCK:
					{
					setState(54);
					subblockstmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			match(R_CURLY);
			setState(61);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubblockstmtContext extends ParserRuleContext {
		public TerminalNode SUBBLOCK() { return getToken(SimpleParser.SUBBLOCK, 0); }
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode L_CURLY() { return getToken(SimpleParser.L_CURLY, 0); }
		public List<TerminalNode> NL() { return getTokens(SimpleParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SimpleParser.NL, i);
		}
		public TerminalNode R_CURLY() { return getToken(SimpleParser.R_CURLY, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public SubblockstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subblockstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterSubblockstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitSubblockstmt(this);
		}
	}

	public final SubblockstmtContext subblockstmt() throws RecognitionException {
		SubblockstmtContext _localctx = new SubblockstmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_subblockstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(SUBBLOCK);
			setState(64);
			match(ID);
			setState(65);
			match(L_CURLY);
			setState(66);
			match(NL);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 37436176221896704L) != 0) {
				{
				{
				setState(67);
				stmt();
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
			match(R_CURLY);
			setState(74);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StmtContext extends ParserRuleContext {
		public DeclarationstmtContext declarationstmt() {
			return getRuleContext(DeclarationstmtContext.class,0);
		}
		public TerminalNode NL() { return getToken(SimpleParser.NL, 0); }
		public IoletdeclstmtContext ioletdeclstmt() {
			return getRuleContext(IoletdeclstmtContext.class,0);
		}
		public ConnectionstmtContext connectionstmt() {
			return getRuleContext(ConnectionstmtContext.class,0);
		}
		public RecallstmtContext recallstmt() {
			return getRuleContext(RecallstmtContext.class,0);
		}
		public IfstmtContext ifstmt() {
			return getRuleContext(IfstmtContext.class,0);
		}
		public ForstmtContext forstmt() {
			return getRuleContext(ForstmtContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(SimpleParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(SimpleParser.CONTINUE, 0); }
		public TerminalNode PASS() { return getToken(SimpleParser.PASS, 0); }
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stmt);
		try {
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				declarationstmt();
				setState(77);
				match(NL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				ioletdeclstmt();
				setState(80);
				match(NL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				connectionstmt();
				setState(83);
				match(NL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
				recallstmt();
				setState(86);
				match(NL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(88);
				ifstmt();
				setState(89);
				match(NL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(91);
				forstmt();
				setState(92);
				match(NL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(94);
				match(BREAK);
				setState(95);
				match(NL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(96);
				match(CONTINUE);
				setState(97);
				match(NL);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(98);
				match(PASS);
				setState(99);
				match(NL);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(100);
				match(NL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationstmtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode NODETYPE() { return getToken(SimpleParser.NODETYPE, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclarationstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterDeclarationstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitDeclarationstmt(this);
		}
	}

	public final DeclarationstmtContext declarationstmt() throws RecognitionException {
		DeclarationstmtContext _localctx = new DeclarationstmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declarationstmt);
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(ID);
				setState(104);
				match(T__1);
				{
				setState(105);
				match(NODETYPE);
				setState(106);
				parameters();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(ID);
				setState(108);
				match(T__1);
				setState(109);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				match(NODETYPE);
				setState(111);
				parameters();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public TerminalNode L_PAREN() { return getToken(SimpleParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(SimpleParser.R_PAREN, 0); }
		public TypedargslistContext typedargslist() {
			return getRuleContext(TypedargslistContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(L_PAREN);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SYMBOL || _la==NUMBER) {
				{
				setState(115);
				typedargslist();
				}
			}

			setState(118);
			match(R_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypedargslistContext extends ParserRuleContext {
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public List<TerminalNode> INOUTID() { return getTokens(SimpleParser.INOUTID); }
		public TerminalNode INOUTID(int i) {
			return getToken(SimpleParser.INOUTID, i);
		}
		public List<TerminalNode> NODETYPE() { return getTokens(SimpleParser.NODETYPE); }
		public TerminalNode NODETYPE(int i) {
			return getToken(SimpleParser.NODETYPE, i);
		}
		public List<ParametersContext> parameters() {
			return getRuleContexts(ParametersContext.class);
		}
		public ParametersContext parameters(int i) {
			return getRuleContext(ParametersContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TypedargslistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedargslist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterTypedargslist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitTypedargslist(this);
		}
	}

	public final TypedargslistContext typedargslist() throws RecognitionException {
		TypedargslistContext _localctx = new TypedargslistContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_typedargslist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			arg();
			setState(125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(121);
					match(T__2);
					setState(122);
					arg();
					}
					} 
				}
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(128);
				match(T__2);
				setState(129);
				match(INOUTID);
				setState(130);
				match(T__1);
				setState(134);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(131);
					match(NODETYPE);
					setState(132);
					parameters();
					}
					break;
				case 2:
					{
					setState(133);
					expr(0);
					}
					break;
				}
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgContext extends ParserRuleContext {
		public TerminalNode SYMBOL() { return getToken(SimpleParser.SYMBOL, 0); }
		public TerminalNode NUMBER() { return getToken(SimpleParser.NUMBER, 0); }
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitArg(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_arg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_la = _input.LA(1);
			if ( !(_la==SYMBOL || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IoletdeclstmtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode INOUTID() { return getToken(SimpleParser.INOUTID, 0); }
		public List<TerminalNode> NODETYPE() { return getTokens(SimpleParser.NODETYPE); }
		public TerminalNode NODETYPE(int i) {
			return getToken(SimpleParser.NODETYPE, i);
		}
		public List<ParametersContext> parameters() {
			return getRuleContexts(ParametersContext.class);
		}
		public ParametersContext parameters(int i) {
			return getRuleContext(ParametersContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IoletdeclstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ioletdeclstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterIoletdeclstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitIoletdeclstmt(this);
		}
	}

	public final IoletdeclstmtContext ioletdeclstmt() throws RecognitionException {
		IoletdeclstmtContext _localctx = new IoletdeclstmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ioletdeclstmt);
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(ID);
				setState(144);
				match(T__3);
				setState(145);
				match(INOUTID);
				setState(146);
				match(T__1);
				setState(150);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(147);
					match(NODETYPE);
					setState(148);
					parameters();
					}
					break;
				case 2:
					{
					setState(149);
					expr(0);
					}
					break;
				}
				}
				break;
			case NODETYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(NODETYPE);
				setState(153);
				parameters();
				setState(154);
				match(T__3);
				setState(155);
				match(INOUTID);
				setState(156);
				match(T__1);
				setState(160);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(157);
					match(NODETYPE);
					setState(158);
					parameters();
					}
					break;
				case 2:
					{
					setState(159);
					expr(0);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConnectionstmtContext extends ParserRuleContext {
		public List<TerminalNode> L_ANGLE() { return getTokens(SimpleParser.L_ANGLE); }
		public TerminalNode L_ANGLE(int i) {
			return getToken(SimpleParser.L_ANGLE, i);
		}
		public List<TerminalNode> R_ANGLE() { return getTokens(SimpleParser.R_ANGLE); }
		public TerminalNode R_ANGLE(int i) {
			return getToken(SimpleParser.R_ANGLE, i);
		}
		public List<TerminalNode> CONNECT() { return getTokens(SimpleParser.CONNECT); }
		public TerminalNode CONNECT(int i) {
			return getToken(SimpleParser.CONNECT, i);
		}
		public List<TerminalNode> ID() { return getTokens(SimpleParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SimpleParser.ID, i);
		}
		public List<DeclarationstmtContext> declarationstmt() {
			return getRuleContexts(DeclarationstmtContext.class);
		}
		public DeclarationstmtContext declarationstmt(int i) {
			return getRuleContext(DeclarationstmtContext.class,i);
		}
		public List<TerminalNode> DISCONNECT() { return getTokens(SimpleParser.DISCONNECT); }
		public TerminalNode DISCONNECT(int i) {
			return getToken(SimpleParser.DISCONNECT, i);
		}
		public ConnectionstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connectionstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterConnectionstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitConnectionstmt(this);
		}
	}

	public final ConnectionstmtContext connectionstmt() throws RecognitionException {
		ConnectionstmtContext _localctx = new ConnectionstmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_connectionstmt);
		int _la;
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case L_ANGLE:
					{
					setState(164);
					match(L_ANGLE);
					setState(167);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						setState(165);
						match(ID);
						}
						break;
					case 2:
						{
						setState(166);
						declarationstmt();
						}
						break;
					}
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(169);
						match(T__2);
						setState(172);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
						case 1:
							{
							setState(170);
							match(ID);
							}
							break;
						case 2:
							{
							setState(171);
							declarationstmt();
							}
							break;
						}
						}
						}
						setState(178);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(179);
					match(R_ANGLE);
					}
					break;
				case NODETYPE:
				case ID:
					{
					setState(182);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						setState(180);
						match(ID);
						}
						break;
					case 2:
						{
						setState(181);
						declarationstmt();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(209); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(186);
					match(CONNECT);
					setState(207);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case L_ANGLE:
						{
						setState(187);
						match(L_ANGLE);
						setState(190);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
						case 1:
							{
							setState(188);
							match(ID);
							}
							break;
						case 2:
							{
							setState(189);
							declarationstmt();
							}
							break;
						}
						setState(199);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__2) {
							{
							{
							setState(192);
							match(T__2);
							setState(195);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
							case 1:
								{
								setState(193);
								match(ID);
								}
								break;
							case 2:
								{
								setState(194);
								declarationstmt();
								}
								break;
							}
							}
							}
							setState(201);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(202);
						match(R_ANGLE);
						}
						break;
					case NODETYPE:
					case ID:
						{
						setState(205);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
						case 1:
							{
							setState(203);
							match(ID);
							}
							break;
						case 2:
							{
							setState(204);
							declarationstmt();
							}
							break;
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(211); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CONNECT );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case L_ANGLE:
					{
					setState(213);
					match(L_ANGLE);
					setState(214);
					match(ID);
					setState(219);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(215);
						match(T__2);
						setState(216);
						match(ID);
						}
						}
						setState(221);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(222);
					match(R_ANGLE);
					}
					break;
				case ID:
					{
					setState(223);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(240); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(226);
					match(DISCONNECT);
					setState(238);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case L_ANGLE:
						{
						setState(227);
						match(L_ANGLE);
						setState(228);
						match(ID);
						setState(233);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__2) {
							{
							{
							setState(229);
							match(T__2);
							setState(230);
							match(ID);
							}
							}
							setState(235);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(236);
						match(R_ANGLE);
						}
						break;
					case ID:
						{
						setState(237);
						match(ID);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(242); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DISCONNECT );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RecallstmtContext extends ParserRuleContext {
		public TerminalNode RECALL() { return getToken(SimpleParser.RECALL, 0); }
		public List<TerminalNode> ID() { return getTokens(SimpleParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SimpleParser.ID, i);
		}
		public TerminalNode TO() { return getToken(SimpleParser.TO, 0); }
		public TerminalNode L_CURLY() { return getToken(SimpleParser.L_CURLY, 0); }
		public TerminalNode NL() { return getToken(SimpleParser.NL, 0); }
		public TerminalNode R_CURLY() { return getToken(SimpleParser.R_CURLY, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<SubblockstmtContext> subblockstmt() {
			return getRuleContexts(SubblockstmtContext.class);
		}
		public SubblockstmtContext subblockstmt(int i) {
			return getRuleContext(SubblockstmtContext.class,i);
		}
		public RecallstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recallstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterRecallstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitRecallstmt(this);
		}
	}

	public final RecallstmtContext recallstmt() throws RecognitionException {
		RecallstmtContext _localctx = new RecallstmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_recallstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(RECALL);
			setState(247);
			match(ID);
			setState(248);
			match(TO);
			setState(249);
			match(ID);
			setState(250);
			match(L_CURLY);
			setState(251);
			match(NL);
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 37436176221900800L) != 0) {
				{
				setState(254);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
				case FOR:
				case BREAK:
				case CONTINUE:
				case PASS:
				case RECALL:
				case L_ANGLE:
				case NODETYPE:
				case ID:
				case NL:
					{
					setState(252);
					stmt();
					}
					break;
				case SUBBLOCK:
					{
					setState(253);
					subblockstmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(259);
			match(R_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfstmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SimpleParser.IF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<SuiteContext> suite() {
			return getRuleContexts(SuiteContext.class);
		}
		public SuiteContext suite(int i) {
			return getRuleContext(SuiteContext.class,i);
		}
		public TerminalNode END() { return getToken(SimpleParser.END, 0); }
		public List<TerminalNode> ELIF() { return getTokens(SimpleParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(SimpleParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(SimpleParser.ELSE, 0); }
		public IfstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterIfstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitIfstmt(this);
		}
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(IF);
			setState(262);
			expr(0);
			setState(263);
			match(T__4);
			setState(264);
			suite();
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(265);
				match(ELIF);
				setState(266);
				expr(0);
				setState(267);
				match(T__4);
				setState(268);
				suite();
				}
				}
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(275);
				match(ELSE);
				setState(276);
				match(T__4);
				setState(277);
				suite();
				}
			}

			setState(280);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForstmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(SimpleParser.FOR, 0); }
		public TerminalNode INTEGER() { return getToken(SimpleParser.INTEGER, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public TerminalNode END() { return getToken(SimpleParser.END, 0); }
		public ForstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterForstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitForstmt(this);
		}
	}

	public final ForstmtContext forstmt() throws RecognitionException {
		ForstmtContext _localctx = new ForstmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_forstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(FOR);
			setState(283);
			match(INTEGER);
			setState(284);
			match(T__5);
			setState(285);
			match(T__4);
			setState(286);
			suite();
			setState(287);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SuiteContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(SimpleParser.NL, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public SuiteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterSuite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitSuite(this);
		}
	}

	public final SuiteContext suite() throws RecognitionException {
		SuiteContext _localctx = new SuiteContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_suite);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(NL);
			setState(291); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(290);
				stmt();
				}
				}
				setState(293); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 37436176221896704L) != 0 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ExprContext {
		public TerminalNode NUMBER() { return getToken(SimpleParser.NUMBER, 0); }
		public NumberContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitNumber(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DynamicAssignContext extends ExprContext {
		public TerminalNode NODETYPE() { return getToken(SimpleParser.NODETYPE, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public DynamicAssignContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterDynamicAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitDynamicAssign(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode STAR() { return getToken(SimpleParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(SimpleParser.DIV, 0); }
		public TerminalNode SIGSTAR() { return getToken(SimpleParser.SIGSTAR, 0); }
		public TerminalNode SIGDIV() { return getToken(SimpleParser.SIGDIV, 0); }
		public MulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitMulDiv(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(SimpleParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SimpleParser.MINUS, 0); }
		public TerminalNode SIGPLUS() { return getToken(SimpleParser.SIGPLUS, 0); }
		public TerminalNode SIGMINUS() { return getToken(SimpleParser.SIGMINUS, 0); }
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitAddSub(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TestContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(SimpleParser.EQ, 0); }
		public TerminalNode NOT_EQ() { return getToken(SimpleParser.NOT_EQ, 0); }
		public TerminalNode R_ANGLE() { return getToken(SimpleParser.R_ANGLE, 0); }
		public TerminalNode L_ANGLE() { return getToken(SimpleParser.L_ANGLE, 0); }
		public TerminalNode MOD() { return getToken(SimpleParser.MOD, 0); }
		public TestContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterTest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitTest(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParensContext extends ExprContext {
		public TerminalNode L_PAREN() { return getToken(SimpleParser.L_PAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(SimpleParser.R_PAREN, 0); }
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitParens(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(SimpleParser.AND, 0); }
		public TerminalNode OR() { return getToken(SimpleParser.OR, 0); }
		public LogicalContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterLogical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitLogical(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitId(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(296);
				match(NUMBER);
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(297);
				match(ID);
				}
				break;
			case NODETYPE:
				{
				_localctx = new DynamicAssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(298);
				match(NODETYPE);
				setState(299);
				parameters();
				}
				break;
			case L_PAREN:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(300);
				match(L_PAREN);
				setState(301);
				expr(0);
				setState(302);
				match(R_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(320);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(318);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(306);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(307);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 212755499974656L) != 0) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(308);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(309);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(310);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 52982716563456L) != 0) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(311);
						expr(8);
						}
						break;
					case 3:
						{
						_localctx = new TestContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(312);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(313);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 2263447765376L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(314);
						expr(7);
						}
						break;
					case 4:
						{
						_localctx = new LogicalContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(315);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(316);
						_la = _input.LA(1);
						if ( !(_la==OR || _la==AND) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(317);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(322);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00019\u0144\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000\"\b\u0000\n\u0000\f\u0000%\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u0000,\b\u0000"+
		"\u000b\u0000\f\u0000-\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u00018\b\u0001"+
		"\n\u0001\f\u0001;\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002E\b\u0002"+
		"\n\u0002\f\u0002H\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003f\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"q\b\u0004\u0001\u0005\u0001\u0005\u0003\u0005u\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006|\b\u0006\n\u0006"+
		"\f\u0006\u007f\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u0087\b\u0006\u0005\u0006\u0089\b"+
		"\u0006\n\u0006\f\u0006\u008c\t\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0097\b\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00a1\b\b\u0003"+
		"\b\u00a3\b\b\u0001\t\u0001\t\u0001\t\u0003\t\u00a8\b\t\u0001\t\u0001\t"+
		"\u0001\t\u0003\t\u00ad\b\t\u0005\t\u00af\b\t\n\t\f\t\u00b2\t\t\u0001\t"+
		"\u0001\t\u0001\t\u0003\t\u00b7\b\t\u0003\t\u00b9\b\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u00bf\b\t\u0001\t\u0001\t\u0001\t\u0003\t\u00c4\b\t"+
		"\u0005\t\u00c6\b\t\n\t\f\t\u00c9\t\t\u0001\t\u0001\t\u0001\t\u0003\t\u00ce"+
		"\b\t\u0003\t\u00d0\b\t\u0004\t\u00d2\b\t\u000b\t\f\t\u00d3\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0005\t\u00da\b\t\n\t\f\t\u00dd\t\t\u0001\t\u0001\t"+
		"\u0003\t\u00e1\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00e8"+
		"\b\t\n\t\f\t\u00eb\t\t\u0001\t\u0001\t\u0003\t\u00ef\b\t\u0004\t\u00f1"+
		"\b\t\u000b\t\f\t\u00f2\u0003\t\u00f5\b\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00ff\b\n\n\n\f\n\u0102\t\n"+
		"\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u010f"+
		"\b\u000b\n\u000b\f\u000b\u0112\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u0117\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0004\r\u0124\b\r\u000b"+
		"\r\f\r\u0125\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0131\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0005\u000e\u013f\b\u000e\n\u000e\f\u000e\u0142\t\u000e\u0001\u000e\u0000"+
		"\u0001\u001c\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u0000\u0005\u0001\u000034\u0002\u0000\'(./\u0002"+
		"\u0000$%,-\u0003\u0000\u0007\b #))\u0001\u0000*+\u0169\u0000#\u0001\u0000"+
		"\u0000\u0000\u00021\u0001\u0000\u0000\u0000\u0004?\u0001\u0000\u0000\u0000"+
		"\u0006e\u0001\u0000\u0000\u0000\bp\u0001\u0000\u0000\u0000\nr\u0001\u0000"+
		"\u0000\u0000\fx\u0001\u0000\u0000\u0000\u000e\u008d\u0001\u0000\u0000"+
		"\u0000\u0010\u00a2\u0001\u0000\u0000\u0000\u0012\u00f4\u0001\u0000\u0000"+
		"\u0000\u0014\u00f6\u0001\u0000\u0000\u0000\u0016\u0105\u0001\u0000\u0000"+
		"\u0000\u0018\u011a\u0001\u0000\u0000\u0000\u001a\u0121\u0001\u0000\u0000"+
		"\u0000\u001c\u0130\u0001\u0000\u0000\u0000\u001e\u001f\u0005\n\u0000\u0000"+
		"\u001f \u00052\u0000\u0000 \"\u00057\u0000\u0000!\u001e\u0001\u0000\u0000"+
		"\u0000\"%\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#$\u0001\u0000"+
		"\u0000\u0000$&\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000&\'\u0005"+
		"\t\u0000\u0000\'(\u00052\u0000\u0000(+\u00057\u0000\u0000),\u0003\u0002"+
		"\u0001\u0000*,\u0003\u0006\u0003\u0000+)\u0001\u0000\u0000\u0000+*\u0001"+
		"\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000"+
		"-.\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0005\u0001\u0000"+
		"\u00000\u0001\u0001\u0000\u0000\u000012\u0005\u000b\u0000\u000023\u0005"+
		"2\u0000\u000034\u0005\u001c\u0000\u000049\u00057\u0000\u000058\u0003\u0006"+
		"\u0003\u000068\u0003\u0004\u0002\u000075\u0001\u0000\u0000\u000076\u0001"+
		"\u0000\u0000\u00008;\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000"+
		"9:\u0001\u0000\u0000\u0000:<\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000"+
		"\u0000<=\u0005\u001d\u0000\u0000=>\u00057\u0000\u0000>\u0003\u0001\u0000"+
		"\u0000\u0000?@\u0005\f\u0000\u0000@A\u00052\u0000\u0000AB\u0005\u001c"+
		"\u0000\u0000BF\u00057\u0000\u0000CE\u0003\u0006\u0003\u0000DC\u0001\u0000"+
		"\u0000\u0000EH\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001"+
		"\u0000\u0000\u0000GI\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000"+
		"IJ\u0005\u001d\u0000\u0000JK\u00057\u0000\u0000K\u0005\u0001\u0000\u0000"+
		"\u0000LM\u0003\b\u0004\u0000MN\u00057\u0000\u0000Nf\u0001\u0000\u0000"+
		"\u0000OP\u0003\u0010\b\u0000PQ\u00057\u0000\u0000Qf\u0001\u0000\u0000"+
		"\u0000RS\u0003\u0012\t\u0000ST\u00057\u0000\u0000Tf\u0001\u0000\u0000"+
		"\u0000UV\u0003\u0014\n\u0000VW\u00057\u0000\u0000Wf\u0001\u0000\u0000"+
		"\u0000XY\u0003\u0016\u000b\u0000YZ\u00057\u0000\u0000Zf\u0001\u0000\u0000"+
		"\u0000[\\\u0003\u0018\f\u0000\\]\u00057\u0000\u0000]f\u0001\u0000\u0000"+
		"\u0000^_\u0005\u0014\u0000\u0000_f\u00057\u0000\u0000`a\u0005\u0015\u0000"+
		"\u0000af\u00057\u0000\u0000bc\u0005\u0016\u0000\u0000cf\u00057\u0000\u0000"+
		"df\u00057\u0000\u0000eL\u0001\u0000\u0000\u0000eO\u0001\u0000\u0000\u0000"+
		"eR\u0001\u0000\u0000\u0000eU\u0001\u0000\u0000\u0000eX\u0001\u0000\u0000"+
		"\u0000e[\u0001\u0000\u0000\u0000e^\u0001\u0000\u0000\u0000e`\u0001\u0000"+
		"\u0000\u0000eb\u0001\u0000\u0000\u0000ed\u0001\u0000\u0000\u0000f\u0007"+
		"\u0001\u0000\u0000\u0000gh\u00052\u0000\u0000hi\u0005\u0002\u0000\u0000"+
		"ij\u00050\u0000\u0000jq\u0003\n\u0005\u0000kl\u00052\u0000\u0000lm\u0005"+
		"\u0002\u0000\u0000mq\u0003\u001c\u000e\u0000no\u00050\u0000\u0000oq\u0003"+
		"\n\u0005\u0000pg\u0001\u0000\u0000\u0000pk\u0001\u0000\u0000\u0000pn\u0001"+
		"\u0000\u0000\u0000q\t\u0001\u0000\u0000\u0000rt\u0005\u001a\u0000\u0000"+
		"su\u0003\f\u0006\u0000ts\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000"+
		"uv\u0001\u0000\u0000\u0000vw\u0005\u001b\u0000\u0000w\u000b\u0001\u0000"+
		"\u0000\u0000x}\u0003\u000e\u0007\u0000yz\u0005\u0003\u0000\u0000z|\u0003"+
		"\u000e\u0007\u0000{y\u0001\u0000\u0000\u0000|\u007f\u0001\u0000\u0000"+
		"\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u008a\u0001"+
		"\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u0081\u0005\u0003"+
		"\u0000\u0000\u0081\u0082\u00051\u0000\u0000\u0082\u0086\u0005\u0002\u0000"+
		"\u0000\u0083\u0084\u00050\u0000\u0000\u0084\u0087\u0003\n\u0005\u0000"+
		"\u0085\u0087\u0003\u001c\u000e\u0000\u0086\u0083\u0001\u0000\u0000\u0000"+
		"\u0086\u0085\u0001\u0000\u0000\u0000\u0087\u0089\u0001\u0000\u0000\u0000"+
		"\u0088\u0080\u0001\u0000\u0000\u0000\u0089\u008c\u0001\u0000\u0000\u0000"+
		"\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000"+
		"\u008b\r\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008d"+
		"\u008e\u0007\u0000\u0000\u0000\u008e\u000f\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u00052\u0000\u0000\u0090\u0091\u0005\u0004\u0000\u0000\u0091\u0092"+
		"\u00051\u0000\u0000\u0092\u0096\u0005\u0002\u0000\u0000\u0093\u0094\u0005"+
		"0\u0000\u0000\u0094\u0097\u0003\n\u0005\u0000\u0095\u0097\u0003\u001c"+
		"\u000e\u0000\u0096\u0093\u0001\u0000\u0000\u0000\u0096\u0095\u0001\u0000"+
		"\u0000\u0000\u0097\u00a3\u0001\u0000\u0000\u0000\u0098\u0099\u00050\u0000"+
		"\u0000\u0099\u009a\u0003\n\u0005\u0000\u009a\u009b\u0005\u0004\u0000\u0000"+
		"\u009b\u009c\u00051\u0000\u0000\u009c\u00a0\u0005\u0002\u0000\u0000\u009d"+
		"\u009e\u00050\u0000\u0000\u009e\u00a1\u0003\n\u0005\u0000\u009f\u00a1"+
		"\u0003\u001c\u000e\u0000\u00a0\u009d\u0001\u0000\u0000\u0000\u00a0\u009f"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a3\u0001\u0000\u0000\u0000\u00a2\u008f"+
		"\u0001\u0000\u0000\u0000\u00a2\u0098\u0001\u0000\u0000\u0000\u00a3\u0011"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a7\u0005 \u0000\u0000\u00a5\u00a8\u0005"+
		"2\u0000\u0000\u00a6\u00a8\u0003\b\u0004\u0000\u00a7\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a8\u00b0\u0001\u0000"+
		"\u0000\u0000\u00a9\u00ac\u0005\u0003\u0000\u0000\u00aa\u00ad\u00052\u0000"+
		"\u0000\u00ab\u00ad\u0003\b\u0004\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000"+
		"\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ad\u00af\u0001\u0000\u0000\u0000"+
		"\u00ae\u00a9\u0001\u0000\u0000\u0000\u00af\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b1\u00b3\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b9\u0005!\u0000\u0000\u00b4\u00b7\u00052\u0000\u0000\u00b5\u00b7"+
		"\u0003\b\u0004\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b9\u0001\u0000\u0000\u0000\u00b8\u00a4\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b9\u00d1\u0001"+
		"\u0000\u0000\u0000\u00ba\u00cf\u0005\r\u0000\u0000\u00bb\u00be\u0005 "+
		"\u0000\u0000\u00bc\u00bf\u00052\u0000\u0000\u00bd\u00bf\u0003\b\u0004"+
		"\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00be\u00bd\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c7\u0001\u0000\u0000\u0000\u00c0\u00c3\u0005\u0003\u0000"+
		"\u0000\u00c1\u00c4\u00052\u0000\u0000\u00c2\u00c4\u0003\b\u0004\u0000"+
		"\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c6\u0001\u0000\u0000\u0000\u00c5\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00ca\u0001\u0000\u0000\u0000"+
		"\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca\u00d0\u0005!\u0000\u0000\u00cb"+
		"\u00ce\u00052\u0000\u0000\u00cc\u00ce\u0003\b\u0004\u0000\u00cd\u00cb"+
		"\u0001\u0000\u0000\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce\u00d0"+
		"\u0001\u0000\u0000\u0000\u00cf\u00bb\u0001\u0000\u0000\u0000\u00cf\u00cd"+
		"\u0001\u0000\u0000\u0000\u00d0\u00d2\u0001\u0000\u0000\u0000\u00d1\u00ba"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00f5"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005 \u0000\u0000\u00d6\u00db\u0005"+
		"2\u0000\u0000\u00d7\u00d8\u0005\u0003\u0000\u0000\u00d8\u00da\u00052\u0000"+
		"\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da\u00dd\u0001\u0000\u0000"+
		"\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000"+
		"\u0000\u00dc\u00de\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000"+
		"\u0000\u00de\u00e1\u0005!\u0000\u0000\u00df\u00e1\u00052\u0000\u0000\u00e0"+
		"\u00d5\u0001\u0000\u0000\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1"+
		"\u00f0\u0001\u0000\u0000\u0000\u00e2\u00ee\u0005\u000e\u0000\u0000\u00e3"+
		"\u00e4\u0005 \u0000\u0000\u00e4\u00e9\u00052\u0000\u0000\u00e5\u00e6\u0005"+
		"\u0003\u0000\u0000\u00e6\u00e8\u00052\u0000\u0000\u00e7\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e8\u00eb\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000"+
		"\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00ec\u0001\u0000"+
		"\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00ec\u00ef\u0005!\u0000"+
		"\u0000\u00ed\u00ef\u00052\u0000\u0000\u00ee\u00e3\u0001\u0000\u0000\u0000"+
		"\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f0\u00e2\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f5\u0001\u0000\u0000\u0000\u00f4\u00b8\u0001\u0000\u0000\u0000"+
		"\u00f4\u00e0\u0001\u0000\u0000\u0000\u00f5\u0013\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f7\u0005\u0018\u0000\u0000\u00f7\u00f8\u00052\u0000\u0000\u00f8"+
		"\u00f9\u0005\u0019\u0000\u0000\u00f9\u00fa\u00052\u0000\u0000\u00fa\u00fb"+
		"\u0005\u001c\u0000\u0000\u00fb\u0100\u00057\u0000\u0000\u00fc\u00ff\u0003"+
		"\u0006\u0003\u0000\u00fd\u00ff\u0003\u0004\u0002\u0000\u00fe\u00fc\u0001"+
		"\u0000\u0000\u0000\u00fe\u00fd\u0001\u0000\u0000\u0000\u00ff\u0102\u0001"+
		"\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0100\u0101\u0001"+
		"\u0000\u0000\u0000\u0101\u0103\u0001\u0000\u0000\u0000\u0102\u0100\u0001"+
		"\u0000\u0000\u0000\u0103\u0104\u0005\u001d\u0000\u0000\u0104\u0015\u0001"+
		"\u0000\u0000\u0000\u0105\u0106\u0005\u000f\u0000\u0000\u0106\u0107\u0003"+
		"\u001c\u000e\u0000\u0107\u0108\u0005\u0005\u0000\u0000\u0108\u0110\u0003"+
		"\u001a\r\u0000\u0109\u010a\u0005\u0010\u0000\u0000\u010a\u010b\u0003\u001c"+
		"\u000e\u0000\u010b\u010c\u0005\u0005\u0000\u0000\u010c\u010d\u0003\u001a"+
		"\r\u0000\u010d\u010f\u0001\u0000\u0000\u0000\u010e\u0109\u0001\u0000\u0000"+
		"\u0000\u010f\u0112\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000"+
		"\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0116\u0001\u0000\u0000"+
		"\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0113\u0114\u0005\u0011\u0000"+
		"\u0000\u0114\u0115\u0005\u0005\u0000\u0000\u0115\u0117\u0003\u001a\r\u0000"+
		"\u0116\u0113\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000"+
		"\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u0119\u0005\u0017\u0000\u0000"+
		"\u0119\u0017\u0001\u0000\u0000\u0000\u011a\u011b\u0005\u0012\u0000\u0000"+
		"\u011b\u011c\u00055\u0000\u0000\u011c\u011d\u0005\u0006\u0000\u0000\u011d"+
		"\u011e\u0005\u0005\u0000\u0000\u011e\u011f\u0003\u001a\r\u0000\u011f\u0120"+
		"\u0005\u0017\u0000\u0000\u0120\u0019\u0001\u0000\u0000\u0000\u0121\u0123"+
		"\u00057\u0000\u0000\u0122\u0124\u0003\u0006\u0003\u0000\u0123\u0122\u0001"+
		"\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0123\u0001"+
		"\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126\u001b\u0001"+
		"\u0000\u0000\u0000\u0127\u0128\u0006\u000e\uffff\uffff\u0000\u0128\u0131"+
		"\u00054\u0000\u0000\u0129\u0131\u00052\u0000\u0000\u012a\u012b\u00050"+
		"\u0000\u0000\u012b\u0131\u0003\n\u0005\u0000\u012c\u012d\u0005\u001a\u0000"+
		"\u0000\u012d\u012e\u0003\u001c\u000e\u0000\u012e\u012f\u0005\u001b\u0000"+
		"\u0000\u012f\u0131\u0001\u0000\u0000\u0000\u0130\u0127\u0001\u0000\u0000"+
		"\u0000\u0130\u0129\u0001\u0000\u0000\u0000\u0130\u012a\u0001\u0000\u0000"+
		"\u0000\u0130\u012c\u0001\u0000\u0000\u0000\u0131\u0140\u0001\u0000\u0000"+
		"\u0000\u0132\u0133\n\b\u0000\u0000\u0133\u0134\u0007\u0001\u0000\u0000"+
		"\u0134\u013f\u0003\u001c\u000e\t\u0135\u0136\n\u0007\u0000\u0000\u0136"+
		"\u0137\u0007\u0002\u0000\u0000\u0137\u013f\u0003\u001c\u000e\b\u0138\u0139"+
		"\n\u0006\u0000\u0000\u0139\u013a\u0007\u0003\u0000\u0000\u013a\u013f\u0003"+
		"\u001c\u000e\u0007\u013b\u013c\n\u0005\u0000\u0000\u013c\u013d\u0007\u0004"+
		"\u0000\u0000\u013d\u013f\u0003\u001c\u000e\u0006\u013e\u0132\u0001\u0000"+
		"\u0000\u0000\u013e\u0135\u0001\u0000\u0000\u0000\u013e\u0138\u0001\u0000"+
		"\u0000\u0000\u013e\u013b\u0001\u0000\u0000\u0000\u013f\u0142\u0001\u0000"+
		"\u0000\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0140\u0141\u0001\u0000"+
		"\u0000\u0000\u0141\u001d\u0001\u0000\u0000\u0000\u0142\u0140\u0001\u0000"+
		"\u0000\u0000(#+-79Fept}\u0086\u008a\u0096\u00a0\u00a2\u00a7\u00ac\u00b0"+
		"\u00b6\u00b8\u00be\u00c3\u00c7\u00cd\u00cf\u00d3\u00db\u00e0\u00e9\u00ee"+
		"\u00f2\u00f4\u00fe\u0100\u0110\u0116\u0125\u0130\u013e\u0140";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}