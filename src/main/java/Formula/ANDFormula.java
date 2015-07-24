package Formula;

/**
 * Created by svozil on 15.07.15.
 */
public class ANDFormula implements LTLFormula {
    private LTLFormula c1;
    private LTLFormula c2;

    public ANDFormula(LTLFormula nnf, LTLFormula nnf1) {
        setC1(nnf);
        setC2(nnf1);
    }

    public ANDFormula() {

    }

    public LTLFormula getC1() {
        return c1;
    }

    public void setC1(LTLFormula c1) {
        this.c1 = c1;
    }

    public LTLFormula getC2() {
        return c2;
    }

    public void setC2(LTLFormula c2) {
        this.c2 = c2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ANDFormula that = (ANDFormula) o;

        if (c1 != null ? !c1.equals(that.c1) : that.c1 != null) return false;
        return !(c2 != null ? !c2.equals(that.c2) : that.c2 != null);

    }

    @Override
    public int hashCode() {
        int result = c1 != null ? c1.hashCode() : 0;
        result = 31 * result + (c2 != null ? c2.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ANDFormula{" +
                "c1=" + c1 +
                ", c2=" + c2 +
                '}';
    }
}

