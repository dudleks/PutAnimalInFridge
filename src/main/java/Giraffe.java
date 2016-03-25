/**
 * Created by Alexey on 21.12.2015.
 */
public class Giraffe implements Animal {

    private String name;
    private double mass;
    private Dimensions dimensions;

    public Giraffe(String name, double mass, Dimensions dimensions) {
        Preconditions.checkPositive("mass", mass);
        this.name = name;
        this.mass = mass;
        this.dimensions = dimensions;
    }

    public String getName() {
        return name;
    }

    public double getMass() {
        return mass;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
