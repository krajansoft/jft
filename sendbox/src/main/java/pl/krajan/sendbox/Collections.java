package pl.krajan.sendbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by kraja on 2017-06-20.
 */
public class Collections {
    public static void main (String[] args){
        String[] langs = {"Java", "C#", "Python", "PHP"};

        List<String> languages = Arrays.asList("Java 8", "C#", "Python 3", "PHP 8");


        for (String l : languages) {
            System.out.println("Chce nauczyc sie " + l);
        }
    }

}
