package factory;

public class Track implements CargoTransport {

    @Override
    public void process() {
        System.out.println("3 days");
    }
}
