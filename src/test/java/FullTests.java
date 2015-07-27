import BuchiAutomata.Buchi;
import Formula.LTLFormula;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;

import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by svozil on 23.07.15.
 */
public class FullTests {

    @Test
    public void easy1 () throws FileNotFoundException, FormulaNotFoundException {
        String toVerify = "~(F (b & c))";
        String pathToK  = "tests/test1";
        ParseAscii pc = new ParseAscii();
        ModelChecker mc = new ModelChecker();
        NNF nnf = new NNF();
        FormulaParser fp = new FormulaParser();

        Buchi pB = pc.parseAscii(new File(pathToK));
        LTLFormula toVerifyF = nnf.NNF(fp.parse(toVerify));
        Buchi fBG = mc.extractBuchi(mc.create_graph(toVerifyF), toVerifyF);
        Buchi fb = mc.GBuchiToBuchi(fBG);
        Buchi productBuchi = mc.productAutomaton(fb, pB);
        boolean bool = mc.checkAlgorithm(productBuchi);

        assertThat("THE PROPERTY DOESNT HOLD",bool);

    }
    @Test
    public void easy15 () throws FileNotFoundException, FormulaNotFoundException {
        String toVerify = "~(F scheisse)";
        String pathToK  = "tests/test1";
        ParseAscii pc = new ParseAscii();
        ModelChecker mc = new ModelChecker();
        NNF nnf = new NNF();
        FormulaParser fp = new FormulaParser();

        Buchi pB = pc.parseAscii(new File(pathToK));
        LTLFormula toVerifyF = nnf.NNF(fp.parse(toVerify));
        Buchi fBG = mc.extractBuchi(mc.create_graph(toVerifyF), toVerifyF);
        Buchi fb = mc.GBuchiToBuchi(fBG);
        Buchi productBuchi = mc.productAutomaton(fb, pB);
        boolean bool = mc.checkAlgorithm(productBuchi);

        assertThat("THE PROPERTY DOESNT HOLD",bool);

    }
    @Test
    public void easy2() throws FileNotFoundException, FormulaNotFoundException {
        String toVerify = "~(F a)";
        String pathToK  = "tests/test1";
        ParseAscii pc = new ParseAscii();
        ModelChecker mc = new ModelChecker();
        NNF nnf = new NNF();
        FormulaParser fp = new FormulaParser();

        Buchi pB = pc.parseAscii(new File(pathToK));
        LTLFormula toVerifyF = nnf.NNF(fp.parse(toVerify));
        Buchi fBG = mc.extractBuchi(mc.create_graph(toVerifyF), toVerifyF);
        Buchi fb = mc.GBuchiToBuchi(fBG);
        Buchi productBuchi = mc.productAutomaton(fb, pB);
        boolean bool = mc.checkAlgorithm(productBuchi);

        assertThat("THE PROPERTY holds",!bool);

    }
    @Test
    public void easy3() throws FileNotFoundException, FormulaNotFoundException {
        String toVerify = "~(a U b)";
        String pathToK  = "tests/test1";
        ParseAscii pc = new ParseAscii();
        ModelChecker mc = new ModelChecker();
        NNF nnf = new NNF();
        FormulaParser fp = new FormulaParser();

        Buchi pB = pc.parseAscii(new File(pathToK));
        LTLFormula toVerifyF = nnf.NNF(fp.parse(toVerify));
        Buchi fBG = mc.extractBuchi(mc.create_graph(toVerifyF), toVerifyF);
        Buchi fb = mc.GBuchiToBuchi(fBG);
        Buchi productBuchi = mc.productAutomaton(fb, pB);
        boolean bool = mc.checkAlgorithm(productBuchi);

        assertThat("THE PROPERTY holds",!bool);

    }
    @Test
    public void easy5() throws FileNotFoundException, FormulaNotFoundException {
        String toVerify = "~(d U b)";
        String pathToK  = "tests/test1";
        ParseAscii pc = new ParseAscii();
        ModelChecker mc = new ModelChecker();
        NNF nnf = new NNF();
        FormulaParser fp = new FormulaParser();

        Buchi pB = pc.parseAscii(new File(pathToK));
        LTLFormula toVerifyF = nnf.NNF(fp.parse(toVerify));
        Buchi fBG = mc.extractBuchi(mc.create_graph(toVerifyF), toVerifyF);
        Buchi fb = mc.GBuchiToBuchi(fBG);
        Buchi productBuchi = mc.productAutomaton(fb, pB);
        boolean bool = mc.checkAlgorithm(productBuchi);

        assertThat("THE PROPERTY doesnt hold",bool);

    }
    @Test
    public void easy6() throws  FileNotFoundException, FormulaNotFoundException{
        LTLCheck checker = new LTLCheck();
        assertThat("property hold", checker.checkIt("(~b | (Xa))","tests/test1"));
    }
    @Test
    public void easy7() throws  FileNotFoundException, FormulaNotFoundException{
        LTLCheck checker = new LTLCheck();
        assertThat("property hold", checker.checkIt("(F(~c | a))","tests/test1"));
    }
    @Test
    public void easy8() throws  FileNotFoundException, FormulaNotFoundException{
        LTLCheck checker = new LTLCheck();
        assertThat("property doesnt hold", !checker.checkIt("(~a | b)","tests/test1"));
    }
    @Test
    public void easy9() throws  FileNotFoundException, FormulaNotFoundException{
        LTLCheck checker = new LTLCheck();
        assertThat("property hold", checker.checkIt("(X (X (G a)))","tests/test1"));
    }
    @Test
    public void easy10() throws  FileNotFoundException, FormulaNotFoundException{
        LTLCheck checker = new LTLCheck();
        assertThat("property hold", checker.checkIt("(X (F( ~a | (G a))))","tests/test1"));

    }
    @Test
    public void easy11() throws  FileNotFoundException, FormulaNotFoundException{
        LTLCheck checker = new LTLCheck();
        assertThat("property hold", checker.checkIt("(F (G a))","tests/test1"));
    }
    @Test
    public void easy12() throws  FileNotFoundException, FormulaNotFoundException{
        LTLCheck checker = new LTLCheck();
        assertThat("property holds", checker.checkIt("(F (~a | (G a)))","tests/test1"));
    }
    @Test
    public void easy13() throws  FileNotFoundException, FormulaNotFoundException{
        LTLCheck checker = new LTLCheck();
        assertThat("property holds", checker.checkIt("(~ready | (X reading))","tests/test4"));
    }
    @Test
    public void easy14() throws  FileNotFoundException, FormulaNotFoundException{
        LTLCheck checker = new LTLCheck();
        assertThat("property doesnt hold", checker.checkIt("(F reading)","tests/test4"));
    }
    @Test
    public void easy16() throws  FileNotFoundException, FormulaNotFoundException{
        LTLCheck checker = new LTLCheck();
        assertThat("property holds", checker.checkIt("(G (~e | (X a)))","tests/test3"));
    }
    @Test
    public void easy17() throws  FileNotFoundException, FormulaNotFoundException{
        LTLCheck checker = new LTLCheck();
        assertThat("property holds", checker.checkIt("(G (~c | (X ~a)))","tests/test3"));
    }
    @Test
    public void easy18() throws  FileNotFoundException, FormulaNotFoundException{
        LTLCheck checker = new LTLCheck();
        assertThat("property holds", checker.checkIt("(F a)","tests/test5"));
    }
    @Test
    public void easy19() throws  FileNotFoundException, FormulaNotFoundException{
        LTLCheck checker = new LTLCheck();
        assertThat("property holds", checker.checkIt("(a U (b U c))","tests/test6"));
    }
    @Test
    public void easy20() throws  FileNotFoundException, FormulaNotFoundException{
        LTLCheck checker = new LTLCheck();
        assertThat("property doesn't hold", !checker.checkIt("(a U (b U b))","tests/test6"));
    }



}
