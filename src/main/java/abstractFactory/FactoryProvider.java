package abstractFactory;

public class FactoryProvider {

    static AbstractFactory getFactory(FactoryMode factoryMode) {

        AbstractFactory abstractFactory = null;

        switch (factoryMode) {
            case CARGO:
                abstractFactory = new CargoFactory();
                break;
            case PASSENGER:
                abstractFactory = new PassengerFactory();
                break;
            default:
                System.out.println("factoryMode not recognized!!!");
        }

        return abstractFactory;
    }
}
