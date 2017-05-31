package pl.krajan.sendbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by kraja on 2017-05-29.
 */
public class PointTest {
    @Test
    public void testPointResoult1(){
        Point x = new Point(1, 1);
        Point y = new Point(2, 2);
        Assert.assertEquals(x.odleglosc(y), 1.4142135623730951);

    }
    @Test
    public void testPointResoult2(){
        Point x = new Point(0, 0);
        Point y = new Point(0, 0);
        Assert.assertEquals(x.odleglosc(y), 0.0);

    }
    @Test
    public void testPointResoult3(){
        Point x = new Point(1, 0);
        Point y = new Point(0, 0);
        Assert.assertEquals(x.odleglosc(y), 1.0);

    }
    @Test
    public void testPointResoult4(){
        Point x = new Point(0, 1);
        Point y = new Point(0, 0);
        Assert.assertEquals(x.odleglosc(y), 1.0);

    }
    @Test
    public void testPointResoult5(){
        Point x = new Point(0, 0);
        Point y = new Point(1, 0);
        Assert.assertEquals(x.odleglosc(y), 1.0);

    }
    @Test
    public void testPointResoult6(){
        Point x = new Point(0, 0);
        Point y = new Point(0, 1);
        Assert.assertEquals(x.odleglosc(y), 1.0);

    }
    @Test
    public void testPointResoult7(){
        Point x = new Point(-1, 0);
        Point y = new Point(0, 0);
        Assert.assertEquals(x.odleglosc(y), 1.0);

    }
    @Test
    public void testPointResoult8(){
        Point x = new Point(0, -1);
        Point y = new Point(0, 0);
        Assert.assertEquals(x.odleglosc(y), 1.0);

    }
    @Test
    public void testPointResoult9(){
        Point x = new Point(0, 0);
        Point y = new Point(-1, 0);
        Assert.assertEquals(x.odleglosc(y), 1.0);

    }
    @Test
    public void testPointResoult10(){
        Point x = new Point(1, 0);
        Point y = new Point(0, -1);
        Assert.assertEquals(x.odleglosc(y), 1.4142135623730951);

    }


    }

