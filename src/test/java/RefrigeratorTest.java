import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Alexey on 01.03.2016.
 */
public class RefrigeratorTest {

    @Test
    public void checkCloseDoor() {
        Refrigerator refrigerator = new SingleRefrigerator(new Dimensions(10, 10, 10));
        Assert.assertFalse(refrigerator.isOpened(),"The door is already opened.");
    }

    @Test
    public void checkOpenDoor() {
        Refrigerator refrigerator = new SingleRefrigerator(new Dimensions(10, 10, 10));
        refrigerator.openDoor();
        Assert.assertTrue(refrigerator.isOpened(),"The door is already closed.");
    }
    @Test
    public void checkRefrigeratorIsEmpty() {
        Refrigerator refrigerator = new SingleRefrigerator(new Dimensions(10, 10, 10));
        Assert.assertTrue(refrigerator.isEmpty(),"The refrigerator is not empty.");
    }

    @Test
    public void checkRefrigeratorIsNotEmpty() {
        Refrigerator refrigerator = new SingleRefrigerator(new Dimensions(10, 10, 10));
        Animal elephant = new Elephant("Elly", 1500, new Dimensions(10, 3, 10));
        refrigerator.openDoor();
        refrigerator.put(elephant);
        Assert.assertFalse(refrigerator.isEmpty(), "The refrigerator is empty.");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void negativeCloseDoor() {
        Refrigerator refrigerator = new SingleRefrigerator(new Dimensions(10, 10, 10));
        refrigerator.closeDoor();
    }
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void negativeOpenDoor() {
        Refrigerator refrigerator = new SingleRefrigerator(new Dimensions(10, 10, 10));
        refrigerator.openDoor();
        refrigerator.openDoor();
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void negativePutSubject() {
        Refrigerator refrigerator = new SingleRefrigerator(new Dimensions(10, 10, 10));
        Animal elephant = new Elephant("Elly", 1500, new Dimensions(10, 3, 10));
        Animal crocodile = new Crocodile("Croco", 500, new Dimensions(2, 1, 10));
        refrigerator.openDoor();
        refrigerator.put(elephant);
        refrigerator.put(crocodile);
    }

}
