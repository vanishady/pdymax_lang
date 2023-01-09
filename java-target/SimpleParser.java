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
		SIGDIV=46, SIGSTAR=47, NODETYPE=48, GENERALTYPE=49, OBJTYPE=50, INOUTID=51, 
		ID=52, SYMBOL=53, NUMBER=54, INTEGER=55, FLOAT=56, NL=57, WS=58, COMMENT=59;
	public static final int
		RULE_prog = 0, RULE_blockstmt = 1, RULE_subblockstmt = 2, RULE_stmt = 3, 
		RULE_declarationstmt = 4, RULE_parameters = 5, RULE_typedargslist = 6, 
		RULE_arg = 7, RULE_operation = 8, RULE_ioletdeclasarg = 9, RULE_ioletdeclstmt = 10, 
		RULE_connectionstmt = 11, RULE_declinside = 12, RULE_connectionelem = 13, 
		RULE_disconnectionstmt = 14, RULE_disconnectionelem = 15, RULE_recallstmt = 16, 
		RULE_ifstmt = 17, RULE_forstmt = 18, RULE_suite = 19, RULE_expr = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "blockstmt", "subblockstmt", "stmt", "declarationstmt", "parameters", 
			"typedargslist", "arg", "operation", "ioletdeclasarg", "ioletdeclstmt", 
			"connectionstmt", "declinside", "connectionelem", "disconnectionstmt", 
			"disconnectionelem", "recallstmt", "ifstmt", "forstmt", "suite", "expr"
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
			"GENERALTYPE", "OBJTYPE", "INOUTID", "ID", "SYMBOL", "NUMBER", "INTEGER", 
			"FLOAT", "NL", "WS", "COMMENT"
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
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INCLUDE) {
				{
				{
				setState(42);
				match(INCLUDE);
				setState(43);
				match(ID);
				setState(44);
				match(NL);
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			match(PATCH);
			setState(51);
			match(ID);
			setState(52);
			match(NL);
			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(55);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BLOCK:
					{
					setState(53);
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
					setState(54);
					stmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 148900266999318528L) != 0 );
			setState(59);
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
			setState(61);
			match(BLOCK);
			setState(62);
			match(ID);
			setState(63);
			match(L_CURLY);
			setState(64);
			match(NL);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 148900266999320576L) != 0) {
				{
				setState(67);
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
					setState(65);
					stmt();
					}
					break;
				case SUBBLOCK:
					{
					setState(66);
					subblockstmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			match(R_CURLY);
			setState(73);
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
			setState(75);
			match(SUBBLOCK);
			setState(76);
			match(ID);
			setState(77);
			match(L_CURLY);
			setState(78);
			match(NL);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 148900266999316480L) != 0) {
				{
				{
				setState(79);
				stmt();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			match(R_CURLY);
			setState(86);
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
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				declarationstmt();
				setState(89);
				match(NL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				ioletdeclstmt();
				setState(92);
				match(NL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				connectionstmt();
				setState(95);
				match(NL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				recallstmt();
				setState(98);
				match(NL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(100);
				ifstmt();
				setState(101);
				match(NL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(103);
				forstmt();
				setState(104);
				match(NL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(106);
				match(BREAK);
				setState(107);
				match(NL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(108);
				match(CONTINUE);
				setState(109);
				match(NL);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(110);
				match(PASS);
				setState(111);
				match(NL);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(112);
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
		public DeclarationstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationstmt; }
	 
		public DeclarationstmtContext() { }
		public void copyFrom(DeclarationstmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FullDeclStmtContext extends DeclarationstmtContext {
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode NODETYPE() { return getToken(SimpleParser.NODETYPE, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public FullDeclStmtContext(DeclarationstmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterFullDeclStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitFullDeclStmt(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FastDeclStmtContext extends DeclarationstmtContext {
		public TerminalNode NODETYPE() { return getToken(SimpleParser.NODETYPE, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public FastDeclStmtContext(DeclarationstmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterFastDeclStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitFastDeclStmt(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OpDeclStmtContext extends DeclarationstmtContext {
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public OpDeclStmtContext(DeclarationstmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterOpDeclStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitOpDeclStmt(this);
		}
	}

	public final DeclarationstmtContext declarationstmt() throws RecognitionException {
		DeclarationstmtContext _localctx = new DeclarationstmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declarationstmt);
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new FullDeclStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(ID);
				setState(116);
				match(T__1);
				{
				setState(117);
				match(NODETYPE);
				setState(118);
				parameters();
				}
				}
				break;
			case 2:
				_localctx = new FastDeclStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(NODETYPE);
				setState(120);
				parameters();
				}
				break;
			case 3:
				_localctx = new OpDeclStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				match(ID);
				setState(122);
				match(T__1);
				setState(123);
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
			setState(126);
			match(L_PAREN);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SYMBOL || _la==NUMBER) {
				{
				setState(127);
				typedargslist();
				}
			}

			setState(130);
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
		public List<IoletdeclasargContext> ioletdeclasarg() {
			return getRuleContexts(IoletdeclasargContext.class);
		}
		public IoletdeclasargContext ioletdeclasarg(int i) {
			return getRuleContext(IoletdeclasargContext.class,i);
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
			setState(132);
			arg();
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(133);
					match(T__2);
					setState(134);
					arg();
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(140);
				match(T__2);
				setState(141);
				ioletdeclasarg();
				}
				}
				setState(146);
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
			setState(147);
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
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
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
				setState(150);
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
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(151);
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
	public static class IoletdeclasargContext extends ParserRuleContext {
		public TerminalNode INOUTID() { return getToken(SimpleParser.INOUTID, 0); }
		public TerminalNode NODETYPE() { return getToken(SimpleParser.NODETYPE, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public IoletdeclasargContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ioletdeclasarg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterIoletdeclasarg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitIoletdeclasarg(this);
		}
	}

	public final IoletdeclasargContext ioletdeclasarg() throws RecognitionException {
		IoletdeclasargContext _localctx = new IoletdeclasargContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ioletdeclasarg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(INOUTID);
			setState(157);
			match(T__1);
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NODETYPE:
				{
				setState(158);
				match(NODETYPE);
				setState(159);
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
				setState(160);
				operation();
				}
				break;
			case ID:
				{
				setState(161);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public IoletdeclasargContext ioletdeclasarg() {
			return getRuleContext(IoletdeclasargContext.class,0);
		}
		public TerminalNode NODETYPE() { return getToken(SimpleParser.NODETYPE, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
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
		enterRule(_localctx, 20, RULE_ioletdeclstmt);
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				match(ID);
				setState(165);
				match(T__3);
				setState(166);
				ioletdeclasarg();
				}
				break;
			case NODETYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(NODETYPE);
				setState(168);
				parameters();
				setState(169);
				match(T__3);
				setState(170);
				ioletdeclasarg();
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
		public List<ConnectionelemContext> connectionelem() {
			return getRuleContexts(ConnectionelemContext.class);
		}
		public ConnectionelemContext connectionelem(int i) {
			return getRuleContext(ConnectionelemContext.class,i);
		}
		public List<TerminalNode> CONNECT() { return getTokens(SimpleParser.CONNECT); }
		public TerminalNode CONNECT(int i) {
			return getToken(SimpleParser.CONNECT, i);
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
		enterRule(_localctx, 22, RULE_connectionstmt);
		int _la;
		try {
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ANGLE:
			case NODETYPE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				connectionelem();
				setState(177); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(175);
					match(CONNECT);
					setState(176);
					connectionelem();
					}
					}
					setState(179); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CONNECT );
				}
				break;
			case NL:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class DeclinsideContext extends ParserRuleContext {
		public DeclinsideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declinside; }
	 
		public DeclinsideContext() { }
		public void copyFrom(DeclinsideContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FullDeclStmtInsideContext extends DeclinsideContext {
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode NODETYPE() { return getToken(SimpleParser.NODETYPE, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public FullDeclStmtInsideContext(DeclinsideContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterFullDeclStmtInside(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitFullDeclStmtInside(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OpDeclStmtInsideContext extends DeclinsideContext {
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public OpDeclStmtInsideContext(DeclinsideContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterOpDeclStmtInside(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitOpDeclStmtInside(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FastDeclStmtInsideContext extends DeclinsideContext {
		public TerminalNode NODETYPE() { return getToken(SimpleParser.NODETYPE, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public FastDeclStmtInsideContext(DeclinsideContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterFastDeclStmtInside(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitFastDeclStmtInside(this);
		}
	}

	public final DeclinsideContext declinside() throws RecognitionException {
		DeclinsideContext _localctx = new DeclinsideContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declinside);
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new FullDeclStmtInsideContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				match(ID);
				setState(185);
				match(T__1);
				{
				setState(186);
				match(NODETYPE);
				setState(187);
				parameters();
				}
				}
				break;
			case 2:
				_localctx = new FastDeclStmtInsideContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				match(NODETYPE);
				setState(189);
				parameters();
				}
				break;
			case 3:
				_localctx = new OpDeclStmtInsideContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				match(ID);
				setState(191);
				match(T__1);
				setState(192);
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
	public static class ConnectionelemContext extends ParserRuleContext {
		public TerminalNode L_ANGLE() { return getToken(SimpleParser.L_ANGLE, 0); }
		public TerminalNode R_ANGLE() { return getToken(SimpleParser.R_ANGLE, 0); }
		public List<TerminalNode> ID() { return getTokens(SimpleParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SimpleParser.ID, i);
		}
		public List<DeclinsideContext> declinside() {
			return getRuleContexts(DeclinsideContext.class);
		}
		public DeclinsideContext declinside(int i) {
			return getRuleContext(DeclinsideContext.class,i);
		}
		public ConnectionelemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connectionelem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterConnectionelem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitConnectionelem(this);
		}
	}

	public final ConnectionelemContext connectionelem() throws RecognitionException {
		ConnectionelemContext _localctx = new ConnectionelemContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_connectionelem);
		int _la;
		try {
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ANGLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(L_ANGLE);
				setState(198);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(196);
					match(ID);
					}
					break;
				case 2:
					{
					setState(197);
					declinside();
					}
					break;
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(200);
					match(T__2);
					setState(203);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						setState(201);
						match(ID);
						}
						break;
					case 2:
						{
						setState(202);
						declinside();
						}
						break;
					}
					}
					}
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(210);
				match(R_ANGLE);
				}
				break;
			case NODETYPE:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(211);
					match(ID);
					}
					break;
				case 2:
					{
					setState(212);
					declinside();
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
	public static class DisconnectionstmtContext extends ParserRuleContext {
		public List<DisconnectionelemContext> disconnectionelem() {
			return getRuleContexts(DisconnectionelemContext.class);
		}
		public DisconnectionelemContext disconnectionelem(int i) {
			return getRuleContext(DisconnectionelemContext.class,i);
		}
		public List<TerminalNode> DISCONNECT() { return getTokens(SimpleParser.DISCONNECT); }
		public TerminalNode DISCONNECT(int i) {
			return getToken(SimpleParser.DISCONNECT, i);
		}
		public DisconnectionstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disconnectionstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterDisconnectionstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitDisconnectionstmt(this);
		}
	}

	public final DisconnectionstmtContext disconnectionstmt() throws RecognitionException {
		DisconnectionstmtContext _localctx = new DisconnectionstmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_disconnectionstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			disconnectionelem();
			setState(220); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(218);
				match(DISCONNECT);
				setState(219);
				disconnectionelem();
				}
				}
				setState(222); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DISCONNECT );
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
	public static class DisconnectionelemContext extends ParserRuleContext {
		public TerminalNode L_ANGLE() { return getToken(SimpleParser.L_ANGLE, 0); }
		public List<TerminalNode> ID() { return getTokens(SimpleParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SimpleParser.ID, i);
		}
		public TerminalNode R_ANGLE() { return getToken(SimpleParser.R_ANGLE, 0); }
		public DisconnectionelemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disconnectionelem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterDisconnectionelem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitDisconnectionelem(this);
		}
	}

	public final DisconnectionelemContext disconnectionelem() throws RecognitionException {
		DisconnectionelemContext _localctx = new DisconnectionelemContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_disconnectionelem);
		int _la;
		try {
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ANGLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				match(L_ANGLE);
				setState(225);
				match(ID);
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(226);
					match(T__2);
					setState(227);
					match(ID);
					}
					}
					setState(232);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(233);
				match(R_ANGLE);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				match(ID);
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
		enterRule(_localctx, 32, RULE_recallstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(RECALL);
			setState(238);
			match(ID);
			setState(239);
			match(TO);
			setState(240);
			match(ID);
			setState(241);
			match(L_CURLY);
			setState(242);
			match(NL);
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 148900266999320576L) != 0) {
				{
				setState(245);
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
					setState(243);
					stmt();
					}
					break;
				case SUBBLOCK:
					{
					setState(244);
					subblockstmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(250);
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
		enterRule(_localctx, 34, RULE_ifstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(IF);
			setState(253);
			expr(0);
			setState(254);
			match(T__4);
			setState(255);
			suite();
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(256);
				match(ELIF);
				setState(257);
				expr(0);
				setState(258);
				match(T__4);
				setState(259);
				suite();
				}
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(266);
				match(ELSE);
				setState(267);
				match(T__4);
				setState(268);
				suite();
				}
			}

			setState(271);
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
		enterRule(_localctx, 36, RULE_forstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(FOR);
			setState(274);
			match(INTEGER);
			setState(275);
			match(T__5);
			setState(276);
			match(T__4);
			setState(277);
			suite();
			setState(278);
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
		enterRule(_localctx, 38, RULE_suite);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(NL);
			setState(282); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(281);
				stmt();
				}
				}
				setState(284); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 148900266999316480L) != 0 );
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

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(287);
				match(NUMBER);
				}
				break;
			case L_PAREN:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(288);
				match(L_PAREN);
				setState(289);
				expr(0);
				setState(290);
				match(R_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(308);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(306);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(294);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(295);
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
						setState(296);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(297);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(298);
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
						setState(299);
						expr(6);
						}
						break;
					case 3:
						{
						_localctx = new TestContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(300);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(301);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 2263447765376L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(302);
						expr(5);
						}
						break;
					case 4:
						{
						_localctx = new LogicalContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(303);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(304);
						_la = _input.LA(1);
						if ( !(_la==OR || _la==AND) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(305);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(310);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
		case 20:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001;\u0138\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000.\b\u0000\n\u0000\f\u00001\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u00008\b\u0000"+
		"\u000b\u0000\f\u00009\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001D\b\u0001"+
		"\n\u0001\f\u0001G\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002Q\b\u0002"+
		"\n\u0002\f\u0002T\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003r\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"}\b\u0004\u0001\u0005\u0001\u0005\u0003\u0005\u0081\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0088\b\u0006"+
		"\n\u0006\f\u0006\u008b\t\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u008f"+
		"\b\u0006\n\u0006\f\u0006\u0092\t\u0006\u0001\u0007\u0001\u0007\u0001\b"+
		"\u0001\b\u0001\b\u0003\b\u0099\b\b\u0003\b\u009b\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u00a3\b\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00ad\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0004\u000b\u00b2\b\u000b\u000b\u000b\f\u000b\u00b3"+
		"\u0001\u000b\u0003\u000b\u00b7\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00c2\b\f\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u00c7\b\r\u0001\r\u0001\r\u0001\r\u0003\r\u00cc\b\r"+
		"\u0005\r\u00ce\b\r\n\r\f\r\u00d1\t\r\u0001\r\u0001\r\u0001\r\u0003\r\u00d6"+
		"\b\r\u0003\r\u00d8\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0004\u000e"+
		"\u00dd\b\u000e\u000b\u000e\f\u000e\u00de\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0005\u000f\u00e5\b\u000f\n\u000f\f\u000f\u00e8\t\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u00ec\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u00f6\b\u0010\n\u0010\f\u0010\u00f9\t\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0106\b\u0011\n"+
		"\u0011\f\u0011\u0109\t\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u010e\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0004\u0013\u011b\b\u0013\u000b\u0013\f\u0013\u011c\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u0125\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0005\u0014\u0133\b\u0014\n\u0014\f\u0014\u0136\t\u0014\u0001"+
		"\u0014\u0000\u0001(\u0015\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(\u0000\u0006\u0001\u000056\u0003"+
		"\u0000$%\'(,/\u0002\u0000\'(./\u0002\u0000$%,-\u0003\u0000\u0007\b #)"+
		")\u0001\u0000*+\u0151\u0000/\u0001\u0000\u0000\u0000\u0002=\u0001\u0000"+
		"\u0000\u0000\u0004K\u0001\u0000\u0000\u0000\u0006q\u0001\u0000\u0000\u0000"+
		"\b|\u0001\u0000\u0000\u0000\n~\u0001\u0000\u0000\u0000\f\u0084\u0001\u0000"+
		"\u0000\u0000\u000e\u0093\u0001\u0000\u0000\u0000\u0010\u009a\u0001\u0000"+
		"\u0000\u0000\u0012\u009c\u0001\u0000\u0000\u0000\u0014\u00ac\u0001\u0000"+
		"\u0000\u0000\u0016\u00b6\u0001\u0000\u0000\u0000\u0018\u00c1\u0001\u0000"+
		"\u0000\u0000\u001a\u00d7\u0001\u0000\u0000\u0000\u001c\u00d9\u0001\u0000"+
		"\u0000\u0000\u001e\u00eb\u0001\u0000\u0000\u0000 \u00ed\u0001\u0000\u0000"+
		"\u0000\"\u00fc\u0001\u0000\u0000\u0000$\u0111\u0001\u0000\u0000\u0000"+
		"&\u0118\u0001\u0000\u0000\u0000(\u0124\u0001\u0000\u0000\u0000*+\u0005"+
		"\n\u0000\u0000+,\u00054\u0000\u0000,.\u00059\u0000\u0000-*\u0001\u0000"+
		"\u0000\u0000.1\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001"+
		"\u0000\u0000\u000002\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u0000"+
		"23\u0005\t\u0000\u000034\u00054\u0000\u000047\u00059\u0000\u000058\u0003"+
		"\u0002\u0001\u000068\u0003\u0006\u0003\u000075\u0001\u0000\u0000\u0000"+
		"76\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u000097\u0001\u0000\u0000"+
		"\u00009:\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;<\u0005\u0001"+
		"\u0000\u0000<\u0001\u0001\u0000\u0000\u0000=>\u0005\u000b\u0000\u0000"+
		">?\u00054\u0000\u0000?@\u0005\u001c\u0000\u0000@E\u00059\u0000\u0000A"+
		"D\u0003\u0006\u0003\u0000BD\u0003\u0004\u0002\u0000CA\u0001\u0000\u0000"+
		"\u0000CB\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000"+
		"\u0000\u0000EF\u0001\u0000\u0000\u0000FH\u0001\u0000\u0000\u0000GE\u0001"+
		"\u0000\u0000\u0000HI\u0005\u001d\u0000\u0000IJ\u00059\u0000\u0000J\u0003"+
		"\u0001\u0000\u0000\u0000KL\u0005\f\u0000\u0000LM\u00054\u0000\u0000MN"+
		"\u0005\u001c\u0000\u0000NR\u00059\u0000\u0000OQ\u0003\u0006\u0003\u0000"+
		"PO\u0001\u0000\u0000\u0000QT\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000"+
		"\u0000RS\u0001\u0000\u0000\u0000SU\u0001\u0000\u0000\u0000TR\u0001\u0000"+
		"\u0000\u0000UV\u0005\u001d\u0000\u0000VW\u00059\u0000\u0000W\u0005\u0001"+
		"\u0000\u0000\u0000XY\u0003\b\u0004\u0000YZ\u00059\u0000\u0000Zr\u0001"+
		"\u0000\u0000\u0000[\\\u0003\u0014\n\u0000\\]\u00059\u0000\u0000]r\u0001"+
		"\u0000\u0000\u0000^_\u0003\u0016\u000b\u0000_`\u00059\u0000\u0000`r\u0001"+
		"\u0000\u0000\u0000ab\u0003 \u0010\u0000bc\u00059\u0000\u0000cr\u0001\u0000"+
		"\u0000\u0000de\u0003\"\u0011\u0000ef\u00059\u0000\u0000fr\u0001\u0000"+
		"\u0000\u0000gh\u0003$\u0012\u0000hi\u00059\u0000\u0000ir\u0001\u0000\u0000"+
		"\u0000jk\u0005\u0014\u0000\u0000kr\u00059\u0000\u0000lm\u0005\u0015\u0000"+
		"\u0000mr\u00059\u0000\u0000no\u0005\u0016\u0000\u0000or\u00059\u0000\u0000"+
		"pr\u00059\u0000\u0000qX\u0001\u0000\u0000\u0000q[\u0001\u0000\u0000\u0000"+
		"q^\u0001\u0000\u0000\u0000qa\u0001\u0000\u0000\u0000qd\u0001\u0000\u0000"+
		"\u0000qg\u0001\u0000\u0000\u0000qj\u0001\u0000\u0000\u0000ql\u0001\u0000"+
		"\u0000\u0000qn\u0001\u0000\u0000\u0000qp\u0001\u0000\u0000\u0000r\u0007"+
		"\u0001\u0000\u0000\u0000st\u00054\u0000\u0000tu\u0005\u0002\u0000\u0000"+
		"uv\u00050\u0000\u0000v}\u0003\n\u0005\u0000wx\u00050\u0000\u0000x}\u0003"+
		"\n\u0005\u0000yz\u00054\u0000\u0000z{\u0005\u0002\u0000\u0000{}\u0003"+
		"\u0010\b\u0000|s\u0001\u0000\u0000\u0000|w\u0001\u0000\u0000\u0000|y\u0001"+
		"\u0000\u0000\u0000}\t\u0001\u0000\u0000\u0000~\u0080\u0005\u001a\u0000"+
		"\u0000\u007f\u0081\u0003\f\u0006\u0000\u0080\u007f\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000"+
		"\u0082\u0083\u0005\u001b\u0000\u0000\u0083\u000b\u0001\u0000\u0000\u0000"+
		"\u0084\u0089\u0003\u000e\u0007\u0000\u0085\u0086\u0005\u0003\u0000\u0000"+
		"\u0086\u0088\u0003\u000e\u0007\u0000\u0087\u0085\u0001\u0000\u0000\u0000"+
		"\u0088\u008b\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000"+
		"\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u0090\u0001\u0000\u0000\u0000"+
		"\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u008d\u0005\u0003\u0000\u0000"+
		"\u008d\u008f\u0003\u0012\t\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f"+
		"\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090"+
		"\u0091\u0001\u0000\u0000\u0000\u0091\r\u0001\u0000\u0000\u0000\u0092\u0090"+
		"\u0001\u0000\u0000\u0000\u0093\u0094\u0007\u0000\u0000\u0000\u0094\u000f"+
		"\u0001\u0000\u0000\u0000\u0095\u009b\u00056\u0000\u0000\u0096\u0098\u0007"+
		"\u0001\u0000\u0000\u0097\u0099\u00056\u0000\u0000\u0098\u0097\u0001\u0000"+
		"\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009b\u0001\u0000"+
		"\u0000\u0000\u009a\u0095\u0001\u0000\u0000\u0000\u009a\u0096\u0001\u0000"+
		"\u0000\u0000\u009b\u0011\u0001\u0000\u0000\u0000\u009c\u009d\u00053\u0000"+
		"\u0000\u009d\u00a2\u0005\u0002\u0000\u0000\u009e\u009f\u00050\u0000\u0000"+
		"\u009f\u00a3\u0003\n\u0005\u0000\u00a0\u00a3\u0003\u0010\b\u0000\u00a1"+
		"\u00a3\u00054\u0000\u0000\u00a2\u009e\u0001\u0000\u0000\u0000\u00a2\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3\u0013"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a5\u00054\u0000\u0000\u00a5\u00a6\u0005"+
		"\u0004\u0000\u0000\u00a6\u00ad\u0003\u0012\t\u0000\u00a7\u00a8\u00050"+
		"\u0000\u0000\u00a8\u00a9\u0003\n\u0005\u0000\u00a9\u00aa\u0005\u0004\u0000"+
		"\u0000\u00aa\u00ab\u0003\u0012\t\u0000\u00ab\u00ad\u0001\u0000\u0000\u0000"+
		"\u00ac\u00a4\u0001\u0000\u0000\u0000\u00ac\u00a7\u0001\u0000\u0000\u0000"+
		"\u00ad\u0015\u0001\u0000\u0000\u0000\u00ae\u00b1\u0003\u001a\r\u0000\u00af"+
		"\u00b0\u0005\r\u0000\u0000\u00b0\u00b2\u0003\u001a\r\u0000\u00b1\u00af"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b7\u0001\u0000\u0000\u0000\u00b6\u00ae"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7\u0017"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b9\u00054\u0000\u0000\u00b9\u00ba\u0005"+
		"\u0002\u0000\u0000\u00ba\u00bb\u00050\u0000\u0000\u00bb\u00c2\u0003\n"+
		"\u0005\u0000\u00bc\u00bd\u00050\u0000\u0000\u00bd\u00c2\u0003\n\u0005"+
		"\u0000\u00be\u00bf\u00054\u0000\u0000\u00bf\u00c0\u0005\u0002\u0000\u0000"+
		"\u00c0\u00c2\u0003\u0010\b\u0000\u00c1\u00b8\u0001\u0000\u0000\u0000\u00c1"+
		"\u00bc\u0001\u0000\u0000\u0000\u00c1\u00be\u0001\u0000\u0000\u0000\u00c2"+
		"\u0019\u0001\u0000\u0000\u0000\u00c3\u00c6\u0005 \u0000\u0000\u00c4\u00c7"+
		"\u00054\u0000\u0000\u00c5\u00c7\u0003\u0018\f\u0000\u00c6\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c7\u00cf\u0001"+
		"\u0000\u0000\u0000\u00c8\u00cb\u0005\u0003\u0000\u0000\u00c9\u00cc\u0005"+
		"4\u0000\u0000\u00ca\u00cc\u0003\u0018\f\u0000\u00cb\u00c9\u0001\u0000"+
		"\u0000\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cc\u00ce\u0001\u0000"+
		"\u0000\u0000\u00cd\u00c8\u0001\u0000\u0000\u0000\u00ce\u00d1\u0001\u0000"+
		"\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d2\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d8\u0005!\u0000\u0000\u00d3\u00d6\u00054\u0000\u0000"+
		"\u00d4\u00d6\u0003\u0018\f\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d8\u0001\u0000\u0000\u0000\u00d7"+
		"\u00c3\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d8"+
		"\u001b\u0001\u0000\u0000\u0000\u00d9\u00dc\u0003\u001e\u000f\u0000\u00da"+
		"\u00db\u0005\u000e\u0000\u0000\u00db\u00dd\u0003\u001e\u000f\u0000\u00dc"+
		"\u00da\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de"+
		"\u00dc\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df"+
		"\u001d\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005 \u0000\u0000\u00e1\u00e6"+
		"\u00054\u0000\u0000\u00e2\u00e3\u0005\u0003\u0000\u0000\u00e3\u00e5\u0005"+
		"4\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e5\u00e8\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e9\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e9\u00ec\u0005!\u0000\u0000\u00ea\u00ec\u00054\u0000\u0000"+
		"\u00eb\u00e0\u0001\u0000\u0000\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000"+
		"\u00ec\u001f\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005\u0018\u0000\u0000"+
		"\u00ee\u00ef\u00054\u0000\u0000\u00ef\u00f0\u0005\u0019\u0000\u0000\u00f0"+
		"\u00f1\u00054\u0000\u0000\u00f1\u00f2\u0005\u001c\u0000\u0000\u00f2\u00f7"+
		"\u00059\u0000\u0000\u00f3\u00f6\u0003\u0006\u0003\u0000\u00f4\u00f6\u0003"+
		"\u0004\u0002\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f9\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00fa\u0001"+
		"\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005"+
		"\u001d\u0000\u0000\u00fb!\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005\u000f"+
		"\u0000\u0000\u00fd\u00fe\u0003(\u0014\u0000\u00fe\u00ff\u0005\u0005\u0000"+
		"\u0000\u00ff\u0107\u0003&\u0013\u0000\u0100\u0101\u0005\u0010\u0000\u0000"+
		"\u0101\u0102\u0003(\u0014\u0000\u0102\u0103\u0005\u0005\u0000\u0000\u0103"+
		"\u0104\u0003&\u0013\u0000\u0104\u0106\u0001\u0000\u0000\u0000\u0105\u0100"+
		"\u0001\u0000\u0000\u0000\u0106\u0109\u0001\u0000\u0000\u0000\u0107\u0105"+
		"\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u010d"+
		"\u0001\u0000\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u010a\u010b"+
		"\u0005\u0011\u0000\u0000\u010b\u010c\u0005\u0005\u0000\u0000\u010c\u010e"+
		"\u0003&\u0013\u0000\u010d\u010a\u0001\u0000\u0000\u0000\u010d\u010e\u0001"+
		"\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f\u0110\u0005"+
		"\u0017\u0000\u0000\u0110#\u0001\u0000\u0000\u0000\u0111\u0112\u0005\u0012"+
		"\u0000\u0000\u0112\u0113\u00057\u0000\u0000\u0113\u0114\u0005\u0006\u0000"+
		"\u0000\u0114\u0115\u0005\u0005\u0000\u0000\u0115\u0116\u0003&\u0013\u0000"+
		"\u0116\u0117\u0005\u0017\u0000\u0000\u0117%\u0001\u0000\u0000\u0000\u0118"+
		"\u011a\u00059\u0000\u0000\u0119\u011b\u0003\u0006\u0003\u0000\u011a\u0119"+
		"\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u011a"+
		"\u0001\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\'\u0001"+
		"\u0000\u0000\u0000\u011e\u011f\u0006\u0014\uffff\uffff\u0000\u011f\u0125"+
		"\u00056\u0000\u0000\u0120\u0121\u0005\u001a\u0000\u0000\u0121\u0122\u0003"+
		"(\u0014\u0000\u0122\u0123\u0005\u001b\u0000\u0000\u0123\u0125\u0001\u0000"+
		"\u0000\u0000\u0124\u011e\u0001\u0000\u0000\u0000\u0124\u0120\u0001\u0000"+
		"\u0000\u0000\u0125\u0134\u0001\u0000\u0000\u0000\u0126\u0127\n\u0006\u0000"+
		"\u0000\u0127\u0128\u0007\u0002\u0000\u0000\u0128\u0133\u0003(\u0014\u0007"+
		"\u0129\u012a\n\u0005\u0000\u0000\u012a\u012b\u0007\u0003\u0000\u0000\u012b"+
		"\u0133\u0003(\u0014\u0006\u012c\u012d\n\u0004\u0000\u0000\u012d\u012e"+
		"\u0007\u0004\u0000\u0000\u012e\u0133\u0003(\u0014\u0005\u012f\u0130\n"+
		"\u0003\u0000\u0000\u0130\u0131\u0007\u0005\u0000\u0000\u0131\u0133\u0003"+
		"(\u0014\u0004\u0132\u0126\u0001\u0000\u0000\u0000\u0132\u0129\u0001\u0000"+
		"\u0000\u0000\u0132\u012c\u0001\u0000\u0000\u0000\u0132\u012f\u0001\u0000"+
		"\u0000\u0000\u0133\u0136\u0001\u0000\u0000\u0000\u0134\u0132\u0001\u0000"+
		"\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000\u0135)\u0001\u0000\u0000"+
		"\u0000\u0136\u0134\u0001\u0000\u0000\u0000\"/79CERq|\u0080\u0089\u0090"+
		"\u0098\u009a\u00a2\u00ac\u00b3\u00b6\u00c1\u00c6\u00cb\u00cf\u00d5\u00d7"+
		"\u00de\u00e6\u00eb\u00f5\u00f7\u0107\u010d\u011c\u0124\u0132\u0134";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}