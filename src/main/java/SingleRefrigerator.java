/**
 * Created by Alexey on 08.02.2016.
 */
public class SingleRefrigerator implements Refrigerator {

    private boolean opened = false;
    private Subject subject;

    private Dimensions maxDimensions;

    public SingleRefrigerator(Dimensions maxDimensions) {
        this.maxDimensions = maxDimensions;
    }

    public void put(Subject subject) {
        ensureOpened();
        if (!isEmpty()) {
            throw new IllegalArgumentException("Refrigerator is not empty");
        }
        Preconditions.checkDimensions(subject.getDimensions(), maxDimensions);
        this.subject = subject;
        System.out.println("Put subject " + subject);
    }

    public Subject get() {
        ensureOpened();
        Subject subject = this.subject;
        this.subject = null;
        System.out.println("Got subject " + subject);
        return subject;
    }

    public boolean isEmpty() {
        return null == subject;
    }

    public void openDoor() {
        if (opened) {
            throw new IllegalArgumentException("Door already opened");
        }
        this.opened = true;
        System.out.println("Door opened");
    }

    public void closeDoor() {
        if (!opened) {
            throw new IllegalArgumentException("Door already closed");
        }
        this.opened = false;
        System.out.println("Door closed");
    }

    public boolean isOpened() {
        return opened;
    }

    private void ensureOpened() {
        if (!opened) {
            throw new IllegalArgumentException("Door closed");
        }
    }
}
