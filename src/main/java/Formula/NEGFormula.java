package Formula;

/**
 * Created by alexander on 17.07.15.
 */
public class NEGFormula implements  LTLFormula {
    private LTLFormula negatedFormula;

    public NEGFormula(LTLFormula u1) {
        negatedFormula = u1;
    }

    public NEGFormula() {

    }

    public LTLFormula getNegatedFormula() {
        return negatedFormula;
    }

    public void setNegatedFormula(LTLFormula negatedFormula) {

        this.negatedFormula = negatedFormula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NEGFormula that = (NEGFormula) o;

        return !(negatedFormula != null ? !negatedFormula.equals(that.negatedFormula) : that.negatedFormula != null);

    }

    @Override
    public int hashCode() {
        return negatedFormula != null ? negatedFormula.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "NEGFormula{" +
                "negatedFormula=" + negatedFormula +
                '}';
    }
}
