package Formula;

/**
 * Created by svozil on 15.07.15.
 */
public class ORFormula implements LTLFormula {

    private LTLFormula d1;
    private LTLFormula d2;

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
}
