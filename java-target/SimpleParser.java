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
		RULE_arg = 7, RULE_operation = 8, RULE_ioletdeclstmt = 9, RULE_connectionstmt = 10, 
		RULE_recallstmt = 11, RULE_ifstmt = 12, RULE_forstmt = 13, RULE_suite = 14, 
		RULE_expr = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "blockstmt", "subblockstmt", "stmt", "declarationstmt", "parameters", 
			"typedargslist", "arg", "operation", "ioletdeclstmt", "connectionstmt", 
			"recallstmt", "ifstmt", "forstmt", "suite", "expr"
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
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INCLUDE) {
				{
				{
				setState(32);
				match(INCLUDE);
				setState(33);
				match(ID);
				setState(34);
				match(NL);
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
			match(PATCH);
			setState(41);
			match(ID);
			setState(42);
			match(NL);
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(45);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BLOCK:
					{
					setState(43);
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
					setState(44);
					stmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 37436176221898752L) != 0 );
			setState(49);
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
			setState(51);
			match(BLOCK);
			setState(52);
			match(ID);
			setState(53);
			match(L_CURLY);
			setState(54);
			match(NL);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 37436176221900800L) != 0) {
				{
				setState(57);
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
					setState(55);
					stmt();
					}
					break;
				case SUBBLOCK:
					{
					setState(56);
					subblockstmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			match(R_CURLY);
			setState(63);
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
			setState(65);
			match(SUBBLOCK);
			setState(66);
			match(ID);
			setState(67);
			match(L_CURLY);
			setState(68);
			match(NL);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 37436176221896704L) != 0) {
				{
				{
				setState(69);
				stmt();
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			match(R_CURLY);
			setState(76);
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
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				declarationstmt();
				setState(79);
				match(NL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				ioletdeclstmt();
				setState(82);
				match(NL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				connectionstmt();
				setState(85);
				match(NL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(87);
				recallstmt();
				setState(88);
				match(NL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(90);
				ifstmt();
				setState(91);
				match(NL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(93);
				forstmt();
				setState(94);
				match(NL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(96);
				match(BREAK);
				setState(97);
				match(NL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(98);
				match(CONTINUE);
				setState(99);
				match(NL);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(100);
				match(PASS);
				setState(101);
				match(NL);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(102);
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
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
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
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(ID);
				setState(106);
				match(T__1);
				{
				setState(107);
				match(NODETYPE);
				setState(108);
				parameters();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(NODETYPE);
				setState(110);
				parameters();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				match(ID);
				setState(112);
				match(T__1);
				setState(113);
				operation();
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
			setState(116);
			match(L_PAREN);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SYMBOL || _la==NUMBER) {
				{
				setState(117);
				typedargslist();
				}
			}

			setState(120);
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
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
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
			setState(122);
			arg();
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(123);
					match(T__2);
					setState(124);
					arg();
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(130);
				match(T__2);
				setState(131);
				match(INOUTID);
				setState(132);
				match(T__1);
				setState(136);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NODETYPE:
					{
					setState(133);
					match(NODETYPE);
					setState(134);
					parameters();
					}
					break;
				case PLUS:
				case MINUS:
				case STAR:
				case DIV:
				case SIGMINUS:
				case SIGPLUS:
				case SIGDIV:
				case SIGSTAR:
				case NUMBER:
					{
					setState(135);
					operation();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(142);
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
			setState(143);
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
	public static class OperationContext extends ParserRuleContext {
		public Token op;
		public TerminalNode NUMBER() { return getToken(SimpleParser.NUMBER, 0); }
		public TerminalNode STAR() { return getToken(SimpleParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(SimpleParser.DIV, 0); }
		public TerminalNode SIGSTAR() { return getToken(SimpleParser.SIGSTAR, 0); }
		public TerminalNode SIGDIV() { return getToken(SimpleParser.SIGDIV, 0); }
		public TerminalNode PLUS() { return getToken(SimpleParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SimpleParser.MINUS, 0); }
		public TerminalNode SIGPLUS() { return getToken(SimpleParser.SIGPLUS, 0); }
		public TerminalNode SIGMINUS() { return getToken(SimpleParser.SIGMINUS, 0); }
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitOperation(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_operation);
		int _la;
		try {
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(NUMBER);
				}
				break;
			case PLUS:
			case MINUS:
			case STAR:
			case DIV:
			case SIGMINUS:
			case SIGPLUS:
			case SIGDIV:
			case SIGSTAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				((OperationContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 265738216538112L) != 0) ) {
					((OperationContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(147);
					match(NUMBER);
					}
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
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
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
		enterRule(_localctx, 18, RULE_ioletdeclstmt);
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(ID);
				setState(153);
				match(T__3);
				setState(154);
				match(INOUTID);
				setState(155);
				match(T__1);
				setState(159);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NODETYPE:
					{
					setState(156);
					match(NODETYPE);
					setState(157);
					parameters();
					}
					break;
				case PLUS:
				case MINUS:
				case STAR:
				case DIV:
				case SIGMINUS:
				case SIGPLUS:
				case SIGDIV:
				case SIGSTAR:
				case NUMBER:
					{
					setState(158);
					operation();
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
				setState(161);
				match(NODETYPE);
				setState(162);
				parameters();
				setState(163);
				match(T__3);
				setState(164);
				match(INOUTID);
				setState(165);
				match(T__1);
				setState(169);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NODETYPE:
					{
					setState(166);
					match(NODETYPE);
					setState(167);
					parameters();
					}
					break;
				case PLUS:
				case MINUS:
				case STAR:
				case DIV:
				case SIGMINUS:
				case SIGPLUS:
				case SIGDIV:
				case SIGSTAR:
				case NUMBER:
					{
					setState(168);
					operation();
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
		enterRule(_localctx, 20, RULE_connectionstmt);
		int _la;
		try {
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case L_ANGLE:
					{
					setState(173);
					match(L_ANGLE);
					setState(176);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						setState(174);
						match(ID);
						}
						break;
					case 2:
						{
						setState(175);
						declarationstmt();
						}
						break;
					}
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(178);
						match(T__2);
						setState(181);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
						case 1:
							{
							setState(179);
							match(ID);
							}
							break;
						case 2:
							{
							setState(180);
							declarationstmt();
							}
							break;
						}
						}
						}
						setState(187);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(188);
					match(R_ANGLE);
					}
					break;
				case NODETYPE:
				case ID:
					{
					setState(191);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						setState(189);
						match(ID);
						}
						break;
					case 2:
						{
						setState(190);
						declarationstmt();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(218); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(195);
					match(CONNECT);
					setState(216);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case L_ANGLE:
						{
						setState(196);
						match(L_ANGLE);
						setState(199);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
						case 1:
							{
							setState(197);
							match(ID);
							}
							break;
						case 2:
							{
							setState(198);
							declarationstmt();
							}
							break;
						}
						setState(208);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__2) {
							{
							{
							setState(201);
							match(T__2);
							setState(204);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
							case 1:
								{
								setState(202);
								match(ID);
								}
								break;
							case 2:
								{
								setState(203);
								declarationstmt();
								}
								break;
							}
							}
							}
							setState(210);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(211);
						match(R_ANGLE);
						}
						break;
					case NODETYPE:
					case ID:
						{
						setState(214);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
						case 1:
							{
							setState(212);
							match(ID);
							}
							break;
						case 2:
							{
							setState(213);
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
					setState(220); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CONNECT );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case L_ANGLE:
					{
					setState(222);
					match(L_ANGLE);
					setState(223);
					match(ID);
					setState(228);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(224);
						match(T__2);
						setState(225);
						match(ID);
						}
						}
						setState(230);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(231);
					match(R_ANGLE);
					}
					break;
				case ID:
					{
					setState(232);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(249); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(235);
					match(DISCONNECT);
					setState(247);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case L_ANGLE:
						{
						setState(236);
						match(L_ANGLE);
						setState(237);
						match(ID);
						setState(242);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__2) {
							{
							{
							setState(238);
							match(T__2);
							setState(239);
							match(ID);
							}
							}
							setState(244);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(245);
						match(R_ANGLE);
						}
						break;
					case ID:
						{
						setState(246);
						match(ID);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(251); 
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
		enterRule(_localctx, 22, RULE_recallstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(RECALL);
			setState(256);
			match(ID);
			setState(257);
			match(TO);
			setState(258);
			match(ID);
			setState(259);
			match(L_CURLY);
			setState(260);
			match(NL);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 37436176221900800L) != 0) {
				{
				setState(263);
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
					setState(261);
					stmt();
					}
					break;
				case SUBBLOCK:
					{
					setState(262);
					subblockstmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(268);
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
		enterRule(_localctx, 24, RULE_ifstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(IF);
			setState(271);
			expr(0);
			setState(272);
			match(T__4);
			setState(273);
			suite();
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(274);
				match(ELIF);
				setState(275);
				expr(0);
				setState(276);
				match(T__4);
				setState(277);
				suite();
				}
				}
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(284);
				match(ELSE);
				setState(285);
				match(T__4);
				setState(286);
				suite();
				}
			}

			setState(289);
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
		enterRule(_localctx, 26, RULE_forstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(FOR);
			setState(292);
			match(INTEGER);
			setState(293);
			match(T__5);
			setState(294);
			match(T__4);
			setState(295);
			suite();
			setState(296);
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
		enterRule(_localctx, 28, RULE_suite);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(NL);
			setState(300); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(299);
				stmt();
				}
				}
				setState(302); 
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(305);
				match(NUMBER);
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(306);
				match(ID);
				}
				break;
			case NODETYPE:
				{
				_localctx = new DynamicAssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(307);
				match(NODETYPE);
				setState(308);
				parameters();
				}
				break;
			case L_PAREN:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(309);
				match(L_PAREN);
				setState(310);
				expr(0);
				setState(311);
				match(R_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(329);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(327);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(315);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(316);
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
						setState(317);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(318);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(319);
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
						setState(320);
						expr(8);
						}
						break;
					case 3:
						{
						_localctx = new TestContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(321);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(322);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 2263447765376L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(323);
						expr(7);
						}
						break;
					case 4:
						{
						_localctx = new LogicalContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(324);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(325);
						_la = _input.LA(1);
						if ( !(_la==OR || _la==AND) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(326);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(331);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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
		case 15:
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
		"\u0004\u00019\u014d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000$\b\u0000\n\u0000\f\u0000"+
		"\'\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0004\u0000.\b\u0000\u000b\u0000\f\u0000/\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001:\b\u0001\n\u0001\f\u0001=\t\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002G\b\u0002\n\u0002\f\u0002J\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003h\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004s\b\u0004\u0001\u0005\u0001\u0005\u0003\u0005w\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"~\b\u0006\n\u0006\f\u0006\u0081\t\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0089\b\u0006\u0005"+
		"\u0006\u008b\b\u0006\n\u0006\f\u0006\u008e\t\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0003\b\u0095\b\b\u0003\b\u0097\b\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00a0\b\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00aa\b\t\u0003"+
		"\t\u00ac\b\t\u0001\n\u0001\n\u0001\n\u0003\n\u00b1\b\n\u0001\n\u0001\n"+
		"\u0001\n\u0003\n\u00b6\b\n\u0005\n\u00b8\b\n\n\n\f\n\u00bb\t\n\u0001\n"+
		"\u0001\n\u0001\n\u0003\n\u00c0\b\n\u0003\n\u00c2\b\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u00c8\b\n\u0001\n\u0001\n\u0001\n\u0003\n\u00cd\b\n"+
		"\u0005\n\u00cf\b\n\n\n\f\n\u00d2\t\n\u0001\n\u0001\n\u0001\n\u0003\n\u00d7"+
		"\b\n\u0003\n\u00d9\b\n\u0004\n\u00db\b\n\u000b\n\f\n\u00dc\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u00e3\b\n\n\n\f\n\u00e6\t\n\u0001\n\u0001\n"+
		"\u0003\n\u00ea\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00f1"+
		"\b\n\n\n\f\n\u00f4\t\n\u0001\n\u0001\n\u0003\n\u00f8\b\n\u0004\n\u00fa"+
		"\b\n\u000b\n\f\n\u00fb\u0003\n\u00fe\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u0108\b\u000b\n\u000b\f\u000b\u010b\t\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0005\f\u0118\b\f\n\f\f\f\u011b\t\f\u0001\f\u0001\f\u0001\f\u0003\f"+
		"\u0120\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0004\u000e\u012d\b\u000e\u000b\u000e"+
		"\f\u000e\u012e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u013a\b\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0005\u000f\u0148\b\u000f\n\u000f\f\u000f\u014b\t\u000f\u0001\u000f\u0000"+
		"\u0001\u001e\u0010\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e\u0000\u0006\u0001\u000034\u0003\u0000$"+
		"%\'(,/\u0002\u0000\'(./\u0002\u0000$%,-\u0003\u0000\u0007\b #))\u0001"+
		"\u0000*+\u0173\u0000%\u0001\u0000\u0000\u0000\u00023\u0001\u0000\u0000"+
		"\u0000\u0004A\u0001\u0000\u0000\u0000\u0006g\u0001\u0000\u0000\u0000\b"+
		"r\u0001\u0000\u0000\u0000\nt\u0001\u0000\u0000\u0000\fz\u0001\u0000\u0000"+
		"\u0000\u000e\u008f\u0001\u0000\u0000\u0000\u0010\u0096\u0001\u0000\u0000"+
		"\u0000\u0012\u00ab\u0001\u0000\u0000\u0000\u0014\u00fd\u0001\u0000\u0000"+
		"\u0000\u0016\u00ff\u0001\u0000\u0000\u0000\u0018\u010e\u0001\u0000\u0000"+
		"\u0000\u001a\u0123\u0001\u0000\u0000\u0000\u001c\u012a\u0001\u0000\u0000"+
		"\u0000\u001e\u0139\u0001\u0000\u0000\u0000 !\u0005\n\u0000\u0000!\"\u0005"+
		"2\u0000\u0000\"$\u00057\u0000\u0000# \u0001\u0000\u0000\u0000$\'\u0001"+
		"\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000"+
		"&(\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000()\u0005\t\u0000"+
		"\u0000)*\u00052\u0000\u0000*-\u00057\u0000\u0000+.\u0003\u0002\u0001\u0000"+
		",.\u0003\u0006\u0003\u0000-+\u0001\u0000\u0000\u0000-,\u0001\u0000\u0000"+
		"\u0000./\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000"+
		"\u0000\u000001\u0001\u0000\u0000\u000012\u0005\u0001\u0000\u00002\u0001"+
		"\u0001\u0000\u0000\u000034\u0005\u000b\u0000\u000045\u00052\u0000\u0000"+
		"56\u0005\u001c\u0000\u00006;\u00057\u0000\u00007:\u0003\u0006\u0003\u0000"+
		"8:\u0003\u0004\u0002\u000097\u0001\u0000\u0000\u000098\u0001\u0000\u0000"+
		"\u0000:=\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000"+
		"\u0000\u0000<>\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000>?\u0005"+
		"\u001d\u0000\u0000?@\u00057\u0000\u0000@\u0003\u0001\u0000\u0000\u0000"+
		"AB\u0005\f\u0000\u0000BC\u00052\u0000\u0000CD\u0005\u001c\u0000\u0000"+
		"DH\u00057\u0000\u0000EG\u0003\u0006\u0003\u0000FE\u0001\u0000\u0000\u0000"+
		"GJ\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000"+
		"\u0000IK\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000KL\u0005\u001d"+
		"\u0000\u0000LM\u00057\u0000\u0000M\u0005\u0001\u0000\u0000\u0000NO\u0003"+
		"\b\u0004\u0000OP\u00057\u0000\u0000Ph\u0001\u0000\u0000\u0000QR\u0003"+
		"\u0012\t\u0000RS\u00057\u0000\u0000Sh\u0001\u0000\u0000\u0000TU\u0003"+
		"\u0014\n\u0000UV\u00057\u0000\u0000Vh\u0001\u0000\u0000\u0000WX\u0003"+
		"\u0016\u000b\u0000XY\u00057\u0000\u0000Yh\u0001\u0000\u0000\u0000Z[\u0003"+
		"\u0018\f\u0000[\\\u00057\u0000\u0000\\h\u0001\u0000\u0000\u0000]^\u0003"+
		"\u001a\r\u0000^_\u00057\u0000\u0000_h\u0001\u0000\u0000\u0000`a\u0005"+
		"\u0014\u0000\u0000ah\u00057\u0000\u0000bc\u0005\u0015\u0000\u0000ch\u0005"+
		"7\u0000\u0000de\u0005\u0016\u0000\u0000eh\u00057\u0000\u0000fh\u00057"+
		"\u0000\u0000gN\u0001\u0000\u0000\u0000gQ\u0001\u0000\u0000\u0000gT\u0001"+
		"\u0000\u0000\u0000gW\u0001\u0000\u0000\u0000gZ\u0001\u0000\u0000\u0000"+
		"g]\u0001\u0000\u0000\u0000g`\u0001\u0000\u0000\u0000gb\u0001\u0000\u0000"+
		"\u0000gd\u0001\u0000\u0000\u0000gf\u0001\u0000\u0000\u0000h\u0007\u0001"+
		"\u0000\u0000\u0000ij\u00052\u0000\u0000jk\u0005\u0002\u0000\u0000kl\u0005"+
		"0\u0000\u0000ls\u0003\n\u0005\u0000mn\u00050\u0000\u0000ns\u0003\n\u0005"+
		"\u0000op\u00052\u0000\u0000pq\u0005\u0002\u0000\u0000qs\u0003\u0010\b"+
		"\u0000ri\u0001\u0000\u0000\u0000rm\u0001\u0000\u0000\u0000ro\u0001\u0000"+
		"\u0000\u0000s\t\u0001\u0000\u0000\u0000tv\u0005\u001a\u0000\u0000uw\u0003"+
		"\f\u0006\u0000vu\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wx\u0001"+
		"\u0000\u0000\u0000xy\u0005\u001b\u0000\u0000y\u000b\u0001\u0000\u0000"+
		"\u0000z\u007f\u0003\u000e\u0007\u0000{|\u0005\u0003\u0000\u0000|~\u0003"+
		"\u000e\u0007\u0000}{\u0001\u0000\u0000\u0000~\u0081\u0001\u0000\u0000"+
		"\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000"+
		"\u0080\u008c\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000"+
		"\u0082\u0083\u0005\u0003\u0000\u0000\u0083\u0084\u00051\u0000\u0000\u0084"+
		"\u0088\u0005\u0002\u0000\u0000\u0085\u0086\u00050\u0000\u0000\u0086\u0089"+
		"\u0003\n\u0005\u0000\u0087\u0089\u0003\u0010\b\u0000\u0088\u0085\u0001"+
		"\u0000\u0000\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u008b\u0001"+
		"\u0000\u0000\u0000\u008a\u0082\u0001\u0000\u0000\u0000\u008b\u008e\u0001"+
		"\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001"+
		"\u0000\u0000\u0000\u008d\r\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000"+
		"\u0000\u0000\u008f\u0090\u0007\u0000\u0000\u0000\u0090\u000f\u0001\u0000"+
		"\u0000\u0000\u0091\u0097\u00054\u0000\u0000\u0092\u0094\u0007\u0001\u0000"+
		"\u0000\u0093\u0095\u00054\u0000\u0000\u0094\u0093\u0001\u0000\u0000\u0000"+
		"\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0097\u0001\u0000\u0000\u0000"+
		"\u0096\u0091\u0001\u0000\u0000\u0000\u0096\u0092\u0001\u0000\u0000\u0000"+
		"\u0097\u0011\u0001\u0000\u0000\u0000\u0098\u0099\u00052\u0000\u0000\u0099"+
		"\u009a\u0005\u0004\u0000\u0000\u009a\u009b\u00051\u0000\u0000\u009b\u009f"+
		"\u0005\u0002\u0000\u0000\u009c\u009d\u00050\u0000\u0000\u009d\u00a0\u0003"+
		"\n\u0005\u0000\u009e\u00a0\u0003\u0010\b\u0000\u009f\u009c\u0001\u0000"+
		"\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u00a0\u00ac\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a2\u00050\u0000\u0000\u00a2\u00a3\u0003\n\u0005"+
		"\u0000\u00a3\u00a4\u0005\u0004\u0000\u0000\u00a4\u00a5\u00051\u0000\u0000"+
		"\u00a5\u00a9\u0005\u0002\u0000\u0000\u00a6\u00a7\u00050\u0000\u0000\u00a7"+
		"\u00aa\u0003\n\u0005\u0000\u00a8\u00aa\u0003\u0010\b\u0000\u00a9\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ac"+
		"\u0001\u0000\u0000\u0000\u00ab\u0098\u0001\u0000\u0000\u0000\u00ab\u00a1"+
		"\u0001\u0000\u0000\u0000\u00ac\u0013\u0001\u0000\u0000\u0000\u00ad\u00b0"+
		"\u0005 \u0000\u0000\u00ae\u00b1\u00052\u0000\u0000\u00af\u00b1\u0003\b"+
		"\u0004\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0\u00af\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b9\u0001\u0000\u0000\u0000\u00b2\u00b5\u0005\u0003"+
		"\u0000\u0000\u00b3\u00b6\u00052\u0000\u0000\u00b4\u00b6\u0003\b\u0004"+
		"\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b8\u0001\u0000\u0000\u0000\u00b7\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b8\u00bb\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bc\u0001\u0000\u0000"+
		"\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bc\u00c2\u0005!\u0000\u0000"+
		"\u00bd\u00c0\u00052\u0000\u0000\u00be\u00c0\u0003\b\u0004\u0000\u00bf"+
		"\u00bd\u0001\u0000\u0000\u0000\u00bf\u00be\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c1\u00ad\u0001\u0000\u0000\u0000\u00c1"+
		"\u00bf\u0001\u0000\u0000\u0000\u00c2\u00da\u0001\u0000\u0000\u0000\u00c3"+
		"\u00d8\u0005\r\u0000\u0000\u00c4\u00c7\u0005 \u0000\u0000\u00c5\u00c8"+
		"\u00052\u0000\u0000\u00c6\u00c8\u0003\b\u0004\u0000\u00c7\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c8\u00d0\u0001"+
		"\u0000\u0000\u0000\u00c9\u00cc\u0005\u0003\u0000\u0000\u00ca\u00cd\u0005"+
		"2\u0000\u0000\u00cb\u00cd\u0003\b\u0004\u0000\u00cc\u00ca\u0001\u0000"+
		"\u0000\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cd\u00cf\u0001\u0000"+
		"\u0000\u0000\u00ce\u00c9\u0001\u0000\u0000\u0000\u00cf\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d3\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d9\u0005!\u0000\u0000\u00d4\u00d7\u00052\u0000\u0000"+
		"\u00d5\u00d7\u0003\b\u0004\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d9\u0001\u0000\u0000\u0000\u00d8"+
		"\u00c4\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d9"+
		"\u00db\u0001\u0000\u0000\u0000\u00da\u00c3\u0001\u0000\u0000\u0000\u00db"+
		"\u00dc\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc"+
		"\u00dd\u0001\u0000\u0000\u0000\u00dd\u00fe\u0001\u0000\u0000\u0000\u00de"+
		"\u00df\u0005 \u0000\u0000\u00df\u00e4\u00052\u0000\u0000\u00e0\u00e1\u0005"+
		"\u0003\u0000\u0000\u00e1\u00e3\u00052\u0000\u0000\u00e2\u00e0\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e6\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e7\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e7\u00ea\u0005!\u0000"+
		"\u0000\u00e8\u00ea\u00052\u0000\u0000\u00e9\u00de\u0001\u0000\u0000\u0000"+
		"\u00e9\u00e8\u0001\u0000\u0000\u0000\u00ea\u00f9\u0001\u0000\u0000\u0000"+
		"\u00eb\u00f7\u0005\u000e\u0000\u0000\u00ec\u00ed\u0005 \u0000\u0000\u00ed"+
		"\u00f2\u00052\u0000\u0000\u00ee\u00ef\u0005\u0003\u0000\u0000\u00ef\u00f1"+
		"\u00052\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f1\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f5\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f8\u0005!\u0000\u0000\u00f6\u00f8\u00052\u0000"+
		"\u0000\u00f7\u00ec\u0001\u0000\u0000\u0000\u00f7\u00f6\u0001\u0000\u0000"+
		"\u0000\u00f8\u00fa\u0001\u0000\u0000\u0000\u00f9\u00eb\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fe\u0001\u0000\u0000"+
		"\u0000\u00fd\u00c1\u0001\u0000\u0000\u0000\u00fd\u00e9\u0001\u0000\u0000"+
		"\u0000\u00fe\u0015\u0001\u0000\u0000\u0000\u00ff\u0100\u0005\u0018\u0000"+
		"\u0000\u0100\u0101\u00052\u0000\u0000\u0101\u0102\u0005\u0019\u0000\u0000"+
		"\u0102\u0103\u00052\u0000\u0000\u0103\u0104\u0005\u001c\u0000\u0000\u0104"+
		"\u0109\u00057\u0000\u0000\u0105\u0108\u0003\u0006\u0003\u0000\u0106\u0108"+
		"\u0003\u0004\u0002\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0107\u0106"+
		"\u0001\u0000\u0000\u0000\u0108\u010b\u0001\u0000\u0000\u0000\u0109\u0107"+
		"\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u010c"+
		"\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010c\u010d"+
		"\u0005\u001d\u0000\u0000\u010d\u0017\u0001\u0000\u0000\u0000\u010e\u010f"+
		"\u0005\u000f\u0000\u0000\u010f\u0110\u0003\u001e\u000f\u0000\u0110\u0111"+
		"\u0005\u0005\u0000\u0000\u0111\u0119\u0003\u001c\u000e\u0000\u0112\u0113"+
		"\u0005\u0010\u0000\u0000\u0113\u0114\u0003\u001e\u000f\u0000\u0114\u0115"+
		"\u0005\u0005\u0000\u0000\u0115\u0116\u0003\u001c\u000e\u0000\u0116\u0118"+
		"\u0001\u0000\u0000\u0000\u0117\u0112\u0001\u0000\u0000\u0000\u0118\u011b"+
		"\u0001\u0000\u0000\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u0119\u011a"+
		"\u0001\u0000\u0000\u0000\u011a\u011f\u0001\u0000\u0000\u0000\u011b\u0119"+
		"\u0001\u0000\u0000\u0000\u011c\u011d\u0005\u0011\u0000\u0000\u011d\u011e"+
		"\u0005\u0005\u0000\u0000\u011e\u0120\u0003\u001c\u000e\u0000\u011f\u011c"+
		"\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0121"+
		"\u0001\u0000\u0000\u0000\u0121\u0122\u0005\u0017\u0000\u0000\u0122\u0019"+
		"\u0001\u0000\u0000\u0000\u0123\u0124\u0005\u0012\u0000\u0000\u0124\u0125"+
		"\u00055\u0000\u0000\u0125\u0126\u0005\u0006\u0000\u0000\u0126\u0127\u0005"+
		"\u0005\u0000\u0000\u0127\u0128\u0003\u001c\u000e\u0000\u0128\u0129\u0005"+
		"\u0017\u0000\u0000\u0129\u001b\u0001\u0000\u0000\u0000\u012a\u012c\u0005"+
		"7\u0000\u0000\u012b\u012d\u0003\u0006\u0003\u0000\u012c\u012b\u0001\u0000"+
		"\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e\u012c\u0001\u0000"+
		"\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u001d\u0001\u0000"+
		"\u0000\u0000\u0130\u0131\u0006\u000f\uffff\uffff\u0000\u0131\u013a\u0005"+
		"4\u0000\u0000\u0132\u013a\u00052\u0000\u0000\u0133\u0134\u00050\u0000"+
		"\u0000\u0134\u013a\u0003\n\u0005\u0000\u0135\u0136\u0005\u001a\u0000\u0000"+
		"\u0136\u0137\u0003\u001e\u000f\u0000\u0137\u0138\u0005\u001b\u0000\u0000"+
		"\u0138\u013a\u0001\u0000\u0000\u0000\u0139\u0130\u0001\u0000\u0000\u0000"+
		"\u0139\u0132\u0001\u0000\u0000\u0000\u0139\u0133\u0001\u0000\u0000\u0000"+
		"\u0139\u0135\u0001\u0000\u0000\u0000\u013a\u0149\u0001\u0000\u0000\u0000"+
		"\u013b\u013c\n\b\u0000\u0000\u013c\u013d\u0007\u0002\u0000\u0000\u013d"+
		"\u0148\u0003\u001e\u000f\t\u013e\u013f\n\u0007\u0000\u0000\u013f\u0140"+
		"\u0007\u0003\u0000\u0000\u0140\u0148\u0003\u001e\u000f\b\u0141\u0142\n"+
		"\u0006\u0000\u0000\u0142\u0143\u0007\u0004\u0000\u0000\u0143\u0148\u0003"+
		"\u001e\u000f\u0007\u0144\u0145\n\u0005\u0000\u0000\u0145\u0146\u0007\u0005"+
		"\u0000\u0000\u0146\u0148\u0003\u001e\u000f\u0006\u0147\u013b\u0001\u0000"+
		"\u0000\u0000\u0147\u013e\u0001\u0000\u0000\u0000\u0147\u0141\u0001\u0000"+
		"\u0000\u0000\u0147\u0144\u0001\u0000\u0000\u0000\u0148\u014b\u0001\u0000"+
		"\u0000\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000"+
		"\u0000\u0000\u014a\u001f\u0001\u0000\u0000\u0000\u014b\u0149\u0001\u0000"+
		"\u0000\u0000*%-/9;Hgrv\u007f\u0088\u008c\u0094\u0096\u009f\u00a9\u00ab"+
		"\u00b0\u00b5\u00b9\u00bf\u00c1\u00c7\u00cc\u00d0\u00d6\u00d8\u00dc\u00e4"+
		"\u00e9\u00f2\u00f7\u00fb\u00fd\u0107\u0109\u0119\u011f\u012e\u0139\u0147"+
		"\u0149";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}