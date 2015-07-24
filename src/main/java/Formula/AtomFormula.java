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
        NEGAtomFormula a = new NEGAtomFormula();
        a.setN(getAtom());
        return a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AtomFormula formula = (AtomFormula) o;

        return atom.equals(formula.atom);

    }

    @Override
    public int hashCode() {

        return atom.hashCode();
    }

    @Override
    public String toString() {
        return "AtomFormula{" +
                "atom='" + atom + '\'' +
                '}';
    }
}
