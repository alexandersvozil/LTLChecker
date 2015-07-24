// Generated from /home/alexander/Dropbox/LTLChecker/LTL/LinearTimeLogic.g4 by ANTLR 4.5
package Parsing;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LinearTimeLogicParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LinearTimeLogicVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LinearTimeLogicParser#formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormula(@NotNull LinearTimeLogicParser.FormulaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinearTimeLogicParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull LinearTimeLogicParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinearTimeLogicParser#vliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVliteral(@NotNull LinearTimeLogicParser.VliteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinearTimeLogicParser#fliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFliteral(@NotNull LinearTimeLogicParser.FliteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinearTimeLogicParser#negatom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegatom(@NotNull LinearTimeLogicParser.NegatomContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinearTimeLogicParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(@NotNull LinearTimeLogicParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinearTimeLogicParser#negatedformula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegatedformula(@NotNull LinearTimeLogicParser.NegatedformulaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinearTimeLogicParser#orformula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrformula(@NotNull LinearTimeLogicParser.OrformulaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinearTimeLogicParser#andformula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndformula(@NotNull LinearTimeLogicParser.AndformulaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinearTimeLogicParser#xformula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXformula(@NotNull LinearTimeLogicParser.XformulaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinearTimeLogicParser#gformula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGformula(@NotNull LinearTimeLogicParser.GformulaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinearTimeLogicParser#fformula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFformula(@NotNull LinearTimeLogicParser.FformulaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinearTimeLogicParser#uformula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUformula(@NotNull LinearTimeLogicParser.UformulaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinearTimeLogicParser#vformula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVformula(@NotNull LinearTimeLogicParser.VformulaContext ctx);
}