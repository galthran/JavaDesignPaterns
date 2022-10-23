package builder;

import java.util.List;

public class Car {

    private final List<String> wheels;
    private final String engine;
    private final String gear;
    private final List<String> chairs;
    private final String colour;

    public Car(List<String> wheels, String engine, String gear, List<String> chairs, String colour) {
        this.wheels = wheels;
        this.engine = engine;
        this.gear = gear;
        this.chairs = chairs;
        this.colour = colour;
    }

    public void overview() {
        System.out.println("Car has:"
                + "\nwheels: " + String.join(", ", wheels)
                + "\nengine: " + engine
                + "\n gear: " + gear
                + "\nchairs: " + String.join(", ", chairs)
                + "\ncolour: " + colour);
    }

}
