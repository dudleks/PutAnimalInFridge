/**
 * Created by Alexey on 08.02.2016.
 */
public interface Refrigerator {

    void put(Subject subject);
    Subject get();

    boolean isEmpty();

    void openDoor();
    void closeDoor();
    boolean isOpened();
}
