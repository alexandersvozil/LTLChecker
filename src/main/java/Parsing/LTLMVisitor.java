package Parsing;

import Formula.*;
import org.antlr.v4.runtime.misc.NotNull;

/**
 * Created by alexander on 17.07.15.
 */
public class LTLMVisitor extends LinearTimeLogicBaseVisitor<LTLFormula> {

    @Override
    public LTLFormula visitFormula(@NotNull LinearTimeLogicParser.FormulaContext ctx) { return visitChildren(ctx); }


    @Override public LTLFormula visitNegatedformula(@NotNull LinearTimeLogicParser.NegatedformulaContext ctx) {
        NEGFormula negFormula = new NEGFormula();
        negFormula.setNegatedFormula(visit(ctx.formula()));
        return negFormula;
    }
    @Override public LTLFormula visitVliteral(@NotNull LinearTimeLogicParser.VliteralContext ctx) {
        return new Verum();
    }
    @Override public LTLFormula visitFliteral(@NotNull LinearTimeLogicParser.FliteralContext ctx) {
        return new Falsum();
    }
    @Override public LTLFormula visitNegatom(@NotNull LinearTimeLogicParser.NegatomContext ctx) {
        NEGAtomFormula n = new NEGAtomFormula();
        n.setN(ctx.ATOM().toString());
        return n;
    }
    @Override public LTLFormula visitAtom(@NotNull LinearTimeLogicParser.AtomContext ctx) {
        AtomFormula a = new AtomFormula();
        a.setAtom(ctx.ATOM().toString());
        return a;
    }
    @Override public LTLFormula visitOrformula(@NotNull LinearTimeLogicParser.OrformulaContext ctx) {
        ORFormula orFormula = new ORFormula();
        orFormula.setD1(visit(ctx.formula(0)));
        orFormula.setD2(visit(ctx.formula(1)));
        return orFormula;
    }
    @Override public LTLFormula visitAndformula(@NotNull LinearTimeLogicParser.AndformulaContext ctx) {

        ANDFormula andFormula = new ANDFormula();
        andFormula.setC1(visit(ctx.formula(0)));
        andFormula.setC2(visit(ctx.formula(1)));
        return andFormula;
    }
    @Override public LTLFormula visitXformula(@NotNull LinearTimeLogicParser.XformulaContext ctx) {
           XFormula xFormula = new XFormula();
            xFormula.setX(visit(ctx.formula()));
            return  xFormula;
    }

    @Override public LTLFormula visitUformula(@NotNull LinearTimeLogicParser.UformulaContext ctx) {
        UFormula uFormula = new UFormula();
        uFormula.setU1(visit(ctx.formula(0)));
        uFormula.setU2(visit(ctx.formula(1)));
        return uFormula;
    }
    @Override public LTLFormula visitVformula(@NotNull LinearTimeLogicParser.VformulaContext ctx) {
        VFormula vFormula = new VFormula();
        vFormula.setV1(visit(ctx.formula(0)));
        vFormula.setV1(visit(ctx.formula(1)));
        return vFormula;
    }

    @Override public LTLFormula visitGformula(@NotNull LinearTimeLogicParser.GformulaContext ctx) {
        NEGFormula g = new NEGFormula();
        UFormula l = new UFormula();
        l.setU1(new Verum());
        NEGFormula g2 = new NEGFormula();
        l.setU2(g2);
        g.setNegatedFormula(l);
        g2.setNegatedFormula(visit(ctx.formula()));
        return g;
    }
    @Override public LTLFormula visitFformula(@NotNull LinearTimeLogicParser.FformulaContext ctx) {
        UFormula fFormula = new UFormula();
        fFormula.setU1(new Verum());
        fFormula.setU2(visit(ctx.formula()));
        return fFormula;
    }
}
