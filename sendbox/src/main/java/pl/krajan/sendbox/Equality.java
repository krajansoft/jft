package pl.krajan.sendbox;

/**
 * Created by kraja on 2017-06-16.
 */
public class Equality {
    public static void main(String[] args){
        String s1 = "firefox";
        String s2 = "fire" + "fox";

        System.out.println(s1 == s2);
        System.out.println(s1.equals (s2));
    }
}
