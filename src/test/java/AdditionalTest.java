import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Alexey on 03.03.2016.
 */
public class AdditionalTest {

    Refrigerator refrigerator = new SingleRefrigerator(new Dimensions(10, 10, 10));

    @BeforeMethod(alwaysRun = true)
    public void openDoor() {
        refrigerator.openDoor();
    }

    @Test
    public void checkRefrigeratorIsNotEmpty() {
        Animal elephant = new Elephant("Elly", 1500, new Dimensions(10, 3, 10));
        refrigerator.put(elephant);
        Assert.assertFalse(refrigerator.isEmpty(), "The refrigerator is empty.");
    }

    @AfterMethod
    public void closeDoor() {
        refrigerator.closeDoor();
    }
}
