import Formula.*;
import BuchiAutomata.Buchi;
import BuchiAutomata.BuchiNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

/**
 * The Model Checker inspired by the Paper
 * R. Gerth, D. Peled, M. Y. Vardi, and P. Wolper. Simple on-the-fly automatic verifi-
 cation of linear temporal logic, 1995.
 */
public class ModelChecker {

    private int counter;

    public ModelChecker (){
    }

    /*creates the buechi automaton from the negated formula */
    public List<Node> create_graph(LTLFormula f) {
        ArrayList<LTLFormula> newBegin = new ArrayList<>();
        newBegin.add(f);
        Node init = new Node();
        init.setName("INIT");
        // init.setIncoming(new ArrayList<>());
        //init.setOldF(new ArrayList<>());
        //init.setNewF(new ArrayList<>());
        //init.setNext(new ArrayList<>());

        ArrayList<Node> incoming = new ArrayList<>();

        incoming.add(init);
        Node n = new Node(newName(), incoming, new ArrayList<>(), newBegin,
                new ArrayList<>() );

        ArrayList<Node> nodeset = new ArrayList<>();
        //nodeset.add(init);
        return expand(n, nodeset);
    }

    private List<Node> expand(Node n, List<Node> nodeset ){
        if (n.getNewF().isEmpty()){
            for(Node k : nodeset){
                boolean equals =  checkEqualNextandOld(k, n);
                if(equals){
                    k.getIncoming().addAll(n.getIncoming());
                    return  nodeset;
                }

            }
            nodeset.add(n);

            ArrayList<Node> incoming = new ArrayList<>();
            incoming.add(n);
            ArrayList<LTLFormula> next = new ArrayList<>();

            ArrayList<LTLFormula> newFs = new ArrayList<>();
            newFs.addAll(n.getNext());
            ArrayList<LTLFormula> OldFs = new ArrayList<>();
            Node newNode = new Node(newName(),incoming, OldFs,newFs,next);
            // if(!n.getNext().isEmpty()) {
            return expand(newNode, nodeset);
            // }else{
            //     return nodeset;
            //}


        }else{

            LTLFormula l = n.getNewF().get(0);
            n.getNewF().remove(0);
            if(l instanceof  LiteralFormula ){
                if(l instanceof Falsum || n.getOldF().contains(((LiteralFormula) l).negate())){
                    return nodeset;
                }else{
                    n.getOldF().add(l);
                    return expand(n,nodeset);
                }

            }
            if(l instanceof UFormula|| l instanceof  VFormula || l instanceof  ORFormula){
                ArrayList<Node> incoming1 = new ArrayList<>(n.getIncoming());
                ArrayList<LTLFormula> next1 = new ArrayList<>(n.getNext());
                next1.addAll(next1(l));
                ArrayList<LTLFormula> newFs1 = new ArrayList<>(n.getNewF());
                List<LTLFormula> l1 = new1(l);
                for(LTLFormula tempf : l1) {
                    if (!n.getOldF().contains(tempf)) {
                        newFs1.add(tempf);
                    }
                }
                ArrayList<LTLFormula> OldFs1 = new ArrayList<>(n.getOldF());
                OldFs1.add(l);
                Node n1 = new Node(newName(),incoming1,OldFs1,newFs1,next1);


                ArrayList<Node> incoming2 = new ArrayList<>(n.getIncoming());
                ArrayList<LTLFormula> next2= new ArrayList<>(n.getNext());
                ArrayList<LTLFormula> newFs2 = new ArrayList<>(n.getNewF());
                List<LTLFormula> l2 = new2(l);
                for(LTLFormula tempf : l2) {
                    if (!n.getOldF().contains(tempf)) {
                        newFs2.add(tempf);

                    }
                }
                ArrayList<LTLFormula> OldFs2 = new ArrayList<>(n.getOldF());
                OldFs2.add(l);
                Node n2 = new Node(newName(),incoming2,OldFs2,newFs2,next2);

                return(expand(n2,expand(n1,nodeset)));
            }

            if(l instanceof ANDFormula){
                //add the subformulas!!!
                ANDFormula l1 = (ANDFormula) l;
                n.getNewF().add(l1.getC1());
                n.getNewF().add(l1.getC2());
                n.getOldF().add(l);
                return (expand(n, nodeset));
            }

            if(l instanceof  XFormula){
                n.getOldF().add(l);
                n.getNext().add(((XFormula) l).getX());
                return expand(n,nodeset);
            }
        }
        return nodeset;
    }

    private boolean checkEqualNextandOld(Node k, Node n) {
        // if(k.getOldF().size() != n.getOldF().size() ) return false;
        //if(k.getNext().size() != n.getNext().size() ) return false;

        /*List<LTLFormula> next1= k.getNext();
        List<LTLFormula> next2= n.getNext();

        Collections.sort(next1);
        Collections.sort(next2);
        if(!next1.equals(next2)) return  false;
        List<LTLFormula> old1= k.getOldF();
        List<LTLFormula> old2= n.getOldF();

        Collections.sort(old1);
        Collections.sort(old2);
        if(!old1.equals(old2)) return  false; */
        if(k.getName().equals("INIT") || n.getName().equals("INIT")){
            return  false;
        }
        for(LTLFormula f : k.getNext()){
            if(!n.getNext().contains(f)){
                return  false;
            }
        }
        for(LTLFormula f : n.getNext()){
            if(!k.getNext().contains(f)){
                return  false;
            }
        }

        for(LTLFormula i : k.getOldF()){
            if(!n.getOldF().contains(i)) {
                return  false;
            }
        }
        for(LTLFormula i : n.getOldF()){
            if(!k.getOldF().contains(i)) {
                return  false;
            }
        }
        return true;
    }

    private List<LTLFormula> next1(LTLFormula l) {
        List<LTLFormula> returnList = new ArrayList<>();
        if (l instanceof UFormula){
            returnList.add(l);
            return returnList;
        }else if (l instanceof VFormula){
            returnList.add(l);
            return returnList;
        }else if(l instanceof ORFormula){
            return returnList;

        }
        throw new IllegalArgumentException();

    }

    private List<LTLFormula> new1(LTLFormula l) {

        List<LTLFormula> returnList = new ArrayList<>();
        if (l instanceof UFormula){
            returnList.add(((UFormula) l).getU1());
            return returnList;
        }else if (l instanceof VFormula){
            returnList.add(((VFormula) l).getV2());
            return returnList;
        }else if(l instanceof ORFormula) {
            ORFormula k = (ORFormula) l;
            returnList.add(k.getD1());
            return returnList;

        }
        throw new IllegalArgumentException();
    }

    private List<LTLFormula> new2(LTLFormula l) {

        List<LTLFormula> returnList = new ArrayList<>();
        if (l instanceof UFormula){
            returnList.add(((UFormula) l).getU2());
            return returnList;
        }else if (l instanceof VFormula){
            returnList.add(((VFormula) l).getV1());
            returnList.add(((VFormula) l).getV2());
            return returnList;
        }else if(l instanceof ORFormula){
            ORFormula k = (ORFormula) l;
            returnList.add(k.getD2());
            return returnList;

        }
        throw new IllegalArgumentException();
    }

    private String newName(){
        return "Node"+counter++;
    }

    /*
    Given the results of the expand Algorithm we extract the BuchiAutomata
     */
    public Buchi extractBuchi( List<Node> result, LTLFormula f){
//        List<BuchiNode>  = new ArrayList<>();
        Buchi b = new Buchi(result.size());
        int initialcounter = 0;
        for(Node n : result){
            BuchiNode bn = new BuchiNode(n.getName());
            bn.setAdj(new ArrayList<>());
            for(LTLFormula l : n.getOldF()){
                if(l instanceof LiteralFormula){
                    bn.addFormula(l);
                }
            }
            b.addNode(bn);
        }

        //extract initial states and transistion relation
        List<BuchiNode> initialStates = new ArrayList<>();
        for(Node n : result) {
            BuchiNode buchiNode = b.getNode(n.getName());
            for(Node k : n.getIncoming()){
                String name = k.getName();
                if(!name.equals("INIT")){
                    BuchiNode adjTo = b.getNode(name);
                    adjTo.getAdj().add(buchiNode);
                }
                else{
                    initialStates.add(buchiNode);
                }

            }
        }
        b.setInitialStates(initialStates);

        //extract final states
        List<UFormula> subformulas = new ArrayList<>();
        subformulas = exUSubf(f, subformulas);
        List<List<BuchiNode>> accStSet = new ArrayList<>();
        for(UFormula u : subformulas){
            ArrayList<BuchiNode> acceptingSt = new ArrayList<>();
            for(Node n : result){
                if(!n.getOldF().contains(u) || n.getOldF().contains(u.getU2())){
                    acceptingSt.add(b.getNode(n.getName()));

                }
            }
            accStSet.add(acceptingSt);
        }
        b.setAcceptingStates(accStSet);


        return b;
    }

    private List<UFormula> exUSubf(LTLFormula f, List<UFormula> subformulas) {
        if(f instanceof ANDFormula){
            return exUSubf(((ANDFormula) f).getC2(),exUSubf(((ANDFormula) f).getC1(),subformulas));

        }
        if(f instanceof ORFormula){
            return  exUSubf(((ORFormula) f).getD2(),exUSubf(((ORFormula) f).getD1(),subformulas));
        }
        if(f instanceof XFormula){
            return exUSubf(((XFormula) f).getX(), subformulas);

        }
        if(f instanceof UFormula){
            subformulas.add((UFormula) f);
            return exUSubf(((UFormula) f).getU2(),exUSubf(((UFormula) f).getU1(), subformulas));
        }
        if(f instanceof VFormula){
            return exUSubf(((VFormula) f).getV1(),exUSubf(((VFormula) f).getV2(),subformulas));
        }
        if(f instanceof LiteralFormula){
            return subformulas;

        }

        throw new IllegalArgumentException();
    }

    /* This method describes the generation of the product Buchi Automaton.
    IMPORTANT: We assume here, that both buchi automatons are simple buchi automatons.
    The state set: nfa.states(V) x program.states(S) states are v_1,...,v_n and s_1,..,s_n respectively

    transition function T(*,*) is defined as (v_2,s_2) \in T ((v_1,s_1),a) iff v_2 \in T_formula(v_1,a)
    and s_2 \in T_program(s_1,a) where a is from the language sigma defining the automatons

    The initial state is (v_0,s_0)

    the final states are V x F where F are the final states of the formula buchi.
     */
    public Buchi productAutomaton(Buchi nFa, Buchi program){
        //create product buchi object
        Buchi productBuchi = new Buchi(nFa.getSize()*program.getSize());
        productBuchi.setAcceptingStatesN(new ArrayList<>());

        //create prodBuchi Nodes
        for(int i=0; i<nFa.getSize(); i++){
                BuchiNode bnF = nFa.getAdjList()[i];
            if(bnF==null) continue;
            for(int j=0; j<program.getSize(); j++){
                BuchiNode bnP = program.getAdjList()[j];
                if(bnP==null) continue;
                String newName = bnF.getName()+","+bnP.getName();
                BuchiNode prodBuchiN = new BuchiNode(newName);
                prodBuchiN.setAdj(new ArrayList<>());
                productBuchi.addNode(prodBuchiN);
                if(nFa.getAcceptingStatesN().contains(bnF)){
                    productBuchi.getAcceptingStatesN().add(prodBuchiN);

                }
            }
        }

        //the transition function
        for (BuchiNode bn : productBuchi.getAdjList()){
            //check if connection holds.
            String[] originalNames = bn.getName().split(",");
            String bnF = originalNames[0];
            BuchiNode bnOF = nFa.getNode(bnF);
            String bnP = originalNames[1];
            BuchiNode bnOP = program.getNode(bnP);
            for (BuchiNode bn2 : productBuchi.getAdjList()){
                String[] originalNames2 = bn2.getName().split(",");
                String bnF2 = originalNames2[0];
                BuchiNode bnOF2 = nFa.getNode(bnF2);
                String bnP2 = originalNames2[1];
                BuchiNode bnOP2 = program.getNode(bnP2);

                //check if connected
                boolean con = true;
                //first check if both are connected, otherwise there is no reason to make an arc
                if(!bnOF.getAdj().contains(bnOF2)) con = false;
                if(!bnOP.getAdj().contains(bnOP2)) con = false;
                //check if labelling is the same (of bnOP2 and bnOF2)
                //TODO THIS IS NOT CORRECT. Check whether the labelling is compatible!
                if(!bnOF2.getLabeling().isEmpty()) {
                    for (LTLFormula f : bnOF2.getLabeling()) {
                        if (f instanceof AtomFormula) {
                            if (!bnOP2.getLabeling().contains(f)) {
                                con = false;
                                break;
                            }
                        }
                        if (f instanceof NEGAtomFormula) {
                            if (bnOP2.getLabeling().contains(((NEGAtomFormula) f).negate())) {
                                con = false;
                                break;
                            }
                        }
                        if(f instanceof Verum) {
                            if (!bnOP2.getLabeling().contains(f)) {
                                con = false;
                                break;
                            }
                        }
                       /* if(f instanceof Falsum) {
                            con = false;
                            break;
                        }*/
                    }

                    /*for (LTLFormula f : bnOP2.getLabeling()) {
                        if (f instanceof AtomFormula) {
                            if (!bnOF2.getLabeling().contains(f)) {
                                con = false;
                            }
                        }
                        if (f instanceof NEGAtomFormula) {
                            if (bnOF2.getLabeling().contains(((NEGAtomFormula) f).negate())) {
                                con = false;
                            }
                        }
                    }*/

                }

                    if (con) {
                        bn.getAdj().add(bn2);
                    }

            }
        }

        //set the initial state
        if(productBuchi.getAcceptingStatesN().size() == productBuchi.getAdjList().length){

            productBuchi.setInitialState(productBuchi.getNode("Init,Init"));
        }else {
            productBuchi.setInitialState(productBuchi.getNode("Init0,Init"));
        }


        return productBuchi;
    }


    /* This method transforms a general buchi to a normal buchi.
    It's end node are saved a seperate list.
     */
    public Buchi GBuchiToBuchi (Buchi gbuchi){
        //duplicate the buchi automata for every accepting set.


        int duplicatedSize = gbuchi.getAcceptingStates().size()*gbuchi.getSize();
        if(duplicatedSize == 0){
            List<BuchiNode> acc = new ArrayList<>();
            for(BuchiNode bn : gbuchi.getAdjList())
            {
               if(bn == null) continue;
                acc.add(bn);

            }
            gbuchi.setAcceptingStatesN(acc);
            return gbuchi;
        }
        Buchi nBuchi = new Buchi(duplicatedSize);

        List<BuchiNode> newAccepting = new ArrayList<>();
        nBuchi.setAcceptingStatesN(newAccepting);
        for(int i = 0; i < gbuchi.getAcceptingStates().size(); i++){
            List<BuchiNode> curAccepting = gbuchi.getAcceptingStates().get(i);
            for(BuchiNode n : gbuchi.getAdjList()) {
                if (n != null) {
                    String name = n.getName();
                    BuchiNode newBuchi = new BuchiNode(new String(name + i));
                    List<LTLFormula> labeling = new ArrayList<>(n.getLabeling());
                    newBuchi.setLabeling(labeling);
                    nBuchi.addNode(newBuchi);
                    if (curAccepting.contains(n) && i == 0) {
                        newAccepting.add(newBuchi);
                    }
                }
            }
        }
        for(int i = 0; i < gbuchi.getAcceptingStates().size(); i++){
            List<BuchiNode> curAccepting = gbuchi.getAcceptingStates().get(i);
            for(BuchiNode n : gbuchi.getAdjList()){
                if(n == null) continue;
                BuchiNode newBuchi  = nBuchi.getNode(n.getName() + i);
                List<BuchiNode> adjList = new ArrayList<>();
                for (BuchiNode adjN : n.getAdj()){
                    if(curAccepting.contains(n)){
                        adjList.add(nBuchi.getNode(adjN.getName() + (i+1%gbuchi.getAcceptingStates().size()) ));
                    }else {
                        adjList.add(nBuchi.getNode(adjN.getName() + i));
                    }

                }
                newBuchi.setAdj(adjList);
            }
        }




        return nBuchi;
    }

    /* the check algorithm
     * taken as is from the paper Memory-Efficient Algorithms for the Verification
of Temporal Properties by Courcoubetis, Vardi, Wolper and Yannakakis
        it takes as input the productbuchi and tells if it is nonempty
      * */
    public boolean checkAlgorithm(Buchi productBuchi){
        HashSet<BuchiNode> visited = new HashSet<>();
        Stack<BuchiNode> stack = new Stack<>();
        stack.push(productBuchi.getInitialState());
        List<BuchiNode> reachable = new ArrayList<>();

        /* determine all final nodes reachable from the start node */
        while(!stack.isEmpty()){
            BuchiNode v = stack.peek();
            boolean allReachable = true;
            BuchiNode fMofSucc = null;
            for(BuchiNode k : v.getAdj()){
               if(!visited.contains(k)){
                   allReachable = false;
                   fMofSucc = k;
                   break;
               }
            }
            if(allReachable){
                stack.pop();
                if (productBuchi.getAcceptingStatesN().contains(v)){
                    reachable.add(v);
                }
            }else{
                stack.push(fMofSucc);
                visited.add(fMofSucc);
            }

        }

        stack = new Stack<>();
        visited = new HashSet<>();

        /* determine if there exists a  cycle starting from the reachable final nodes */
        while(!reachable.isEmpty()){
            BuchiNode f = reachable.get(0);
            reachable.remove(0);
            stack.push(f);
            while(!stack.isEmpty()){
                BuchiNode v = stack.peek();
                if(v.getAdj().contains(v)){
                    return true;
                }
                boolean allVisited = true;
                BuchiNode firstMember = null;
                for(BuchiNode k : v.getAdj()){
                   if(!visited.contains(k)){
                       allVisited = false;
                       firstMember = k;

                   }
                }
                if(allVisited){
                   stack.pop();
                }else{
                    visited.add(firstMember);
                    stack.push(firstMember);
                }
            }
        }





        return false;
    }
}


