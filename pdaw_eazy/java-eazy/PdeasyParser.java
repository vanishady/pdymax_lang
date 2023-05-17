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
		T__24=25, T__25=26, PATCH=27, IMPORT=28, FUNC=29, BLOCK=30, RETURN=31, 
		CONNECT=32, END=33, IF=34, ELIF=35, ELSE=36, FOR=37, AS=38, BREAK=39, 
		CONTINUE=40, PASS=41, VARTYPE=42, NAME=43, SYMBOL=44, NUMBER=45, INTEGER=46, 
		FLOAT=47, WS=48, COMMENT=49;
	public static final int
		RULE_prog = 0, RULE_patchstmt = 1, RULE_importstmt = 2, RULE_funcdefstmt = 3, 
		RULE_returnstmt = 4, RULE_stmt = 5, RULE_flow_stmt = 6, RULE_blockstmt = 7, 
		RULE_callstmt = 8, RULE_nodedecl = 9, RULE_simpledecl = 10, RULE_list = 11, 
		RULE_listelem = 12, RULE_list_access = 13, RULE_connectionstmt = 14, RULE_connectionelem = 15, 
		RULE_singlenode = 16, RULE_parameters = 17, RULE_typedparams = 18, RULE_argslist = 19, 
		RULE_typedargslist = 20, RULE_arg = 21, RULE_typedarg = 22, RULE_suite = 23, 
		RULE_operation = 24, RULE_ifstmt = 25, RULE_expr = 26, RULE_comparison = 27, 
		RULE_forstmt = 28, RULE_varname = 29, RULE_inlet = 30, RULE_outlet = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "patchstmt", "importstmt", "funcdefstmt", "returnstmt", "stmt", 
			"flow_stmt", "blockstmt", "callstmt", "nodedecl", "simpledecl", "list", 
			"listelem", "list_access", "connectionstmt", "connectionelem", "singlenode", 
			"parameters", "typedparams", "argslist", "typedargslist", "arg", "typedarg", 
			"suite", "operation", "ifstmt", "expr", "comparison", "forstmt", "varname", 
			"inlet", "outlet"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'{'", "'}'", "'@'", "'='", "'['", "','", "']'", "':'", 
			"'('", "')'", "'*'", "'/'", "'*~'", "'/~'", "'+'", "'-'", "'+~'", "'-~'", 
			"'%'", "'=='", "'!='", "'>='", "'<'", "'<='", "'in range'", "'patch'", 
			"'import'", "'func'", "'block'", "'return'", "'>'", "'end'", "'if'", 
			"'elif'", "'else'", "'for'", "'as'", "'break'", "'continue'", "'pass'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "PATCH", "IMPORT", "FUNC", "BLOCK", "RETURN", "CONNECT", 
			"END", "IF", "ELIF", "ELSE", "FOR", "AS", "BREAK", "CONTINUE", "PASS", 
			"VARTYPE", "NAME", "SYMBOL", "NUMBER", "INTEGER", "FLOAT", "WS", "COMMENT"
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
			setState(64);
			patchstmt();
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(65);
				importstmt();
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNC) {
				{
				{
				setState(71);
				funcdefstmt();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 65578783994960L) != 0) {
				{
				{
				setState(77);
				stmt();
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
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
			setState(85);
			match(PATCH);
			setState(86);
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
			setState(88);
			match(IMPORT);
			setState(89);
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
			setState(91);
			match(FUNC);
			setState(92);
			match(NAME);
			setState(93);
			typedparams();
			setState(94);
			match(T__1);
			setState(95);
			suite();
			setState(96);
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
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
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
			setState(98);
			match(RETURN);
			setState(99);
			arg();
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
		public IfstmtContext ifstmt() {
			return getRuleContext(IfstmtContext.class,0);
		}
		public ForstmtContext forstmt() {
			return getRuleContext(ForstmtContext.class,0);
		}
		public ReturnstmtContext returnstmt() {
			return getRuleContext(ReturnstmtContext.class,0);
		}
		public Flow_stmtContext flow_stmt() {
			return getRuleContext(Flow_stmtContext.class,0);
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
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
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
				ifstmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(107);
				forstmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(108);
				returnstmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(109);
				flow_stmt();
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
	public static class Flow_stmtContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(PdeasyParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(PdeasyParser.CONTINUE, 0); }
		public TerminalNode PASS() { return getToken(PdeasyParser.PASS, 0); }
		public Flow_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flow_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).enterFlow_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).exitFlow_stmt(this);
		}
	}

	public final Flow_stmtContext flow_stmt() throws RecognitionException {
		Flow_stmtContext _localctx = new Flow_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_flow_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 3848290697216L) != 0) ) {
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
		enterRule(_localctx, 14, RULE_blockstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(BLOCK);
			setState(115);
			match(NAME);
			setState(116);
			typedparams();
			setState(117);
			match(T__1);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 65578783994960L) != 0) {
				{
				setState(118);
				suite();
				}
			}

			setState(121);
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
		enterRule(_localctx, 16, RULE_callstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__3);
			setState(124);
			match(NAME);
			setState(125);
			parameters();
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
		enterRule(_localctx, 18, RULE_nodedecl);
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new Nodedecl1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				varname();
				setState(128);
				match(T__4);
				setState(129);
				match(NAME);
				setState(130);
				parameters();
				}
				break;
			case 2:
				_localctx = new Nodedecl2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(NAME);
				setState(133);
				parameters();
				}
				break;
			case 3:
				_localctx = new Nodedecl3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				operation();
				}
				break;
			case 4:
				_localctx = new Nodedecl4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(135);
				varname();
				setState(136);
				match(T__4);
				setState(137);
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
		enterRule(_localctx, 20, RULE_simpledecl);
		try {
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				varname();
				setState(142);
				match(T__4);
				setState(143);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				varname();
				setState(146);
				match(T__4);
				setState(147);
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
		enterRule(_localctx, 22, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__5);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 61572653248512L) != 0) {
				{
				{
				setState(152);
				listelem();
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(153);
					match(T__6);
					setState(154);
					listelem();
					}
					}
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165);
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
		public TerminalNode NAME() { return getToken(PdeasyParser.NAME, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
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
		enterRule(_localctx, 24, RULE_listelem);
		try {
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(SYMBOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				varname();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
				match(NAME);
				setState(171);
				parameters();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(172);
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
	public static class List_accessContext extends ParserRuleContext {
		public VarnameContext varname() {
			return getRuleContext(VarnameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
		enterRule(_localctx, 26, RULE_list_access);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			varname();
			setState(176);
			match(T__5);
			setState(177);
			expr(0);
			setState(178);
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
		enterRule(_localctx, 28, RULE_connectionstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			connectionelem();
			setState(183); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(181);
				match(CONNECT);
				setState(182);
				connectionelem();
				}
				}
				setState(185); 
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
		enterRule(_localctx, 30, RULE_connectionelem);
		int _la;
		try {
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				_localctx = new MultipleconnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(T__5);
				setState(188);
				singlenode();
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(189);
					match(T__6);
					setState(190);
					singlenode();
					}
					}
					setState(195);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(196);
				match(T__7);
				}
				break;
			case T__3:
			case T__9:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case NAME:
			case SYMBOL:
			case NUMBER:
				_localctx = new SingleconnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
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
		public NodedeclContext nodedecl() {
			return getRuleContext(NodedeclContext.class,0);
		}
		public VarnameContext varname() {
			return getRuleContext(VarnameContext.class,0);
		}
		public CallstmtContext callstmt() {
			return getRuleContext(CallstmtContext.class,0);
		}
		public List_accessContext list_access() {
			return getRuleContext(List_accessContext.class,0);
		}
		public SimpledeclContext simpledecl() {
			return getRuleContext(SimpledeclContext.class,0);
		}
		public InletContext inlet() {
			return getRuleContext(InletContext.class,0);
		}
		public OutletContext outlet() {
			return getRuleContext(OutletContext.class,0);
		}
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
		enterRule(_localctx, 32, RULE_singlenode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(201);
				inlet();
				setState(202);
				match(T__8);
				}
				break;
			}
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(206);
				nodedecl();
				}
				break;
			case 2:
				{
				setState(207);
				varname();
				}
				break;
			case 3:
				{
				setState(208);
				callstmt();
				}
				break;
			case 4:
				{
				setState(209);
				list_access();
				}
				break;
			case 5:
				{
				setState(210);
				simpledecl();
				}
				break;
			}
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(213);
				match(T__8);
				setState(214);
				outlet();
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
		enterRule(_localctx, 34, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(T__9);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 61572653249616L) != 0) {
				{
				setState(218);
				argslist();
				}
			}

			setState(221);
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
		enterRule(_localctx, 36, RULE_typedparams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(T__9);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(224);
				typedargslist();
				}
			}

			setState(227);
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
		enterRule(_localctx, 38, RULE_argslist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			arg();
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(230);
				match(T__6);
				setState(231);
				arg();
				}
				}
				setState(236);
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
		enterRule(_localctx, 40, RULE_typedargslist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			typedarg();
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(238);
				match(T__6);
				setState(239);
				typedarg();
				}
				}
				setState(244);
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
		public TerminalNode NAME() { return getToken(PdeasyParser.NAME, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
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
		enterRule(_localctx, 42, RULE_arg);
		try {
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				list();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(247);
				match(NAME);
				setState(248);
				parameters();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(249);
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
		enterRule(_localctx, 44, RULE_typedarg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			varname();
			setState(253);
			match(T__8);
			setState(254);
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
		enterRule(_localctx, 46, RULE_suite);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(256);
				stmt();
				}
				}
				setState(259); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 65578783994960L) != 0 );
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		enterRule(_localctx, 48, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			((OperationContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 2093056L) != 0) ) {
				((OperationContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(262);
			match(T__9);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 61572651156496L) != 0) {
				{
				setState(263);
				expr(0);
				}
			}

			setState(266);
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
		public List<ComparisonContext> comparison() {
			return getRuleContexts(ComparisonContext.class);
		}
		public ComparisonContext comparison(int i) {
			return getRuleContext(ComparisonContext.class,i);
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
		enterRule(_localctx, 50, RULE_ifstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(IF);
			setState(269);
			comparison();
			setState(270);
			match(T__8);
			setState(271);
			suite();
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(272);
				match(ELIF);
				setState(273);
				comparison();
				setState(274);
				match(T__8);
				setState(275);
				suite();
				}
				}
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(282);
				match(ELSE);
				setState(283);
				match(T__8);
				setState(284);
				suite();
				}
			}

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
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				_localctx = new TestNumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(290);
				match(NUMBER);
				}
				break;
			case 2:
				{
				_localctx = new TestSymContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(291);
				match(SYMBOL);
				}
				break;
			case 3:
				{
				_localctx = new TestVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(292);
				varname();
				}
				break;
			case 4:
				{
				_localctx = new TestCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(293);
				callstmt();
				}
				break;
			case 5:
				{
				_localctx = new TestListAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(294);
				list_access();
				}
				break;
			case 6:
				{
				_localctx = new ParensExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(295);
				match(T__9);
				setState(296);
				expr(0);
				setState(297);
				match(T__10);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(307);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(301);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(302);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 1060864L) != 0) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(303);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new SubAddContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(304);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(305);
						((SubAddContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__15 || _la==T__16) ) {
							((SubAddContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(306);
						expr(8);
						}
						break;
					}
					} 
				}
				setState(311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
	public static class ComparisonContext extends ParserRuleContext {
		public Token testop;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CONNECT() { return getToken(PdeasyParser.CONNECT, 0); }
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).exitComparison(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			expr(0);
			setState(313);
			((ComparisonContext)_localctx).testop = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 4359979008L) != 0) ) {
				((ComparisonContext)_localctx).testop = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(314);
			expr(0);
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
		public VarnameContext varname() {
			return getRuleContext(VarnameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public TerminalNode END() { return getToken(PdeasyParser.END, 0); }
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
			setState(316);
			match(FOR);
			setState(317);
			varname();
			setState(318);
			match(T__25);
			setState(319);
			expr(0);
			setState(320);
			match(T__8);
			setState(321);
			suite();
			setState(322);
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
		public TerminalNode NAME() { return getToken(PdeasyParser.NAME, 0); }
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
			setState(324);
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
	public static class InletContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(PdeasyParser.NUMBER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InletContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).enterInlet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).exitInlet(this);
		}
	}

	public final InletContext inlet() throws RecognitionException {
		InletContext _localctx = new InletContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_inlet);
		try {
			setState(328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
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
	public static class OutletContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(PdeasyParser.NUMBER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OutletContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outlet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).enterOutlet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdeasyListener ) ((PdeasyListener)listener).exitOutlet(this);
		}
	}

	public final OutletContext outlet() throws RecognitionException {
		OutletContext _localctx = new OutletContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_outlet);
		try {
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 26:
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
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00011\u014f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0001\u0000\u0001\u0000\u0005\u0000C\b\u0000"+
		"\n\u0000\f\u0000F\t\u0000\u0001\u0000\u0005\u0000I\b\u0000\n\u0000\f\u0000"+
		"L\t\u0000\u0001\u0000\u0005\u0000O\b\u0000\n\u0000\f\u0000R\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005o\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007x\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u008c\b\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0096\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u009c\b\u000b\n\u000b\f\u000b"+
		"\u009f\t\u000b\u0005\u000b\u00a1\b\u000b\n\u000b\f\u000b\u00a4\t\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u00ae\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0004\u000e\u00b8\b\u000e\u000b\u000e\f\u000e"+
		"\u00b9\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00c0"+
		"\b\u000f\n\u000f\f\u000f\u00c3\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u00c8\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u00cd\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u00d4\b\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00d8\b"+
		"\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u00dc\b\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0003\u0012\u00e2\b\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00e9\b\u0013\n"+
		"\u0013\f\u0013\u00ec\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u00f1\b\u0014\n\u0014\f\u0014\u00f4\t\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00fb\b\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0004\u0017\u0102\b\u0017"+
		"\u000b\u0017\f\u0017\u0103\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u0109\b\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0005\u0019\u0116\b\u0019\n\u0019\f\u0019\u0119\t\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u011e\b\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u012c\b\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005"+
		"\u001a\u0134\b\u001a\n\u001a\f\u001a\u0137\t\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0003\u001e\u0149\b\u001e\u0001\u001f\u0001\u001f"+
		"\u0003\u001f\u014d\b\u001f\u0001\u001f\u0000\u00014 \u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>\u0000\u0005\u0001\u0000\')\u0001\u0000\f\u0014\u0002\u0000"+
		"\f\r\u0014\u0014\u0001\u0000\u0010\u0011\u0002\u0000\u0015\u0019  \u0161"+
		"\u0000@\u0001\u0000\u0000\u0000\u0002U\u0001\u0000\u0000\u0000\u0004X"+
		"\u0001\u0000\u0000\u0000\u0006[\u0001\u0000\u0000\u0000\bb\u0001\u0000"+
		"\u0000\u0000\nn\u0001\u0000\u0000\u0000\fp\u0001\u0000\u0000\u0000\u000e"+
		"r\u0001\u0000\u0000\u0000\u0010{\u0001\u0000\u0000\u0000\u0012\u008b\u0001"+
		"\u0000\u0000\u0000\u0014\u0095\u0001\u0000\u0000\u0000\u0016\u0097\u0001"+
		"\u0000\u0000\u0000\u0018\u00ad\u0001\u0000\u0000\u0000\u001a\u00af\u0001"+
		"\u0000\u0000\u0000\u001c\u00b4\u0001\u0000\u0000\u0000\u001e\u00c7\u0001"+
		"\u0000\u0000\u0000 \u00cc\u0001\u0000\u0000\u0000\"\u00d9\u0001\u0000"+
		"\u0000\u0000$\u00df\u0001\u0000\u0000\u0000&\u00e5\u0001\u0000\u0000\u0000"+
		"(\u00ed\u0001\u0000\u0000\u0000*\u00fa\u0001\u0000\u0000\u0000,\u00fc"+
		"\u0001\u0000\u0000\u0000.\u0101\u0001\u0000\u0000\u00000\u0105\u0001\u0000"+
		"\u0000\u00002\u010c\u0001\u0000\u0000\u00004\u012b\u0001\u0000\u0000\u0000"+
		"6\u0138\u0001\u0000\u0000\u00008\u013c\u0001\u0000\u0000\u0000:\u0144"+
		"\u0001\u0000\u0000\u0000<\u0148\u0001\u0000\u0000\u0000>\u014c\u0001\u0000"+
		"\u0000\u0000@D\u0003\u0002\u0001\u0000AC\u0003\u0004\u0002\u0000BA\u0001"+
		"\u0000\u0000\u0000CF\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000"+
		"DE\u0001\u0000\u0000\u0000EJ\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000"+
		"\u0000GI\u0003\u0006\u0003\u0000HG\u0001\u0000\u0000\u0000IL\u0001\u0000"+
		"\u0000\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KP\u0001"+
		"\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000MO\u0003\n\u0005\u0000NM\u0001"+
		"\u0000\u0000\u0000OR\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000"+
		"PQ\u0001\u0000\u0000\u0000QS\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000"+
		"\u0000ST\u0005\u0001\u0000\u0000T\u0001\u0001\u0000\u0000\u0000UV\u0005"+
		"\u001b\u0000\u0000VW\u0005+\u0000\u0000W\u0003\u0001\u0000\u0000\u0000"+
		"XY\u0005\u001c\u0000\u0000YZ\u0005+\u0000\u0000Z\u0005\u0001\u0000\u0000"+
		"\u0000[\\\u0005\u001d\u0000\u0000\\]\u0005+\u0000\u0000]^\u0003$\u0012"+
		"\u0000^_\u0005\u0002\u0000\u0000_`\u0003.\u0017\u0000`a\u0005\u0003\u0000"+
		"\u0000a\u0007\u0001\u0000\u0000\u0000bc\u0005\u001f\u0000\u0000cd\u0003"+
		"*\u0015\u0000d\t\u0001\u0000\u0000\u0000eo\u0003\u000e\u0007\u0000fo\u0003"+
		"\u001c\u000e\u0000go\u0003\u0010\b\u0000ho\u0003\u0012\t\u0000io\u0003"+
		"\u0014\n\u0000jo\u00032\u0019\u0000ko\u00038\u001c\u0000lo\u0003\b\u0004"+
		"\u0000mo\u0003\f\u0006\u0000ne\u0001\u0000\u0000\u0000nf\u0001\u0000\u0000"+
		"\u0000ng\u0001\u0000\u0000\u0000nh\u0001\u0000\u0000\u0000ni\u0001\u0000"+
		"\u0000\u0000nj\u0001\u0000\u0000\u0000nk\u0001\u0000\u0000\u0000nl\u0001"+
		"\u0000\u0000\u0000nm\u0001\u0000\u0000\u0000o\u000b\u0001\u0000\u0000"+
		"\u0000pq\u0007\u0000\u0000\u0000q\r\u0001\u0000\u0000\u0000rs\u0005\u001e"+
		"\u0000\u0000st\u0005+\u0000\u0000tu\u0003$\u0012\u0000uw\u0005\u0002\u0000"+
		"\u0000vx\u0003.\u0017\u0000wv\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000"+
		"\u0000xy\u0001\u0000\u0000\u0000yz\u0005\u0003\u0000\u0000z\u000f\u0001"+
		"\u0000\u0000\u0000{|\u0005\u0004\u0000\u0000|}\u0005+\u0000\u0000}~\u0003"+
		"\"\u0011\u0000~\u0011\u0001\u0000\u0000\u0000\u007f\u0080\u0003:\u001d"+
		"\u0000\u0080\u0081\u0005\u0005\u0000\u0000\u0081\u0082\u0005+\u0000\u0000"+
		"\u0082\u0083\u0003\"\u0011\u0000\u0083\u008c\u0001\u0000\u0000\u0000\u0084"+
		"\u0085\u0005+\u0000\u0000\u0085\u008c\u0003\"\u0011\u0000\u0086\u008c"+
		"\u00030\u0018\u0000\u0087\u0088\u0003:\u001d\u0000\u0088\u0089\u0005\u0005"+
		"\u0000\u0000\u0089\u008a\u00030\u0018\u0000\u008a\u008c\u0001\u0000\u0000"+
		"\u0000\u008b\u007f\u0001\u0000\u0000\u0000\u008b\u0084\u0001\u0000\u0000"+
		"\u0000\u008b\u0086\u0001\u0000\u0000\u0000\u008b\u0087\u0001\u0000\u0000"+
		"\u0000\u008c\u0013\u0001\u0000\u0000\u0000\u008d\u008e\u0003:\u001d\u0000"+
		"\u008e\u008f\u0005\u0005\u0000\u0000\u008f\u0090\u00034\u001a\u0000\u0090"+
		"\u0096\u0001\u0000\u0000\u0000\u0091\u0092\u0003:\u001d\u0000\u0092\u0093"+
		"\u0005\u0005\u0000\u0000\u0093\u0094\u0003\u0016\u000b\u0000\u0094\u0096"+
		"\u0001\u0000\u0000\u0000\u0095\u008d\u0001\u0000\u0000\u0000\u0095\u0091"+
		"\u0001\u0000\u0000\u0000\u0096\u0015\u0001\u0000\u0000\u0000\u0097\u00a2"+
		"\u0005\u0006\u0000\u0000\u0098\u009d\u0003\u0018\f\u0000\u0099\u009a\u0005"+
		"\u0007\u0000\u0000\u009a\u009c\u0003\u0018\f\u0000\u009b\u0099\u0001\u0000"+
		"\u0000\u0000\u009c\u009f\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000"+
		"\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u00a1\u0001\u0000"+
		"\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u00a0\u0098\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a4\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\b\u0000"+
		"\u0000\u00a6\u0017\u0001\u0000\u0000\u0000\u00a7\u00ae\u0005,\u0000\u0000"+
		"\u00a8\u00ae\u0005-\u0000\u0000\u00a9\u00ae\u0003:\u001d\u0000\u00aa\u00ab"+
		"\u0005+\u0000\u0000\u00ab\u00ae\u0003\"\u0011\u0000\u00ac\u00ae\u0003"+
		"0\u0018\u0000\u00ad\u00a7\u0001\u0000\u0000\u0000\u00ad\u00a8\u0001\u0000"+
		"\u0000\u0000\u00ad\u00a9\u0001\u0000\u0000\u0000\u00ad\u00aa\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ae\u0019\u0001\u0000"+
		"\u0000\u0000\u00af\u00b0\u0003:\u001d\u0000\u00b0\u00b1\u0005\u0006\u0000"+
		"\u0000\u00b1\u00b2\u00034\u001a\u0000\u00b2\u00b3\u0005\b\u0000\u0000"+
		"\u00b3\u001b\u0001\u0000\u0000\u0000\u00b4\u00b7\u0003\u001e\u000f\u0000"+
		"\u00b5\u00b6\u0005 \u0000\u0000\u00b6\u00b8\u0003\u001e\u000f\u0000\u00b7"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba"+
		"\u001d\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005\u0006\u0000\u0000\u00bc"+
		"\u00c1\u0003 \u0010\u0000\u00bd\u00be\u0005\u0007\u0000\u0000\u00be\u00c0"+
		"\u0003 \u0010\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00c0\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c4\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c5\u0005\b\u0000\u0000\u00c5\u00c8\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c8\u0003 \u0010\u0000\u00c7\u00bb\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c8\u001f\u0001\u0000\u0000"+
		"\u0000\u00c9\u00ca\u0003<\u001e\u0000\u00ca\u00cb\u0005\t\u0000\u0000"+
		"\u00cb\u00cd\u0001\u0000\u0000\u0000\u00cc\u00c9\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00d3\u0001\u0000\u0000\u0000"+
		"\u00ce\u00d4\u0003\u0012\t\u0000\u00cf\u00d4\u0003:\u001d\u0000\u00d0"+
		"\u00d4\u0003\u0010\b\u0000\u00d1\u00d4\u0003\u001a\r\u0000\u00d2\u00d4"+
		"\u0003\u0014\n\u0000\u00d3\u00ce\u0001\u0000\u0000\u0000\u00d3\u00cf\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d0\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d6\u0005\t\u0000\u0000\u00d6\u00d8\u0003>"+
		"\u001f\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000"+
		"\u0000\u0000\u00d8!\u0001\u0000\u0000\u0000\u00d9\u00db\u0005\n\u0000"+
		"\u0000\u00da\u00dc\u0003&\u0013\u0000\u00db\u00da\u0001\u0000\u0000\u0000"+
		"\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000"+
		"\u00dd\u00de\u0005\u000b\u0000\u0000\u00de#\u0001\u0000\u0000\u0000\u00df"+
		"\u00e1\u0005\n\u0000\u0000\u00e0\u00e2\u0003(\u0014\u0000\u00e1\u00e0"+
		"\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e3"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005\u000b\u0000\u0000\u00e4%\u0001"+
		"\u0000\u0000\u0000\u00e5\u00ea\u0003*\u0015\u0000\u00e6\u00e7\u0005\u0007"+
		"\u0000\u0000\u00e7\u00e9\u0003*\u0015\u0000\u00e8\u00e6\u0001\u0000\u0000"+
		"\u0000\u00e9\u00ec\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000"+
		"\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\'\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ed\u00f2\u0003,\u0016\u0000\u00ee"+
		"\u00ef\u0005\u0007\u0000\u0000\u00ef\u00f1\u0003,\u0016\u0000\u00f0\u00ee"+
		"\u0001\u0000\u0000\u0000\u00f1\u00f4\u0001\u0000\u0000\u0000\u00f2\u00f0"+
		"\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3)\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f5\u00fb\u0003"+
		"4\u001a\u0000\u00f6\u00fb\u0003\u0016\u000b\u0000\u00f7\u00f8\u0005+\u0000"+
		"\u0000\u00f8\u00fb\u0003\"\u0011\u0000\u00f9\u00fb\u00030\u0018\u0000"+
		"\u00fa\u00f5\u0001\u0000\u0000\u0000\u00fa\u00f6\u0001\u0000\u0000\u0000"+
		"\u00fa\u00f7\u0001\u0000\u0000\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000"+
		"\u00fb+\u0001\u0000\u0000\u0000\u00fc\u00fd\u0003:\u001d\u0000\u00fd\u00fe"+
		"\u0005\t\u0000\u0000\u00fe\u00ff\u0005*\u0000\u0000\u00ff-\u0001\u0000"+
		"\u0000\u0000\u0100\u0102\u0003\n\u0005\u0000\u0101\u0100\u0001\u0000\u0000"+
		"\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000"+
		"\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104/\u0001\u0000\u0000\u0000"+
		"\u0105\u0106\u0007\u0001\u0000\u0000\u0106\u0108\u0005\n\u0000\u0000\u0107"+
		"\u0109\u00034\u001a\u0000\u0108\u0107\u0001\u0000\u0000\u0000\u0108\u0109"+
		"\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u010b"+
		"\u0005\u000b\u0000\u0000\u010b1\u0001\u0000\u0000\u0000\u010c\u010d\u0005"+
		"\"\u0000\u0000\u010d\u010e\u00036\u001b\u0000\u010e\u010f\u0005\t\u0000"+
		"\u0000\u010f\u0117\u0003.\u0017\u0000\u0110\u0111\u0005#\u0000\u0000\u0111"+
		"\u0112\u00036\u001b\u0000\u0112\u0113\u0005\t\u0000\u0000\u0113\u0114"+
		"\u0003.\u0017\u0000\u0114\u0116\u0001\u0000\u0000\u0000\u0115\u0110\u0001"+
		"\u0000\u0000\u0000\u0116\u0119\u0001\u0000\u0000\u0000\u0117\u0115\u0001"+
		"\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u011d\u0001"+
		"\u0000\u0000\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u011a\u011b\u0005"+
		"$\u0000\u0000\u011b\u011c\u0005\t\u0000\u0000\u011c\u011e\u0003.\u0017"+
		"\u0000\u011d\u011a\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000"+
		"\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f\u0120\u0005!\u0000\u0000"+
		"\u01203\u0001\u0000\u0000\u0000\u0121\u0122\u0006\u001a\uffff\uffff\u0000"+
		"\u0122\u012c\u0005-\u0000\u0000\u0123\u012c\u0005,\u0000\u0000\u0124\u012c"+
		"\u0003:\u001d\u0000\u0125\u012c\u0003\u0010\b\u0000\u0126\u012c\u0003"+
		"\u001a\r\u0000\u0127\u0128\u0005\n\u0000\u0000\u0128\u0129\u00034\u001a"+
		"\u0000\u0129\u012a\u0005\u000b\u0000\u0000\u012a\u012c\u0001\u0000\u0000"+
		"\u0000\u012b\u0121\u0001\u0000\u0000\u0000\u012b\u0123\u0001\u0000\u0000"+
		"\u0000\u012b\u0124\u0001\u0000\u0000\u0000\u012b\u0125\u0001\u0000\u0000"+
		"\u0000\u012b\u0126\u0001\u0000\u0000\u0000\u012b\u0127\u0001\u0000\u0000"+
		"\u0000\u012c\u0135\u0001\u0000\u0000\u0000\u012d\u012e\n\b\u0000\u0000"+
		"\u012e\u012f\u0007\u0002\u0000\u0000\u012f\u0134\u00034\u001a\t\u0130"+
		"\u0131\n\u0007\u0000\u0000\u0131\u0132\u0007\u0003\u0000\u0000\u0132\u0134"+
		"\u00034\u001a\b\u0133\u012d\u0001\u0000\u0000\u0000\u0133\u0130\u0001"+
		"\u0000\u0000\u0000\u0134\u0137\u0001\u0000\u0000\u0000\u0135\u0133\u0001"+
		"\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u01365\u0001\u0000"+
		"\u0000\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0138\u0139\u00034\u001a"+
		"\u0000\u0139\u013a\u0007\u0004\u0000\u0000\u013a\u013b\u00034\u001a\u0000"+
		"\u013b7\u0001\u0000\u0000\u0000\u013c\u013d\u0005%\u0000\u0000\u013d\u013e"+
		"\u0003:\u001d\u0000\u013e\u013f\u0005\u001a\u0000\u0000\u013f\u0140\u0003"+
		"4\u001a\u0000\u0140\u0141\u0005\t\u0000\u0000\u0141\u0142\u0003.\u0017"+
		"\u0000\u0142\u0143\u0005!\u0000\u0000\u01439\u0001\u0000\u0000\u0000\u0144"+
		"\u0145\u0005+\u0000\u0000\u0145;\u0001\u0000\u0000\u0000\u0146\u0149\u0005"+
		"-\u0000\u0000\u0147\u0149\u00034\u001a\u0000\u0148\u0146\u0001\u0000\u0000"+
		"\u0000\u0148\u0147\u0001\u0000\u0000\u0000\u0149=\u0001\u0000\u0000\u0000"+
		"\u014a\u014d\u0005-\u0000\u0000\u014b\u014d\u00034\u001a\u0000\u014c\u014a"+
		"\u0001\u0000\u0000\u0000\u014c\u014b\u0001\u0000\u0000\u0000\u014d?\u0001"+
		"\u0000\u0000\u0000\u001eDJPnw\u008b\u0095\u009d\u00a2\u00ad\u00b9\u00c1"+
		"\u00c7\u00cc\u00d3\u00d7\u00db\u00e1\u00ea\u00f2\u00fa\u0103\u0108\u0117"+
		"\u011d\u012b\u0133\u0135\u0148\u014c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}