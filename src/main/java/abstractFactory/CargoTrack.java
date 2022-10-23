package abstractFactory;

public class CargoTrack implements Transport {

    @Override
    public void process() {
        System.out.println("3 days");
    }
}
