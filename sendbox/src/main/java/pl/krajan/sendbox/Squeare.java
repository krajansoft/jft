package pl.krajan.sendbox;

/**
 * Created by kraja on 2017-05-28.
 */
public class Squeare {
    public double l;  //opis atrubutu obiektu tego typu

    public Squeare(double l){

        this.l = l;
    }  // konstruktor przez ktory wiemy co przekazujemy do głównego wywołania

    public double wzorkwadratu(){
        return this.l * this.l;
    }
}
