package abstractFactory;

public abstract class AbstractFactory {

    abstract Transport getTransport(TransportType transportType);
}
