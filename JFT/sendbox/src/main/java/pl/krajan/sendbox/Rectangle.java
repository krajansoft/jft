package pl.krajan.sendbox;

/**
 * Created by kraja on 2017-05-28.
 */
public class Rectangle {
    public double a;
    public double b;

    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double prostokatu(){
        return this.a * this.b;
    }
}
