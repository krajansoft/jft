package pl.krajan.sendbox;

public class Point
{
    public double x, y;

    public Point (double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double odleglosc(Point b) {
        return Math.sqrt(Math.pow((x - b.x),2) + Math.pow((y - b.y),2));
    }
}


/**
 * Created by kraja on 2017-05-29.
public class Point {
    public double p[];
    public double k[];

    public Point(double p[], double k[]) {
        this.p = p;
        this.k = k;
    }

    public double pole(){
        return Math.sqrt(
                (this.k[0] - this.p[0])*(this.k[0] - this.p[0])
                        + (this.k[1] - this.p[1])*(this.k[1] - this.p[1]));
    }
*/

