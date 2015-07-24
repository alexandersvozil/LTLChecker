import Formula.*;

/**
 * Created by alexander on 17.07.15.
 */
public class NNF  {
    public LTLFormula NNF(LTLFormula formula) throws FormulaNotFoundException {
        if(formula instanceof  NEGFormula){
            LTLFormula subformula = ((NEGFormula) formula).getNegatedFormula();
            if (subformula instanceof NEGFormula){
                return  NNF(((NEGFormula) subformula).getNegatedFormula());
            }
            if(subformula instanceof UFormula){
                return new VFormula(NNF(new NEGFormula(((UFormula) subformula).getU1())),NNF(new NEGFormula(((UFormula) subformula).getU2())));
            }
            if(subformula instanceof VFormula){
                return new UFormula(NNF(new NEGFormula(((VFormula) subformula).getV1())),NNF(new NEGFormula(((VFormula) subformula).getV2())));
            }
            if(subformula instanceof ORFormula){
                return new ANDFormula(NNF(new NEGFormula(((ORFormula) subformula).getD1())), NNF(new NEGFormula(((ORFormula) subformula).getD2())));
            }
            if(subformula instanceof ANDFormula){
                return new ORFormula(NNF(new NEGFormula(((ANDFormula) subformula).getC1())), NNF(new NEGFormula(((ANDFormula) subformula).getC2())));
            }
            if(subformula instanceof  XFormula){
                return new XFormula(NNF(new NEGFormula(((XFormula) subformula).getX())));
            }
            if(subformula instanceof Verum){
                return  new Falsum();
            }
            if(subformula instanceof Falsum){
                return new Verum();
            }
            if(subformula instanceof AtomFormula){
                return ((AtomFormula) subformula).negate();
            }
            if(subformula instanceof NEGAtomFormula){
                return ((NEGAtomFormula) subformula).negate();
            }
        }
        else  if (formula instanceof UFormula){ return new UFormula(NNF(((UFormula) formula).getU1()), NNF(((UFormula) formula).getU2()));}
        else  if (formula instanceof VFormula){ return new VFormula(NNF(((VFormula) formula).getV1()), NNF(((VFormula) formula).getV2()));}
        else  if (formula instanceof ORFormula){ return new ORFormula(NNF(((ORFormula) formula).getD1()), NNF(((ORFormula) formula).getD2()));}
        else  if (formula instanceof ANDFormula){ return new ANDFormula(NNF(((ANDFormula) formula).getC1()), NNF(((ANDFormula) formula).getC2()));}
        else  if (formula instanceof XFormula){return  new XFormula(NNF(((XFormula) formula).getX()));}
        else  if (formula instanceof LiteralFormula ){ return formula;}


        //we forgot a case ;)
        throw new FormulaNotFoundException(formula);
    }
}
