package Formula;

/**
 * Created by svozil on 15.07.15.
 */
public class NEGFormula implements LiteralFormula {
    private String n;

    public NEGFormula(AtomFormula l) {
        setN(l.getAtom());
    }


    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    @Override
    public LiteralFormula negate() {
        return null;
    }
}
