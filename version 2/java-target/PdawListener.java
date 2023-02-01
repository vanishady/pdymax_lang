// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PdawParser}.
 */
public interface PdawListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PdawParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(PdawParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdawParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(PdawParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdawParser#importstmt}.
	 * @param ctx the parse tree
	 */
	void enterImportstmt(PdawParser.ImportstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdawParser#importstmt}.
	 * @param ctx the parse tree
	 */
	void exitImportstmt(PdawParser.ImportstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdawParser#patchstmt}.
	 * @param ctx the parse tree
	 */
	void enterPatchstmt(PdawParser.PatchstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdawParser#patchstmt}.
	 * @param ctx the parse tree
	 */
	void exitPatchstmt(PdawParser.PatchstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdawParser#funcdefstmt}.
	 * @param ctx the parse tree
	 */
	void enterFuncdefstmt(PdawParser.FuncdefstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdawParser#funcdefstmt}.
	 * @param ctx the parse tree
	 */
	void exitFuncdefstmt(PdawParser.FuncdefstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdawParser#returnstmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnstmt(PdawParser.ReturnstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdawParser#returnstmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnstmt(PdawParser.ReturnstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdawParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(PdawParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdawParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(PdawParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdawParser#blockstmt}.
	 * @param ctx the parse tree
	 */
	void enterBlockstmt(PdawParser.BlockstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdawParser#blockstmt}.
	 * @param ctx the parse tree
	 */
	void exitBlockstmt(PdawParser.BlockstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdawParser#dotdotstmt}.
	 * @param ctx the parse tree
	 */
	void enterDotdotstmt(PdawParser.DotdotstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdawParser#dotdotstmt}.
	 * @param ctx the parse tree
	 */
	void exitDotdotstmt(PdawParser.DotdotstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdawParser#callstmt}.
	 * @param ctx the parse tree
	 */
	void enterCallstmt(PdawParser.CallstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdawParser#callstmt}.
	 * @param ctx the parse tree
	 */
	void exitCallstmt(PdawParser.CallstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdawParser#nodedeclstmt}.
	 * @param ctx the parse tree
	 */
	void enterNodedeclstmt(PdawParser.NodedeclstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdawParser#nodedeclstmt}.
	 * @param ctx the parse tree
	 */
	void exitNodedeclstmt(PdawParser.NodedeclstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdawParser#simpledeclstmt}.
	 * @param ctx the parse tree
	 */
	void enterSimpledeclstmt(PdawParser.SimpledeclstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdawParser#simpledeclstmt}.
	 * @param ctx the parse tree
	 */
	void exitSimpledeclstmt(PdawParser.SimpledeclstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdawParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(PdawParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdawParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(PdawParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdawParser#slicedlist}.
	 * @param ctx the parse tree
	 */
	void enterSlicedlist(PdawParser.SlicedlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdawParser#slicedlist}.
	 * @param ctx the parse tree
	 */
	void exitSlicedlist(PdawParser.SlicedlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdawParser#connectionstmt}.
	 * @param ctx the parse tree
	 */
	void enterConnectionstmt(PdawParser.ConnectionstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdawParser#connectionstmt}.
	 * @param ctx the parse tree
	 */
	void exitConnectionstmt(PdawParser.ConnectionstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdawParser#connectionelem}.
	 * @param ctx the parse tree
	 */
	void enterConnectionelem(PdawParser.ConnectionelemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdawParser#connectionelem}.
	 * @param ctx the parse tree
	 */
	void exitConnectionelem(PdawParser.ConnectionelemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdawParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(PdawParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdawParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(PdawParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdawParser#typedparams}.
	 * @param ctx the parse tree
	 */
	void enterTypedparams(PdawParser.TypedparamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdawParser#typedparams}.
	 * @param ctx the parse tree
	 */
	void exitTypedparams(PdawParser.TypedparamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdawParser#argslist}.
	 * @param ctx the parse tree
	 */
	void enterArgslist(PdawParser.ArgslistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdawParser#argslist}.
	 * @param ctx the parse tree
	 */
	void exitArgslist(PdawParser.ArgslistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdawParser#typedargslist}.
	 * @param ctx the parse tree
	 */
	void enterTypedargslist(PdawParser.TypedargslistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdawParser#typedargslist}.
	 * @param ctx the parse tree
	 */
	void exitTypedargslist(PdawParser.TypedargslistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdawParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(PdawParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdawParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(PdawParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdawParser#typedarg}.
	 * @param ctx the parse tree
	 */
	void enterTypedarg(PdawParser.TypedargContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdawParser#typedarg}.
	 * @param ctx the parse tree
	 */
	void exitTypedarg(PdawParser.TypedargContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdawParser#suite}.
	 * @param ctx the parse tree
	 */
	void enterSuite(PdawParser.SuiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdawParser#suite}.
	 * @param ctx the parse tree
	 */
	void exitSuite(PdawParser.SuiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdawParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(PdawParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdawParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(PdawParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdawParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterIfstmt(PdawParser.IfstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdawParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitIfstmt(PdawParser.IfstmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code testnumber}
	 * labeled alternative in {@link PdawParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTestnumber(PdawParser.TestnumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code testnumber}
	 * labeled alternative in {@link PdawParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTestnumber(PdawParser.TestnumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code testvar}
	 * labeled alternative in {@link PdawParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTestvar(PdawParser.TestvarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code testvar}
	 * labeled alternative in {@link PdawParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTestvar(PdawParser.TestvarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParensExpr}
	 * labeled alternative in {@link PdawParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParensExpr(PdawParser.ParensExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParensExpr}
	 * labeled alternative in {@link PdawParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParensExpr(PdawParser.ParensExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code testfunc}
	 * labeled alternative in {@link PdawParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTestfunc(PdawParser.TestfuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code testfunc}
	 * labeled alternative in {@link PdawParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTestfunc(PdawParser.TestfuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MathExpr}
	 * labeled alternative in {@link PdawParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMathExpr(PdawParser.MathExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MathExpr}
	 * labeled alternative in {@link PdawParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMathExpr(PdawParser.MathExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TestExpr}
	 * labeled alternative in {@link PdawParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTestExpr(PdawParser.TestExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TestExpr}
	 * labeled alternative in {@link PdawParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTestExpr(PdawParser.TestExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdawParser#forstmt}.
	 * @param ctx the parse tree
	 */
	void enterForstmt(PdawParser.ForstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdawParser#forstmt}.
	 * @param ctx the parse tree
	 */
	void exitForstmt(PdawParser.ForstmtContext ctx);
}