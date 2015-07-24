package Formula;

/**
 * Created by alexander on 16.07.15.
 */
public class Verum implements LiteralFormula {
    @Override
    public LiteralFormula negate() {
        return new Falsum();
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Verum ) return true;
        else return false;
    }

    @Override
    public String toString() {
        return "Verum";
    }
}
