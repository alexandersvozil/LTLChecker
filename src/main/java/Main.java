import Formula.LTLFormula;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.Normalizer;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //create the Modelchecker object with the given parameters
        if (!(args.length == 2)){
            System.out.println("Wrong number of arguments. Usage: ltlcheck formula path_to_kripke_structure_ascii");
            return;
        }
        LTLCheck ltlCheck = new LTLCheck();
        String resultString = null;
        try {
           boolean result =  ltlCheck.checkIt(args[0], args[1]);
            if(result){
                resultString = "satisfiable";
            }else {
                resultString = "unsatisfiable";
            }
            System.out.println("The formula is " + resultString + " under the given Kripke structure");
        } catch (FileNotFoundException e) {
            System.out.println("Kripke Structure Ascii File could not be found.\n Usage: ltlcheck formula path_to_kripke_structure_ascii");
        } catch (FormulaNotFoundException e) {
            System.out.println("Formula could not be found.\n Usage: ltlcheck formula path_to_kripke_structure_ascii");
        }


    }
}
