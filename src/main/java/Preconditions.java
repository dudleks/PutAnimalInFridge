/**
 * Created by Alexey on 08.02.2016.
 */
public class Preconditions {

    public static void checkPositive(String parameter, Double value) {
        if ( null == value) {
            throw new NullPointerException("Parameter " + parameter + " can't be null");
        }
        if (value <= 0) {
            throw new IllegalArgumentException("Parameter " + parameter + " must be positive");
        }
    }

    public static void checkDimensions(Dimensions dimensions, Dimensions maxDimensions) {
        if (dimensions.getHeight() > maxDimensions.getHeight()) {
            throw new IllegalArgumentException("Subject too high");
        }
        if (dimensions.getWidth() > maxDimensions.getWidth()) {
            throw new IllegalArgumentException("Subject too fat");
        }
        if (dimensions.getLength() > maxDimensions.getLength()) {
            throw new IllegalArgumentException("Subject too long");
        }
    }
}
