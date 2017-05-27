package pl.krajan.sendbox;

public class MyFirstProgram {

    public static void main(String[] args) {

      hello("Adam");
      hello("User");
      hello("Testy");

      double len = 2;
      double second = 3;
      double third = 7;
        System.out.println("Pole kwadratu o dlugosci " + len + " = " + wzorkwadratu(len));
        System.out.println("Pole ptostokatu o dlugosci " + len + " i szerokosci " + second +" = " + prostokatu(len, second));
        System.out.println("Pierwiastek z liczby " + len + " wynosi " + pierwiastek(len));
        System.out.println("Liczba " + len + " podniesione do potegi " + third + " jest rowna " + potega(len, third));
    }

    private static void hello(String somebody) {
        System.out.println("Witaj " + somebody + "!");
    }
    public static double wzorkwadratu(double l){
        return l*l;
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
    public static double trojkata(double a, double b){
        return a*b;
    }
}