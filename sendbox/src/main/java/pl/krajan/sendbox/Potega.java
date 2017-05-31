package pl.krajan.sendbox;

/**
 * Created by kraja on 2017-05-31.
 */
public class Potega {
    public double a;
    public double b;

    public Potega(double a, double b){

        this.a = a;
        this.b = b;
    }


    public double potega(double a, double b){
        return Math.pow(a,b);
    }
}
