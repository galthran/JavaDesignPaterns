package abstractFactory;

public class PassengerFactory extends AbstractFactory {


    @Override
    Transport getTransport(TransportType transportType) {
        Transport transport = null;

        switch (transportType) {
            case BUS_TRACK:
                transport = new PassengerBus();
                break;
            case PLANE:
                transport = new PassengerPlane();
                break;
            case SHIP:
                transport = new PassengerShip();
                break;
            default:
                System.out.println("transportType not recognized!!!");
        }

        return transport;
    }
}
