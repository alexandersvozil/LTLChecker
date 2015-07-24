import Formula.LTLFormula;
import org.junit.Test;

/**
 * Created by alexander on 17.07.15.
 */
public class NNFTests {

    @Test
    public void testNNF(){
        FormulaParser fp = new FormulaParser();
        NNF nnf = new NNF();
        LTLFormula f = fp.parse("~(F ~a)");
        LTLFormula k = null;
        try {
            k = nnf.NNF(f);
        } catch (FormulaNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(k);
    }
}
