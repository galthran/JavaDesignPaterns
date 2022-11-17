package bridge;

public class BridgePattern {

    public static void main(String[] args) {
        Format format = new JsonFormat("Hello", new RestApi());
        format.sendMessage();
    }
}
