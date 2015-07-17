package Formula;

/**
 * Created by svozil on 15.07.15.
 */
public class ANDFormula implements LTLFormula {
    private LTLFormula c1;
    private LTLFormula c2;

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
}

