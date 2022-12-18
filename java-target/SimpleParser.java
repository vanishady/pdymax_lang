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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, PATCH=8, INCLUDE=9, 
		BLOCK=10, SUBBLOCK=11, CONNECT=12, DISCONNECT=13, IF=14, ELIF=15, ELSE=16, 
		FOR=17, THISROUND=18, BREAK=19, CONTINUE=20, PASS=21, END=22, L_PAREN=23, 
		R_PAREN=24, L_CURLY=25, R_CURLY=26, L_BRACKET=27, R_BRACKET=28, L_ANGLE=29, 
		R_ANGLE=30, EQ=31, NOT_EQ=32, PLUS=33, MINUS=34, POW=35, STAR=36, DIV=37, 
		MOD=38, OR=39, AND=40, NODETYPE=41, PARAMETERS=42, ID=43, IOLET=44, STRING=45, 
		NUMBER=46, INTEGER=47, FLOAT=48, ARGLIST=49, IOLIST=50, NL=51, WS=52, 
		COMMENT=53;
	public static final int
		RULE_prog = 0, RULE_blockstmt = 1, RULE_subblockstmt = 2, RULE_stmt = 3, 
		RULE_declarationstmt = 4, RULE_ioletdeclstmt = 5, RULE_connectionstmt = 6, 
		RULE_ifstmt = 7, RULE_forstmt = 8, RULE_suite = 9, RULE_expr = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "blockstmt", "subblockstmt", "stmt", "declarationstmt", "ioletdeclstmt", 
			"connectionstmt", "ifstmt", "forstmt", "suite", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'.'", "','", "':'", "'rounds do'", "'>='", "'<='", "'patch'", 
			"'include'", "'block'", "'subblock'", "'::'", null, "'if'", "'elif'", 
			"'else'", "'for'", "'thisround'", "'break'", "'continue'", "'pass'", 
			"'end'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'<'", "'>'", "'=='", 
			"'!='", "'+'", "'-'", "'**'", "'*'", "'/'", "'%'", "'||'", "'&&'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "PATCH", "INCLUDE", "BLOCK", 
			"SUBBLOCK", "CONNECT", "DISCONNECT", "IF", "ELIF", "ELSE", "FOR", "THISROUND", 
			"BREAK", "CONTINUE", "PASS", "END", "L_PAREN", "R_PAREN", "L_CURLY", 
			"R_CURLY", "L_BRACKET", "R_BRACKET", "L_ANGLE", "R_ANGLE", "EQ", "NOT_EQ", 
			"PLUS", "MINUS", "POW", "STAR", "DIV", "MOD", "OR", "AND", "NODETYPE", 
			"PARAMETERS", "ID", "IOLET", "STRING", "NUMBER", "INTEGER", "FLOAT", 
			"ARGLIST", "IOLIST", "NL", "WS", "COMMENT"
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
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INCLUDE) {
				{
				{
				setState(22);
				match(INCLUDE);
				setState(23);
				match(ID);
				setState(24);
				match(NL);
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30);
			match(PATCH);
			setState(31);
			match(ID);
			setState(32);
			match(NL);
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(35);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BLOCK:
					{
					setState(33);
					blockstmt();
					}
					break;
				case IF:
				case FOR:
				case BREAK:
				case CONTINUE:
				case PASS:
				case L_ANGLE:
				case NODETYPE:
				case ID:
				case NL:
					{
					setState(34);
					stmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 2262795470652416L) != 0 );
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
			setState(39);
			match(BLOCK);
			setState(40);
			match(ID);
			setState(41);
			match(L_CURLY);
			setState(42);
			match(NL);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 2262795470653440L) != 0) {
				{
				setState(45);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
				case FOR:
				case BREAK:
				case CONTINUE:
				case PASS:
				case L_ANGLE:
				case NODETYPE:
				case ID:
				case NL:
					{
					setState(43);
					stmt();
					}
					break;
				case SUBBLOCK:
					{
					setState(44);
					subblockstmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			match(R_CURLY);
			setState(51);
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
			setState(53);
			match(SUBBLOCK);
			setState(54);
			match(ID);
			setState(55);
			match(L_CURLY);
			setState(56);
			match(NL);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 2262795470651392L) != 0) {
				{
				{
				setState(57);
				stmt();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			match(R_CURLY);
			setState(64);
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
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				declarationstmt();
				setState(67);
				match(NL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				ioletdeclstmt();
				setState(70);
				match(NL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				connectionstmt();
				setState(73);
				match(NL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				ifstmt();
				setState(76);
				match(NL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(78);
				forstmt();
				setState(79);
				match(NL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(81);
				match(BREAK);
				setState(82);
				match(NL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(83);
				match(CONTINUE);
				setState(84);
				match(NL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(85);
				match(PASS);
				setState(86);
				match(NL);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(87);
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
		public TerminalNode PARAMETERS() { return getToken(SimpleParser.PARAMETERS, 0); }
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
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(ID);
				setState(91);
				match(T__0);
				setState(95);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NODETYPE:
					{
					setState(92);
					match(NODETYPE);
					setState(93);
					match(PARAMETERS);
					}
					break;
				case L_PAREN:
				case ID:
				case STRING:
				case NUMBER:
					{
					setState(94);
					expr(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case NODETYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(NODETYPE);
				setState(98);
				match(PARAMETERS);
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
	public static class IoletdeclstmtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode IOLET() { return getToken(SimpleParser.IOLET, 0); }
		public List<TerminalNode> NODETYPE() { return getTokens(SimpleParser.NODETYPE); }
		public TerminalNode NODETYPE(int i) {
			return getToken(SimpleParser.NODETYPE, i);
		}
		public List<TerminalNode> PARAMETERS() { return getTokens(SimpleParser.PARAMETERS); }
		public TerminalNode PARAMETERS(int i) {
			return getToken(SimpleParser.PARAMETERS, i);
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
		enterRule(_localctx, 10, RULE_ioletdeclstmt);
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(ID);
				setState(102);
				match(T__1);
				setState(103);
				match(IOLET);
				setState(104);
				match(T__0);
				setState(108);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NODETYPE:
					{
					setState(105);
					match(NODETYPE);
					setState(106);
					match(PARAMETERS);
					}
					break;
				case L_PAREN:
				case ID:
				case STRING:
				case NUMBER:
					{
					setState(107);
					expr(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case NODETYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				match(NODETYPE);
				setState(111);
				match(PARAMETERS);
				setState(112);
				match(T__1);
				setState(113);
				match(IOLET);
				setState(114);
				match(T__0);
				setState(118);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NODETYPE:
					{
					setState(115);
					match(NODETYPE);
					setState(116);
					match(PARAMETERS);
					}
					break;
				case L_PAREN:
				case ID:
				case STRING:
				case NUMBER:
					{
					setState(117);
					expr(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
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
		enterRule(_localctx, 12, RULE_connectionstmt);
		int _la;
		try {
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case L_ANGLE:
					{
					setState(122);
					match(L_ANGLE);
					setState(125);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						setState(123);
						match(ID);
						}
						break;
					case 2:
						{
						setState(124);
						declarationstmt();
						}
						break;
					}
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(127);
						match(T__2);
						setState(130);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
						case 1:
							{
							setState(128);
							match(ID);
							}
							break;
						case 2:
							{
							setState(129);
							declarationstmt();
							}
							break;
						}
						}
						}
						setState(136);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(137);
					match(R_ANGLE);
					}
					break;
				case NODETYPE:
				case ID:
					{
					setState(140);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						setState(138);
						match(ID);
						}
						break;
					case 2:
						{
						setState(139);
						declarationstmt();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(167); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(144);
					match(CONNECT);
					setState(165);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case L_ANGLE:
						{
						setState(145);
						match(L_ANGLE);
						setState(148);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
						case 1:
							{
							setState(146);
							match(ID);
							}
							break;
						case 2:
							{
							setState(147);
							declarationstmt();
							}
							break;
						}
						setState(157);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__2) {
							{
							{
							setState(150);
							match(T__2);
							setState(153);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
							case 1:
								{
								setState(151);
								match(ID);
								}
								break;
							case 2:
								{
								setState(152);
								declarationstmt();
								}
								break;
							}
							}
							}
							setState(159);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(160);
						match(R_ANGLE);
						}
						break;
					case NODETYPE:
					case ID:
						{
						setState(163);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
						case 1:
							{
							setState(161);
							match(ID);
							}
							break;
						case 2:
							{
							setState(162);
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
					setState(169); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CONNECT );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case L_ANGLE:
					{
					setState(171);
					match(L_ANGLE);
					setState(172);
					match(ID);
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(173);
						match(T__2);
						setState(174);
						match(ID);
						}
						}
						setState(179);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(180);
					match(R_ANGLE);
					}
					break;
				case ID:
					{
					setState(181);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(198); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(184);
					match(DISCONNECT);
					setState(196);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case L_ANGLE:
						{
						setState(185);
						match(L_ANGLE);
						setState(186);
						match(ID);
						setState(191);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__2) {
							{
							{
							setState(187);
							match(T__2);
							setState(188);
							match(ID);
							}
							}
							setState(193);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(194);
						match(R_ANGLE);
						}
						break;
					case ID:
						{
						setState(195);
						match(ID);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(200); 
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
		enterRule(_localctx, 14, RULE_ifstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(IF);
			setState(205);
			expr(0);
			setState(206);
			match(T__3);
			setState(207);
			suite();
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(208);
				match(ELIF);
				setState(209);
				expr(0);
				setState(210);
				match(T__3);
				setState(211);
				suite();
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(218);
				match(ELSE);
				setState(219);
				match(T__3);
				setState(220);
				suite();
				}
			}

			setState(223);
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
		public TerminalNode NL() { return getToken(SimpleParser.NL, 0); }
		public TerminalNode END() { return getToken(SimpleParser.END, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
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
		enterRule(_localctx, 16, RULE_forstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(FOR);
			setState(226);
			match(INTEGER);
			setState(227);
			match(T__4);
			setState(228);
			match(T__3);
			setState(229);
			match(NL);
			setState(231); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(230);
				stmt();
				}
				}
				setState(233); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 2262795470651392L) != 0 );
			setState(235);
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
		enterRule(_localctx, 18, RULE_suite);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(NL);
			setState(239); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(238);
				stmt();
				}
				}
				setState(241); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 2262795470651392L) != 0 );
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
		public TerminalNode NUMBER() { return getToken(SimpleParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(SimpleParser.STRING, 0); }
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode L_PAREN() { return getToken(SimpleParser.L_PAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode R_PAREN() { return getToken(SimpleParser.R_PAREN, 0); }
		public TerminalNode STAR() { return getToken(SimpleParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(SimpleParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(SimpleParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SimpleParser.MINUS, 0); }
		public TerminalNode POW() { return getToken(SimpleParser.POW, 0); }
		public TerminalNode MOD() { return getToken(SimpleParser.MOD, 0); }
		public TerminalNode EQ() { return getToken(SimpleParser.EQ, 0); }
		public TerminalNode NOT_EQ() { return getToken(SimpleParser.NOT_EQ, 0); }
		public TerminalNode R_ANGLE() { return getToken(SimpleParser.R_ANGLE, 0); }
		public TerminalNode L_ANGLE() { return getToken(SimpleParser.L_ANGLE, 0); }
		public TerminalNode AND() { return getToken(SimpleParser.AND, 0); }
		public TerminalNode OR() { return getToken(SimpleParser.OR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitExpr(this);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(244);
				match(NUMBER);
				}
				break;
			case STRING:
				{
				setState(245);
				match(STRING);
				}
				break;
			case ID:
				{
				setState(246);
				match(ID);
				}
				break;
			case L_PAREN:
				{
				setState(247);
				match(L_PAREN);
				setState(248);
				expr(0);
				setState(249);
				match(R_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(273);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(271);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(253);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(254);
						_la = _input.LA(1);
						if ( !(_la==STAR || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(255);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(256);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(257);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(258);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(259);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						{
						setState(260);
						match(POW);
						}
						setState(261);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(262);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						{
						setState(263);
						match(MOD);
						}
						setState(264);
						expr(8);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(265);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(266);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 8053063872L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(267);
						expr(7);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(268);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(269);
						_la = _input.LA(1);
						if ( !(_la==OR || _la==AND) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(270);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(275);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
		case 10:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00015\u0115\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0005\u0000\u001a\b\u0000\n\u0000\f\u0000\u001d\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u0000$\b\u0000"+
		"\u000b\u0000\f\u0000%\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001.\b\u0001\n\u0001\f\u00011\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002;\b\u0002\n\u0002\f\u0002>\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003Y\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004`\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004d\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005m\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005w\b\u0005\u0003\u0005y\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006~\b\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u0083\b\u0006\u0005\u0006\u0085\b\u0006\n\u0006\f\u0006"+
		"\u0088\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u008d\b"+
		"\u0006\u0003\u0006\u008f\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u0095\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u009a\b\u0006\u0005\u0006\u009c\b\u0006\n\u0006\f\u0006\u009f\t"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00a4\b\u0006\u0003"+
		"\u0006\u00a6\b\u0006\u0004\u0006\u00a8\b\u0006\u000b\u0006\f\u0006\u00a9"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00b0\b\u0006"+
		"\n\u0006\f\u0006\u00b3\t\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00b7"+
		"\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006\u00be\b\u0006\n\u0006\f\u0006\u00c1\t\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u00c5\b\u0006\u0004\u0006\u00c7\b\u0006\u000b\u0006\f\u0006"+
		"\u00c8\u0003\u0006\u00cb\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007\u00d6\b\u0007\n\u0007\f\u0007\u00d9\t\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u00de\b\u0007\u0001\u0007\u0001\u0007\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b\u00e8\b\b\u000b\b\f\b"+
		"\u00e9\u0001\b\u0001\b\u0001\t\u0001\t\u0004\t\u00f0\b\t\u000b\t\f\t\u00f1"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u00fc\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u0110\b\n\n\n\f\n\u0113\t\n\u0001\n\u0000\u0001\u0014"+
		"\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0004"+
		"\u0001\u0000$%\u0001\u0000!\"\u0002\u0000\u0006\u0007\u001d \u0001\u0000"+
		"\'(\u013a\u0000\u001b\u0001\u0000\u0000\u0000\u0002\'\u0001\u0000\u0000"+
		"\u0000\u00045\u0001\u0000\u0000\u0000\u0006X\u0001\u0000\u0000\u0000\b"+
		"c\u0001\u0000\u0000\u0000\nx\u0001\u0000\u0000\u0000\f\u00ca\u0001\u0000"+
		"\u0000\u0000\u000e\u00cc\u0001\u0000\u0000\u0000\u0010\u00e1\u0001\u0000"+
		"\u0000\u0000\u0012\u00ed\u0001\u0000\u0000\u0000\u0014\u00fb\u0001\u0000"+
		"\u0000\u0000\u0016\u0017\u0005\t\u0000\u0000\u0017\u0018\u0005+\u0000"+
		"\u0000\u0018\u001a\u00053\u0000\u0000\u0019\u0016\u0001\u0000\u0000\u0000"+
		"\u001a\u001d\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000"+
		"\u001b\u001c\u0001\u0000\u0000\u0000\u001c\u001e\u0001\u0000\u0000\u0000"+
		"\u001d\u001b\u0001\u0000\u0000\u0000\u001e\u001f\u0005\b\u0000\u0000\u001f"+
		" \u0005+\u0000\u0000 #\u00053\u0000\u0000!$\u0003\u0002\u0001\u0000\""+
		"$\u0003\u0006\u0003\u0000#!\u0001\u0000\u0000\u0000#\"\u0001\u0000\u0000"+
		"\u0000$%\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000%&\u0001\u0000"+
		"\u0000\u0000&\u0001\u0001\u0000\u0000\u0000\'(\u0005\n\u0000\u0000()\u0005"+
		"+\u0000\u0000)*\u0005\u0019\u0000\u0000*/\u00053\u0000\u0000+.\u0003\u0006"+
		"\u0003\u0000,.\u0003\u0004\u0002\u0000-+\u0001\u0000\u0000\u0000-,\u0001"+
		"\u0000\u0000\u0000.1\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000"+
		"/0\u0001\u0000\u0000\u000002\u0001\u0000\u0000\u00001/\u0001\u0000\u0000"+
		"\u000023\u0005\u001a\u0000\u000034\u00053\u0000\u00004\u0003\u0001\u0000"+
		"\u0000\u000056\u0005\u000b\u0000\u000067\u0005+\u0000\u000078\u0005\u0019"+
		"\u0000\u00008<\u00053\u0000\u00009;\u0003\u0006\u0003\u0000:9\u0001\u0000"+
		"\u0000\u0000;>\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000<=\u0001"+
		"\u0000\u0000\u0000=?\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000"+
		"?@\u0005\u001a\u0000\u0000@A\u00053\u0000\u0000A\u0005\u0001\u0000\u0000"+
		"\u0000BC\u0003\b\u0004\u0000CD\u00053\u0000\u0000DY\u0001\u0000\u0000"+
		"\u0000EF\u0003\n\u0005\u0000FG\u00053\u0000\u0000GY\u0001\u0000\u0000"+
		"\u0000HI\u0003\f\u0006\u0000IJ\u00053\u0000\u0000JY\u0001\u0000\u0000"+
		"\u0000KL\u0003\u000e\u0007\u0000LM\u00053\u0000\u0000MY\u0001\u0000\u0000"+
		"\u0000NO\u0003\u0010\b\u0000OP\u00053\u0000\u0000PY\u0001\u0000\u0000"+
		"\u0000QR\u0005\u0013\u0000\u0000RY\u00053\u0000\u0000ST\u0005\u0014\u0000"+
		"\u0000TY\u00053\u0000\u0000UV\u0005\u0015\u0000\u0000VY\u00053\u0000\u0000"+
		"WY\u00053\u0000\u0000XB\u0001\u0000\u0000\u0000XE\u0001\u0000\u0000\u0000"+
		"XH\u0001\u0000\u0000\u0000XK\u0001\u0000\u0000\u0000XN\u0001\u0000\u0000"+
		"\u0000XQ\u0001\u0000\u0000\u0000XS\u0001\u0000\u0000\u0000XU\u0001\u0000"+
		"\u0000\u0000XW\u0001\u0000\u0000\u0000Y\u0007\u0001\u0000\u0000\u0000"+
		"Z[\u0005+\u0000\u0000[_\u0005\u0001\u0000\u0000\\]\u0005)\u0000\u0000"+
		"]`\u0005*\u0000\u0000^`\u0003\u0014\n\u0000_\\\u0001\u0000\u0000\u0000"+
		"_^\u0001\u0000\u0000\u0000`d\u0001\u0000\u0000\u0000ab\u0005)\u0000\u0000"+
		"bd\u0005*\u0000\u0000cZ\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000"+
		"d\t\u0001\u0000\u0000\u0000ef\u0005+\u0000\u0000fg\u0005\u0002\u0000\u0000"+
		"gh\u0005,\u0000\u0000hl\u0005\u0001\u0000\u0000ij\u0005)\u0000\u0000j"+
		"m\u0005*\u0000\u0000km\u0003\u0014\n\u0000li\u0001\u0000\u0000\u0000l"+
		"k\u0001\u0000\u0000\u0000my\u0001\u0000\u0000\u0000no\u0005)\u0000\u0000"+
		"op\u0005*\u0000\u0000pq\u0005\u0002\u0000\u0000qr\u0005,\u0000\u0000r"+
		"v\u0005\u0001\u0000\u0000st\u0005)\u0000\u0000tw\u0005*\u0000\u0000uw"+
		"\u0003\u0014\n\u0000vs\u0001\u0000\u0000\u0000vu\u0001\u0000\u0000\u0000"+
		"wy\u0001\u0000\u0000\u0000xe\u0001\u0000\u0000\u0000xn\u0001\u0000\u0000"+
		"\u0000y\u000b\u0001\u0000\u0000\u0000z}\u0005\u001d\u0000\u0000{~\u0005"+
		"+\u0000\u0000|~\u0003\b\u0004\u0000}{\u0001\u0000\u0000\u0000}|\u0001"+
		"\u0000\u0000\u0000~\u0086\u0001\u0000\u0000\u0000\u007f\u0082\u0005\u0003"+
		"\u0000\u0000\u0080\u0083\u0005+\u0000\u0000\u0081\u0083\u0003\b\u0004"+
		"\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0081\u0001\u0000\u0000"+
		"\u0000\u0083\u0085\u0001\u0000\u0000\u0000\u0084\u007f\u0001\u0000\u0000"+
		"\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0089\u0001\u0000\u0000"+
		"\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089\u008f\u0005\u001e\u0000"+
		"\u0000\u008a\u008d\u0005+\u0000\u0000\u008b\u008d\u0003\b\u0004\u0000"+
		"\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008b\u0001\u0000\u0000\u0000"+
		"\u008d\u008f\u0001\u0000\u0000\u0000\u008ez\u0001\u0000\u0000\u0000\u008e"+
		"\u008c\u0001\u0000\u0000\u0000\u008f\u00a7\u0001\u0000\u0000\u0000\u0090"+
		"\u00a5\u0005\f\u0000\u0000\u0091\u0094\u0005\u001d\u0000\u0000\u0092\u0095"+
		"\u0005+\u0000\u0000\u0093\u0095\u0003\b\u0004\u0000\u0094\u0092\u0001"+
		"\u0000\u0000\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0095\u009d\u0001"+
		"\u0000\u0000\u0000\u0096\u0099\u0005\u0003\u0000\u0000\u0097\u009a\u0005"+
		"+\u0000\u0000\u0098\u009a\u0003\b\u0004\u0000\u0099\u0097\u0001\u0000"+
		"\u0000\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u009a\u009c\u0001\u0000"+
		"\u0000\u0000\u009b\u0096\u0001\u0000\u0000\u0000\u009c\u009f\u0001\u0000"+
		"\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000"+
		"\u0000\u0000\u009e\u00a0\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a6\u0005\u001e\u0000\u0000\u00a1\u00a4\u0005+\u0000"+
		"\u0000\u00a2\u00a4\u0003\b\u0004\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a5\u0091\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a8\u0001\u0000\u0000\u0000\u00a7\u0090\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000"+
		"\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00cb\u0001\u0000\u0000\u0000"+
		"\u00ab\u00ac\u0005\u001d\u0000\u0000\u00ac\u00b1\u0005+\u0000\u0000\u00ad"+
		"\u00ae\u0005\u0003\u0000\u0000\u00ae\u00b0\u0005+\u0000\u0000\u00af\u00ad"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b3\u0001\u0000\u0000\u0000\u00b1\u00af"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b7"+
		"\u0005\u001e\u0000\u0000\u00b5\u00b7\u0005+\u0000\u0000\u00b6\u00ab\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7\u00c6\u0001"+
		"\u0000\u0000\u0000\u00b8\u00c4\u0005\r\u0000\u0000\u00b9\u00ba\u0005\u001d"+
		"\u0000\u0000\u00ba\u00bf\u0005+\u0000\u0000\u00bb\u00bc\u0005\u0003\u0000"+
		"\u0000\u00bc\u00be\u0005+\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000"+
		"\u00be\u00c1\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2\u00c5\u0005\u001e\u0000\u0000"+
		"\u00c3\u00c5\u0005+\u0000\u0000\u00c4\u00b9\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c7\u0001\u0000\u0000\u0000\u00c6"+
		"\u00b8\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9"+
		"\u00cb\u0001\u0000\u0000\u0000\u00ca\u008e\u0001\u0000\u0000\u0000\u00ca"+
		"\u00b6\u0001\u0000\u0000\u0000\u00cb\r\u0001\u0000\u0000\u0000\u00cc\u00cd"+
		"\u0005\u000e\u0000\u0000\u00cd\u00ce\u0003\u0014\n\u0000\u00ce\u00cf\u0005"+
		"\u0004\u0000\u0000\u00cf\u00d7\u0003\u0012\t\u0000\u00d0\u00d1\u0005\u000f"+
		"\u0000\u0000\u00d1\u00d2\u0003\u0014\n\u0000\u00d2\u00d3\u0005\u0004\u0000"+
		"\u0000\u00d3\u00d4\u0003\u0012\t\u0000\u00d4\u00d6\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d0\u0001\u0000\u0000\u0000\u00d6\u00d9\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000"+
		"\u00d8\u00dd\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000"+
		"\u00da\u00db\u0005\u0010\u0000\u0000\u00db\u00dc\u0005\u0004\u0000\u0000"+
		"\u00dc\u00de\u0003\u0012\t\u0000\u00dd\u00da\u0001\u0000\u0000\u0000\u00dd"+
		"\u00de\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df"+
		"\u00e0\u0005\u0016\u0000\u0000\u00e0\u000f\u0001\u0000\u0000\u0000\u00e1"+
		"\u00e2\u0005\u0011\u0000\u0000\u00e2\u00e3\u0005/\u0000\u0000\u00e3\u00e4"+
		"\u0005\u0005\u0000\u0000\u00e4\u00e5\u0005\u0004\u0000\u0000\u00e5\u00e7"+
		"\u00053\u0000\u0000\u00e6\u00e8\u0003\u0006\u0003\u0000\u00e7\u00e6\u0001"+
		"\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001"+
		"\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ec\u0005\u0016\u0000\u0000\u00ec\u0011\u0001"+
		"\u0000\u0000\u0000\u00ed\u00ef\u00053\u0000\u0000\u00ee\u00f0\u0003\u0006"+
		"\u0003\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f2\u0013\u0001\u0000\u0000\u0000\u00f3\u00f4\u0006\n\uffff"+
		"\uffff\u0000\u00f4\u00fc\u0005.\u0000\u0000\u00f5\u00fc\u0005-\u0000\u0000"+
		"\u00f6\u00fc\u0005+\u0000\u0000\u00f7\u00f8\u0005\u0017\u0000\u0000\u00f8"+
		"\u00f9\u0003\u0014\n\u0000\u00f9\u00fa\u0005\u0018\u0000\u0000\u00fa\u00fc"+
		"\u0001\u0000\u0000\u0000\u00fb\u00f3\u0001\u0000\u0000\u0000\u00fb\u00f5"+
		"\u0001\u0000\u0000\u0000\u00fb\u00f6\u0001\u0000\u0000\u0000\u00fb\u00f7"+
		"\u0001\u0000\u0000\u0000\u00fc\u0111\u0001\u0000\u0000\u0000\u00fd\u00fe"+
		"\n\n\u0000\u0000\u00fe\u00ff\u0007\u0000\u0000\u0000\u00ff\u0110\u0003"+
		"\u0014\n\u000b\u0100\u0101\n\t\u0000\u0000\u0101\u0102\u0007\u0001\u0000"+
		"\u0000\u0102\u0110\u0003\u0014\n\n\u0103\u0104\n\b\u0000\u0000\u0104\u0105"+
		"\u0005#\u0000\u0000\u0105\u0110\u0003\u0014\n\t\u0106\u0107\n\u0007\u0000"+
		"\u0000\u0107\u0108\u0005&\u0000\u0000\u0108\u0110\u0003\u0014\n\b\u0109"+
		"\u010a\n\u0006\u0000\u0000\u010a\u010b\u0007\u0002\u0000\u0000\u010b\u0110"+
		"\u0003\u0014\n\u0007\u010c\u010d\n\u0005\u0000\u0000\u010d\u010e\u0007"+
		"\u0003\u0000\u0000\u010e\u0110\u0003\u0014\n\u0006\u010f\u00fd\u0001\u0000"+
		"\u0000\u0000\u010f\u0100\u0001\u0000\u0000\u0000\u010f\u0103\u0001\u0000"+
		"\u0000\u0000\u010f\u0106\u0001\u0000\u0000\u0000\u010f\u0109\u0001\u0000"+
		"\u0000\u0000\u010f\u010c\u0001\u0000\u0000\u0000\u0110\u0113\u0001\u0000"+
		"\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000"+
		"\u0000\u0000\u0112\u0015\u0001\u0000\u0000\u0000\u0113\u0111\u0001\u0000"+
		"\u0000\u0000$\u001b#%-/<X_clvx}\u0082\u0086\u008c\u008e\u0094\u0099\u009d"+
		"\u00a3\u00a5\u00a9\u00b1\u00b6\u00bf\u00c4\u00c8\u00ca\u00d7\u00dd\u00e9"+
		"\u00f1\u00fb\u010f\u0111";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}