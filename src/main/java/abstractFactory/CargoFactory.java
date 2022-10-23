package abstractFactory;

public class CargoFactory extends AbstractFactory {

    @Override
    Transport getTransport(TransportType transportType) {
        Transport transport = null;

        switch (transportType) {
            case BUS_TRACK:
                transport = new CargoTrack();
                break;
            case PLANE:
                transport = new CargoPlane();
                break;
            case SHIP:
                transport = new CargoShip();
                break;
            default:
                System.out.println("transportType not recognized!!!");
        }

        return transport;
    }
}
