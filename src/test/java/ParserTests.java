import Formula.AtomFormula;
import Formula.LTLFormula;
import Formula.NEGFormula;
import Formula.UFormula;
import org.junit.Test;

/**
 * Created by alexander on 17.07.15.
 */
public class ParserTests {

   @Test
   public void testparser1(){
       String f1 = "(a U (a U b))";
       FormulaParser fp = new FormulaParser();
       LTLFormula f1_p = fp.parse(f1);
       assert(f1_p instanceof UFormula);
       UFormula f1_u = (UFormula) f1_p;
       assert(f1_u.getU1() instanceof AtomFormula);
       AtomFormula formula = (AtomFormula) f1_u.getU1();
       assert(f1_u.getU2() instanceof UFormula);
       UFormula f2 = (UFormula) f1_u.getU2();
       assert(f2.getU2() instanceof AtomFormula);
       AtomFormula a2 = (AtomFormula) f2.getU2();
       assert(a2.getAtom().equals("b"));

    }
    @Test
    public void testparser2(){
        String f1 = "~(a U (a U b))";
        FormulaParser fp = new FormulaParser();
        LTLFormula f1_p = fp.parse(f1);
        assert(f1_p instanceof NEGFormula);
        NEGFormula f1_u = (NEGFormula) f1_p;
        assert(f1_u.getNegatedFormula() instanceof UFormula);
    }
}
