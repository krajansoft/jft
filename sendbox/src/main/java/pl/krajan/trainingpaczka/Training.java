package pl.krajan.trainingpaczka;

import pl.krajan.sendbox.Rectangle;
import pl.krajan.sendbox.Squeare;
import pl.krajan.sendbox.Triangle;

public class Training {

    public static void main(String[] args) {

      hello("User");

      Squeare s = new Squeare(9);

      //Point p = new Point ((12, 0),(1,1))
      //double p1[] = new double[] {7, 0}, p2[] = new double[] {12, 3};

      Rectangle r = new Rectangle(10,2);

      Triangle t = new Triangle(10);

      Hometraining h = new Hometraining(120, 90, 7);

      //System.out.println("Odleglosc miedzy punktem A" + p.p + " i B" + p.k + " = " + p.pole());
        //System.out.println("Odleglosc = " + Math.sqrt(
               // (p2[0] - p1[0])*(p2[0] - p1[0])
                       // + (p2[1] - p1[1])*(p2[1] - p1[1])));
        System.out.println("Pole kwadratu o dlugosci " + s.l + " = " + s.wzorkwadratu());
        System.out.println("Pole ptostokatu o dlugosci " + r.a + " i szerokosci " + r.b +" = " + r.prostokatu());
        System.out.println("HOMEWORK Sum " + h.u + " and " + h.w + " divided " + h.z + " results " + h.resoulthomerork());
        System.out.println("Pierwiastek z liczby " + s.l + " wynosi " + t.pierwiastek(s.l));
        System.out.println("Liczba " + r.a + " podniesione do potegi " + r.b + " jest rowna " + t.potega(r.a, r.b));
        System.out.println("Wysokosc trojkata o podstawie " + t.alpha + " jest rowna " + t.wysokosctrojkata(t));
        System.out.println("Pole trojkata rownobocznego, o boku " + t.alpha + " jest rowne " + t.poletrojkata(t));
    }

    private static void hello(String somebody) {
        System.out.println("Witaj " + somebody + "!");
    }
}