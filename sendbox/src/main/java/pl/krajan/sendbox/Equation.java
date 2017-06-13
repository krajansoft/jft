package pl.krajan.sendbox;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by kraja on 2017-06-13.
 */
public class Equation {
    private double a;
    private double b;
    private double c;

    private int n;

    public Equation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

        double d = b * b - 4 * a * c;

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    n = -1;
                } else {
                    n = 0;
                }
            }

            else {
                    n = 1;
                }
            } else

            {
                if (d > 0) {
                    n = 2;
                } else if (d == 0) {
                    n = 1;
                } else {
                    n = 0;
                }


            }

        }


    public int rootNumber() {
        return n;
    }
}
