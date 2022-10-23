package factory;

public class TransportFactory {

    private final static String TRACK = "track";

    private final static String PLANE = "plane";

    private final static String SHIP = "ship";

    public static CargoTransport getTransport(String transportName) {

        CargoTransport cargoTransport = null;

        switch (transportName) {
            case TRACK:
                return new Track();
            case PLANE:
                return new Plane();
            case SHIP:
                return new Ship();
            default:
                System.out.println("TransportName not recognized!!!");
        }

        return null;
    }
}
