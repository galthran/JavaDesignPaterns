package factory;

public class Plane implements CargoTransport {

    @Override
    public void process() {
        System.out.println("1 day");
    }
}
