package BuchiAutomata;

import Formula.LTLFormula;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by svozil on 20.07.15.
 */
public class BuchiNode{
    private static int idcounter = 0;
    int id;
    String name;
    List<LTLFormula> labeling;
    List<BuchiNode> adj;

    public BuchiNode(String name) {
        this.name = name;
        this.id = idcounter++;
        labeling = new ArrayList<>();
    }

    public List<BuchiNode> getAdj() {
        return adj;
    }

    public void addFormula(LTLFormula l) {
        labeling.add(l);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<LTLFormula> getLabeling() {
        return labeling;
    }

    public void setLabeling(List<LTLFormula> labeling) {
        this.labeling = labeling;
    }

    public void setAdj(List<BuchiNode> adj) {
        this.adj = adj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BuchiNode buchiNode = (BuchiNode) o;

        if (name != null ? !name.equals(buchiNode.name) : buchiNode.name != null) return false;
        return true;

    }

}
