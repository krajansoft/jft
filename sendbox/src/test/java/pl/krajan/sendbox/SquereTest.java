package pl.krajan.sendbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by kraja on 2017-05-29.
 */
public class SquereTest {
    @Test
    public void testPolaKwadratu(){
        Squeare s = new Squeare(5);
        Assert.assertEquals(s.wzorkwadratu(), 25.0);
    }

}
