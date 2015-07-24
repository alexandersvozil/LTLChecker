import Formula.LTLFormula;

import java.util.List;

/**
 * Created by alexander on 16.07.15.
 */
public class Node {
   private String name;
   private List<Node> incoming;
   private List<LTLFormula> next;
   private List<LTLFormula> oldF;
   private List<LTLFormula> newF;

   public Node(String name, List<Node> incoming,  List<LTLFormula> oldF, List<LTLFormula> newF,
               List<LTLFormula> next) {
      this.name = name;
      this.incoming = incoming;
      this.next = next;
      this.oldF = oldF;
      this.newF = newF;
   }

   public Node() {

   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }



   public List<Node> getIncoming() {
      return incoming;
   }

   public void setIncoming(List<Node> incoming) {
      this.incoming = incoming;
   }

   public List<LTLFormula> getNext() {
      return next;
   }

   public void setNext(List<LTLFormula> next) {
      this.next = next;
   }

   public List<LTLFormula> getOldF() {
      return oldF;
   }

   public void setOldF(List<LTLFormula> oldF) {
      this.oldF = oldF;
   }

   public List<LTLFormula> getNewF() {
      return newF;
   }

   public void setNewF(List<LTLFormula> newF) {
      this.newF = newF;
   }

   public void addIncomingNode(Node n) {

      incoming.add(n);
   }

   @Override
   public String toString() {
      return "Node{" +
              "name='" + name + '\'' +
              '}';
   }
}
