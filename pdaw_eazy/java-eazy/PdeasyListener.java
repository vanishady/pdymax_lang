// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PdeasyParser}.
 */
public interface PdeasyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PdeasyParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(PdeasyParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdeasyParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(PdeasyParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdeasyParser#patchstmt}.
	 * @param ctx the parse tree
	 */
	void enterPatchstmt(PdeasyParser.PatchstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdeasyParser#patchstmt}.
	 * @param ctx the parse tree
	 */
	void exitPatchstmt(PdeasyParser.PatchstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdeasyParser#importstmt}.
	 * @param ctx the parse tree
	 */
	void enterImportstmt(PdeasyParser.ImportstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdeasyParser#importstmt}.
	 * @param ctx the parse tree
	 */
	void exitImportstmt(PdeasyParser.ImportstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdeasyParser#funcdefstmt}.
	 * @param ctx the parse tree
	 */
	void enterFuncdefstmt(PdeasyParser.FuncdefstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdeasyParser#funcdefstmt}.
	 * @param ctx the parse tree
	 */
	void exitFuncdefstmt(PdeasyParser.FuncdefstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdeasyParser#returnstmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnstmt(PdeasyParser.ReturnstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdeasyParser#returnstmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnstmt(PdeasyParser.ReturnstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdeasyParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(PdeasyParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdeasyParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(PdeasyParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdeasyParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFlow_stmt(PdeasyParser.Flow_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdeasyParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFlow_stmt(PdeasyParser.Flow_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdeasyParser#blockstmt}.
	 * @param ctx the parse tree
	 */
	void enterBlockstmt(PdeasyParser.BlockstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdeasyParser#blockstmt}.
	 * @param ctx the parse tree
	 */
	void exitBlockstmt(PdeasyParser.BlockstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdeasyParser#callstmt}.
	 * @param ctx the parse tree
	 */
	void enterCallstmt(PdeasyParser.CallstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdeasyParser#callstmt}.
	 * @param ctx the parse tree
	 */
	void exitCallstmt(PdeasyParser.CallstmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nodedecl1}
	 * labeled alternative in {@link PdeasyParser#nodedecl}.
	 * @param ctx the parse tree
	 */
	void enterNodedecl1(PdeasyParser.Nodedecl1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code nodedecl1}
	 * labeled alternative in {@link PdeasyParser#nodedecl}.
	 * @param ctx the parse tree
	 */
	void exitNodedecl1(PdeasyParser.Nodedecl1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code nodedecl2}
	 * labeled alternative in {@link PdeasyParser#nodedecl}.
	 * @param ctx the parse tree
	 */
	void enterNodedecl2(PdeasyParser.Nodedecl2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code nodedecl2}
	 * labeled alternative in {@link PdeasyParser#nodedecl}.
	 * @param ctx the parse tree
	 */
	void exitNodedecl2(PdeasyParser.Nodedecl2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code nodedecl3}
	 * labeled alternative in {@link PdeasyParser#nodedecl}.
	 * @param ctx the parse tree
	 */
	void enterNodedecl3(PdeasyParser.Nodedecl3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code nodedecl3}
	 * labeled alternative in {@link PdeasyParser#nodedecl}.
	 * @param ctx the parse tree
	 */
	void exitNodedecl3(PdeasyParser.Nodedecl3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code nodedecl4}
	 * labeled alternative in {@link PdeasyParser#nodedecl}.
	 * @param ctx the parse tree
	 */
	void enterNodedecl4(PdeasyParser.Nodedecl4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code nodedecl4}
	 * labeled alternative in {@link PdeasyParser#nodedecl}.
	 * @param ctx the parse tree
	 */
	void exitNodedecl4(PdeasyParser.Nodedecl4Context ctx);
	/**
	 * Enter a parse tree produced by {@link PdeasyParser#simpledecl}.
	 * @param ctx the parse tree
	 */
	void enterSimpledecl(PdeasyParser.SimpledeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdeasyParser#simpledecl}.
	 * @param ctx the parse tree
	 */
	void exitSimpledecl(PdeasyParser.SimpledeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdeasyParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(PdeasyParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdeasyParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(PdeasyParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdeasyParser#listelem}.
	 * @param ctx the parse tree
	 */
	void enterListelem(PdeasyParser.ListelemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdeasyParser#listelem}.
	 * @param ctx the parse tree
	 */
	void exitListelem(PdeasyParser.ListelemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdeasyParser#list_access}.
	 * @param ctx the parse tree
	 */
	void enterList_access(PdeasyParser.List_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdeasyParser#list_access}.
	 * @param ctx the parse tree
	 */
	void exitList_access(PdeasyParser.List_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdeasyParser#connectionstmt}.
	 * @param ctx the parse tree
	 */
	void enterConnectionstmt(PdeasyParser.ConnectionstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdeasyParser#connectionstmt}.
	 * @param ctx the parse tree
	 */
	void exitConnectionstmt(PdeasyParser.ConnectionstmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multipleconn}
	 * labeled alternative in {@link PdeasyParser#connectionelem}.
	 * @param ctx the parse tree
	 */
	void enterMultipleconn(PdeasyParser.MultipleconnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multipleconn}
	 * labeled alternative in {@link PdeasyParser#connectionelem}.
	 * @param ctx the parse tree
	 */
	void exitMultipleconn(PdeasyParser.MultipleconnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleconn}
	 * labeled alternative in {@link PdeasyParser#connectionelem}.
	 * @param ctx the parse tree
	 */
	void enterSingleconn(PdeasyParser.SingleconnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleconn}
	 * labeled alternative in {@link PdeasyParser#connectionelem}.
	 * @param ctx the parse tree
	 */
	void exitSingleconn(PdeasyParser.SingleconnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdeasyParser#singlenode}.
	 * @param ctx the parse tree
	 */
	void enterSinglenode(PdeasyParser.SinglenodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdeasyParser#singlenode}.
	 * @param ctx the parse tree
	 */
	void exitSinglenode(PdeasyParser.SinglenodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdeasyParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(PdeasyParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdeasyParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(PdeasyParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdeasyParser#typedparams}.
	 * @param ctx the parse tree
	 */
	void enterTypedparams(PdeasyParser.TypedparamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdeasyParser#typedparams}.
	 * @param ctx the parse tree
	 */
	void exitTypedparams(PdeasyParser.TypedparamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdeasyParser#argslist}.
	 * @param ctx the parse tree
	 */
	void enterArgslist(PdeasyParser.ArgslistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdeasyParser#argslist}.
	 * @param ctx the parse tree
	 */
	void exitArgslist(PdeasyParser.ArgslistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdeasyParser#typedargslist}.
	 * @param ctx the parse tree
	 */
	void enterTypedargslist(PdeasyParser.TypedargslistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdeasyParser#typedargslist}.
	 * @param ctx the parse tree
	 */
	void exitTypedargslist(PdeasyParser.TypedargslistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdeasyParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(PdeasyParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdeasyParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(PdeasyParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdeasyParser#typedarg}.
	 * @param ctx the parse tree
	 */
	void enterTypedarg(PdeasyParser.TypedargContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdeasyParser#typedarg}.
	 * @param ctx the parse tree
	 */
	void exitTypedarg(PdeasyParser.TypedargContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdeasyParser#suite}.
	 * @param ctx the parse tree
	 */
	void enterSuite(PdeasyParser.SuiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdeasyParser#suite}.
	 * @param ctx the parse tree
	 */
	void exitSuite(PdeasyParser.SuiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdeasyParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(PdeasyParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdeasyParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(PdeasyParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdeasyParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterIfstmt(PdeasyParser.IfstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdeasyParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitIfstmt(PdeasyParser.IfstmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SubAdd}
	 * labeled alternative in {@link PdeasyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSubAdd(PdeasyParser.SubAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubAdd}
	 * labeled alternative in {@link PdeasyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSubAdd(PdeasyParser.SubAddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link PdeasyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(PdeasyParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link PdeasyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(PdeasyParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TestCall}
	 * labeled alternative in {@link PdeasyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTestCall(PdeasyParser.TestCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TestCall}
	 * labeled alternative in {@link PdeasyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTestCall(PdeasyParser.TestCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParensExpr}
	 * labeled alternative in {@link PdeasyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParensExpr(PdeasyParser.ParensExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParensExpr}
	 * labeled alternative in {@link PdeasyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParensExpr(PdeasyParser.ParensExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TestSym}
	 * labeled alternative in {@link PdeasyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTestSym(PdeasyParser.TestSymContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TestSym}
	 * labeled alternative in {@link PdeasyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTestSym(PdeasyParser.TestSymContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TestVar}
	 * labeled alternative in {@link PdeasyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTestVar(PdeasyParser.TestVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TestVar}
	 * labeled alternative in {@link PdeasyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTestVar(PdeasyParser.TestVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TestNum}
	 * labeled alternative in {@link PdeasyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTestNum(PdeasyParser.TestNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TestNum}
	 * labeled alternative in {@link PdeasyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTestNum(PdeasyParser.TestNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TestListAccess}
	 * labeled alternative in {@link PdeasyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTestListAccess(PdeasyParser.TestListAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TestListAccess}
	 * labeled alternative in {@link PdeasyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTestListAccess(PdeasyParser.TestListAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdeasyParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(PdeasyParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdeasyParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(PdeasyParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdeasyParser#forstmt}.
	 * @param ctx the parse tree
	 */
	void enterForstmt(PdeasyParser.ForstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdeasyParser#forstmt}.
	 * @param ctx the parse tree
	 */
	void exitForstmt(PdeasyParser.ForstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdeasyParser#varname}.
	 * @param ctx the parse tree
	 */
	void enterVarname(PdeasyParser.VarnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdeasyParser#varname}.
	 * @param ctx the parse tree
	 */
	void exitVarname(PdeasyParser.VarnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdeasyParser#inlet}.
	 * @param ctx the parse tree
	 */
	void enterInlet(PdeasyParser.InletContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdeasyParser#inlet}.
	 * @param ctx the parse tree
	 */
	void exitInlet(PdeasyParser.InletContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdeasyParser#outlet}.
	 * @param ctx the parse tree
	 */
	void enterOutlet(PdeasyParser.OutletContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdeasyParser#outlet}.
	 * @param ctx the parse tree
	 */
	void exitOutlet(PdeasyParser.OutletContext ctx);
}