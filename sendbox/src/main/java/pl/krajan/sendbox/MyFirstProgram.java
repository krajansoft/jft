package pl.krajan.sendbox;

public class MyFirstProgram {

    public static void main(String[] args) {

      hello("User");

      Squeare s = new Squeare(9);

      Rectangle r = new Rectangle(10,2);

        System.out.println("Pole kwadratu o dlugosci " + s.l + " = " + s.wzorkwadratu());
        System.out.println("Pole ptostokatu o dlugosci " + r.a + " i szerokosci " + r.b +" = " + r.prostokatu());
    }

    private static void hello(String somebody) {
        System.out.println("Witaj " + somebody + "!");
    }
}