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

        BuildingType houseBuildingType = new BuildingType("House");
        BuildingType skyscraperBuildingType = new BuildingType("Skyscraper");

        Building house1 = new Building(20, houseBuildingType);
        /*Building house2 = new Building(20, houseBuildingType);
        Building house3 = new Building(20, houseBuildingType);
        Building house4 = new Building(20, houseBuildingType);
        Building house5 = new Building(20, houseBuildingType);*/

        Building house2 = house1.clone();
        Building house3 = house1.clone();
        Building house4 = house1.clone();
        Building house5 = house1.clone();
        houseBuildingType.setType("House with yard");

        Building skyscraper1 = new Building(110, skyscraperBuildingType);
        /*Building skyscraper2 = new Building(110, skyscraperBuildingType);
        Building skyscraper3 = new Building(110, skyscraperBuildingType);
        Building skyscraper4 = new Building(110, skyscraperBuildingType);
        Building skyscraper5 = new Building(110, skyscraperBuildingType);*/

        Building skyscraper2 = skyscraper1.clone();

        System.out.println("house1: " + house1);
        System.out.println("house2: " + house2);
        System.out.println("house3: " + house3);
        System.out.println("house4: " + house4);
        System.out.println("house5: " + house5);

    }
}
