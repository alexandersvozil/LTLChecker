package Formula;

/**
 * Created by svozil on 15.07.15.
 */
public class UFormula implements LTLFormula, BinopWAnd {
    private LTLFormula u1;
    private LTLFormula u2;

    public UFormula(LTLFormula nnf, LTLFormula formula) {
        setU1(nnf);
        setU2(formula);
    }

    public UFormula() {

    }

    public LTLFormula getU1() {
        return u1;
    }

    public void setU1(LTLFormula u1) {
        this.u1 = u1;
    }

    public LTLFormula getU2() {
        return u2;
    }

    public void setU2(LTLFormula u2) {

        this.u2 = u2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UFormula uFormula = (UFormula) o;

        if (u1 != null ? !u1.equals(uFormula.u1) : uFormula.u1 != null) return false;
        return !(u2 != null ? !u2.equals(uFormula.u2) : uFormula.u2 != null);

    }

    @Override
    public int hashCode() {
        int result = u1 != null ? u1.hashCode() : 0;
        result = 31 * result + (u2 != null ? u2.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "UFormula{" +
                "u1=" + u1 +
                ", u2=" + u2 +
                '}';
    }
}
