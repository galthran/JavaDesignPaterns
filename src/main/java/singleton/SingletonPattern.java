package singleton;

public class SingletonPattern {

    public static void main(String[] args) {
        SingletonServer singletonServer = SingletonServer.getInstance();
        singletonServer.getResponse();

        SingletonServer singletonServer2 = SingletonServer.getInstance();

        System.out.println(singletonServer == singletonServer2);

        Logger logger1 = Logger.getInstance();
        logger1.log("Logger1");

        Logger logger2 = Logger.getInstance();
        logger2.log("Logger2");
    }
}
