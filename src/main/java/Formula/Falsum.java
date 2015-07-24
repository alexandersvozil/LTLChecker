package Formula;

/**
 * Created by alexander on 16.07.15.
 */
public class Falsum implements LiteralFormula {
    @Override
    public LiteralFormula negate() {
        return new Verum();
    }
    @Override
   public boolean equals(Object o){
       if(o instanceof Falsum) return  true;
       else  return false;
    }

    @Override
    public String toString() {
        return "Falsum";
    }

}
