package builder;

import java.util.ArrayList;

public class BuilderPattern {

    public static void main(String[] args) {
        Car car = new Car(new ArrayList<>(), "engine", "gear", new ArrayList<>(), "red");
        car.overview();

        Car car1 = new CarBuilder().construct().addEngine("1.6 TDI").addGear("manual").build();
        car1.overview();
    }
}
