/**
 * Created by Alexey on 08.02.2016.
 */
public class Dimensions {

    private double height;
    private double width;
    private double length;

    public Dimensions(double height, double width, double length) {
        Preconditions.checkPositive("height", height);
        Preconditions.checkPositive("width", width);
        Preconditions.checkPositive("length", length);
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
}
