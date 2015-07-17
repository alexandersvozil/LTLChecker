package Formula;

/**
 * Created by svozil on 15.07.15.
 */
public class UFormula implements LTLFormula {
    private LTLFormula u1;
    private LTLFormula u2;

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
}
