package pl.krajan.sendbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by kraja on 2017-05-29.
 */
public class TriangleTests {
    @Test
    public void testPoleTrojkata(){
       Triangle t = new Triangle(10);
        Assert.assertEquals(t.poletrojkata(t), 43.30127018922193);

    }

    @Test
        public void testWysokoscTrojkata(){
            Triangle t = new Triangle(10);
            Assert.assertEquals(t.wysokosctrojkata(t), 8.660254037844386);

    }
}
