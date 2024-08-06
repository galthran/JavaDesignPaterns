package builder;

import java.util.ArrayList;

public class BuilderPattern {

    public static void main(String[] args) {
        Car car = new Car(new ArrayList<>(), "engine", "gear", new ArrayList<>(), "red");
        car.overview();

        Car car1 = new CarBuilder().addEngine("1.6 TDI").addGear("manual").build();
        car1.overview();

        StoreItem storeItem = new StoreItem.StoreItemBuilder("AAAA", 12.5d)
                .shortDescription("short desc")
                .longDescription("long desc")
                .stockAvailable(345)
                .build();

        System.out.println(storeItem.toString());
    }
}
