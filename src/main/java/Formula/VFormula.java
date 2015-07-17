package Formula;

/**
 * Created by svozil on 15.07.15.
 */
public class VFormula implements LTLFormula {
    private LTLFormula v1;
    private LTLFormula v2;

    public LTLFormula getV1() {
        return v1;
    }

    public void setV1(LTLFormula v1) {
        this.v1 = v1;
    }

    public LTLFormula getV2() {
        return v2;
    }

    public void setV2(LTLFormula v2) {
        this.v2 = v2;
    }

}
