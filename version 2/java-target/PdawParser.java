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
public class PdawParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, IMPORT=29, PATCH=30, FUNC=31, 
		BLOCK=32, RETURN=33, CONNECT=34, END=35, IF=36, ELIF=37, ELSE=38, FOR=39, 
		VARTYPE=40, IOLET=41, NAME=42, VARNAME=43, SYMBOL=44, NUMBER=45, INTEGER=46, 
		FLOAT=47, NL=48, WS=49, COMMENT=50;
	public static final int
		RULE_prog = 0, RULE_importstmt = 1, RULE_patchstmt = 2, RULE_funcdefstmt = 3, 
		RULE_returnstmt = 4, RULE_stmt = 5, RULE_blockstmt = 6, RULE_dotdotstmt = 7, 
		RULE_callstmt = 8, RULE_nodedeclstmt = 9, RULE_simpledeclstmt = 10, RULE_list = 11, 
		RULE_slicedlist = 12, RULE_connectionstmt = 13, RULE_connectionelem = 14, 
		RULE_parameters = 15, RULE_typedparams = 16, RULE_argslist = 17, RULE_typedargslist = 18, 
		RULE_arg = 19, RULE_typedarg = 20, RULE_suite = 21, RULE_operation = 22, 
		RULE_ifstmt = 23, RULE_expr = 24, RULE_forstmt = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "importstmt", "patchstmt", "funcdefstmt", "returnstmt", "stmt", 
			"blockstmt", "dotdotstmt", "callstmt", "nodedeclstmt", "simpledeclstmt", 
			"list", "slicedlist", "connectionstmt", "connectionelem", "parameters", 
			"typedparams", "argslist", "typedargslist", "arg", "typedarg", "suite", 
			"operation", "ifstmt", "expr", "forstmt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'{'", "'}'", "','", "'..'", "'@'", "'='", "'['", "']'", 
			"'.'", "'('", "')'", "':'", "'*'", "'/'", "'*~'", "'/~'", "'+'", "'-'", 
			"'+~'", "'-~'", "'%'", "'=='", "'!='", "'>='", "'<'", "'<='", "'in range'", 
			"'import'", "'patch'", "'func'", "'block'", "'return'", "'>'", "'end'", 
			"'if'", "'elif'", "'else'", "'for'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "IMPORT", "PATCH", "FUNC", "BLOCK", "RETURN", 
			"CONNECT", "END", "IF", "ELIF", "ELSE", "FOR", "VARTYPE", "IOLET", "NAME", 
			"VARNAME", "SYMBOL", "NUMBER", "INTEGER", "FLOAT", "NL", "WS", "COMMENT"
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

	public PdawParser(TokenStream input) {
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
		public List<TerminalNode> NL() { return getTokens(PdawParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(PdawParser.NL, i);
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
			if ( listener instanceof PdawListener ) ((PdawListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdawListener ) ((PdawListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT || _la==NL) {
				{
				setState(54);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IMPORT:
					{
					setState(52);
					importstmt();
					}
					break;
				case NL:
					{
					setState(53);
					match(NL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			patchstmt();
			setState(63);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(60);
					match(NL);
					}
					} 
				}
				setState(65);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(70);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(68);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case FUNC:
						{
						setState(66);
						funcdefstmt();
						}
						break;
					case NL:
						{
						setState(67);
						match(NL);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(72);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 295291894874432L) != 0) {
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
	public static class ImportstmtContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(PdawParser.IMPORT, 0); }
		public TerminalNode NAME() { return getToken(PdawParser.NAME, 0); }
		public TerminalNode NL() { return getToken(PdawParser.NL, 0); }
		public ImportstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdawListener ) ((PdawListener)listener).enterImportstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdawListener ) ((PdawListener)listener).exitImportstmt(this);
		}
	}

	public final ImportstmtContext importstmt() throws RecognitionException {
		ImportstmtContext _localctx = new ImportstmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_importstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(IMPORT);
			setState(82);
			match(NAME);
			setState(83);
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
	public static class PatchstmtContext extends ParserRuleContext {
		public TerminalNode PATCH() { return getToken(PdawParser.PATCH, 0); }
		public TerminalNode NAME() { return getToken(PdawParser.NAME, 0); }
		public TerminalNode NL() { return getToken(PdawParser.NL, 0); }
		public PatchstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patchstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdawListener ) ((PdawListener)listener).enterPatchstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdawListener ) ((PdawListener)listener).exitPatchstmt(this);
		}
	}

	public final PatchstmtContext patchstmt() throws RecognitionException {
		PatchstmtContext _localctx = new PatchstmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_patchstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(PATCH);
			setState(86);
			match(NAME);
			setState(87);
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
	public static class FuncdefstmtContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(PdawParser.FUNC, 0); }
		public TerminalNode NAME() { return getToken(PdawParser.NAME, 0); }
		public TypedparamsContext typedparams() {
			return getRuleContext(TypedparamsContext.class,0);
		}
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(PdawParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(PdawParser.NL, i);
		}
		public ReturnstmtContext returnstmt() {
			return getRuleContext(ReturnstmtContext.class,0);
		}
		public FuncdefstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdefstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdawListener ) ((PdawListener)listener).enterFuncdefstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdawListener ) ((PdawListener)listener).exitFuncdefstmt(this);
		}
	}

	public final FuncdefstmtContext funcdefstmt() throws RecognitionException {
		FuncdefstmtContext _localctx = new FuncdefstmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcdefstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(FUNC);
			setState(90);
			match(NAME);
			setState(91);
			typedparams();
			setState(92);
			match(T__1);
			setState(93);
			suite();
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(94);
				returnstmt();
				}
			}

			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(97);
				match(NL);
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
			match(T__2);
			setState(104);
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
	public static class ReturnstmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(PdawParser.RETURN, 0); }
		public List<TerminalNode> VARNAME() { return getTokens(PdawParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(PdawParser.VARNAME, i);
		}
		public TerminalNode NL() { return getToken(PdawParser.NL, 0); }
		public ReturnstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdawListener ) ((PdawListener)listener).enterReturnstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdawListener ) ((PdawListener)listener).exitReturnstmt(this);
		}
	}

	public final ReturnstmtContext returnstmt() throws RecognitionException {
		ReturnstmtContext _localctx = new ReturnstmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_returnstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(RETURN);
			setState(107);
			match(VARNAME);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(108);
				match(T__3);
				setState(109);
				match(VARNAME);
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
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
		public BlockstmtContext blockstmt() {
			return getRuleContext(BlockstmtContext.class,0);
		}
		public TerminalNode NL() { return getToken(PdawParser.NL, 0); }
		public ConnectionstmtContext connectionstmt() {
			return getRuleContext(ConnectionstmtContext.class,0);
		}
		public CallstmtContext callstmt() {
			return getRuleContext(CallstmtContext.class,0);
		}
		public NodedeclstmtContext nodedeclstmt() {
			return getRuleContext(NodedeclstmtContext.class,0);
		}
		public SimpledeclstmtContext simpledeclstmt() {
			return getRuleContext(SimpledeclstmtContext.class,0);
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
			if ( listener instanceof PdawListener ) ((PdawListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdawListener ) ((PdawListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stmt);
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				blockstmt();
				setState(118);
				match(NL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				connectionstmt();
				setState(121);
				match(NL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				callstmt();
				setState(124);
				match(NL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(126);
				nodedeclstmt();
				setState(127);
				match(NL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(129);
				simpledeclstmt();
				setState(130);
				match(NL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(132);
				ifstmt();
				setState(133);
				match(NL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(135);
				forstmt();
				setState(136);
				match(NL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(138);
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
	public static class BlockstmtContext extends ParserRuleContext {
		public TerminalNode BLOCK() { return getToken(PdawParser.BLOCK, 0); }
		public TerminalNode NAME() { return getToken(PdawParser.NAME, 0); }
		public TypedparamsContext typedparams() {
			return getRuleContext(TypedparamsContext.class,0);
		}
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(PdawParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(PdawParser.NL, i);
		}
		public List<DotdotstmtContext> dotdotstmt() {
			return getRuleContexts(DotdotstmtContext.class);
		}
		public DotdotstmtContext dotdotstmt(int i) {
			return getRuleContext(DotdotstmtContext.class,i);
		}
		public BlockstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdawListener ) ((PdawListener)listener).enterBlockstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdawListener ) ((PdawListener)listener).exitBlockstmt(this);
		}
	}

	public final BlockstmtContext blockstmt() throws RecognitionException {
		BlockstmtContext _localctx = new BlockstmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_blockstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(BLOCK);
			setState(142);
			match(NAME);
			setState(143);
			typedparams();
			setState(144);
			match(T__1);
			setState(145);
			suite();
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(146);
				dotdotstmt();
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(152);
				match(NL);
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158);
			match(T__2);
			setState(159);
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
	public static class DotdotstmtContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(PdawParser.NL, 0); }
		public ConnectionstmtContext connectionstmt() {
			return getRuleContext(ConnectionstmtContext.class,0);
		}
		public NodedeclstmtContext nodedeclstmt() {
			return getRuleContext(NodedeclstmtContext.class,0);
		}
		public CallstmtContext callstmt() {
			return getRuleContext(CallstmtContext.class,0);
		}
		public DotdotstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotdotstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdawListener ) ((PdawListener)listener).enterDotdotstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdawListener ) ((PdawListener)listener).exitDotdotstmt(this);
		}
	}

	public final DotdotstmtContext dotdotstmt() throws RecognitionException {
		DotdotstmtContext _localctx = new DotdotstmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dotdotstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(T__4);
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(162);
				connectionstmt();
				}
				break;
			case 2:
				{
				setState(163);
				nodedeclstmt();
				}
				break;
			case 3:
				{
				setState(164);
				callstmt();
				}
				break;
			}
			setState(167);
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
	public static class CallstmtContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PdawParser.NAME, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public CallstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdawListener ) ((PdawListener)listener).enterCallstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdawListener ) ((PdawListener)listener).exitCallstmt(this);
		}
	}

	public final CallstmtContext callstmt() throws RecognitionException {
		CallstmtContext _localctx = new CallstmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_callstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__5);
			setState(170);
			match(NAME);
			setState(171);
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
	public static class NodedeclstmtContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(PdawParser.VARNAME, 0); }
		public TerminalNode NAME() { return getToken(PdawParser.NAME, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public NodedeclstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodedeclstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdawListener ) ((PdawListener)listener).enterNodedeclstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdawListener ) ((PdawListener)listener).exitNodedeclstmt(this);
		}
	}

	public final NodedeclstmtContext nodedeclstmt() throws RecognitionException {
		NodedeclstmtContext _localctx = new NodedeclstmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_nodedeclstmt);
		int _la;
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(VARNAME);
				setState(174);
				match(T__6);
				setState(175);
				match(NAME);
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(176);
					parameters();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				match(NAME);
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(180);
					parameters();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				operation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(184);
				match(VARNAME);
				setState(185);
				match(T__6);
				setState(186);
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
	public static class SimpledeclstmtContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(PdawParser.VARNAME, 0); }
		public TerminalNode SYMBOL() { return getToken(PdawParser.SYMBOL, 0); }
		public TerminalNode NUMBER() { return getToken(PdawParser.NUMBER, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public SlicedlistContext slicedlist() {
			return getRuleContext(SlicedlistContext.class,0);
		}
		public CallstmtContext callstmt() {
			return getRuleContext(CallstmtContext.class,0);
		}
		public SimpledeclstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpledeclstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdawListener ) ((PdawListener)listener).enterSimpledeclstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdawListener ) ((PdawListener)listener).exitSimpledeclstmt(this);
		}
	}

	public final SimpledeclstmtContext simpledeclstmt() throws RecognitionException {
		SimpledeclstmtContext _localctx = new SimpledeclstmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_simpledeclstmt);
		try {
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(VARNAME);
				setState(190);
				match(T__6);
				setState(191);
				match(SYMBOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				match(VARNAME);
				setState(193);
				match(T__6);
				setState(194);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				match(VARNAME);
				setState(196);
				match(T__6);
				setState(197);
				list();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(198);
				match(VARNAME);
				setState(199);
				match(T__6);
				setState(200);
				slicedlist();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(201);
				match(VARNAME);
				setState(202);
				match(T__6);
				setState(203);
				callstmt();
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
		public List<TerminalNode> SYMBOL() { return getTokens(PdawParser.SYMBOL); }
		public TerminalNode SYMBOL(int i) {
			return getToken(PdawParser.SYMBOL, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(PdawParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(PdawParser.NUMBER, i);
		}
		public List<TerminalNode> VARNAME() { return getTokens(PdawParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(PdawParser.VARNAME, i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdawListener ) ((PdawListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdawListener ) ((PdawListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_list);
		int _la;
		try {
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(T__7);
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SYMBOL) {
					{
					{
					setState(207);
					match(SYMBOL);
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(208);
						match(T__3);
						setState(209);
						match(SYMBOL);
						}
						}
						setState(214);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(219);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(220);
				match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				match(T__7);
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NUMBER) {
					{
					{
					setState(222);
					match(NUMBER);
					setState(227);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(223);
						match(T__3);
						setState(224);
						match(NUMBER);
						}
						}
						setState(229);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(234);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(235);
				match(T__8);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				match(T__7);
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VARNAME) {
					{
					{
					setState(237);
					match(VARNAME);
					setState(242);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(238);
						match(T__3);
						setState(239);
						match(VARNAME);
						}
						}
						setState(244);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(249);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(250);
				match(T__8);
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
	public static class SlicedlistContext extends ParserRuleContext {
		public List<TerminalNode> VARNAME() { return getTokens(PdawParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(PdawParser.VARNAME, i);
		}
		public TerminalNode NUMBER() { return getToken(PdawParser.NUMBER, 0); }
		public SlicedlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slicedlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdawListener ) ((PdawListener)listener).enterSlicedlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdawListener ) ((PdawListener)listener).exitSlicedlist(this);
		}
	}

	public final SlicedlistContext slicedlist() throws RecognitionException {
		SlicedlistContext _localctx = new SlicedlistContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_slicedlist);
		try {
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				match(VARNAME);
				setState(254);
				match(T__7);
				setState(255);
				match(VARNAME);
				setState(256);
				match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				match(VARNAME);
				setState(258);
				match(T__7);
				setState(259);
				match(NUMBER);
				setState(260);
				match(T__8);
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
		public List<TerminalNode> CONNECT() { return getTokens(PdawParser.CONNECT); }
		public TerminalNode CONNECT(int i) {
			return getToken(PdawParser.CONNECT, i);
		}
		public ConnectionstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connectionstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdawListener ) ((PdawListener)listener).enterConnectionstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdawListener ) ((PdawListener)listener).exitConnectionstmt(this);
		}
	}

	public final ConnectionstmtContext connectionstmt() throws RecognitionException {
		ConnectionstmtContext _localctx = new ConnectionstmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_connectionstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			connectionelem();
			setState(266); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(264);
				match(CONNECT);
				setState(265);
				connectionelem();
				}
				}
				setState(268); 
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
		public List<TerminalNode> VARNAME() { return getTokens(PdawParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(PdawParser.VARNAME, i);
		}
		public List<NodedeclstmtContext> nodedeclstmt() {
			return getRuleContexts(NodedeclstmtContext.class);
		}
		public NodedeclstmtContext nodedeclstmt(int i) {
			return getRuleContext(NodedeclstmtContext.class,i);
		}
		public List<TerminalNode> IOLET() { return getTokens(PdawParser.IOLET); }
		public TerminalNode IOLET(int i) {
			return getToken(PdawParser.IOLET, i);
		}
		public ConnectionelemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connectionelem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdawListener ) ((PdawListener)listener).enterConnectionelem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdawListener ) ((PdawListener)listener).exitConnectionelem(this);
		}
	}

	public final ConnectionelemContext connectionelem() throws RecognitionException {
		ConnectionelemContext _localctx = new ConnectionelemContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_connectionelem);
		int _la;
		try {
			setState(302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				match(T__7);
				setState(273);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(271);
					match(VARNAME);
					}
					break;
				case 2:
					{
					setState(272);
					nodedeclstmt();
					}
					break;
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(275);
					match(T__9);
					setState(276);
					match(IOLET);
					}
				}

				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(279);
					match(T__3);
					setState(282);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						setState(280);
						match(VARNAME);
						}
						break;
					case 2:
						{
						setState(281);
						nodedeclstmt();
						}
						break;
					}
					setState(286);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__9) {
						{
						setState(284);
						match(T__9);
						setState(285);
						match(IOLET);
						}
					}

					}
					}
					setState(292);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(293);
				match(T__8);
				}
				break;
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case NAME:
			case VARNAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(294);
					match(VARNAME);
					}
					break;
				case 2:
					{
					setState(295);
					nodedeclstmt();
					}
					break;
				}
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(298);
					match(T__9);
					setState(299);
					match(IOLET);
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
			if ( listener instanceof PdawListener ) ((PdawListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdawListener ) ((PdawListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(T__10);
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 61572651155776L) != 0) {
				{
				setState(305);
				argslist();
				}
			}

			setState(308);
			match(T__11);
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
			if ( listener instanceof PdawListener ) ((PdawListener)listener).enterTypedparams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdawListener ) ((PdawListener)listener).exitTypedparams(this);
		}
	}

	public final TypedparamsContext typedparams() throws RecognitionException {
		TypedparamsContext _localctx = new TypedparamsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typedparams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(T__10);
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARNAME) {
				{
				setState(311);
				typedargslist();
				}
			}

			setState(314);
			match(T__11);
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
			if ( listener instanceof PdawListener ) ((PdawListener)listener).enterArgslist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdawListener ) ((PdawListener)listener).exitArgslist(this);
		}
	}

	public final ArgslistContext argslist() throws RecognitionException {
		ArgslistContext _localctx = new ArgslistContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_argslist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			arg();
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(317);
				match(T__3);
				setState(318);
				arg();
				}
				}
				setState(323);
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
			if ( listener instanceof PdawListener ) ((PdawListener)listener).enterTypedargslist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdawListener ) ((PdawListener)listener).exitTypedargslist(this);
		}
	}

	public final TypedargslistContext typedargslist() throws RecognitionException {
		TypedargslistContext _localctx = new TypedargslistContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typedargslist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			typedarg();
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(325);
				match(T__3);
				setState(326);
				typedarg();
				}
				}
				setState(331);
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
		public TerminalNode SYMBOL() { return getToken(PdawParser.SYMBOL, 0); }
		public TerminalNode NUMBER() { return getToken(PdawParser.NUMBER, 0); }
		public TerminalNode VARNAME() { return getToken(PdawParser.VARNAME, 0); }
		public CallstmtContext callstmt() {
			return getRuleContext(CallstmtContext.class,0);
		}
		public SlicedlistContext slicedlist() {
			return getRuleContext(SlicedlistContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdawListener ) ((PdawListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdawListener ) ((PdawListener)listener).exitArg(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_arg);
		try {
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				match(SYMBOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(334);
				match(VARNAME);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(335);
				callstmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(336);
				slicedlist();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(337);
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
	public static class TypedargContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(PdawParser.VARNAME, 0); }
		public TerminalNode VARTYPE() { return getToken(PdawParser.VARTYPE, 0); }
		public TypedargContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedarg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdawListener ) ((PdawListener)listener).enterTypedarg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdawListener ) ((PdawListener)listener).exitTypedarg(this);
		}
	}

	public final TypedargContext typedarg() throws RecognitionException {
		TypedargContext _localctx = new TypedargContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_typedarg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(VARNAME);
			setState(341);
			match(T__12);
			setState(342);
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
		public TerminalNode NL() { return getToken(PdawParser.NL, 0); }
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
			if ( listener instanceof PdawListener ) ((PdawListener)listener).enterSuite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdawListener ) ((PdawListener)listener).exitSuite(this);
		}
	}

	public final SuiteContext suite() throws RecognitionException {
		SuiteContext _localctx = new SuiteContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_suite);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(NL);
			setState(346); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(345);
					stmt();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(348); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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
		public TerminalNode NUMBER() { return getToken(PdawParser.NUMBER, 0); }
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdawListener ) ((PdawListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdawListener ) ((PdawListener)listener).exitOperation(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			((OperationContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 8372224L) != 0) ) {
				((OperationContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(351);
				match(NUMBER);
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
	public static class IfstmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PdawParser.IF, 0); }
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
		public TerminalNode END() { return getToken(PdawParser.END, 0); }
		public List<TerminalNode> ELIF() { return getTokens(PdawParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(PdawParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(PdawParser.ELSE, 0); }
		public IfstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdawListener ) ((PdawListener)listener).enterIfstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdawListener ) ((PdawListener)listener).exitIfstmt(this);
		}
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ifstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(IF);
			setState(355);
			expr(0);
			setState(356);
			match(T__12);
			setState(357);
			suite();
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(358);
				match(ELIF);
				setState(359);
				expr(0);
				setState(360);
				match(T__12);
				setState(361);
				suite();
				}
				}
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(368);
				match(ELSE);
				setState(369);
				match(T__12);
				setState(370);
				suite();
				}
			}

			setState(373);
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
	public static class TestnumberContext extends ExprContext {
		public TerminalNode NUMBER() { return getToken(PdawParser.NUMBER, 0); }
		public TestnumberContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdawListener ) ((PdawListener)listener).enterTestnumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdawListener ) ((PdawListener)listener).exitTestnumber(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TestvarContext extends ExprContext {
		public TerminalNode VARNAME() { return getToken(PdawParser.VARNAME, 0); }
		public TestvarContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdawListener ) ((PdawListener)listener).enterTestvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdawListener ) ((PdawListener)listener).exitTestvar(this);
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
			if ( listener instanceof PdawListener ) ((PdawListener)listener).enterParensExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdawListener ) ((PdawListener)listener).exitParensExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TestfuncContext extends ExprContext {
		public CallstmtContext callstmt() {
			return getRuleContext(CallstmtContext.class,0);
		}
		public TestfuncContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdawListener ) ((PdawListener)listener).enterTestfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdawListener ) ((PdawListener)listener).exitTestfunc(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MathExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MathExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdawListener ) ((PdawListener)listener).enterMathExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdawListener ) ((PdawListener)listener).exitMathExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TestExprContext extends ExprContext {
		public Token testop;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CONNECT() { return getToken(PdawParser.CONNECT, 0); }
		public TestExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdawListener ) ((PdawListener)listener).enterTestExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdawListener ) ((PdawListener)listener).exitTestExpr(this);
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
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				_localctx = new TestnumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(376);
				match(NUMBER);
				}
				break;
			case VARNAME:
				{
				_localctx = new TestvarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(377);
				match(VARNAME);
				}
				break;
			case T__5:
				{
				_localctx = new TestfuncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(378);
				callstmt();
				}
				break;
			case T__10:
				{
				_localctx = new ParensExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(379);
				match(T__10);
				setState(380);
				expr(0);
				setState(381);
				match(T__11);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(393);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(391);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
					case 1:
						{
						_localctx = new MathExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(385);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(386);
						((MathExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 5029888L) != 0) ) {
							((MathExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(387);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new TestExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(388);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(389);
						((TestExprContext)_localctx).testop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 17439916032L) != 0) ) {
							((TestExprContext)_localctx).testop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(390);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(395);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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
	public static class ForstmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(PdawParser.FOR, 0); }
		public List<TerminalNode> VARNAME() { return getTokens(PdawParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(PdawParser.VARNAME, i);
		}
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public TerminalNode END() { return getToken(PdawParser.END, 0); }
		public TerminalNode NUMBER() { return getToken(PdawParser.NUMBER, 0); }
		public CallstmtContext callstmt() {
			return getRuleContext(CallstmtContext.class,0);
		}
		public ForstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdawListener ) ((PdawListener)listener).enterForstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdawListener ) ((PdawListener)listener).exitForstmt(this);
		}
	}

	public final ForstmtContext forstmt() throws RecognitionException {
		ForstmtContext _localctx = new ForstmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_forstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(FOR);
			setState(397);
			match(VARNAME);
			setState(398);
			match(T__27);
			setState(402);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(399);
				match(NUMBER);
				}
				break;
			case T__5:
				{
				setState(400);
				callstmt();
				}
				break;
			case VARNAME:
				{
				setState(401);
				match(VARNAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(404);
			match(T__12);
			setState(405);
			suite();
			setState(406);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 24:
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
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00012\u0199\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000\u0005\u00007\b\u0000"+
		"\n\u0000\f\u0000:\t\u0000\u0001\u0000\u0001\u0000\u0005\u0000>\b\u0000"+
		"\n\u0000\f\u0000A\t\u0000\u0001\u0000\u0001\u0000\u0005\u0000E\b\u0000"+
		"\n\u0000\f\u0000H\t\u0000\u0001\u0000\u0005\u0000K\b\u0000\n\u0000\f\u0000"+
		"N\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"`\b\u0003\u0001\u0003\u0005\u0003c\b\u0003\n\u0003\f\u0003f\t\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004o\b\u0004\n\u0004\f\u0004r\t\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u008c"+
		"\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006\u0094\b\u0006\n\u0006\f\u0006\u0097\t\u0006\u0001\u0006"+
		"\u0005\u0006\u009a\b\u0006\n\u0006\f\u0006\u009d\t\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u00a6\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00b2\b\t\u0001\t\u0001\t\u0003"+
		"\t\u00b6\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00bc\b\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00cd\b\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00d3\b\u000b\n\u000b"+
		"\f\u000b\u00d6\t\u000b\u0005\u000b\u00d8\b\u000b\n\u000b\f\u000b\u00db"+
		"\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u00e2\b\u000b\n\u000b\f\u000b\u00e5\t\u000b\u0005\u000b\u00e7\b"+
		"\u000b\n\u000b\f\u000b\u00ea\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u00f1\b\u000b\n\u000b\f\u000b\u00f4"+
		"\t\u000b\u0005\u000b\u00f6\b\u000b\n\u000b\f\u000b\u00f9\t\u000b\u0001"+
		"\u000b\u0003\u000b\u00fc\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u0106\b\f\u0001\r\u0001\r\u0001\r\u0004"+
		"\r\u010b\b\r\u000b\r\f\r\u010c\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u0112\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0116\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u011b\b\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u011f\b\u000e\u0005\u000e\u0121\b\u000e\n\u000e"+
		"\f\u000e\u0124\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u0129\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u012d\b\u000e\u0003"+
		"\u000e\u012f\b\u000e\u0001\u000f\u0001\u000f\u0003\u000f\u0133\b\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0003\u0010\u0139\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u0140\b\u0011\n\u0011\f\u0011\u0143\t\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0005\u0012\u0148\b\u0012\n\u0012\f\u0012\u014b\t\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u0153\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0004\u0015\u015b\b\u0015\u000b\u0015\f\u0015\u015c\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u0161\b\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0005\u0017\u016c\b\u0017\n\u0017\f\u0017\u016f\t\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u0174\b\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0003\u0018\u0180\b\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0188\b\u0018"+
		"\n\u0018\f\u0018\u018b\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0193\b\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0000\u00010\u001a\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02\u0000\u0003\u0001\u0000\u000e\u0016\u0003\u0000\u000e\u000f"+
		"\u0012\u0013\u0016\u0016\u0002\u0000\u0017\u001b\"\"\u01c1\u00008\u0001"+
		"\u0000\u0000\u0000\u0002Q\u0001\u0000\u0000\u0000\u0004U\u0001\u0000\u0000"+
		"\u0000\u0006Y\u0001\u0000\u0000\u0000\bj\u0001\u0000\u0000\u0000\n\u008b"+
		"\u0001\u0000\u0000\u0000\f\u008d\u0001\u0000\u0000\u0000\u000e\u00a1\u0001"+
		"\u0000\u0000\u0000\u0010\u00a9\u0001\u0000\u0000\u0000\u0012\u00bb\u0001"+
		"\u0000\u0000\u0000\u0014\u00cc\u0001\u0000\u0000\u0000\u0016\u00fb\u0001"+
		"\u0000\u0000\u0000\u0018\u0105\u0001\u0000\u0000\u0000\u001a\u0107\u0001"+
		"\u0000\u0000\u0000\u001c\u012e\u0001\u0000\u0000\u0000\u001e\u0130\u0001"+
		"\u0000\u0000\u0000 \u0136\u0001\u0000\u0000\u0000\"\u013c\u0001\u0000"+
		"\u0000\u0000$\u0144\u0001\u0000\u0000\u0000&\u0152\u0001\u0000\u0000\u0000"+
		"(\u0154\u0001\u0000\u0000\u0000*\u0158\u0001\u0000\u0000\u0000,\u015e"+
		"\u0001\u0000\u0000\u0000.\u0162\u0001\u0000\u0000\u00000\u017f\u0001\u0000"+
		"\u0000\u00002\u018c\u0001\u0000\u0000\u000047\u0003\u0002\u0001\u0000"+
		"57\u00050\u0000\u000064\u0001\u0000\u0000\u000065\u0001\u0000\u0000\u0000"+
		"7:\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u000089\u0001\u0000\u0000"+
		"\u00009;\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000;?\u0003\u0004"+
		"\u0002\u0000<>\u00050\u0000\u0000=<\u0001\u0000\u0000\u0000>A\u0001\u0000"+
		"\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@F\u0001"+
		"\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000BE\u0003\u0006\u0003\u0000"+
		"CE\u00050\u0000\u0000DB\u0001\u0000\u0000\u0000DC\u0001\u0000\u0000\u0000"+
		"EH\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000"+
		"\u0000GL\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000IK\u0003\n\u0005"+
		"\u0000JI\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000LJ\u0001\u0000"+
		"\u0000\u0000LM\u0001\u0000\u0000\u0000MO\u0001\u0000\u0000\u0000NL\u0001"+
		"\u0000\u0000\u0000OP\u0005\u0001\u0000\u0000P\u0001\u0001\u0000\u0000"+
		"\u0000QR\u0005\u001d\u0000\u0000RS\u0005*\u0000\u0000ST\u00050\u0000\u0000"+
		"T\u0003\u0001\u0000\u0000\u0000UV\u0005\u001e\u0000\u0000VW\u0005*\u0000"+
		"\u0000WX\u00050\u0000\u0000X\u0005\u0001\u0000\u0000\u0000YZ\u0005\u001f"+
		"\u0000\u0000Z[\u0005*\u0000\u0000[\\\u0003 \u0010\u0000\\]\u0005\u0002"+
		"\u0000\u0000]_\u0003*\u0015\u0000^`\u0003\b\u0004\u0000_^\u0001\u0000"+
		"\u0000\u0000_`\u0001\u0000\u0000\u0000`d\u0001\u0000\u0000\u0000ac\u0005"+
		"0\u0000\u0000ba\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000db\u0001"+
		"\u0000\u0000\u0000de\u0001\u0000\u0000\u0000eg\u0001\u0000\u0000\u0000"+
		"fd\u0001\u0000\u0000\u0000gh\u0005\u0003\u0000\u0000hi\u00050\u0000\u0000"+
		"i\u0007\u0001\u0000\u0000\u0000jk\u0005!\u0000\u0000kp\u0005+\u0000\u0000"+
		"lm\u0005\u0004\u0000\u0000mo\u0005+\u0000\u0000nl\u0001\u0000\u0000\u0000"+
		"or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000"+
		"\u0000qs\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000st\u00050\u0000"+
		"\u0000t\t\u0001\u0000\u0000\u0000uv\u0003\f\u0006\u0000vw\u00050\u0000"+
		"\u0000w\u008c\u0001\u0000\u0000\u0000xy\u0003\u001a\r\u0000yz\u00050\u0000"+
		"\u0000z\u008c\u0001\u0000\u0000\u0000{|\u0003\u0010\b\u0000|}\u00050\u0000"+
		"\u0000}\u008c\u0001\u0000\u0000\u0000~\u007f\u0003\u0012\t\u0000\u007f"+
		"\u0080\u00050\u0000\u0000\u0080\u008c\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0003\u0014\n\u0000\u0082\u0083\u00050\u0000\u0000\u0083\u008c\u0001"+
		"\u0000\u0000\u0000\u0084\u0085\u0003.\u0017\u0000\u0085\u0086\u00050\u0000"+
		"\u0000\u0086\u008c\u0001\u0000\u0000\u0000\u0087\u0088\u00032\u0019\u0000"+
		"\u0088\u0089\u00050\u0000\u0000\u0089\u008c\u0001\u0000\u0000\u0000\u008a"+
		"\u008c\u00050\u0000\u0000\u008bu\u0001\u0000\u0000\u0000\u008bx\u0001"+
		"\u0000\u0000\u0000\u008b{\u0001\u0000\u0000\u0000\u008b~\u0001\u0000\u0000"+
		"\u0000\u008b\u0081\u0001\u0000\u0000\u0000\u008b\u0084\u0001\u0000\u0000"+
		"\u0000\u008b\u0087\u0001\u0000\u0000\u0000\u008b\u008a\u0001\u0000\u0000"+
		"\u0000\u008c\u000b\u0001\u0000\u0000\u0000\u008d\u008e\u0005 \u0000\u0000"+
		"\u008e\u008f\u0005*\u0000\u0000\u008f\u0090\u0003 \u0010\u0000\u0090\u0091"+
		"\u0005\u0002\u0000\u0000\u0091\u0095\u0003*\u0015\u0000\u0092\u0094\u0003"+
		"\u000e\u0007\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094\u0097\u0001"+
		"\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001"+
		"\u0000\u0000\u0000\u0096\u009b\u0001\u0000\u0000\u0000\u0097\u0095\u0001"+
		"\u0000\u0000\u0000\u0098\u009a\u00050\u0000\u0000\u0099\u0098\u0001\u0000"+
		"\u0000\u0000\u009a\u009d\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000"+
		"\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009e\u0001\u0000"+
		"\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009e\u009f\u0005\u0003"+
		"\u0000\u0000\u009f\u00a0\u00050\u0000\u0000\u00a0\r\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a5\u0005\u0005\u0000\u0000\u00a2\u00a6\u0003\u001a\r\u0000"+
		"\u00a3\u00a6\u0003\u0012\t\u0000\u00a4\u00a6\u0003\u0010\b\u0000\u00a5"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a8\u00050\u0000\u0000\u00a8\u000f\u0001\u0000\u0000\u0000\u00a9\u00aa"+
		"\u0005\u0006\u0000\u0000\u00aa\u00ab\u0005*\u0000\u0000\u00ab\u00ac\u0003"+
		"\u001e\u000f\u0000\u00ac\u0011\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005"+
		"+\u0000\u0000\u00ae\u00af\u0005\u0007\u0000\u0000\u00af\u00b1\u0005*\u0000"+
		"\u0000\u00b0\u00b2\u0003\u001e\u000f\u0000\u00b1\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00bc\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b5\u0005*\u0000\u0000\u00b4\u00b6\u0003\u001e\u000f\u0000"+
		"\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b6\u00bc\u0001\u0000\u0000\u0000\u00b7\u00bc\u0003,\u0016\u0000\u00b8"+
		"\u00b9\u0005+\u0000\u0000\u00b9\u00ba\u0005\u0007\u0000\u0000\u00ba\u00bc"+
		"\u0003,\u0016\u0000\u00bb\u00ad\u0001\u0000\u0000\u0000\u00bb\u00b3\u0001"+
		"\u0000\u0000\u0000\u00bb\u00b7\u0001\u0000\u0000\u0000\u00bb\u00b8\u0001"+
		"\u0000\u0000\u0000\u00bc\u0013\u0001\u0000\u0000\u0000\u00bd\u00be\u0005"+
		"+\u0000\u0000\u00be\u00bf\u0005\u0007\u0000\u0000\u00bf\u00cd\u0005,\u0000"+
		"\u0000\u00c0\u00c1\u0005+\u0000\u0000\u00c1\u00c2\u0005\u0007\u0000\u0000"+
		"\u00c2\u00cd\u0005-\u0000\u0000\u00c3\u00c4\u0005+\u0000\u0000\u00c4\u00c5"+
		"\u0005\u0007\u0000\u0000\u00c5\u00cd\u0003\u0016\u000b\u0000\u00c6\u00c7"+
		"\u0005+\u0000\u0000\u00c7\u00c8\u0005\u0007\u0000\u0000\u00c8\u00cd\u0003"+
		"\u0018\f\u0000\u00c9\u00ca\u0005+\u0000\u0000\u00ca\u00cb\u0005\u0007"+
		"\u0000\u0000\u00cb\u00cd\u0003\u0010\b\u0000\u00cc\u00bd\u0001\u0000\u0000"+
		"\u0000\u00cc\u00c0\u0001\u0000\u0000\u0000\u00cc\u00c3\u0001\u0000\u0000"+
		"\u0000\u00cc\u00c6\u0001\u0000\u0000\u0000\u00cc\u00c9\u0001\u0000\u0000"+
		"\u0000\u00cd\u0015\u0001\u0000\u0000\u0000\u00ce\u00d9\u0005\b\u0000\u0000"+
		"\u00cf\u00d4\u0005,\u0000\u0000\u00d0\u00d1\u0005\u0004\u0000\u0000\u00d1"+
		"\u00d3\u0005,\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d3\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d8\u0001\u0000\u0000\u0000\u00d6\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d7\u00cf\u0001\u0000\u0000\u0000\u00d8\u00db"+
		"\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00d9\u00da"+
		"\u0001\u0000\u0000\u0000\u00da\u00dc\u0001\u0000\u0000\u0000\u00db\u00d9"+
		"\u0001\u0000\u0000\u0000\u00dc\u00fc\u0005\t\u0000\u0000\u00dd\u00e8\u0005"+
		"\b\u0000\u0000\u00de\u00e3\u0005-\u0000\u0000\u00df\u00e0\u0005\u0004"+
		"\u0000\u0000\u00e0\u00e2\u0005-\u0000\u0000\u00e1\u00df\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e5\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e7\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e6\u00de\u0001\u0000\u0000"+
		"\u0000\u00e7\u00ea\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000"+
		"\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00eb\u0001\u0000\u0000"+
		"\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00eb\u00fc\u0005\t\u0000\u0000"+
		"\u00ec\u00f7\u0005\b\u0000\u0000\u00ed\u00f2\u0005+\u0000\u0000\u00ee"+
		"\u00ef\u0005\u0004\u0000\u0000\u00ef\u00f1\u0005+\u0000\u0000\u00f0\u00ee"+
		"\u0001\u0000\u0000\u0000\u00f1\u00f4\u0001\u0000\u0000\u0000\u00f2\u00f0"+
		"\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f6"+
		"\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f5\u00ed"+
		"\u0001\u0000\u0000\u0000\u00f6\u00f9\u0001\u0000\u0000\u0000\u00f7\u00f5"+
		"\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00fa"+
		"\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00fa\u00fc"+
		"\u0005\t\u0000\u0000\u00fb\u00ce\u0001\u0000\u0000\u0000\u00fb\u00dd\u0001"+
		"\u0000\u0000\u0000\u00fb\u00ec\u0001\u0000\u0000\u0000\u00fc\u0017\u0001"+
		"\u0000\u0000\u0000\u00fd\u00fe\u0005+\u0000\u0000\u00fe\u00ff\u0005\b"+
		"\u0000\u0000\u00ff\u0100\u0005+\u0000\u0000\u0100\u0106\u0005\t\u0000"+
		"\u0000\u0101\u0102\u0005+\u0000\u0000\u0102\u0103\u0005\b\u0000\u0000"+
		"\u0103\u0104\u0005-\u0000\u0000\u0104\u0106\u0005\t\u0000\u0000\u0105"+
		"\u00fd\u0001\u0000\u0000\u0000\u0105\u0101\u0001\u0000\u0000\u0000\u0106"+
		"\u0019\u0001\u0000\u0000\u0000\u0107\u010a\u0003\u001c\u000e\u0000\u0108"+
		"\u0109\u0005\"\u0000\u0000\u0109\u010b\u0003\u001c\u000e\u0000\u010a\u0108"+
		"\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u010a"+
		"\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u001b"+
		"\u0001\u0000\u0000\u0000\u010e\u0111\u0005\b\u0000\u0000\u010f\u0112\u0005"+
		"+\u0000\u0000\u0110\u0112\u0003\u0012\t\u0000\u0111\u010f\u0001\u0000"+
		"\u0000\u0000\u0111\u0110\u0001\u0000\u0000\u0000\u0112\u0115\u0001\u0000"+
		"\u0000\u0000\u0113\u0114\u0005\n\u0000\u0000\u0114\u0116\u0005)\u0000"+
		"\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000"+
		"\u0000\u0116\u0122\u0001\u0000\u0000\u0000\u0117\u011a\u0005\u0004\u0000"+
		"\u0000\u0118\u011b\u0005+\u0000\u0000\u0119\u011b\u0003\u0012\t\u0000"+
		"\u011a\u0118\u0001\u0000\u0000\u0000\u011a\u0119\u0001\u0000\u0000\u0000"+
		"\u011b\u011e\u0001\u0000\u0000\u0000\u011c\u011d\u0005\n\u0000\u0000\u011d"+
		"\u011f\u0005)\u0000\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011e\u011f"+
		"\u0001\u0000\u0000\u0000\u011f\u0121\u0001\u0000\u0000\u0000\u0120\u0117"+
		"\u0001\u0000\u0000\u0000\u0121\u0124\u0001\u0000\u0000\u0000\u0122\u0120"+
		"\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0125"+
		"\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0125\u012f"+
		"\u0005\t\u0000\u0000\u0126\u0129\u0005+\u0000\u0000\u0127\u0129\u0003"+
		"\u0012\t\u0000\u0128\u0126\u0001\u0000\u0000\u0000\u0128\u0127\u0001\u0000"+
		"\u0000\u0000\u0129\u012c\u0001\u0000\u0000\u0000\u012a\u012b\u0005\n\u0000"+
		"\u0000\u012b\u012d\u0005)\u0000\u0000\u012c\u012a\u0001\u0000\u0000\u0000"+
		"\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u012f\u0001\u0000\u0000\u0000"+
		"\u012e\u010e\u0001\u0000\u0000\u0000\u012e\u0128\u0001\u0000\u0000\u0000"+
		"\u012f\u001d\u0001\u0000\u0000\u0000\u0130\u0132\u0005\u000b\u0000\u0000"+
		"\u0131\u0133\u0003\"\u0011\u0000\u0132\u0131\u0001\u0000\u0000\u0000\u0132"+
		"\u0133\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134"+
		"\u0135\u0005\f\u0000\u0000\u0135\u001f\u0001\u0000\u0000\u0000\u0136\u0138"+
		"\u0005\u000b\u0000\u0000\u0137\u0139\u0003$\u0012\u0000\u0138\u0137\u0001"+
		"\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139\u013a\u0001"+
		"\u0000\u0000\u0000\u013a\u013b\u0005\f\u0000\u0000\u013b!\u0001\u0000"+
		"\u0000\u0000\u013c\u0141\u0003&\u0013\u0000\u013d\u013e\u0005\u0004\u0000"+
		"\u0000\u013e\u0140\u0003&\u0013\u0000\u013f\u013d\u0001\u0000\u0000\u0000"+
		"\u0140\u0143\u0001\u0000\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000"+
		"\u0141\u0142\u0001\u0000\u0000\u0000\u0142#\u0001\u0000\u0000\u0000\u0143"+
		"\u0141\u0001\u0000\u0000\u0000\u0144\u0149\u0003(\u0014\u0000\u0145\u0146"+
		"\u0005\u0004\u0000\u0000\u0146\u0148\u0003(\u0014\u0000\u0147\u0145\u0001"+
		"\u0000\u0000\u0000\u0148\u014b\u0001\u0000\u0000\u0000\u0149\u0147\u0001"+
		"\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a%\u0001\u0000"+
		"\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014c\u0153\u0005,\u0000"+
		"\u0000\u014d\u0153\u0005-\u0000\u0000\u014e\u0153\u0005+\u0000\u0000\u014f"+
		"\u0153\u0003\u0010\b\u0000\u0150\u0153\u0003\u0018\f\u0000\u0151\u0153"+
		"\u0003\u0016\u000b\u0000\u0152\u014c\u0001\u0000\u0000\u0000\u0152\u014d"+
		"\u0001\u0000\u0000\u0000\u0152\u014e\u0001\u0000\u0000\u0000\u0152\u014f"+
		"\u0001\u0000\u0000\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0152\u0151"+
		"\u0001\u0000\u0000\u0000\u0153\'\u0001\u0000\u0000\u0000\u0154\u0155\u0005"+
		"+\u0000\u0000\u0155\u0156\u0005\r\u0000\u0000\u0156\u0157\u0005(\u0000"+
		"\u0000\u0157)\u0001\u0000\u0000\u0000\u0158\u015a\u00050\u0000\u0000\u0159"+
		"\u015b\u0003\n\u0005\u0000\u015a\u0159\u0001\u0000\u0000\u0000\u015b\u015c"+
		"\u0001\u0000\u0000\u0000\u015c\u015a\u0001\u0000\u0000\u0000\u015c\u015d"+
		"\u0001\u0000\u0000\u0000\u015d+\u0001\u0000\u0000\u0000\u015e\u0160\u0007"+
		"\u0000\u0000\u0000\u015f\u0161\u0005-\u0000\u0000\u0160\u015f\u0001\u0000"+
		"\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000\u0161-\u0001\u0000\u0000"+
		"\u0000\u0162\u0163\u0005$\u0000\u0000\u0163\u0164\u00030\u0018\u0000\u0164"+
		"\u0165\u0005\r\u0000\u0000\u0165\u016d\u0003*\u0015\u0000\u0166\u0167"+
		"\u0005%\u0000\u0000\u0167\u0168\u00030\u0018\u0000\u0168\u0169\u0005\r"+
		"\u0000\u0000\u0169\u016a\u0003*\u0015\u0000\u016a\u016c\u0001\u0000\u0000"+
		"\u0000\u016b\u0166\u0001\u0000\u0000\u0000\u016c\u016f\u0001\u0000\u0000"+
		"\u0000\u016d\u016b\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000\u0000"+
		"\u0000\u016e\u0173\u0001\u0000\u0000\u0000\u016f\u016d\u0001\u0000\u0000"+
		"\u0000\u0170\u0171\u0005&\u0000\u0000\u0171\u0172\u0005\r\u0000\u0000"+
		"\u0172\u0174\u0003*\u0015\u0000\u0173\u0170\u0001\u0000\u0000\u0000\u0173"+
		"\u0174\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175"+
		"\u0176\u0005#\u0000\u0000\u0176/\u0001\u0000\u0000\u0000\u0177\u0178\u0006"+
		"\u0018\uffff\uffff\u0000\u0178\u0180\u0005-\u0000\u0000\u0179\u0180\u0005"+
		"+\u0000\u0000\u017a\u0180\u0003\u0010\b\u0000\u017b\u017c\u0005\u000b"+
		"\u0000\u0000\u017c\u017d\u00030\u0018\u0000\u017d\u017e\u0005\f\u0000"+
		"\u0000\u017e\u0180\u0001\u0000\u0000\u0000\u017f\u0177\u0001\u0000\u0000"+
		"\u0000\u017f\u0179\u0001\u0000\u0000\u0000\u017f\u017a\u0001\u0000\u0000"+
		"\u0000\u017f\u017b\u0001\u0000\u0000\u0000\u0180\u0189\u0001\u0000\u0000"+
		"\u0000\u0181\u0182\n\u0006\u0000\u0000\u0182\u0183\u0007\u0001\u0000\u0000"+
		"\u0183\u0188\u00030\u0018\u0007\u0184\u0185\n\u0005\u0000\u0000\u0185"+
		"\u0186\u0007\u0002\u0000\u0000\u0186\u0188\u00030\u0018\u0006\u0187\u0181"+
		"\u0001\u0000\u0000\u0000\u0187\u0184\u0001\u0000\u0000\u0000\u0188\u018b"+
		"\u0001\u0000\u0000\u0000\u0189\u0187\u0001\u0000\u0000\u0000\u0189\u018a"+
		"\u0001\u0000\u0000\u0000\u018a1\u0001\u0000\u0000\u0000\u018b\u0189\u0001"+
		"\u0000\u0000\u0000\u018c\u018d\u0005\'\u0000\u0000\u018d\u018e\u0005+"+
		"\u0000\u0000\u018e\u0192\u0005\u001c\u0000\u0000\u018f\u0193\u0005-\u0000"+
		"\u0000\u0190\u0193\u0003\u0010\b\u0000\u0191\u0193\u0005+\u0000\u0000"+
		"\u0192\u018f\u0001\u0000\u0000\u0000\u0192\u0190\u0001\u0000\u0000\u0000"+
		"\u0192\u0191\u0001\u0000\u0000\u0000\u0193\u0194\u0001\u0000\u0000\u0000"+
		"\u0194\u0195\u0005\r\u0000\u0000\u0195\u0196\u0003*\u0015\u0000\u0196"+
		"\u0197\u0005#\u0000\u0000\u01973\u0001\u0000\u0000\u0000/68?DFL_dp\u008b"+
		"\u0095\u009b\u00a5\u00b1\u00b5\u00bb\u00cc\u00d4\u00d9\u00e3\u00e8\u00f2"+
		"\u00f7\u00fb\u0105\u010c\u0111\u0115\u011a\u011e\u0122\u0128\u012c\u012e"+
		"\u0132\u0138\u0141\u0149\u0152\u015c\u0160\u016d\u0173\u017f\u0187\u0189"+
		"\u0192";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}