import BuchiAutomata.Buchi;
import BuchiAutomata.BuchiNode;
import Formula.LTLFormula;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by svozil on 21.07.15.
 */
public class ParseAscii {

    public Buchi parseAscii(File f) throws FileNotFoundException {
            int nrVertices = 0;
            boolean repr [][] = null;
            String [] labeling = null;
            Scanner sc = new Scanner(f);
            boolean firstline = true;
            boolean secondline = true;
            boolean thirdline = true;


            nrVertices = sc.nextInt();
            Buchi b = new Buchi(nrVertices);
            repr = new boolean[nrVertices][nrVertices]; //initialize the adj. matrix

            int height = 0;
            int width = 0;
            //skip "--"
            sc.next();
            while (width+height != (2*nrVertices)-2) {
                int nextInt = sc.nextInt();
                // System.out.println(nextInt);
                if (nextInt == 0) {
                    repr[height][width] = false;
                } else {
                    repr[height][width] = true;
                }
                if ((width + 1) % nrVertices == 0) {
                    height++;
                }
                width = (width + 1) % nrVertices;
            }
            int nextInt = sc.nextInt();
            // System.out.println(nextInt);
            if (nextInt == 0) {
                repr[nrVertices-1][nrVertices-1] = false;
            } else {
                repr[nrVertices-1][nrVertices-1] = true;
            }
            labeling = new String[nrVertices];
            sc.next();
            sc.nextLine();
            while(sc.hasNextLine()){
                String newline = sc.nextLine();
                Scanner sc2 = new Scanner(newline);

                int h = sc2.nextInt();
                //int l = sc2.nextInt();
                String str= "";
                sc2.next();
                while(sc2.hasNext()){
                    str += sc2.next();
                }
                labeling[h] = str;
            //    System.out.println(h + " " + str);
            }

        //produce adjlist from adjMatrix;
        for(int i = 0; i < repr.length; i++){
            BuchiNode bn = new BuchiNode("Adj"+i);
            b.addNode(bn);
        }
        for(int i = 0; i < repr.length; i++) {
            List<BuchiNode> adjListbn = new ArrayList<>();
            for (int k = 0; k < repr[i].length; k++) {
                if(repr[i][k] == true){
                adjListbn.add(b.getNode("Adj"+k));
                }

            }
            BuchiNode bn = b.getNode("Adj" + i);
            bn.setAdj(adjListbn);

        }
        //add labeling
        FormulaParser fp = new FormulaParser();
        for(int i = 0; i < labeling.length; i++){
            String str =labeling[i];
            if(str == null) continue;
            List<LTLFormula>label_n_i = new ArrayList<>();
            String str2 = str.substring(1,str.length()-1);
            String[] formulae = str2.split(",");
            for(String f_i : formulae) {
               // if(f_i.equals("")) continue;
               LTLFormula pf = fp.parse(f_i);
            //    System.out.println(pf);
               label_n_i.add(pf);
            }
            //add label to the respective node
            BuchiNode n = b.getNode("Adj"+i);
            n.setLabeling(label_n_i);
           // System.out.println("newline");
        }
        List<BuchiNode> init = new ArrayList<>();
                init.add(b.getNode("Adj0"));
        b.setInitialStates(init);


            return b;
    }
}
