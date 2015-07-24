package Formula;

/**
 * Created by svozil on 15.07.15.
 */
public class ORFormula implements LTLFormula, BinopWAnd {

    private LTLFormula d1;
    private LTLFormula d2;

    public ORFormula(LTLFormula nnf, LTLFormula nnf1) {
        setD1(nnf);
        setD2(nnf1);
    }

    public ORFormula()  {

    }

    public LTLFormula getD1() {
        return d1;
    }

    public void setD1(LTLFormula d1) {
        this.d1 = d1;
    }

    public LTLFormula getD2() {
        return d2;
    }

    public void setD2(LTLFormula d2) {

        this.d2 = d2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ORFormula orFormula = (ORFormula) o;

        if (d1 != null ? !d1.equals(orFormula.d1) : orFormula.d1 != null) return false;
        return !(d2 != null ? !d2.equals(orFormula.d2) : orFormula.d2 != null);

    }

    @Override
    public int hashCode() {
        int result = d1 != null ? d1.hashCode() : 0;
        result = 31 * result + (d2 != null ? d2.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ORFormula{" +
                "d1=" + d1 +
                ", d2=" + d2 +
                '}';
    }
}
