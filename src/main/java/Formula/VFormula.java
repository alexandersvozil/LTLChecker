package Formula;

/**
 * Created by svozil on 15.07.15.
 */
public class VFormula implements LTLFormula, BinopWAnd {
    private LTLFormula v1;
    private LTLFormula v2;

    public VFormula(LTLFormula nnf, LTLFormula nnf1) {
        setV1(nnf);
        setV2(nnf1);
    }

    public VFormula() {

    }

    public LTLFormula getV1() {
        return v1;
    }

    public void setV1(LTLFormula v1) {
        this.v1 = v1;
    }

    public LTLFormula getV2() {
        return v2;
    }

    public void setV2(LTLFormula v2) {

        this.v2 = v2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VFormula vFormula = (VFormula) o;

        if (v1 != null ? !v1.equals(vFormula.v1) : vFormula.v1 != null) return false;
        return !(v2 != null ? !v2.equals(vFormula.v2) : vFormula.v2 != null);

    }

    @Override
    public int hashCode() {
        int result = v1 != null ? v1.hashCode() : 0;
        result = 31 * result + (v2 != null ? v2.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "VFormula{" +
                "v1=" + v1 +
                ", v2=" + v2 +
                '}';
    }
}
