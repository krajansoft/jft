package pl.krajan.sendbox;

import com.sun.org.apache.xpath.internal.SourceTree;

public class MyFirstProgram {

    public static void main(String[] args) {

      hello("Adam");
      hello("User");
      hello("Testy");

      Squeare s = new Squeare(9);

      Rectangle r = new Rectangle(10,2);

      Triangle t = new Triangle(10);

      Homework h = new Homework(120, 90, 7);

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