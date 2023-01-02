// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleParser}.
 */
public interface SimpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(SimpleParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(SimpleParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#blockstmt}.
	 * @param ctx the parse tree
	 */
	void enterBlockstmt(SimpleParser.BlockstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#blockstmt}.
	 * @param ctx the parse tree
	 */
	void exitBlockstmt(SimpleParser.BlockstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#subblockstmt}.
	 * @param ctx the parse tree
	 */
	void enterSubblockstmt(SimpleParser.SubblockstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#subblockstmt}.
	 * @param ctx the parse tree
	 */
	void exitSubblockstmt(SimpleParser.SubblockstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(SimpleParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(SimpleParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#declarationstmt}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationstmt(SimpleParser.DeclarationstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#declarationstmt}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationstmt(SimpleParser.DeclarationstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(SimpleParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(SimpleParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#typedargslist}.
	 * @param ctx the parse tree
	 */
	void enterTypedargslist(SimpleParser.TypedargslistContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#typedargslist}.
	 * @param ctx the parse tree
	 */
	void exitTypedargslist(SimpleParser.TypedargslistContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(SimpleParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(SimpleParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(SimpleParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(SimpleParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#ioletdeclstmt}.
	 * @param ctx the parse tree
	 */
	void enterIoletdeclstmt(SimpleParser.IoletdeclstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#ioletdeclstmt}.
	 * @param ctx the parse tree
	 */
	void exitIoletdeclstmt(SimpleParser.IoletdeclstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#connectionstmt}.
	 * @param ctx the parse tree
	 */
	void enterConnectionstmt(SimpleParser.ConnectionstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#connectionstmt}.
	 * @param ctx the parse tree
	 */
	void exitConnectionstmt(SimpleParser.ConnectionstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#recallstmt}.
	 * @param ctx the parse tree
	 */
	void enterRecallstmt(SimpleParser.RecallstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#recallstmt}.
	 * @param ctx the parse tree
	 */
	void exitRecallstmt(SimpleParser.RecallstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterIfstmt(SimpleParser.IfstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitIfstmt(SimpleParser.IfstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#forstmt}.
	 * @param ctx the parse tree
	 */
	void enterForstmt(SimpleParser.ForstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#forstmt}.
	 * @param ctx the parse tree
	 */
	void exitForstmt(SimpleParser.ForstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#suite}.
	 * @param ctx the parse tree
	 */
	void enterSuite(SimpleParser.SuiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#suite}.
	 * @param ctx the parse tree
	 */
	void exitSuite(SimpleParser.SuiteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code number}
	 * labeled alternative in {@link SimpleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumber(SimpleParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code number}
	 * labeled alternative in {@link SimpleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumber(SimpleParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DynamicAssign}
	 * labeled alternative in {@link SimpleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDynamicAssign(SimpleParser.DynamicAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DynamicAssign}
	 * labeled alternative in {@link SimpleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDynamicAssign(SimpleParser.DynamicAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link SimpleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(SimpleParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link SimpleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(SimpleParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link SimpleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(SimpleParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link SimpleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(SimpleParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Test}
	 * labeled alternative in {@link SimpleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTest(SimpleParser.TestContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Test}
	 * labeled alternative in {@link SimpleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTest(SimpleParser.TestContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link SimpleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(SimpleParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link SimpleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(SimpleParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Logical}
	 * labeled alternative in {@link SimpleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLogical(SimpleParser.LogicalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Logical}
	 * labeled alternative in {@link SimpleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLogical(SimpleParser.LogicalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link SimpleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(SimpleParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link SimpleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(SimpleParser.IdContext ctx);
}