import Formula.LTLFormula;
import Formula.UFormula;
import Parsing.LTLMVisitor;
import Parsing.LinearTimeLogicBaseListener;
import Parsing.LinearTimeLogicLexer;
import Parsing.LinearTimeLogicParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * Created by alexander on 16.07.15.
 */
public class FormulaParser {

    public LTLFormula parse(String formula){
        //Get our lexer
        LinearTimeLogicLexer lexer = new LinearTimeLogicLexer(new ANTLRInputStream(formula));

        //Get a list of matched tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        //Pass the tokens to the parser
        LinearTimeLogicParser parser = new LinearTimeLogicParser(tokens);


        //Specify our entry point
        ParseTree tree = parser.formula();
        LTLMVisitor visitor = new LTLMVisitor();
        LTLFormula l = visitor.visit(tree);
        return l;

    }


}
