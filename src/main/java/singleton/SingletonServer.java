package singleton;

public class SingletonServer {

    private static SingletonServer instance;

    private SingletonServer() {}

    public static SingletonServer getInstance() {
        if(instance == null) {
            instance = new SingletonServer();
        }
        return instance;
    }

    public void getResponse() {
        System.out.println("200 OK");
    }
}
