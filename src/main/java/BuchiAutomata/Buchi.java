package BuchiAutomata;

import com.sun.xml.internal.bind.v2.runtime.IllegalAnnotationException;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * Created by svozil on 20.07.15.
 */
public class Buchi {
    private BuchiNode initialState;
    private List<BuchiNode> acceptingStatesN;

    public List<List<BuchiNode>> getAcceptingStates() {
        return acceptingStates;
    }

    public void setAcceptingStates(List<List<BuchiNode>> acceptingStates) {
        this.acceptingStates = acceptingStates;
    }

    //the accepting state sets ( we have an LGBA)
    private List<List<BuchiNode>> acceptingStates;

    //the list of starting states
    private List<BuchiNode> initialStates;

    public BuchiNode[] getAdjList() {
        return adjList;
    }

    public void setAdjList(BuchiNode[] adjList) {
        this.adjList = adjList;
    }

    //the adjacency list of the vertices
    private BuchiNode [] adjList;

    //capacity of the adjList;
    private int capacity;

    //current nr of vertices
    private int nrVertices;
    public Buchi(int capacity){
        adjList = new BuchiNode[capacity];
        nrVertices = 0;
        this.capacity = capacity;
    }
    public BuchiNode getNode(String name){
        for(BuchiNode n : adjList){
           if (n.getName().equals(name)){
               return n;
           }
        }
        throw new IllegalArgumentException();
    }
    public void addNode(BuchiNode n){
        if(capacity > nrVertices){
            adjList[nrVertices] = n;
        }else{
            capacity=2*capacity;
            BuchiNode [] adjList2 = new BuchiNode[capacity];
            for(int i = 0; i < capacity/2; i++){
               adjList2[i] = adjList[i];
            }
            adjList = adjList2;
            adjList[nrVertices] = n;
        }
        nrVertices++;
    }

    public List<BuchiNode> getInitialStates() {
        return initialStates;
    }

    public void setInitialStates(List<BuchiNode> initialStates) {
        this.initialStates = initialStates;
        BuchiNode initialState = new BuchiNode("Init");
        initialState.setAdj(initialStates);
        addNode(initialState);
        this.initialState = initialState;
    }

    public int getSize() {
        return nrVertices;
    }

    public BuchiNode getInitialState() {
        return initialState;
    }

    public void setInitialState(BuchiNode initialState) {
        this.initialState = initialState;
    }

    public List<BuchiNode> getAcceptingStatesN() {
        return acceptingStatesN;
    }

    public void setAcceptingStatesN(List<BuchiNode> acceptingStatesN) {
        this.acceptingStatesN = acceptingStatesN;
    }
}

