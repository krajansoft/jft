package pl.krajan.sendbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by kraja on 2017-06-13.
 */
public class EquationTests {
    @Test
    public void test0(){
        Equation e = new Equation(1, 1, 1);
        Assert.assertEquals(e.rootNumber(), 0);
    }

    @Test
    public void test1(){
        Equation e = new Equation(1, 2, 1);
        Assert.assertEquals(e.rootNumber(), 1);
    }
    @Test
    public void test2(){
        Equation e = new Equation(1, 5, 6);
        Assert.assertEquals(e.rootNumber(), 2);
    }
}
