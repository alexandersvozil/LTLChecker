package Formula;

/**
 * Created by svozil on 15.07.15.
 */
public class XFormula implements   LTLFormula{

    private LTLFormula x;

    public XFormula(LTLFormula nnf) {
        setX(nnf);
    }

    public XFormula() {

    }

    public LTLFormula getX() {
        return x;
    }

    public void setX(LTLFormula x) {
        this.x = x;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        XFormula xFormula = (XFormula) o;

        return !(x != null ? !x.equals(xFormula.x) : xFormula.x != null);

    }

    @Override
    public int hashCode() {
        return x != null ? x.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "XFormula{" +
                "x=" + x +
                '}';
    }
}
