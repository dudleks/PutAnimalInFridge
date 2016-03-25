import java.util.ArrayList;
import java.util.List;

/**
 * Created by adudarev on 25.03.2016.
 */
public class SingleCheckroom implements  Refrigerator{

    private boolean opened = false;
    private Subject subject;
    List checkRoomList;

    private Dimensions maxDimensions;

    public SingleCheckroom(Dimensions maxDimensions) {
        this.maxDimensions = maxDimensions;
       this.checkRoomList = checkRoomList;
    }

    public void put(Subject subject) {
        checkRoomList = new ArrayList ();

        //ensureOpened();
      /*  if (!isEmpty()) {
            throw new IllegalArgumentException("Refrigerator is not empty");
        }*/
        Preconditions.checkDimensions(subject.getDimensions(), maxDimensions);
        this.subject = subject;
        checkRoomList.add(subject);
        //System.out.println("Put subject " + subject);
        System.out.println("list: " + checkRoomList);

    }


    public Subject get() {
        return null;
    }

    public boolean isEmpty() {
        return null == subject;
    }

    public void openDoor() {

    }

    public void closeDoor() {

    }

    public boolean isOpened() {
        return false;
    }

    private void ensureOpened() {
        if (!opened) {
            throw new IllegalArgumentException("Door closed");
        }
    }
}
