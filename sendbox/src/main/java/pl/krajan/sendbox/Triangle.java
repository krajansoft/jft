package pl.krajan.sendbox;

/**
 * Created by kraja on 2017-05-28.
 */
public class Triangle {
    public double alpha;

    public Triangle(double alpha){
        this.alpha = alpha;
    }

    public double pierwiastek(double a){
        return Math.sqrt(a);
    }
    public double potegaq(double a, double b){
        return Math.pow(a,b);
    }
    public double poletrojkata(Triangle t){
        return (((potegaq(this.alpha, 2)*pierwiastek(3)))/4);
    }
    public double wysokosctrojkata(Triangle t){
        return ((this.alpha*pierwiastek(3))/2);
    }
}