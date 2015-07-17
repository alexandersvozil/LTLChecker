import Formula.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexander on 16.07.15.
 */
public class ModelChecker {

   private int counter;

   public ModelChecker (){
   }

   /*creates the buechi automaton from the negated formula */
   public List<Node> create_graph(LTLFormula f) {

      Node n = new Node(newName(),null, new ArrayList<Node>(), new ArrayList<LTLFormula>(), new ArrayList<LTLFormula>(),
              new ArrayList<LTLFormula>() );
     return expand(n, new ArrayList<Node>());
   }

   private List<Node> expand(Node n, List<Node> nodeset ){
     if (n.getNewF().isEmpty()){
        for(Node k : nodeset){
            //TODO implement equals method for LTL Formula Node(!!)
            if(k.getNext().equals(n.getNext()) && k.getOldF().equals(n.getOldF())){
                k.addIncomingNode(n);
                return nodeset;
            }
        }
        ArrayList<Node> incoming = new ArrayList<Node>();
         incoming.add(n);
         ArrayList<LTLFormula> next = new ArrayList<LTLFormula>();

         ArrayList<LTLFormula> newFs = new ArrayList<LTLFormula>();
         ArrayList<LTLFormula> OldFs = new ArrayList<LTLFormula>();
         nodeset.add(n);
        return expand(new Node(newName(),null,incoming, newFs,OldFs,next), nodeset);

     }else{
         LTLFormula l = n.getNewF().get(1);
         n.getNewF().remove(1);
         if(l instanceof  LiteralFormula ){
             if(l instanceof Falsum ||
                     n.getOldF().contains(((LiteralFormula) l).negate())){
                 return nodeset;
             }else{
                 n.getOldF().add(l);
                 return expand(n,nodeset);
             }

         }
         if(l instanceof UFormula|| l instanceof  VFormula || l instanceof  ORFormula){
             ArrayList<Node> incoming1 = new ArrayList<Node>(n.getIncoming());
             ArrayList<LTLFormula> next1 = new ArrayList<LTLFormula>(n.getNext());
             next1.add(next1(l));
             ArrayList<LTLFormula> newFs1 = new ArrayList<LTLFormula>(n.getNewF());
             LTLFormula l1 = new1(l);
             if(!n.getOldF().contains(l1)){
                 newFs1.add(l1);
             }
             ArrayList<LTLFormula> OldFs1 = new ArrayList<LTLFormula>(n.getOldF());
             OldFs1.add(l);

             Node n1 = new Node(newName(),n,incoming1,newFs1,OldFs1,next1);

             LTLFormula l2 = new2(l);
             if(!n.getOldF().contains(l1)){
                 newFs1.add(l2);

             }
             ArrayList<Node> incoming2 = new ArrayList<Node>(n.getIncoming());
             ArrayList<LTLFormula> next2= new ArrayList<LTLFormula>(n.getNext());
             ArrayList<LTLFormula> newFs2 = new ArrayList<LTLFormula>(n.getNewF());
             ArrayList<LTLFormula> OldFs2 = new ArrayList<LTLFormula>(n.getOldF());
             OldFs1.add(l);
             Node n2 = new Node(newName(),n,incoming2,newFs2,OldFs2,next2);

             return(expand(n2,expand(n1,nodeset)));

         }

         if(l instanceof ANDFormula){
             //add the subformulas!!! TODO
             ANDFormula l1 = (ANDFormula) l;
             n.getNewF().add(l1.getC1());
             n.getNewF().add(l1.getC2());
             n.getOldF().add(l);
            return (expand(n, nodeset));
         }
     }
      return nodeset;
   }
    private LTLFormula next1(LTLFormula l) {
        return null;
    }

    private LTLFormula new1(LTLFormula l) {
        return null;
    }

    private LTLFormula new2(LTLFormula l) {
        return  null;
    }

    private String newName(){
     return "Node"+counter++;
   }

}
