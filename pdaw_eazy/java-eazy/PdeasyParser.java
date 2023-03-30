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
		RULE_nodeptr = 27, RULE_forstmt = 28, RULE_varname = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "patchstmt", "importstmt", "funcdefstmt", "returnstmt", "stmt", 
			"blockstmt", "callstmt", "nodedecl", "simpledecl", "list", "listelem", 
			"list_access", "connectionstmt", "connectionelem", "singlenode", "parameters", 
			"typedparams", "argslist", "typedargslist", "arg", "typedarg", "suite", 
			"operation", "ifstmt", "expr", "node_expr", "nodeptr", "forstmt", "varname"
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
			setState(60);
			patchstmt();
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(61);
				importstmt();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNC) {
				{
				{
				setState(67);
				funcdefstmt();
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 54039282704464L) != 0) {
				{
				{
				setState(73);
				stmt();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
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
			setState(81);
			match(PATCH);
			setState(82);
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
			setState(84);
			match(IMPORT);
			setState(85);
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
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(FUNC);
			setState(88);
			match(NAME);
			setState(89);
			typedparams();
			setState(90);
			match(T__1);
			setState(91);
			suite();
			setState(92);
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
		public ConnectionstmtContext connectionstmt() {
			return getRuleContext(ConnectionstmtContext.class,0);
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
			setState(94);
			match(RETURN);
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(95);
				varname();
				}
				break;
			case 2:
				{
				setState(96);
				expr(0);
				}
				break;
			case 3:
				{
				setState(97);
				node_expr();
				}
				break;
			case 4:
				{
				setState(98);
				connectionstmt();
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
		public ReturnstmtContext returnstmt() {
			return getRuleContext(ReturnstmtContext.class,0);
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
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				blockstmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				connectionstmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				callstmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				nodedecl();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(105);
				simpledecl();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(106);
				node_expr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(107);
				ifstmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(108);
				forstmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(109);
				returnstmt();
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
			setState(112);
			match(BLOCK);
			setState(113);
			match(NAME);
			setState(114);
			typedparams();
			setState(115);
			match(T__1);
			setState(116);
			suite();
			setState(117);
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
			setState(119);
			match(T__3);
			setState(120);
			match(NAME);
			setState(121);
			parameters();
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(122);
				match(AS);
				setState(123);
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
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new Nodedecl1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				varname();
				setState(127);
				match(T__4);
				setState(128);
				match(NAME);
				setState(129);
				parameters();
				}
				break;
			case 2:
				_localctx = new Nodedecl2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(NAME);
				setState(132);
				parameters();
				}
				break;
			case 3:
				_localctx = new Nodedecl3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				operation();
				}
				break;
			case 4:
				_localctx = new Nodedecl4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(134);
				varname();
				setState(135);
				match(T__4);
				setState(136);
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
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				varname();
				setState(141);
				match(T__4);
				setState(142);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				varname();
				setState(145);
				match(T__4);
				setState(146);
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
			setState(150);
			match(T__5);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 246290604621824L) != 0) {
				{
				{
				setState(151);
				listelem();
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(152);
					match(T__6);
					setState(153);
					listelem();
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
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
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(SYMBOL);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(NUMBER);
				}
				break;
			case VARNAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
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
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				varname();
				setState(172);
				match(T__5);
				setState(173);
				varname();
				setState(174);
				match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				varname();
				setState(177);
				match(T__5);
				setState(178);
				match(NUMBER);
				setState(179);
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
			setState(183);
			connectionelem();
			setState(186); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(184);
				match(CONNECT);
				setState(185);
				connectionelem();
				}
				}
				setState(188); 
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
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				_localctx = new MultipleconnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(T__5);
				setState(191);
				singlenode();
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(192);
					match(T__6);
					setState(193);
					singlenode();
					}
					}
					setState(198);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(199);
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
				setState(201);
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
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(204);
				varname();
				}
				break;
			case 2:
				{
				setState(205);
				nodedecl();
				}
				break;
			}
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(208);
				match(T__8);
				setState(209);
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
			setState(212);
			match(T__9);
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 246290604631120L) != 0) {
				{
				setState(213);
				argslist();
				}
			}

			setState(216);
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
			setState(218);
			match(T__9);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARNAME) {
				{
				setState(219);
				typedargslist();
				}
			}

			setState(222);
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
			setState(224);
			arg();
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(225);
				match(T__6);
				setState(226);
				arg();
				}
				}
				setState(231);
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
			setState(232);
			typedarg();
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(233);
				match(T__6);
				setState(234);
				typedarg();
				}
				}
				setState(239);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public NodeptrContext nodeptr() {
			return getRuleContext(NodeptrContext.class,0);
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
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__9:
			case VARNAME:
			case SYMBOL:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				expr(0);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				list();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				nodeptr();
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
			setState(245);
			varname();
			setState(246);
			match(T__11);
			setState(247);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(249);
				stmt();
				}
				}
				setState(252); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 54039282704464L) != 0 );
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
			setState(254);
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
			setState(255);
			match(T__9);
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(256);
				match(NUMBER);
				}
				break;
			case 2:
				{
				setState(257);
				varname();
				}
				break;
			case 3:
				{
				setState(258);
				list_access();
				}
				break;
			}
			setState(261);
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
			setState(263);
			match(IF);
			setState(264);
			expr(0);
			setState(265);
			match(T__11);
			setState(266);
			suite();
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(267);
				match(ELIF);
				setState(268);
				expr(0);
				setState(269);
				match(T__11);
				setState(270);
				suite();
				}
				}
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(277);
				match(ELSE);
				setState(278);
				match(T__11);
				setState(279);
				suite();
				}
			}

			setState(282);
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
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				_localctx = new TestNumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(285);
				match(NUMBER);
				}
				break;
			case 2:
				{
				_localctx = new TestSymContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(286);
				match(SYMBOL);
				}
				break;
			case 3:
				{
				_localctx = new TestVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(287);
				varname();
				}
				break;
			case 4:
				{
				_localctx = new TestCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(288);
				callstmt();
				}
				break;
			case 5:
				{
				_localctx = new TestListAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(289);
				list_access();
				}
				break;
			case 6:
				{
				_localctx = new ParensExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(290);
				match(T__9);
				setState(291);
				expr(0);
				setState(292);
				match(T__10);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(307);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(305);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(296);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(297);
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
						setState(298);
						expr(10);
						}
						break;
					case 2:
						{
						_localctx = new SubAddContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(299);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(300);
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
						setState(301);
						expr(9);
						}
						break;
					case 3:
						{
						_localctx = new TestCompareContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(302);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(303);
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
						setState(304);
						expr(8);
						}
						break;
					}
					} 
				}
				setState(309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(310);
					varname();
					}
					break;
				case 2:
					{
					setState(311);
					nodedecl();
					}
					break;
				}
				setState(314);
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
				setState(317);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(315);
					varname();
					}
					break;
				case 2:
					{
					setState(316);
					nodedecl();
					}
					break;
				}
				setState(319);
				match(T__27);
				setState(322);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(320);
					varname();
					}
					break;
				case 2:
					{
					setState(321);
					nodedecl();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(324);
					varname();
					}
					break;
				case 2:
					{
					setState(325);
					nodedecl();
					}
					break;
				}
				setState(328);
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
				setState(331);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(329);
					varname();
					}
					break;
				case 2:
					{
					setState(330);
					nodedecl();
					}
					break;
				}
				setState(333);
				match(T__27);
				setState(336);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(334);
					varname();
					}
					break;
				case 2:
					{
					setState(335);
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
	public static class NodeptrContext extends ParserRuleContext {
		public VarnameContext varname() {
			return getRuleContext(VarnameContext.class,0);
		}
		public NodeptrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodeptr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).enterNodeptr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).exitNodeptr(this);
		}
	}

	public final NodeptrContext nodeptr() throws RecognitionException {
		NodeptrContext _localctx = new NodeptrContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_nodeptr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(T__12);
			setState(341);
			varname();
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
		public List_accessContext list_access() {
			return getRuleContext(List_accessContext.class,0);
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
		enterRule(_localctx, 56, RULE_forstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(FOR);
			setState(344);
			varname();
			setState(345);
			match(T__28);
			setState(350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(346);
				match(NUMBER);
				}
				break;
			case 2:
				{
				setState(347);
				callstmt();
				}
				break;
			case 3:
				{
				setState(348);
				varname();
				}
				break;
			case 4:
				{
				setState(349);
				list_access();
				}
				break;
			}
			setState(352);
			match(T__11);
			setState(353);
			suite();
			setState(354);
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
		enterRule(_localctx, 58, RULE_varname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
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
		"\u0004\u00013\u0167\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0001\u0000\u0001\u0000"+
		"\u0005\u0000?\b\u0000\n\u0000\f\u0000B\t\u0000\u0001\u0000\u0005\u0000"+
		"E\b\u0000\n\u0000\f\u0000H\t\u0000\u0001\u0000\u0005\u0000K\b\u0000\n"+
		"\u0000\f\u0000N\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004d\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005o\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"}\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u008b\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0095\b\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u009b\b\n\n\n\f\n\u009e\t\n\u0005\n\u00a0\b"+
		"\n\n\n\f\n\u00a3\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u00aa\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00b6\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0004\r\u00bb\b\r\u000b\r\f\r\u00bc\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u00c3\b\u000e\n\u000e\f\u000e\u00c6\t\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00cb\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u00cf\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00d3"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0003\u0010\u00d7\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u00dd\b\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00e4\b\u0012"+
		"\n\u0012\f\u0012\u00e7\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0005"+
		"\u0013\u00ec\b\u0013\n\u0013\f\u0013\u00ef\t\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u00f4\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0004\u0016\u00fb\b\u0016\u000b\u0016\f\u0016"+
		"\u00fc\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u0104\b\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0005\u0018\u0111\b\u0018\n\u0018\f\u0018\u0114\t\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0003\u0018\u0119\b\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0127\b\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0132\b\u0019\n\u0019"+
		"\f\u0019\u0135\t\u0019\u0001\u001a\u0001\u001a\u0003\u001a\u0139\b\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u013e\b\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0003\u001a\u0143\b\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u0147\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u014c\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0151\b"+
		"\u001a\u0003\u001a\u0153\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0003\u001c\u015f\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0000\u00012\u001e\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:\u0000\u0006\u0001\u0000\r\u0015\u0002\u0000\r\u000e\u0015"+
		"\u0015\u0001\u0000\u0011\u0012\u0002\u0000\u0016\u001a##\u0002\u0000\u000f"+
		"\u0010\u001b\u001b\u0001\u0000\u0013\u0014\u0184\u0000<\u0001\u0000\u0000"+
		"\u0000\u0002Q\u0001\u0000\u0000\u0000\u0004T\u0001\u0000\u0000\u0000\u0006"+
		"W\u0001\u0000\u0000\u0000\b^\u0001\u0000\u0000\u0000\nn\u0001\u0000\u0000"+
		"\u0000\fp\u0001\u0000\u0000\u0000\u000ew\u0001\u0000\u0000\u0000\u0010"+
		"\u008a\u0001\u0000\u0000\u0000\u0012\u0094\u0001\u0000\u0000\u0000\u0014"+
		"\u0096\u0001\u0000\u0000\u0000\u0016\u00a9\u0001\u0000\u0000\u0000\u0018"+
		"\u00b5\u0001\u0000\u0000\u0000\u001a\u00b7\u0001\u0000\u0000\u0000\u001c"+
		"\u00ca\u0001\u0000\u0000\u0000\u001e\u00ce\u0001\u0000\u0000\u0000 \u00d4"+
		"\u0001\u0000\u0000\u0000\"\u00da\u0001\u0000\u0000\u0000$\u00e0\u0001"+
		"\u0000\u0000\u0000&\u00e8\u0001\u0000\u0000\u0000(\u00f3\u0001\u0000\u0000"+
		"\u0000*\u00f5\u0001\u0000\u0000\u0000,\u00fa\u0001\u0000\u0000\u0000."+
		"\u00fe\u0001\u0000\u0000\u00000\u0107\u0001\u0000\u0000\u00002\u0126\u0001"+
		"\u0000\u0000\u00004\u0152\u0001\u0000\u0000\u00006\u0154\u0001\u0000\u0000"+
		"\u00008\u0157\u0001\u0000\u0000\u0000:\u0164\u0001\u0000\u0000\u0000<"+
		"@\u0003\u0002\u0001\u0000=?\u0003\u0004\u0002\u0000>=\u0001\u0000\u0000"+
		"\u0000?B\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000"+
		"\u0000\u0000AF\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000CE\u0003"+
		"\u0006\u0003\u0000DC\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000\u0000"+
		"FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GL\u0001\u0000\u0000"+
		"\u0000HF\u0001\u0000\u0000\u0000IK\u0003\n\u0005\u0000JI\u0001\u0000\u0000"+
		"\u0000KN\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000"+
		"\u0000\u0000MO\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000OP\u0005"+
		"\u0001\u0000\u0000P\u0001\u0001\u0000\u0000\u0000QR\u0005\u001e\u0000"+
		"\u0000RS\u0005,\u0000\u0000S\u0003\u0001\u0000\u0000\u0000TU\u0005\u001f"+
		"\u0000\u0000UV\u0005,\u0000\u0000V\u0005\u0001\u0000\u0000\u0000WX\u0005"+
		" \u0000\u0000XY\u0005,\u0000\u0000YZ\u0003\"\u0011\u0000Z[\u0005\u0002"+
		"\u0000\u0000[\\\u0003,\u0016\u0000\\]\u0005\u0003\u0000\u0000]\u0007\u0001"+
		"\u0000\u0000\u0000^c\u0005\"\u0000\u0000_d\u0003:\u001d\u0000`d\u0003"+
		"2\u0019\u0000ad\u00034\u001a\u0000bd\u0003\u001a\r\u0000c_\u0001\u0000"+
		"\u0000\u0000c`\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cb\u0001"+
		"\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000d\t\u0001\u0000\u0000\u0000"+
		"eo\u0003\f\u0006\u0000fo\u0003\u001a\r\u0000go\u0003\u000e\u0007\u0000"+
		"ho\u0003\u0010\b\u0000io\u0003\u0012\t\u0000jo\u00034\u001a\u0000ko\u0003"+
		"0\u0018\u0000lo\u00038\u001c\u0000mo\u0003\b\u0004\u0000ne\u0001\u0000"+
		"\u0000\u0000nf\u0001\u0000\u0000\u0000ng\u0001\u0000\u0000\u0000nh\u0001"+
		"\u0000\u0000\u0000ni\u0001\u0000\u0000\u0000nj\u0001\u0000\u0000\u0000"+
		"nk\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000nm\u0001\u0000\u0000"+
		"\u0000o\u000b\u0001\u0000\u0000\u0000pq\u0005!\u0000\u0000qr\u0005,\u0000"+
		"\u0000rs\u0003\"\u0011\u0000st\u0005\u0002\u0000\u0000tu\u0003,\u0016"+
		"\u0000uv\u0005\u0003\u0000\u0000v\r\u0001\u0000\u0000\u0000wx\u0005\u0004"+
		"\u0000\u0000xy\u0005,\u0000\u0000y|\u0003 \u0010\u0000z{\u0005)\u0000"+
		"\u0000{}\u0003:\u001d\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000"+
		"\u0000}\u000f\u0001\u0000\u0000\u0000~\u007f\u0003:\u001d\u0000\u007f"+
		"\u0080\u0005\u0005\u0000\u0000\u0080\u0081\u0005,\u0000\u0000\u0081\u0082"+
		"\u0003 \u0010\u0000\u0082\u008b\u0001\u0000\u0000\u0000\u0083\u0084\u0005"+
		",\u0000\u0000\u0084\u008b\u0003 \u0010\u0000\u0085\u008b\u0003.\u0017"+
		"\u0000\u0086\u0087\u0003:\u001d\u0000\u0087\u0088\u0005\u0005\u0000\u0000"+
		"\u0088\u0089\u0003.\u0017\u0000\u0089\u008b\u0001\u0000\u0000\u0000\u008a"+
		"~\u0001\u0000\u0000\u0000\u008a\u0083\u0001\u0000\u0000\u0000\u008a\u0085"+
		"\u0001\u0000\u0000\u0000\u008a\u0086\u0001\u0000\u0000\u0000\u008b\u0011"+
		"\u0001\u0000\u0000\u0000\u008c\u008d\u0003:\u001d\u0000\u008d\u008e\u0005"+
		"\u0005\u0000\u0000\u008e\u008f\u00032\u0019\u0000\u008f\u0095\u0001\u0000"+
		"\u0000\u0000\u0090\u0091\u0003:\u001d\u0000\u0091\u0092\u0005\u0005\u0000"+
		"\u0000\u0092\u0093\u0003\u0014\n\u0000\u0093\u0095\u0001\u0000\u0000\u0000"+
		"\u0094\u008c\u0001\u0000\u0000\u0000\u0094\u0090\u0001\u0000\u0000\u0000"+
		"\u0095\u0013\u0001\u0000\u0000\u0000\u0096\u00a1\u0005\u0006\u0000\u0000"+
		"\u0097\u009c\u0003\u0016\u000b\u0000\u0098\u0099\u0005\u0007\u0000\u0000"+
		"\u0099\u009b\u0003\u0016\u000b\u0000\u009a\u0098\u0001\u0000\u0000\u0000"+
		"\u009b\u009e\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000"+
		"\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u00a0\u0001\u0000\u0000\u0000"+
		"\u009e\u009c\u0001\u0000\u0000\u0000\u009f\u0097\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005\b\u0000\u0000\u00a5"+
		"\u0015\u0001\u0000\u0000\u0000\u00a6\u00aa\u0005.\u0000\u0000\u00a7\u00aa"+
		"\u0005/\u0000\u0000\u00a8\u00aa\u0003:\u001d\u0000\u00a9\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00a8\u0001\u0000"+
		"\u0000\u0000\u00aa\u0017\u0001\u0000\u0000\u0000\u00ab\u00ac\u0003:\u001d"+
		"\u0000\u00ac\u00ad\u0005\u0006\u0000\u0000\u00ad\u00ae\u0003:\u001d\u0000"+
		"\u00ae\u00af\u0005\b\u0000\u0000\u00af\u00b6\u0001\u0000\u0000\u0000\u00b0"+
		"\u00b1\u0003:\u001d\u0000\u00b1\u00b2\u0005\u0006\u0000\u0000\u00b2\u00b3"+
		"\u0005/\u0000\u0000\u00b3\u00b4\u0005\b\u0000\u0000\u00b4\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b5\u00ab\u0001\u0000\u0000\u0000\u00b5\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b6\u0019\u0001\u0000\u0000\u0000\u00b7\u00ba\u0003"+
		"\u001c\u000e\u0000\u00b8\u00b9\u0005#\u0000\u0000\u00b9\u00bb\u0003\u001c"+
		"\u000e\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000"+
		"\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bd\u001b\u0001\u0000\u0000\u0000\u00be\u00bf\u0005\u0006"+
		"\u0000\u0000\u00bf\u00c4\u0003\u001e\u000f\u0000\u00c0\u00c1\u0005\u0007"+
		"\u0000\u0000\u00c1\u00c3\u0003\u001e\u000f\u0000\u00c2\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c6\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005\b\u0000"+
		"\u0000\u00c8\u00cb\u0001\u0000\u0000\u0000\u00c9\u00cb\u0003\u001e\u000f"+
		"\u0000\u00ca\u00be\u0001\u0000\u0000\u0000\u00ca\u00c9\u0001\u0000\u0000"+
		"\u0000\u00cb\u001d\u0001\u0000\u0000\u0000\u00cc\u00cf\u0003:\u001d\u0000"+
		"\u00cd\u00cf\u0003\u0010\b\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d2\u0001\u0000\u0000\u0000\u00d0"+
		"\u00d1\u0005\t\u0000\u0000\u00d1\u00d3\u0005+\u0000\u0000\u00d2\u00d0"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u001f"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d6\u0005\n\u0000\u0000\u00d5\u00d7\u0003"+
		"$\u0012\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005\u000b"+
		"\u0000\u0000\u00d9!\u0001\u0000\u0000\u0000\u00da\u00dc\u0005\n\u0000"+
		"\u0000\u00db\u00dd\u0003&\u0013\u0000\u00dc\u00db\u0001\u0000\u0000\u0000"+
		"\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000"+
		"\u00de\u00df\u0005\u000b\u0000\u0000\u00df#\u0001\u0000\u0000\u0000\u00e0"+
		"\u00e5\u0003(\u0014\u0000\u00e1\u00e2\u0005\u0007\u0000\u0000\u00e2\u00e4"+
		"\u0003(\u0014\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e7\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001"+
		"\u0000\u0000\u0000\u00e6%\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e8\u00ed\u0003*\u0015\u0000\u00e9\u00ea\u0005\u0007\u0000"+
		"\u0000\u00ea\u00ec\u0003*\u0015\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ef\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\'\u0001\u0000\u0000\u0000\u00ef"+
		"\u00ed\u0001\u0000\u0000\u0000\u00f0\u00f4\u00032\u0019\u0000\u00f1\u00f4"+
		"\u0003\u0014\n\u0000\u00f2\u00f4\u00036\u001b\u0000\u00f3\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f4)\u0001\u0000\u0000\u0000\u00f5\u00f6\u0003:\u001d"+
		"\u0000\u00f6\u00f7\u0005\f\u0000\u0000\u00f7\u00f8\u0005*\u0000\u0000"+
		"\u00f8+\u0001\u0000\u0000\u0000\u00f9\u00fb\u0003\n\u0005\u0000\u00fa"+
		"\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd"+
		"-\u0001\u0000\u0000\u0000\u00fe\u00ff\u0007\u0000\u0000\u0000\u00ff\u0103"+
		"\u0005\n\u0000\u0000\u0100\u0104\u0005/\u0000\u0000\u0101\u0104\u0003"+
		":\u001d\u0000\u0102\u0104\u0003\u0018\f\u0000\u0103\u0100\u0001\u0000"+
		"\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0102\u0001\u0000"+
		"\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000"+
		"\u0000\u0000\u0105\u0106\u0005\u000b\u0000\u0000\u0106/\u0001\u0000\u0000"+
		"\u0000\u0107\u0108\u0005%\u0000\u0000\u0108\u0109\u00032\u0019\u0000\u0109"+
		"\u010a\u0005\f\u0000\u0000\u010a\u0112\u0003,\u0016\u0000\u010b\u010c"+
		"\u0005&\u0000\u0000\u010c\u010d\u00032\u0019\u0000\u010d\u010e\u0005\f"+
		"\u0000\u0000\u010e\u010f\u0003,\u0016\u0000\u010f\u0111\u0001\u0000\u0000"+
		"\u0000\u0110\u010b\u0001\u0000\u0000\u0000\u0111\u0114\u0001\u0000\u0000"+
		"\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000"+
		"\u0000\u0113\u0118\u0001\u0000\u0000\u0000\u0114\u0112\u0001\u0000\u0000"+
		"\u0000\u0115\u0116\u0005\'\u0000\u0000\u0116\u0117\u0005\f\u0000\u0000"+
		"\u0117\u0119\u0003,\u0016\u0000\u0118\u0115\u0001\u0000\u0000\u0000\u0118"+
		"\u0119\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a"+
		"\u011b\u0005$\u0000\u0000\u011b1\u0001\u0000\u0000\u0000\u011c\u011d\u0006"+
		"\u0019\uffff\uffff\u0000\u011d\u0127\u0005/\u0000\u0000\u011e\u0127\u0005"+
		".\u0000\u0000\u011f\u0127\u0003:\u001d\u0000\u0120\u0127\u0003\u000e\u0007"+
		"\u0000\u0121\u0127\u0003\u0018\f\u0000\u0122\u0123\u0005\n\u0000\u0000"+
		"\u0123\u0124\u00032\u0019\u0000\u0124\u0125\u0005\u000b\u0000\u0000\u0125"+
		"\u0127\u0001\u0000\u0000\u0000\u0126\u011c\u0001\u0000\u0000\u0000\u0126"+
		"\u011e\u0001\u0000\u0000\u0000\u0126\u011f\u0001\u0000\u0000\u0000\u0126"+
		"\u0120\u0001\u0000\u0000\u0000\u0126\u0121\u0001\u0000\u0000\u0000\u0126"+
		"\u0122\u0001\u0000\u0000\u0000\u0127\u0133\u0001\u0000\u0000\u0000\u0128"+
		"\u0129\n\t\u0000\u0000\u0129\u012a\u0007\u0001\u0000\u0000\u012a\u0132"+
		"\u00032\u0019\n\u012b\u012c\n\b\u0000\u0000\u012c\u012d\u0007\u0002\u0000"+
		"\u0000\u012d\u0132\u00032\u0019\t\u012e\u012f\n\u0007\u0000\u0000\u012f"+
		"\u0130\u0007\u0003\u0000\u0000\u0130\u0132\u00032\u0019\b\u0131\u0128"+
		"\u0001\u0000\u0000\u0000\u0131\u012b\u0001\u0000\u0000\u0000\u0131\u012e"+
		"\u0001\u0000\u0000\u0000\u0132\u0135\u0001\u0000\u0000\u0000\u0133\u0131"+
		"\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u01343\u0001"+
		"\u0000\u0000\u0000\u0135\u0133\u0001\u0000\u0000\u0000\u0136\u0139\u0003"+
		":\u001d\u0000\u0137\u0139\u0003\u0010\b\u0000\u0138\u0136\u0001\u0000"+
		"\u0000\u0000\u0138\u0137\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000"+
		"\u0000\u0000\u013a\u013d\u0007\u0004\u0000\u0000\u013b\u013e\u0003:\u001d"+
		"\u0000\u013c\u013e\u0003\u0010\b\u0000\u013d\u013b\u0001\u0000\u0000\u0000"+
		"\u013d\u013c\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000"+
		"\u013f\u0142\u0005\u001c\u0000\u0000\u0140\u0143\u0003:\u001d\u0000\u0141"+
		"\u0143\u0003\u0010\b\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0142\u0141"+
		"\u0001\u0000\u0000\u0000\u0143\u0153\u0001\u0000\u0000\u0000\u0144\u0147"+
		"\u0003:\u001d\u0000\u0145\u0147\u0003\u0010\b\u0000\u0146\u0144\u0001"+
		"\u0000\u0000\u0000\u0146\u0145\u0001\u0000\u0000\u0000\u0147\u0148\u0001"+
		"\u0000\u0000\u0000\u0148\u014b\u0007\u0005\u0000\u0000\u0149\u014c\u0003"+
		":\u001d\u0000\u014a\u014c\u0003\u0010\b\u0000\u014b\u0149\u0001\u0000"+
		"\u0000\u0000\u014b\u014a\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000"+
		"\u0000\u0000\u014d\u0150\u0005\u001c\u0000\u0000\u014e\u0151\u0003:\u001d"+
		"\u0000\u014f\u0151\u0003\u0010\b\u0000\u0150\u014e\u0001\u0000\u0000\u0000"+
		"\u0150\u014f\u0001\u0000\u0000\u0000\u0151\u0153\u0001\u0000\u0000\u0000"+
		"\u0152\u0138\u0001\u0000\u0000\u0000\u0152\u0146\u0001\u0000\u0000\u0000"+
		"\u01535\u0001\u0000\u0000\u0000\u0154\u0155\u0005\r\u0000\u0000\u0155"+
		"\u0156\u0003:\u001d\u0000\u01567\u0001\u0000\u0000\u0000\u0157\u0158\u0005"+
		"(\u0000\u0000\u0158\u0159\u0003:\u001d\u0000\u0159\u015e\u0005\u001d\u0000"+
		"\u0000\u015a\u015f\u0005/\u0000\u0000\u015b\u015f\u0003\u000e\u0007\u0000"+
		"\u015c\u015f\u0003:\u001d\u0000\u015d\u015f\u0003\u0018\f\u0000\u015e"+
		"\u015a\u0001\u0000\u0000\u0000\u015e\u015b\u0001\u0000\u0000\u0000\u015e"+
		"\u015c\u0001\u0000\u0000\u0000\u015e\u015d\u0001\u0000\u0000\u0000\u015f"+
		"\u0160\u0001\u0000\u0000\u0000\u0160\u0161\u0005\f\u0000\u0000\u0161\u0162"+
		"\u0003,\u0016\u0000\u0162\u0163\u0005$\u0000\u0000\u01639\u0001\u0000"+
		"\u0000\u0000\u0164\u0165\u0005-\u0000\u0000\u0165;\u0001\u0000\u0000\u0000"+
		"%@FLcn|\u008a\u0094\u009c\u00a1\u00a9\u00b5\u00bc\u00c4\u00ca\u00ce\u00d2"+
		"\u00d6\u00dc\u00e5\u00ed\u00f3\u00fc\u0103\u0112\u0118\u0126\u0131\u0133"+
		"\u0138\u013d\u0142\u0146\u014b\u0150\u0152\u015e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}