package factory;

public class FactoryPattern {

      public static void main(String[] args) {
          CargoTransport cargoTransport = TransportFactory.getTransport("plane");
          cargoTransport.process();
      }
}
