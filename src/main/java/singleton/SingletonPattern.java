package singleton;

public class SingletonPattern {

    public static void main(String[] args) {
        SingletonServer singletonServer = SingletonServer.getInstance();
        singletonServer.getResponse();

        SingletonServer singletonServer2 = SingletonServer.getInstance();

        System.out.printf(String.valueOf(singletonServer == singletonServer2));
    }
}
