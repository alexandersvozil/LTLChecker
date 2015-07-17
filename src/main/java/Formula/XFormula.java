package Formula;

/**
 * Created by svozil on 15.07.15.
 */
public class XFormula implements   LTLFormula{

    private LTLFormula x;

    public LTLFormula getX() {
        return x;
    }

    public void setX(LTLFormula x) {
        this.x = x;
    }
}
