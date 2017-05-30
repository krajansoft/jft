package pl.krajan.sendbox;

public class MyHomework {

    public static void main(String[] args) {

      hello("User");

      Squeare s = new Squeare(9);

      Rectangle r = new Rectangle(10,2);

      Point p = new Point(new double[]{3,2}, new double[]{2,2});

        System.out.println("Punkty " + p.p[0] + " " +  p.p[1] + " i " + p.k[0] +" " + p.k[1] + " = " + p.pole());
        System.out.println("Pole kwadratu o dlugosci " + s.l + " = " + s.wzorkwadratu());
        System.out.println("Pole ptostokatu o dlugosci " + r.a + " i szerokosci " + r.b +" = " + r.prostokatu());
    }

    private static void hello(String somebody) {
        System.out.println("Witaj " + somebody + "!");
    }
}