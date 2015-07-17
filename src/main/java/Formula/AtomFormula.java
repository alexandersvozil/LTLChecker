package Formula;

/**
 * Created by alexander on 16.07.15.
 */
public class AtomFormula implements LiteralFormula {
    private String atom;

    public void setAtom(String atom) {
        this.atom = atom;
    }

    public String getAtom() {
        return atom;
    }

    @Override
    //TODO implement negate ;)
    public LiteralFormula negate() {
        return null;
    }
}
