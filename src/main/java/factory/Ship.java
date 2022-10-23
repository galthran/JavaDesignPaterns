package factory;

public class Ship implements CargoTransport {

    @Override
    public void process() {
        System.out.println("7 days");
    }
}
