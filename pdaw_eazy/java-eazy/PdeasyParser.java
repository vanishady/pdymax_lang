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
public class PdeasyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, PATCH=30, IMPORT=31, 
		FUNC=32, BLOCK=33, RETURN=34, CONNECT=35, END=36, IF=37, ELIF=38, ELSE=39, 
		FOR=40, AS=41, VARTYPE=42, IOLET=43, NAME=44, VARNAME=45, SYMBOL=46, NUMBER=47, 
		INTEGER=48, FLOAT=49, WS=50, COMMENT=51;
	public static final int
		RULE_prog = 0, RULE_patchstmt = 1, RULE_importstmt = 2, RULE_funcdefstmt = 3, 
		RULE_returnstmt = 4, RULE_stmt = 5, RULE_blockstmt = 6, RULE_callstmt = 7, 
		RULE_nodedecl = 8, RULE_simpledecl = 9, RULE_list = 10, RULE_listelem = 11, 
		RULE_list_access = 12, RULE_connectionstmt = 13, RULE_connectionelem = 14, 
		RULE_singlenode = 15, RULE_parameters = 16, RULE_typedparams = 17, RULE_argslist = 18, 
		RULE_typedargslist = 19, RULE_arg = 20, RULE_typedarg = 21, RULE_suite = 22, 
		RULE_operation = 23, RULE_ifstmt = 24, RULE_expr = 25, RULE_node_expr = 26, 
		RULE_forstmt = 27, RULE_varname = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "patchstmt", "importstmt", "funcdefstmt", "returnstmt", "stmt", 
			"blockstmt", "callstmt", "nodedecl", "simpledecl", "list", "listelem", 
			"list_access", "connectionstmt", "connectionelem", "singlenode", "parameters", 
			"typedparams", "argslist", "typedargslist", "arg", "typedarg", "suite", 
			"operation", "ifstmt", "expr", "node_expr", "forstmt", "varname"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'{'", "'}'", "'@'", "'='", "'['", "','", "']'", "'.'", 
			"'('", "')'", "':'", "'*'", "'/'", "'*~'", "'/~'", "'+'", "'-'", "'+~'", 
			"'-~'", "'%'", "'=='", "'!='", "'>='", "'<'", "'<='", "'%~'", "'->'", 
			"'in range'", "'patch'", "'import'", "'func'", "'block'", "'return'", 
			"'>'", "'end'", "'if'", "'elif'", "'else'", "'for'", "'as'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "PATCH", "IMPORT", "FUNC", "BLOCK", 
			"RETURN", "CONNECT", "END", "IF", "ELIF", "ELSE", "FOR", "AS", "VARTYPE", 
			"IOLET", "NAME", "VARNAME", "SYMBOL", "NUMBER", "INTEGER", "FLOAT", "WS", 
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

	public PdeasyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public PatchstmtContext patchstmt() {
			return getRuleContext(PatchstmtContext.class,0);
		}
		public List<ImportstmtContext> importstmt() {
			return getRuleContexts(ImportstmtContext.class);
		}
		public ImportstmtContext importstmt(int i) {
			return getRuleContext(ImportstmtContext.class,i);
		}
		public List<FuncdefstmtContext> funcdefstmt() {
			return getRuleContexts(FuncdefstmtContext.class);
		}
		public FuncdefstmtContext funcdefstmt(int i) {
			return getRuleContext(FuncdefstmtContext.class,i);
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
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			patchstmt();
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(59);
				importstmt();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNC) {
				{
				{
				setState(65);
				funcdefstmt();
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 54022102835280L) != 0) {
				{
				{
				setState(71);
				stmt();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
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
	public static class PatchstmtContext extends ParserRuleContext {
		public TerminalNode PATCH() { return getToken(PdeasyParser.PATCH, 0); }
		public TerminalNode NAME() { return getToken(PdeasyParser.NAME, 0); }
		public PatchstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patchstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).enterPatchstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).exitPatchstmt(this);
		}
	}

	public final PatchstmtContext patchstmt() throws RecognitionException {
		PatchstmtContext _localctx = new PatchstmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_patchstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(PATCH);
			setState(80);
			match(NAME);
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
	public static class ImportstmtContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(PdeasyParser.IMPORT, 0); }
		public TerminalNode NAME() { return getToken(PdeasyParser.NAME, 0); }
		public ImportstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).enterImportstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).exitImportstmt(this);
		}
	}

	public final ImportstmtContext importstmt() throws RecognitionException {
		ImportstmtContext _localctx = new ImportstmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(IMPORT);
			setState(83);
			match(NAME);
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
	public static class FuncdefstmtContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(PdeasyParser.FUNC, 0); }
		public TerminalNode NAME() { return getToken(PdeasyParser.NAME, 0); }
		public TypedparamsContext typedparams() {
			return getRuleContext(TypedparamsContext.class,0);
		}
		public List<SuiteContext> suite() {
			return getRuleContexts(SuiteContext.class);
		}
		public SuiteContext suite(int i) {
			return getRuleContext(SuiteContext.class,i);
		}
		public List<ReturnstmtContext> returnstmt() {
			return getRuleContexts(ReturnstmtContext.class);
		}
		public ReturnstmtContext returnstmt(int i) {
			return getRuleContext(ReturnstmtContext.class,i);
		}
		public FuncdefstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdefstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).enterFuncdefstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).exitFuncdefstmt(this);
		}
	}

	public final FuncdefstmtContext funcdefstmt() throws RecognitionException {
		FuncdefstmtContext _localctx = new FuncdefstmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcdefstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(FUNC);
			setState(86);
			match(NAME);
			setState(87);
			typedparams();
			setState(88);
			match(T__1);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 54022102835280L) != 0) {
				{
				{
				setState(89);
				suite();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RETURN) {
				{
				{
				setState(95);
				returnstmt();
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			match(T__2);
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
	public static class ReturnstmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(PdeasyParser.RETURN, 0); }
		public VarnameContext varname() {
			return getRuleContext(VarnameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Node_exprContext node_expr() {
			return getRuleContext(Node_exprContext.class,0);
		}
		public ReturnstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).enterReturnstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).exitReturnstmt(this);
		}
	}

	public final ReturnstmtContext returnstmt() throws RecognitionException {
		ReturnstmtContext _localctx = new ReturnstmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_returnstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(RETURN);
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(104);
				varname();
				}
				break;
			case 2:
				{
				setState(105);
				expr(0);
				}
				break;
			case 3:
				{
				setState(106);
				node_expr();
				}
				break;
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
	public static class StmtContext extends ParserRuleContext {
		public BlockstmtContext blockstmt() {
			return getRuleContext(BlockstmtContext.class,0);
		}
		public ConnectionstmtContext connectionstmt() {
			return getRuleContext(ConnectionstmtContext.class,0);
		}
		public CallstmtContext callstmt() {
			return getRuleContext(CallstmtContext.class,0);
		}
		public NodedeclContext nodedecl() {
			return getRuleContext(NodedeclContext.class,0);
		}
		public SimpledeclContext simpledecl() {
			return getRuleContext(SimpledeclContext.class,0);
		}
		public Node_exprContext node_expr() {
			return getRuleContext(Node_exprContext.class,0);
		}
		public IfstmtContext ifstmt() {
			return getRuleContext(IfstmtContext.class,0);
		}
		public ForstmtContext forstmt() {
			return getRuleContext(ForstmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stmt);
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				blockstmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				connectionstmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				callstmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(112);
				nodedecl();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(113);
				simpledecl();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(114);
				node_expr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(115);
				ifstmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(116);
				forstmt();
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
	public static class BlockstmtContext extends ParserRuleContext {
		public TerminalNode BLOCK() { return getToken(PdeasyParser.BLOCK, 0); }
		public TerminalNode NAME() { return getToken(PdeasyParser.NAME, 0); }
		public TypedparamsContext typedparams() {
			return getRuleContext(TypedparamsContext.class,0);
		}
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public BlockstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).enterBlockstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).exitBlockstmt(this);
		}
	}

	public final BlockstmtContext blockstmt() throws RecognitionException {
		BlockstmtContext _localctx = new BlockstmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_blockstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(BLOCK);
			setState(120);
			match(NAME);
			setState(121);
			typedparams();
			setState(122);
			match(T__1);
			setState(123);
			suite();
			setState(124);
			match(T__2);
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
	public static class CallstmtContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PdeasyParser.NAME, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode AS() { return getToken(PdeasyParser.AS, 0); }
		public VarnameContext varname() {
			return getRuleContext(VarnameContext.class,0);
		}
		public CallstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).enterCallstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).exitCallstmt(this);
		}
	}

	public final CallstmtContext callstmt() throws RecognitionException {
		CallstmtContext _localctx = new CallstmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_callstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__3);
			setState(127);
			match(NAME);
			setState(128);
			parameters();
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(129);
				match(AS);
				setState(130);
				varname();
				}
				break;
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
	public static class NodedeclContext extends ParserRuleContext {
		public NodedeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodedecl; }
	 
		public NodedeclContext() { }
		public void copyFrom(NodedeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Nodedecl3Context extends NodedeclContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public Nodedecl3Context(NodedeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).enterNodedecl3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).exitNodedecl3(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Nodedecl2Context extends NodedeclContext {
		public TerminalNode NAME() { return getToken(PdeasyParser.NAME, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public Nodedecl2Context(NodedeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).enterNodedecl2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).exitNodedecl2(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Nodedecl1Context extends NodedeclContext {
		public VarnameContext varname() {
			return getRuleContext(VarnameContext.class,0);
		}
		public TerminalNode NAME() { return getToken(PdeasyParser.NAME, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public Nodedecl1Context(NodedeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).enterNodedecl1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).exitNodedecl1(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Nodedecl4Context extends NodedeclContext {
		public VarnameContext varname() {
			return getRuleContext(VarnameContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public Nodedecl4Context(NodedeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).enterNodedecl4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).exitNodedecl4(this);
		}
	}

	public final NodedeclContext nodedecl() throws RecognitionException {
		NodedeclContext _localctx = new NodedeclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_nodedecl);
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new Nodedecl1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				varname();
				setState(134);
				match(T__4);
				setState(135);
				match(NAME);
				setState(136);
				parameters();
				}
				break;
			case 2:
				_localctx = new Nodedecl2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				match(NAME);
				setState(139);
				parameters();
				}
				break;
			case 3:
				_localctx = new Nodedecl3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				operation();
				}
				break;
			case 4:
				_localctx = new Nodedecl4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(141);
				varname();
				setState(142);
				match(T__4);
				setState(143);
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
	public static class SimpledeclContext extends ParserRuleContext {
		public VarnameContext varname() {
			return getRuleContext(VarnameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public SimpledeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpledecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).enterSimpledecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).exitSimpledecl(this);
		}
	}

	public final SimpledeclContext simpledecl() throws RecognitionException {
		SimpledeclContext _localctx = new SimpledeclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_simpledecl);
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				varname();
				setState(148);
				match(T__4);
				setState(149);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				varname();
				setState(152);
				match(T__4);
				setState(153);
				list();
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
	public static class ListContext extends ParserRuleContext {
		public List<ListelemContext> listelem() {
			return getRuleContexts(ListelemContext.class);
		}
		public ListelemContext listelem(int i) {
			return getRuleContext(ListelemContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(T__5);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 246290604621824L) != 0) {
				{
				{
				setState(158);
				listelem();
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(159);
					match(T__6);
					setState(160);
					listelem();
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
			match(T__7);
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
	public static class ListelemContext extends ParserRuleContext {
		public TerminalNode SYMBOL() { return getToken(PdeasyParser.SYMBOL, 0); }
		public TerminalNode NUMBER() { return getToken(PdeasyParser.NUMBER, 0); }
		public VarnameContext varname() {
			return getRuleContext(VarnameContext.class,0);
		}
		public ListelemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listelem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).enterListelem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).exitListelem(this);
		}
	}

	public final ListelemContext listelem() throws RecognitionException {
		ListelemContext _localctx = new ListelemContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_listelem);
		try {
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(SYMBOL);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(NUMBER);
				}
				break;
			case VARNAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				varname();
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
	public static class List_accessContext extends ParserRuleContext {
		public List<VarnameContext> varname() {
			return getRuleContexts(VarnameContext.class);
		}
		public VarnameContext varname(int i) {
			return getRuleContext(VarnameContext.class,i);
		}
		public TerminalNode NUMBER() { return getToken(PdeasyParser.NUMBER, 0); }
		public List_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_access; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).enterList_access(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).exitList_access(this);
		}
	}

	public final List_accessContext list_access() throws RecognitionException {
		List_accessContext _localctx = new List_accessContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_list_access);
		try {
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				varname();
				setState(179);
				match(T__5);
				setState(180);
				varname();
				setState(181);
				match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				varname();
				setState(184);
				match(T__5);
				setState(185);
				match(NUMBER);
				setState(186);
				match(T__7);
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
	public static class ConnectionstmtContext extends ParserRuleContext {
		public List<ConnectionelemContext> connectionelem() {
			return getRuleContexts(ConnectionelemContext.class);
		}
		public ConnectionelemContext connectionelem(int i) {
			return getRuleContext(ConnectionelemContext.class,i);
		}
		public List<TerminalNode> CONNECT() { return getTokens(PdeasyParser.CONNECT); }
		public TerminalNode CONNECT(int i) {
			return getToken(PdeasyParser.CONNECT, i);
		}
		public ConnectionstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connectionstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).enterConnectionstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).exitConnectionstmt(this);
		}
	}

	public final ConnectionstmtContext connectionstmt() throws RecognitionException {
		ConnectionstmtContext _localctx = new ConnectionstmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_connectionstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			connectionelem();
			setState(193); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(191);
				match(CONNECT);
				setState(192);
				connectionelem();
				}
				}
				setState(195); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CONNECT );
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
		public ConnectionelemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connectionelem; }
	 
		public ConnectionelemContext() { }
		public void copyFrom(ConnectionelemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultipleconnContext extends ConnectionelemContext {
		public List<SinglenodeContext> singlenode() {
			return getRuleContexts(SinglenodeContext.class);
		}
		public SinglenodeContext singlenode(int i) {
			return getRuleContext(SinglenodeContext.class,i);
		}
		public MultipleconnContext(ConnectionelemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).enterMultipleconn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).exitMultipleconn(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleconnContext extends ConnectionelemContext {
		public SinglenodeContext singlenode() {
			return getRuleContext(SinglenodeContext.class,0);
		}
		public SingleconnContext(ConnectionelemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).enterSingleconn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).exitSingleconn(this);
		}
	}

	public final ConnectionelemContext connectionelem() throws RecognitionException {
		ConnectionelemContext _localctx = new ConnectionelemContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_connectionelem);
		int _la;
		try {
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				_localctx = new MultipleconnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(T__5);
				setState(198);
				singlenode();
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(199);
					match(T__6);
					setState(200);
					singlenode();
					}
					}
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(206);
				match(T__7);
				}
				break;
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case NAME:
			case VARNAME:
				_localctx = new SingleconnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				singlenode();
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
	public static class SinglenodeContext extends ParserRuleContext {
		public VarnameContext varname() {
			return getRuleContext(VarnameContext.class,0);
		}
		public NodedeclContext nodedecl() {
			return getRuleContext(NodedeclContext.class,0);
		}
		public TerminalNode IOLET() { return getToken(PdeasyParser.IOLET, 0); }
		public SinglenodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singlenode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).enterSinglenode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).exitSinglenode(this);
		}
	}

	public final SinglenodeContext singlenode() throws RecognitionException {
		SinglenodeContext _localctx = new SinglenodeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_singlenode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(211);
				varname();
				}
				break;
			case 2:
				{
				setState(212);
				nodedecl();
				}
				break;
			}
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(215);
				match(T__8);
				setState(216);
				match(IOLET);
				}
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
	public static class ParametersContext extends ParserRuleContext {
		public ArgslistContext argslist() {
			return getRuleContext(ArgslistContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(T__9);
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 246290604622928L) != 0) {
				{
				setState(220);
				argslist();
				}
			}

			setState(223);
			match(T__10);
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
	public static class TypedparamsContext extends ParserRuleContext {
		public TypedargslistContext typedargslist() {
			return getRuleContext(TypedargslistContext.class,0);
		}
		public TypedparamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedparams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).enterTypedparams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).exitTypedparams(this);
		}
	}

	public final TypedparamsContext typedparams() throws RecognitionException {
		TypedparamsContext _localctx = new TypedparamsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typedparams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(T__9);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARNAME) {
				{
				setState(226);
				typedargslist();
				}
			}

			setState(229);
			match(T__10);
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
	public static class ArgslistContext extends ParserRuleContext {
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public ArgslistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argslist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).enterArgslist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).exitArgslist(this);
		}
	}

	public final ArgslistContext argslist() throws RecognitionException {
		ArgslistContext _localctx = new ArgslistContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_argslist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			arg();
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(232);
				match(T__6);
				setState(233);
				arg();
				}
				}
				setState(238);
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
	public static class TypedargslistContext extends ParserRuleContext {
		public List<TypedargContext> typedarg() {
			return getRuleContexts(TypedargContext.class);
		}
		public TypedargContext typedarg(int i) {
			return getRuleContext(TypedargContext.class,i);
		}
		public TypedargslistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedargslist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).enterTypedargslist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).exitTypedargslist(this);
		}
	}

	public final TypedargslistContext typedargslist() throws RecognitionException {
		TypedargslistContext _localctx = new TypedargslistContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_typedargslist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			typedarg();
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(240);
				match(T__6);
				setState(241);
				typedarg();
				}
				}
				setState(246);
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
		public TerminalNode SYMBOL() { return getToken(PdeasyParser.SYMBOL, 0); }
		public TerminalNode NUMBER() { return getToken(PdeasyParser.NUMBER, 0); }
		public VarnameContext varname() {
			return getRuleContext(VarnameContext.class,0);
		}
		public CallstmtContext callstmt() {
			return getRuleContext(CallstmtContext.class,0);
		}
		public List_accessContext list_access() {
			return getRuleContext(List_accessContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).exitArg(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_arg);
		try {
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(SYMBOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				varname();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(250);
				callstmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(251);
				list_access();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(252);
				list();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(253);
				expr(0);
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
	public static class TypedargContext extends ParserRuleContext {
		public VarnameContext varname() {
			return getRuleContext(VarnameContext.class,0);
		}
		public TerminalNode VARTYPE() { return getToken(PdeasyParser.VARTYPE, 0); }
		public TypedargContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedarg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).enterTypedarg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).exitTypedarg(this);
		}
	}

	public final TypedargContext typedarg() throws RecognitionException {
		TypedargContext _localctx = new TypedargContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_typedarg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			varname();
			setState(257);
			match(T__11);
			setState(258);
			match(VARTYPE);
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
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).enterSuite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).exitSuite(this);
		}
	}

	public final SuiteContext suite() throws RecognitionException {
		SuiteContext _localctx = new SuiteContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_suite);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(261); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(260);
					stmt();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(263); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		public TerminalNode NUMBER() { return getToken(PdeasyParser.NUMBER, 0); }
		public VarnameContext varname() {
			return getRuleContext(VarnameContext.class,0);
		}
		public List_accessContext list_access() {
			return getRuleContext(List_accessContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).exitOperation(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			((OperationContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 4186112L) != 0) ) {
				((OperationContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(266);
			match(T__9);
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(267);
				match(NUMBER);
				}
				break;
			case 2:
				{
				setState(268);
				varname();
				}
				break;
			case 3:
				{
				setState(269);
				list_access();
				}
				break;
			}
			setState(272);
			match(T__10);
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
		public TerminalNode IF() { return getToken(PdeasyParser.IF, 0); }
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
		public TerminalNode END() { return getToken(PdeasyParser.END, 0); }
		public List<TerminalNode> ELIF() { return getTokens(PdeasyParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(PdeasyParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(PdeasyParser.ELSE, 0); }
		public IfstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).enterIfstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).exitIfstmt(this);
		}
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ifstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(IF);
			setState(275);
			expr(0);
			setState(276);
			match(T__11);
			setState(277);
			suite();
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(278);
				match(ELIF);
				setState(279);
				expr(0);
				setState(280);
				match(T__11);
				setState(281);
				suite();
				}
				}
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(288);
				match(ELSE);
				setState(289);
				match(T__11);
				setState(290);
				suite();
				}
			}

			setState(293);
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
	public static class SubAddContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SubAddContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).enterSubAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).exitSubAdd(this);
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
		public MulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).exitMulDiv(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TestCallContext extends ExprContext {
		public CallstmtContext callstmt() {
			return getRuleContext(CallstmtContext.class,0);
		}
		public TestCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).enterTestCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).exitTestCall(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParensExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParensExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).enterParensExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).exitParensExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TestCompareContext extends ExprContext {
		public Token testop;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CONNECT() { return getToken(PdeasyParser.CONNECT, 0); }
		public TestCompareContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).enterTestCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).exitTestCompare(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TestSymContext extends ExprContext {
		public TerminalNode SYMBOL() { return getToken(PdeasyParser.SYMBOL, 0); }
		public TestSymContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).enterTestSym(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).exitTestSym(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TestVarContext extends ExprContext {
		public VarnameContext varname() {
			return getRuleContext(VarnameContext.class,0);
		}
		public TestVarContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).enterTestVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).exitTestVar(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TestNumContext extends ExprContext {
		public TerminalNode NUMBER() { return getToken(PdeasyParser.NUMBER, 0); }
		public TestNumContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).enterTestNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).exitTestNum(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TestListAccessContext extends ExprContext {
		public List_accessContext list_access() {
			return getRuleContext(List_accessContext.class,0);
		}
		public TestListAccessContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).enterTestListAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).exitTestListAccess(this);
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
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				_localctx = new TestNumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(296);
				match(NUMBER);
				}
				break;
			case 2:
				{
				_localctx = new TestSymContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(297);
				match(SYMBOL);
				}
				break;
			case 3:
				{
				_localctx = new TestVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(298);
				varname();
				}
				break;
			case 4:
				{
				_localctx = new TestCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(299);
				callstmt();
				}
				break;
			case 5:
				{
				_localctx = new TestListAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(300);
				list_access();
				}
				break;
			case 6:
				{
				_localctx = new ParensExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(301);
				match(T__9);
				setState(302);
				expr(0);
				setState(303);
				match(T__10);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(318);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(316);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(307);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(308);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 2121728L) != 0) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(309);
						expr(10);
						}
						break;
					case 2:
						{
						_localctx = new SubAddContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(310);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(311);
						((SubAddContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__16 || _la==T__17) ) {
							((SubAddContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(312);
						expr(9);
						}
						break;
					case 3:
						{
						_localctx = new TestCompareContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(313);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(314);
						((TestCompareContext)_localctx).testop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 34489761792L) != 0) ) {
							((TestCompareContext)_localctx).testop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(315);
						expr(8);
						}
						break;
					}
					} 
				}
				setState(320);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Node_exprContext extends ParserRuleContext {
		public Token op;
		public List<VarnameContext> varname() {
			return getRuleContexts(VarnameContext.class);
		}
		public VarnameContext varname(int i) {
			return getRuleContext(VarnameContext.class,i);
		}
		public List<NodedeclContext> nodedecl() {
			return getRuleContexts(NodedeclContext.class);
		}
		public NodedeclContext nodedecl(int i) {
			return getRuleContext(NodedeclContext.class,i);
		}
		public Node_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).enterNode_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).exitNode_expr(this);
		}
	}

	public final Node_exprContext node_expr() throws RecognitionException {
		Node_exprContext _localctx = new Node_exprContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_node_expr);
		int _la;
		try {
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(321);
					varname();
					}
					break;
				case 2:
					{
					setState(322);
					nodedecl();
					}
					break;
				}
				setState(325);
				((Node_exprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 134316032L) != 0) ) {
					((Node_exprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(328);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(326);
					varname();
					}
					break;
				case 2:
					{
					setState(327);
					nodedecl();
					}
					break;
				}
				setState(330);
				match(T__27);
				setState(333);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(331);
					varname();
					}
					break;
				case 2:
					{
					setState(332);
					nodedecl();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(335);
					varname();
					}
					break;
				case 2:
					{
					setState(336);
					nodedecl();
					}
					break;
				}
				setState(339);
				((Node_exprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__18 || _la==T__19) ) {
					((Node_exprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(342);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(340);
					varname();
					}
					break;
				case 2:
					{
					setState(341);
					nodedecl();
					}
					break;
				}
				setState(344);
				match(T__27);
				setState(347);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(345);
					varname();
					}
					break;
				case 2:
					{
					setState(346);
					nodedecl();
					}
					break;
				}
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
	public static class ForstmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(PdeasyParser.FOR, 0); }
		public List<VarnameContext> varname() {
			return getRuleContexts(VarnameContext.class);
		}
		public VarnameContext varname(int i) {
			return getRuleContext(VarnameContext.class,i);
		}
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public TerminalNode END() { return getToken(PdeasyParser.END, 0); }
		public TerminalNode NUMBER() { return getToken(PdeasyParser.NUMBER, 0); }
		public CallstmtContext callstmt() {
			return getRuleContext(CallstmtContext.class,0);
		}
		public ForstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).enterForstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).exitForstmt(this);
		}
	}

	public final ForstmtContext forstmt() throws RecognitionException {
		ForstmtContext _localctx = new ForstmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_forstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(FOR);
			setState(352);
			varname();
			setState(353);
			match(T__28);
			setState(357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(354);
				match(NUMBER);
				}
				break;
			case T__3:
				{
				setState(355);
				callstmt();
				}
				break;
			case VARNAME:
				{
				setState(356);
				varname();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(359);
			match(T__11);
			setState(360);
			suite();
			setState(361);
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
	public static class VarnameContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(PdeasyParser.VARNAME, 0); }
		public VarnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).enterVarname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).exitVarname(this);
		}
	}

	public final VarnameContext varname() throws RecognitionException {
		VarnameContext _localctx = new VarnameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_varname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(VARNAME);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 25:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00013\u016e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000\u0005\u0000=\b\u0000"+
		"\n\u0000\f\u0000@\t\u0000\u0001\u0000\u0005\u0000C\b\u0000\n\u0000\f\u0000"+
		"F\t\u0000\u0001\u0000\u0005\u0000I\b\u0000\n\u0000\f\u0000L\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003[\b\u0003\n\u0003\f\u0003^\t\u0003\u0001\u0003\u0005"+
		"\u0003a\b\u0003\n\u0003\f\u0003d\t\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004l\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005v\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0084\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u0092\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u009c\b\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0005\n\u00a2\b\n\n\n\f\n\u00a5\t\n\u0005\n\u00a7\b\n\n\n\f\n\u00aa"+
		"\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00b1"+
		"\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u00bd\b\f\u0001\r\u0001\r\u0001\r\u0004\r\u00c2"+
		"\b\r\u000b\r\f\r\u00c3\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0005\u000e\u00ca\b\u000e\n\u000e\f\u000e\u00cd\t\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u00d2\b\u000e\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u00d6\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00da\b\u000f"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u00de\b\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u00e4\b\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00eb\b\u0012\n\u0012"+
		"\f\u0012\u00ee\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013"+
		"\u00f3\b\u0013\n\u0013\f\u0013\u00f6\t\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00ff"+
		"\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0004"+
		"\u0016\u0106\b\u0016\u000b\u0016\f\u0016\u0107\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u010f\b\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u011c\b\u0018"+
		"\n\u0018\f\u0018\u011f\t\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u0124\b\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u0132\b\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0005\u0019\u013d\b\u0019\n\u0019\f\u0019\u0140\t\u0019\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u0144\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u0149\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u014e\b\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0152\b\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0157\b\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u015c\b\u001a\u0003\u001a\u015e\b\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0003\u001b\u0166\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0000\u00012\u001d\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468\u0000\u0006\u0001\u0000\r\u0015\u0002\u0000\r\u000e\u0015"+
		"\u0015\u0001\u0000\u0011\u0012\u0002\u0000\u0016\u001a##\u0002\u0000\u000f"+
		"\u0010\u001b\u001b\u0001\u0000\u0013\u0014\u018f\u0000:\u0001\u0000\u0000"+
		"\u0000\u0002O\u0001\u0000\u0000\u0000\u0004R\u0001\u0000\u0000\u0000\u0006"+
		"U\u0001\u0000\u0000\u0000\bg\u0001\u0000\u0000\u0000\nu\u0001\u0000\u0000"+
		"\u0000\fw\u0001\u0000\u0000\u0000\u000e~\u0001\u0000\u0000\u0000\u0010"+
		"\u0091\u0001\u0000\u0000\u0000\u0012\u009b\u0001\u0000\u0000\u0000\u0014"+
		"\u009d\u0001\u0000\u0000\u0000\u0016\u00b0\u0001\u0000\u0000\u0000\u0018"+
		"\u00bc\u0001\u0000\u0000\u0000\u001a\u00be\u0001\u0000\u0000\u0000\u001c"+
		"\u00d1\u0001\u0000\u0000\u0000\u001e\u00d5\u0001\u0000\u0000\u0000 \u00db"+
		"\u0001\u0000\u0000\u0000\"\u00e1\u0001\u0000\u0000\u0000$\u00e7\u0001"+
		"\u0000\u0000\u0000&\u00ef\u0001\u0000\u0000\u0000(\u00fe\u0001\u0000\u0000"+
		"\u0000*\u0100\u0001\u0000\u0000\u0000,\u0105\u0001\u0000\u0000\u0000."+
		"\u0109\u0001\u0000\u0000\u00000\u0112\u0001\u0000\u0000\u00002\u0131\u0001"+
		"\u0000\u0000\u00004\u015d\u0001\u0000\u0000\u00006\u015f\u0001\u0000\u0000"+
		"\u00008\u016b\u0001\u0000\u0000\u0000:>\u0003\u0002\u0001\u0000;=\u0003"+
		"\u0004\u0002\u0000<;\u0001\u0000\u0000\u0000=@\u0001\u0000\u0000\u0000"+
		"><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?D\u0001\u0000\u0000"+
		"\u0000@>\u0001\u0000\u0000\u0000AC\u0003\u0006\u0003\u0000BA\u0001\u0000"+
		"\u0000\u0000CF\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001"+
		"\u0000\u0000\u0000EJ\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000"+
		"GI\u0003\n\u0005\u0000HG\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000\u0000"+
		"JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KM\u0001\u0000\u0000"+
		"\u0000LJ\u0001\u0000\u0000\u0000MN\u0005\u0001\u0000\u0000N\u0001\u0001"+
		"\u0000\u0000\u0000OP\u0005\u001e\u0000\u0000PQ\u0005,\u0000\u0000Q\u0003"+
		"\u0001\u0000\u0000\u0000RS\u0005\u001f\u0000\u0000ST\u0005,\u0000\u0000"+
		"T\u0005\u0001\u0000\u0000\u0000UV\u0005 \u0000\u0000VW\u0005,\u0000\u0000"+
		"WX\u0003\"\u0011\u0000X\\\u0005\u0002\u0000\u0000Y[\u0003,\u0016\u0000"+
		"ZY\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000"+
		"\u0000\\]\u0001\u0000\u0000\u0000]b\u0001\u0000\u0000\u0000^\\\u0001\u0000"+
		"\u0000\u0000_a\u0003\b\u0004\u0000`_\u0001\u0000\u0000\u0000ad\u0001\u0000"+
		"\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000ce\u0001"+
		"\u0000\u0000\u0000db\u0001\u0000\u0000\u0000ef\u0005\u0003\u0000\u0000"+
		"f\u0007\u0001\u0000\u0000\u0000gk\u0005\"\u0000\u0000hl\u00038\u001c\u0000"+
		"il\u00032\u0019\u0000jl\u00034\u001a\u0000kh\u0001\u0000\u0000\u0000k"+
		"i\u0001\u0000\u0000\u0000kj\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000"+
		"\u0000l\t\u0001\u0000\u0000\u0000mv\u0003\f\u0006\u0000nv\u0003\u001a"+
		"\r\u0000ov\u0003\u000e\u0007\u0000pv\u0003\u0010\b\u0000qv\u0003\u0012"+
		"\t\u0000rv\u00034\u001a\u0000sv\u00030\u0018\u0000tv\u00036\u001b\u0000"+
		"um\u0001\u0000\u0000\u0000un\u0001\u0000\u0000\u0000uo\u0001\u0000\u0000"+
		"\u0000up\u0001\u0000\u0000\u0000uq\u0001\u0000\u0000\u0000ur\u0001\u0000"+
		"\u0000\u0000us\u0001\u0000\u0000\u0000ut\u0001\u0000\u0000\u0000v\u000b"+
		"\u0001\u0000\u0000\u0000wx\u0005!\u0000\u0000xy\u0005,\u0000\u0000yz\u0003"+
		"\"\u0011\u0000z{\u0005\u0002\u0000\u0000{|\u0003,\u0016\u0000|}\u0005"+
		"\u0003\u0000\u0000}\r\u0001\u0000\u0000\u0000~\u007f\u0005\u0004\u0000"+
		"\u0000\u007f\u0080\u0005,\u0000\u0000\u0080\u0083\u0003 \u0010\u0000\u0081"+
		"\u0082\u0005)\u0000\u0000\u0082\u0084\u00038\u001c\u0000\u0083\u0081\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u000f\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u00038\u001c\u0000\u0086\u0087\u0005\u0005"+
		"\u0000\u0000\u0087\u0088\u0005,\u0000\u0000\u0088\u0089\u0003 \u0010\u0000"+
		"\u0089\u0092\u0001\u0000\u0000\u0000\u008a\u008b\u0005,\u0000\u0000\u008b"+
		"\u0092\u0003 \u0010\u0000\u008c\u0092\u0003.\u0017\u0000\u008d\u008e\u0003"+
		"8\u001c\u0000\u008e\u008f\u0005\u0005\u0000\u0000\u008f\u0090\u0003.\u0017"+
		"\u0000\u0090\u0092\u0001\u0000\u0000\u0000\u0091\u0085\u0001\u0000\u0000"+
		"\u0000\u0091\u008a\u0001\u0000\u0000\u0000\u0091\u008c\u0001\u0000\u0000"+
		"\u0000\u0091\u008d\u0001\u0000\u0000\u0000\u0092\u0011\u0001\u0000\u0000"+
		"\u0000\u0093\u0094\u00038\u001c\u0000\u0094\u0095\u0005\u0005\u0000\u0000"+
		"\u0095\u0096\u00032\u0019\u0000\u0096\u009c\u0001\u0000\u0000\u0000\u0097"+
		"\u0098\u00038\u001c\u0000\u0098\u0099\u0005\u0005\u0000\u0000\u0099\u009a"+
		"\u0003\u0014\n\u0000\u009a\u009c\u0001\u0000\u0000\u0000\u009b\u0093\u0001"+
		"\u0000\u0000\u0000\u009b\u0097\u0001\u0000\u0000\u0000\u009c\u0013\u0001"+
		"\u0000\u0000\u0000\u009d\u00a8\u0005\u0006\u0000\u0000\u009e\u00a3\u0003"+
		"\u0016\u000b\u0000\u009f\u00a0\u0005\u0007\u0000\u0000\u00a0\u00a2\u0003"+
		"\u0016\u000b\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a6\u009e\u0001\u0000\u0000\u0000\u00a7\u00aa\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001"+
		"\u0000\u0000\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001"+
		"\u0000\u0000\u0000\u00ab\u00ac\u0005\b\u0000\u0000\u00ac\u0015\u0001\u0000"+
		"\u0000\u0000\u00ad\u00b1\u0005.\u0000\u0000\u00ae\u00b1\u0005/\u0000\u0000"+
		"\u00af\u00b1\u00038\u001c\u0000\u00b0\u00ad\u0001\u0000\u0000\u0000\u00b0"+
		"\u00ae\u0001\u0000\u0000\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b1"+
		"\u0017\u0001\u0000\u0000\u0000\u00b2\u00b3\u00038\u001c\u0000\u00b3\u00b4"+
		"\u0005\u0006\u0000\u0000\u00b4\u00b5\u00038\u001c\u0000\u00b5\u00b6\u0005"+
		"\b\u0000\u0000\u00b6\u00bd\u0001\u0000\u0000\u0000\u00b7\u00b8\u00038"+
		"\u001c\u0000\u00b8\u00b9\u0005\u0006\u0000\u0000\u00b9\u00ba\u0005/\u0000"+
		"\u0000\u00ba\u00bb\u0005\b\u0000\u0000\u00bb\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bc\u00b2\u0001\u0000\u0000\u0000\u00bc\u00b7\u0001\u0000\u0000\u0000"+
		"\u00bd\u0019\u0001\u0000\u0000\u0000\u00be\u00c1\u0003\u001c\u000e\u0000"+
		"\u00bf\u00c0\u0005#\u0000\u0000\u00c0\u00c2\u0003\u001c\u000e\u0000\u00c1"+
		"\u00bf\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4"+
		"\u001b\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005\u0006\u0000\u0000\u00c6"+
		"\u00cb\u0003\u001e\u000f\u0000\u00c7\u00c8\u0005\u0007\u0000\u0000\u00c8"+
		"\u00ca\u0003\u001e\u000f\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cb"+
		"\u00cc\u0001\u0000\u0000\u0000\u00cc\u00ce\u0001\u0000\u0000\u0000\u00cd"+
		"\u00cb\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005\b\u0000\u0000\u00cf\u00d2"+
		"\u0001\u0000\u0000\u0000\u00d0\u00d2\u0003\u001e\u000f\u0000\u00d1\u00c5"+
		"\u0001\u0000\u0000\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d2\u001d"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d6\u00038\u001c\u0000\u00d4\u00d6\u0003"+
		"\u0010\b\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d9\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005\t\u0000"+
		"\u0000\u00d8\u00da\u0005+\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000"+
		"\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u001f\u0001\u0000\u0000\u0000"+
		"\u00db\u00dd\u0005\n\u0000\u0000\u00dc\u00de\u0003$\u0012\u0000\u00dd"+
		"\u00dc\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de"+
		"\u00df\u0001\u0000\u0000\u0000\u00df\u00e0\u0005\u000b\u0000\u0000\u00e0"+
		"!\u0001\u0000\u0000\u0000\u00e1\u00e3\u0005\n\u0000\u0000\u00e2\u00e4"+
		"\u0003&\u0013\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005"+
		"\u000b\u0000\u0000\u00e6#\u0001\u0000\u0000\u0000\u00e7\u00ec\u0003(\u0014"+
		"\u0000\u00e8\u00e9\u0005\u0007\u0000\u0000\u00e9\u00eb\u0003(\u0014\u0000"+
		"\u00ea\u00e8\u0001\u0000\u0000\u0000\u00eb\u00ee\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000"+
		"\u00ed%\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f4\u0003*\u0015\u0000\u00f0\u00f1\u0005\u0007\u0000\u0000\u00f1\u00f3"+
		"\u0003*\u0015\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f3\u00f6\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f5\'\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000"+
		"\u0000\u0000\u00f7\u00ff\u0005.\u0000\u0000\u00f8\u00ff\u0005/\u0000\u0000"+
		"\u00f9\u00ff\u00038\u001c\u0000\u00fa\u00ff\u0003\u000e\u0007\u0000\u00fb"+
		"\u00ff\u0003\u0018\f\u0000\u00fc\u00ff\u0003\u0014\n\u0000\u00fd\u00ff"+
		"\u00032\u0019\u0000\u00fe\u00f7\u0001\u0000\u0000\u0000\u00fe\u00f8\u0001"+
		"\u0000\u0000\u0000\u00fe\u00f9\u0001\u0000\u0000\u0000\u00fe\u00fa\u0001"+
		"\u0000\u0000\u0000\u00fe\u00fb\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001"+
		"\u0000\u0000\u0000\u00fe\u00fd\u0001\u0000\u0000\u0000\u00ff)\u0001\u0000"+
		"\u0000\u0000\u0100\u0101\u00038\u001c\u0000\u0101\u0102\u0005\f\u0000"+
		"\u0000\u0102\u0103\u0005*\u0000\u0000\u0103+\u0001\u0000\u0000\u0000\u0104"+
		"\u0106\u0003\n\u0005\u0000\u0105\u0104\u0001\u0000\u0000\u0000\u0106\u0107"+
		"\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0107\u0108"+
		"\u0001\u0000\u0000\u0000\u0108-\u0001\u0000\u0000\u0000\u0109\u010a\u0007"+
		"\u0000\u0000\u0000\u010a\u010e\u0005\n\u0000\u0000\u010b\u010f\u0005/"+
		"\u0000\u0000\u010c\u010f\u00038\u001c\u0000\u010d\u010f\u0003\u0018\f"+
		"\u0000\u010e\u010b\u0001\u0000\u0000\u0000\u010e\u010c\u0001\u0000\u0000"+
		"\u0000\u010e\u010d\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000"+
		"\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0111\u0005\u000b\u0000"+
		"\u0000\u0111/\u0001\u0000\u0000\u0000\u0112\u0113\u0005%\u0000\u0000\u0113"+
		"\u0114\u00032\u0019\u0000\u0114\u0115\u0005\f\u0000\u0000\u0115\u011d"+
		"\u0003,\u0016\u0000\u0116\u0117\u0005&\u0000\u0000\u0117\u0118\u00032"+
		"\u0019\u0000\u0118\u0119\u0005\f\u0000\u0000\u0119\u011a\u0003,\u0016"+
		"\u0000\u011a\u011c\u0001\u0000\u0000\u0000\u011b\u0116\u0001\u0000\u0000"+
		"\u0000\u011c\u011f\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000\u0000"+
		"\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e\u0123\u0001\u0000\u0000"+
		"\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u0120\u0121\u0005\'\u0000\u0000"+
		"\u0121\u0122\u0005\f\u0000\u0000\u0122\u0124\u0003,\u0016\u0000\u0123"+
		"\u0120\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124"+
		"\u0125\u0001\u0000\u0000\u0000\u0125\u0126\u0005$\u0000\u0000\u01261\u0001"+
		"\u0000\u0000\u0000\u0127\u0128\u0006\u0019\uffff\uffff\u0000\u0128\u0132"+
		"\u0005/\u0000\u0000\u0129\u0132\u0005.\u0000\u0000\u012a\u0132\u00038"+
		"\u001c\u0000\u012b\u0132\u0003\u000e\u0007\u0000\u012c\u0132\u0003\u0018"+
		"\f\u0000\u012d\u012e\u0005\n\u0000\u0000\u012e\u012f\u00032\u0019\u0000"+
		"\u012f\u0130\u0005\u000b\u0000\u0000\u0130\u0132\u0001\u0000\u0000\u0000"+
		"\u0131\u0127\u0001\u0000\u0000\u0000\u0131\u0129\u0001\u0000\u0000\u0000"+
		"\u0131\u012a\u0001\u0000\u0000\u0000\u0131\u012b\u0001\u0000\u0000\u0000"+
		"\u0131\u012c\u0001\u0000\u0000\u0000\u0131\u012d\u0001\u0000\u0000\u0000"+
		"\u0132\u013e\u0001\u0000\u0000\u0000\u0133\u0134\n\t\u0000\u0000\u0134"+
		"\u0135\u0007\u0001\u0000\u0000\u0135\u013d\u00032\u0019\n\u0136\u0137"+
		"\n\b\u0000\u0000\u0137\u0138\u0007\u0002\u0000\u0000\u0138\u013d\u0003"+
		"2\u0019\t\u0139\u013a\n\u0007\u0000\u0000\u013a\u013b\u0007\u0003\u0000"+
		"\u0000\u013b\u013d\u00032\u0019\b\u013c\u0133\u0001\u0000\u0000\u0000"+
		"\u013c\u0136\u0001\u0000\u0000\u0000\u013c\u0139\u0001\u0000\u0000\u0000"+
		"\u013d\u0140\u0001\u0000\u0000\u0000\u013e\u013c\u0001\u0000\u0000\u0000"+
		"\u013e\u013f\u0001\u0000\u0000\u0000\u013f3\u0001\u0000\u0000\u0000\u0140"+
		"\u013e\u0001\u0000\u0000\u0000\u0141\u0144\u00038\u001c\u0000\u0142\u0144"+
		"\u0003\u0010\b\u0000\u0143\u0141\u0001\u0000\u0000\u0000\u0143\u0142\u0001"+
		"\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145\u0148\u0007"+
		"\u0004\u0000\u0000\u0146\u0149\u00038\u001c\u0000\u0147\u0149\u0003\u0010"+
		"\b\u0000\u0148\u0146\u0001\u0000\u0000\u0000\u0148\u0147\u0001\u0000\u0000"+
		"\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a\u014d\u0005\u001c\u0000"+
		"\u0000\u014b\u014e\u00038\u001c\u0000\u014c\u014e\u0003\u0010\b\u0000"+
		"\u014d\u014b\u0001\u0000\u0000\u0000\u014d\u014c\u0001\u0000\u0000\u0000"+
		"\u014e\u015e\u0001\u0000\u0000\u0000\u014f\u0152\u00038\u001c\u0000\u0150"+
		"\u0152\u0003\u0010\b\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0151\u0150"+
		"\u0001\u0000\u0000\u0000\u0152\u0153\u0001\u0000\u0000\u0000\u0153\u0156"+
		"\u0007\u0005\u0000\u0000\u0154\u0157\u00038\u001c\u0000\u0155\u0157\u0003"+
		"\u0010\b\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0156\u0155\u0001\u0000"+
		"\u0000\u0000\u0157\u0158\u0001\u0000\u0000\u0000\u0158\u015b\u0005\u001c"+
		"\u0000\u0000\u0159\u015c\u00038\u001c\u0000\u015a\u015c\u0003\u0010\b"+
		"\u0000\u015b\u0159\u0001\u0000\u0000\u0000\u015b\u015a\u0001\u0000\u0000"+
		"\u0000\u015c\u015e\u0001\u0000\u0000\u0000\u015d\u0143\u0001\u0000\u0000"+
		"\u0000\u015d\u0151\u0001\u0000\u0000\u0000\u015e5\u0001\u0000\u0000\u0000"+
		"\u015f\u0160\u0005(\u0000\u0000\u0160\u0161\u00038\u001c\u0000\u0161\u0165"+
		"\u0005\u001d\u0000\u0000\u0162\u0166\u0005/\u0000\u0000\u0163\u0166\u0003"+
		"\u000e\u0007\u0000\u0164\u0166\u00038\u001c\u0000\u0165\u0162\u0001\u0000"+
		"\u0000\u0000\u0165\u0163\u0001\u0000\u0000\u0000\u0165\u0164\u0001\u0000"+
		"\u0000\u0000\u0166\u0167\u0001\u0000\u0000\u0000\u0167\u0168\u0005\f\u0000"+
		"\u0000\u0168\u0169\u0003,\u0016\u0000\u0169\u016a\u0005$\u0000\u0000\u016a"+
		"7\u0001\u0000\u0000\u0000\u016b\u016c\u0005-\u0000\u0000\u016c9\u0001"+
		"\u0000\u0000\u0000\'>DJ\\bku\u0083\u0091\u009b\u00a3\u00a8\u00b0\u00bc"+
		"\u00c3\u00cb\u00d1\u00d5\u00d9\u00dd\u00e3\u00ec\u00f4\u00fe\u0107\u010e"+
		"\u011d\u0123\u0131\u013c\u013e\u0143\u0148\u014d\u0151\u0156\u015b\u015d"+
		"\u0165";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}