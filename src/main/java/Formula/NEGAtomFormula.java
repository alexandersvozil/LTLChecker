package Formula;

/**
 * Created by svozil on 15.07.15.
 */
public class NEGAtomFormula implements LiteralFormula {
    private String n;


    public NEGAtomFormula() {

    }


    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    @Override
    public LiteralFormula negate() {
        AtomFormula a = new AtomFormula();
        a.setAtom(n);
        return a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NEGAtomFormula that = (NEGAtomFormula) o;

        return !(n != null ? !n.equals(that.n) : that.n != null);

    }

    @Override
    public int hashCode() {
        return n != null ? n.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "NEGAtomFormula{" +
                "n='" + n + '\'' +
                '}';
    }
}
