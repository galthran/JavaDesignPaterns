package abstractFactory;

public class AbstractFactoryPattern {

    public static void main (String[] args) {
        AbstractFactory cargoFactory = FactoryProvider.getFactory(FactoryMode.CARGO);
        cargoFactory.getTransport(TransportType.PLANE).process();

        AbstractFactory passengerFactory = FactoryProvider.getFactory(FactoryMode.PASSENGER);
        passengerFactory.getTransport(TransportType.SHIP).process();
    }
}
