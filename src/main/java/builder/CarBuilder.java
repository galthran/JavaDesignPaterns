package builder;

import java.util.ArrayList;
import java.util.List;

public class CarBuilder {

    private final List<String> wheels = new ArrayList<>();
    private String engine;
    private String gear;
    private final List<String> chairs = new ArrayList<>();
    private String colour;

    CarBuilder construct() {
        return new CarBuilder();
    }

    CarBuilder addWheel(String wheel) {
        wheels.add(wheel);
        return this;
    }

    CarBuilder addEngine(String engine) {
        this.engine = engine;
        return this;
    }

    CarBuilder addGear(String gear) {
        this.gear = gear;
        return this;
    }

    CarBuilder addChair(String chair) {
        chairs.add(chair);
        return this;
    }

    CarBuilder addColour(String colour) {
        this.colour = colour;
        return this;
    }

    Car build() {
        return new Car(wheels, engine, gear, chairs, colour);
    }
}
