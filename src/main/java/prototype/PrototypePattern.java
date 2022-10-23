package prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypePattern {

    public static void main(String[] args) {
        Map<String, AnimalPrototype> animalMap = new HashMap<>();
        animalMap.put("Sheep", new Sheep("Doly", 10.5));
        animalMap.put("Rabbit", new Rabbit("Roger", 1.5));

        Sheep clonedShip = (Sheep) animalMap.get("Sheep").clone();
        clonedShip.say();

        Rabbit clonedRabbit = (Rabbit) animalMap.get("Rabbit").clone();
        clonedRabbit.say();

        System.out.println(animalMap.get("Sheep") == clonedShip);
    }
}
