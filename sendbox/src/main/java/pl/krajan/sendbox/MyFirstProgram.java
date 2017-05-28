package pl.krajan.sendbox;

import com.sun.org.apache.xpath.internal.SourceTree;

public class MyFirstProgram {

    public static void main(String[] args) {

      hello("Adam");
      hello("User");
      hello("Testy");

      double len = 9;
      double second = 3;
      double third = 7;
        System.out.println("Pole kwadratu o dlugosci " + len + " = " + wzorkwadratu(len));
        System.out.println("Pole ptostokatu o dlugosci " + len + " i szerokosci " + second +" = " + prostokatu(len, second));
        System.out.println("Pierwiastek z liczby " + len + " wynosi " + pierwiastek(len));
        System.out.println("Liczba " + len + " podniesione do potegi " + third + " jest rowna " + potega(len, third));
        System.out.println("Wysokosc trojkata o podstawie " + len + " jest rowna " + wysokosctrojkata(len));
        System.out.println("Pole trojkata rownobocznego, o boku " + len + " jest rowne " + poletrojkata(len));
    }

    private static void hello(String somebody) {
        System.out.println("Witaj " + somebody + "!");
    }
    public static double wzorkwadratu(double a){
        return a*a;
    }
    public static double prostokatu(double a, double b){
        return a*b;
    }
    public static double pierwiastek(double a){
        return Math.sqrt(a);
    }
    public static double potega(double a, double b){
        return Math.pow(a,b);
    }
    public static double wysokosctrojkata(double a){
        return ((a*pierwiastek(3))/2);
    }
    public static double poletrojkata(double a){
        return (((potega(a, 2)*pierwiastek(3)))/4);
    }
}