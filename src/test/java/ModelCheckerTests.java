import BuchiAutomata.Buchi;
import Formula.LTLFormula;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by alexander on 18.07.15.
 */
public class ModelCheckerTests {
    @Test
    public void simpleTest1() throws FormulaNotFoundException {
        String f = "(a U b)";
        FormulaParser fp = new FormulaParser();
        NNF nnf = new NNF();
        LTLFormula f_LTL =  nnf.NNF(fp.parse(f));
        ModelChecker mc = new ModelChecker();

        List<Node> nodes = mc.create_graph(f_LTL);
        assertThat ("Nodes size: " +nodes.size(), nodes.size() >= 3);
        boolean initial = false;
        for(Node n1 : nodes){
            for(Node k1 : n1.getIncoming()){
                if(k1.getName().equals("INIT")){
                initial = true;
                }

            }
        }
        assertThat("TRUE", initial == true);
        Buchi b = mc.extractBuchi(nodes, f_LTL);


    }
    @Test
    public void simpleTest2() throws FormulaNotFoundException {
        String f = "(a U (b U c))";
        FormulaParser fp = new FormulaParser();
        NNF nnf = new NNF();
        LTLFormula f_LTL =  nnf.NNF(fp.parse(f));
        ModelChecker mc = new ModelChecker();

        List<Node> nodes = mc.create_graph(f_LTL);
        assertThat ("Nodes size: " + nodes.size(), nodes.size() >= 4);
        boolean initial = false;
        for(Node n1 : nodes){
            for(Node k1 : n1.getIncoming()){
                if(k1.getName().equals("INIT")){
                    initial = true;
                }

            }
        }
        assertThat("TRUE", initial==true);
        Buchi b = mc.extractBuchi(nodes,f_LTL);
    }

    @Test
    public void simpleTest3() throws FormulaNotFoundException {
        String f = "~(a U (b U c))";
        FormulaParser fp = new FormulaParser();
        NNF nnf = new NNF();
        LTLFormula f_LTL =  nnf.NNF(fp.parse(f));
        ModelChecker mc = new ModelChecker();

        List<Node> nodes = mc.create_graph(f_LTL);
        assertThat ("Nodes size: " + nodes.size(), nodes.size() >= 7);
        boolean initial = false;
        for(Node n1 : nodes){
            for(Node k1 : n1.getIncoming()){
                if(k1.getName().equals("INIT")){
                    initial = true;
                }

            }
        }
        assertThat("TRUE", initial==true);
        Buchi b = mc.extractBuchi(nodes,f_LTL);
    }
    @Test
    public void simpleTest4() throws FormulaNotFoundException {
        String f = "((G a) U b))";
        FormulaParser fp = new FormulaParser();
        NNF nnf = new NNF();
        LTLFormula f_LTL =  nnf.NNF(fp.parse(f));
        ModelChecker mc = new ModelChecker();

        List<Node> nodes = mc.create_graph(f_LTL);
        assertThat ("Nodes size: " + nodes.size(), nodes.size() >= 5);
        boolean initial = false;
        for(Node n1 : nodes){
            for(Node k1 : n1.getIncoming()){
                if(k1.getName().equals("INIT")){
                    initial = true;
                }

            }
        }
        assertThat("TRUE", initial==true);
        Buchi b = mc.extractBuchi(nodes,f_LTL);
    }
    @Test
    public void simpleTest5() throws FormulaNotFoundException {
        String f = "((F a) U (G b))";
        FormulaParser fp = new FormulaParser();
        NNF nnf = new NNF();
        LTLFormula f_LTL =  nnf.NNF(fp.parse(f));
        ModelChecker mc = new ModelChecker();

        List<Node> nodes = mc.create_graph(f_LTL);
        assertThat ("Nodes size: " + nodes.size(), nodes.size() >= 8);
        boolean initial = false;
        for(Node n1 : nodes){
            for(Node k1 : n1.getIncoming()){
                if(k1.getName().equals("INIT")){
                    initial = true;
                }

            }
        }
        assertThat("TRUE", initial==true);
        Buchi b = mc.extractBuchi(nodes,f_LTL);
    }

    @Test
    public void simpleTest6() throws FormulaNotFoundException {
        String f = "((F a) U (F b))";
        FormulaParser fp = new FormulaParser();
        NNF nnf = new NNF();
        LTLFormula f_LTL =  nnf.NNF(fp.parse(f));
        ModelChecker mc = new ModelChecker();

        List<Node> nodes = mc.create_graph(f_LTL);
        boolean initial = false;
        for(Node n1 : nodes){
            for(Node k1 : n1.getIncoming()){
                if(k1.getName().equals("INIT")){
                    initial = true;
                }

            }
        }
        assertThat("TRUE", initial==true);

        Buchi b = mc.extractBuchi(nodes,f_LTL);
    }

}
