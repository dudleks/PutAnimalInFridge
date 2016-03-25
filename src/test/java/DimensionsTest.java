import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Alexey on 01.03.2016.
 */
public class DimensionsTest {

    @Test
    public void  comparisonOfNumbers() {
        Dimensions dimensions = new Dimensions(10, 10, 10);
        Assert.assertEquals(10.0, dimensions.getHeight(), "Values are not equal.");
        Assert.assertEquals(10.0, dimensions.getLength(), "Values are not equal.");
        Assert.assertEquals(10.0, dimensions.getWidth(), "Values are not equal.");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
     public void negativeHeight() {
        new Dimensions(-10, 10, 10);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void negativeWidth() {
        new Dimensions(10, -10, 10);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void negativeLength() {
        new Dimensions(10, 10, -10);
    }
}
