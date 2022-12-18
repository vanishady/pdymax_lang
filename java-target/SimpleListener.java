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
	 * Enter a parse tree produced by {@link SimpleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SimpleParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SimpleParser.ExprContext ctx);
}