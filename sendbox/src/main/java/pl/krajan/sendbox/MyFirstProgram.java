package pl.krajan.sendbox;

import com.sun.org.apache.xpath.internal.SourceTree;

public class MyFirstProgram {

    public static void main(String[] args) {

      hello("Adam");
      hello("User");
      hello("Testy");

      Squeare s = new Squeare();
      s.l = 9;

      Rectangle r = new Rectangle();
      r.a = 10;
      r.b = 2;

      Triangle t = new Triangle();
      t.alpha = 10;

      double len = 9;
        System.out.println("Pole kwadratu o dlugosci " + s.l + " = " + wzorkwadratu(s));
        System.out.println("Pole ptostokatu o dlugosci " + r.a + " i szerokosci " + r.b +" = " + prostokatu(r));
        System.out.println("Pierwiastek z liczby " + s.l + " wynosi " + pierwiastek(s.l));
        System.out.println("Liczba " + r.a + " podniesione do potegi " + r.b + " jest rowna " + potega(r.a, r.b));
        System.out.println("Wysokosc trojkata o podstawie " + t.alpha + " jest rowna " + wysokosctrojkata(t));
        System.out.println("Pole trojkata rownobocznego, o boku " + t.alpha+ " jest rowne " + poletrojkata(t));
    }

    private static void hello(String somebody) {
        System.out.println("Witaj " + somebody + "!");
    }
    public static double wzorkwadratu(Squeare s){
        return s.l * s.l;
    }
    public static double prostokatu(Rectangle r){
        return r.a * r.b;
    }
    public static double pierwiastek(double a){
        return Math.sqrt(a);
    }
    public static double potega(double a, double b){
        return Math.pow(a,b);
    }
    public static double wysokosctrojkata(Triangle t){
        return ((t.alpha*pierwiastek(3))/2);
    }
    public static double poletrojkata(Triangle t){
        return (((potega(t.alpha, 2)*pierwiastek(3)))/4);
    }
}