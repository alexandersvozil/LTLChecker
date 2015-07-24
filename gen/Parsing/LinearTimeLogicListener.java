// Generated from /home/alexander/Dropbox/LTLChecker/LTL/LinearTimeLogic.g4 by ANTLR 4.5
package Parsing;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LinearTimeLogicParser}.
 */
public interface LinearTimeLogicListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LinearTimeLogicParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterFormula(@NotNull LinearTimeLogicParser.FormulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinearTimeLogicParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitFormula(@NotNull LinearTimeLogicParser.FormulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinearTimeLogicParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull LinearTimeLogicParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinearTimeLogicParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull LinearTimeLogicParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinearTimeLogicParser#vliteral}.
	 * @param ctx the parse tree
	 */
	void enterVliteral(@NotNull LinearTimeLogicParser.VliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinearTimeLogicParser#vliteral}.
	 * @param ctx the parse tree
	 */
	void exitVliteral(@NotNull LinearTimeLogicParser.VliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinearTimeLogicParser#fliteral}.
	 * @param ctx the parse tree
	 */
	void enterFliteral(@NotNull LinearTimeLogicParser.FliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinearTimeLogicParser#fliteral}.
	 * @param ctx the parse tree
	 */
	void exitFliteral(@NotNull LinearTimeLogicParser.FliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinearTimeLogicParser#negatom}.
	 * @param ctx the parse tree
	 */
	void enterNegatom(@NotNull LinearTimeLogicParser.NegatomContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinearTimeLogicParser#negatom}.
	 * @param ctx the parse tree
	 */
	void exitNegatom(@NotNull LinearTimeLogicParser.NegatomContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinearTimeLogicParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(@NotNull LinearTimeLogicParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinearTimeLogicParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(@NotNull LinearTimeLogicParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinearTimeLogicParser#negatedformula}.
	 * @param ctx the parse tree
	 */
	void enterNegatedformula(@NotNull LinearTimeLogicParser.NegatedformulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinearTimeLogicParser#negatedformula}.
	 * @param ctx the parse tree
	 */
	void exitNegatedformula(@NotNull LinearTimeLogicParser.NegatedformulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinearTimeLogicParser#orformula}.
	 * @param ctx the parse tree
	 */
	void enterOrformula(@NotNull LinearTimeLogicParser.OrformulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinearTimeLogicParser#orformula}.
	 * @param ctx the parse tree
	 */
	void exitOrformula(@NotNull LinearTimeLogicParser.OrformulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinearTimeLogicParser#andformula}.
	 * @param ctx the parse tree
	 */
	void enterAndformula(@NotNull LinearTimeLogicParser.AndformulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinearTimeLogicParser#andformula}.
	 * @param ctx the parse tree
	 */
	void exitAndformula(@NotNull LinearTimeLogicParser.AndformulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinearTimeLogicParser#xformula}.
	 * @param ctx the parse tree
	 */
	void enterXformula(@NotNull LinearTimeLogicParser.XformulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinearTimeLogicParser#xformula}.
	 * @param ctx the parse tree
	 */
	void exitXformula(@NotNull LinearTimeLogicParser.XformulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinearTimeLogicParser#gformula}.
	 * @param ctx the parse tree
	 */
	void enterGformula(@NotNull LinearTimeLogicParser.GformulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinearTimeLogicParser#gformula}.
	 * @param ctx the parse tree
	 */
	void exitGformula(@NotNull LinearTimeLogicParser.GformulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinearTimeLogicParser#fformula}.
	 * @param ctx the parse tree
	 */
	void enterFformula(@NotNull LinearTimeLogicParser.FformulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinearTimeLogicParser#fformula}.
	 * @param ctx the parse tree
	 */
	void exitFformula(@NotNull LinearTimeLogicParser.FformulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinearTimeLogicParser#uformula}.
	 * @param ctx the parse tree
	 */
	void enterUformula(@NotNull LinearTimeLogicParser.UformulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinearTimeLogicParser#uformula}.
	 * @param ctx the parse tree
	 */
	void exitUformula(@NotNull LinearTimeLogicParser.UformulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinearTimeLogicParser#vformula}.
	 * @param ctx the parse tree
	 */
	void enterVformula(@NotNull LinearTimeLogicParser.VformulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinearTimeLogicParser#vformula}.
	 * @param ctx the parse tree
	 */
	void exitVformula(@NotNull LinearTimeLogicParser.VformulaContext ctx);
}