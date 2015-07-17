package Parsing;

import Formula.LTLFormula;
import Formula.UFormula;
import org.antlr.v4.runtime.misc.NotNull;

/**
 * Created by alexander on 17.07.15.
 */
public class LTLMListener extends LinearTimeLogicBaseListener {

    private LTLFormula formula;

    @Override public void enterUformula(@NotNull LinearTimeLogicParser.UformulaContext ctx) {
        if(formula == null){
            formula = new UFormula();

        }else{
        }
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitUformula(@NotNull LinearTimeLogicParser.UformulaContext ctx) {
    }

}
