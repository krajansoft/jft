package pl.krajan.sendbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by kraja on 2017-05-29.
 */
public class RectangleTest {

    @Test
    public void testPolaProstokata(){
        Rectangle r = new Rectangle(3, 4);
        Assert.assertEquals(r.prostokatu(), 12.0);
    }
}
