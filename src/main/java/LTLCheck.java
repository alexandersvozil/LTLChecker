import BuchiAutomata.Buchi;
import Formula.LTLFormula;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * Created by svozil on 24.07.15.
 */
public class LTLCheck {

    public boolean checkIt(String formula, String path) throws FileNotFoundException, FormulaNotFoundException {

        String toVerify = "~"+formula;
        String pathToK  = path;
        ParseAscii pc = new ParseAscii();
        ModelChecker mc = new ModelChecker();
        NNF nnf = new NNF();
        FormulaParser fp = new FormulaParser();

        Buchi pB = pc.parseAscii(new File(pathToK));
        LTLFormula toVerifyF = nnf.NNF(fp.parse(toVerify));
        Buchi fBG = mc.extractBuchi(mc.create_graph(toVerifyF), toVerifyF);
        Buchi fb = mc.GBuchiToBuchi(fBG);
        Buchi productBuchi = mc.productAutomaton(fb, pB);
        boolean result = mc.checkAlgorithm(productBuchi);

        return !result;
    }
}
