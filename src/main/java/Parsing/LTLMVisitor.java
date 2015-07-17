package Parsing;

import Formula.AtomFormula;
import Formula.Falsum;
import Formula.LTLFormula;
import Formula.Verum;
import org.antlr.v4.runtime.misc.NotNull;

/**
 * Created by alexander on 17.07.15.
 */
public class LTLMVisitor extends LinearTimeLogicBaseVisitor<LTLFormula> {

    @Override
    public LTLFormula visitFormula(@NotNull LinearTimeLogicParser.FormulaContext ctx) { return visitChildren(ctx); }

    @Override public LTLFormula visitVliteral(@NotNull LinearTimeLogicParser.VliteralContext ctx) { return new Verum(); }
    @Override public LTLFormula visitFliteral(@NotNull LinearTimeLogicParser.FliteralContext ctx) { return new Falsum(); }
    @Override public LTLFormula visitNegatom(@NotNull LinearTimeLogicParser.NegatomContext ctx) { return visitChildren(ctx); }
    @Override public LTLFormula visitAtom(@NotNull LinearTimeLogicParser.AtomContext ctx) {
        AtomFormula a = new AtomFormula();
       a.setAtom(ctx.ATOM().toString());
        return a; }
    @Override public LTLFormula visitOrformula(@NotNull LinearTimeLogicParser.OrformulaContext ctx) { return visitChildren(ctx); }
    @Override public LTLFormula visitAndformula(@NotNull LinearTimeLogicParser.AndformulaContext ctx) { return visitChildren(ctx); }
    @Override public LTLFormula visitXformula(@NotNull LinearTimeLogicParser.XformulaContext ctx) { return visitChildren(ctx); }
    @Override public LTLFormula visitUformula(@NotNull LinearTimeLogicParser.UformulaContext ctx) { return visitChildren(ctx); }
    @Override public LTLFormula visitVformula(@NotNull LinearTimeLogicParser.VformulaContext ctx) { return visitChildren(ctx); }
}
