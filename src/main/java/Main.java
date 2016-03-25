/**
 * Created by Alexey on 21.12.2015.
 */

public class Main {
    public static void main(String[] args)
    {
        Animal elephant = new Elephant("Elly", 1500, new Dimensions(15, 3, 15));
        Animal crocodile = new Crocodile("Croco", 500, new Dimensions(2, 1, 10));
        Animal giraffe = new Giraffe("Graphee", 1000, new Dimensions(15, 3, 13));

        Refrigerator refrigerator = new SingleRefrigerator(new Dimensions(15, 3, 15));
        Refrigerator checkroom = new SingleCheckroom(new Dimensions(15, 3, 15));

        checkroom.put(elephant);
        checkroom.put(crocodile);
        checkroom.put(giraffe);

        // mini elephant
       /* refrigerator.openDoor();
        refrigerator.put(elephant);
        refrigerator.closeDoor();
        refrigerator.openDoor();
        refrigerator.get();
        refrigerator.closeDoor();
            // crocodile
        refrigerator.openDoor();
        refrigerator.put(crocodile);
        refrigerator.closeDoor();
        refrigerator.openDoor();
        refrigerator.get();
        refrigerator.closeDoor();

        // giraffe
        refrigerator.openDoor();
        refrigerator.put(giraffe);
        refrigerator.closeDoor();
        refrigerator.openDoor();
        refrigerator.get();
        refrigerator.closeDoor();

        // fat elephant
        Animal fat = new Elephant("Elly", 1500, new Dimensions(1500, 3, 15));
        refrigerator.openDoor();
        refrigerator.put(fat);*/
    }
}