package pl.krajan.sendbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by kraja on 2017-05-29.
 */
public class PointTest {
    @Test
    public void testPointResoult(){
        Point p = new Point(new double[]{0,0}, new double[]{0,0});
        Assert.assertEquals(p.pole(), 0.0);

    }
    @Test
    public void testPointResoult2(){
        Point p = new Point(new double[]{0,1}, new double[]{1,0});
        Assert.assertEquals(p.pole(), 1.4142135623730951);

    }
    @Test
    public void testPointResoult3(){
        Point p = new Point(new double[]{-1,0}, new double[]{1,0});
        Assert.assertEquals(p.pole(), 2.0);

    }
    @Test
    public void testPointResoult4(){
        Point p = new Point(new double[]{-1,0}, new double[]{0,-1});
        Assert.assertEquals(p.pole(), 1.4142135623730951);

    }
    @Test
    public void testPointResoult5(){
        Point p = new Point(new double[]{-1,1}, new double[]{1,-1});
        Assert.assertEquals(p.pole(), 2.8284271247461903);

    }


    }

