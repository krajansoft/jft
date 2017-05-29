package pl.krajan.sendbox;

/**
 * Created by kraja on 2017-05-28.
 */
public class Hometraining {
    public double u; //pierwsza liczba
    public double w; //druga liczba
    public double z; //trzecia liczba

    public Hometraining(double u, double w, double z) {

        this.u = u;
        this.w = w;
        this.z = z;
    }
    public double resoulthomerork(){
        return (this.u + this.w)/this.z;
    }
}


