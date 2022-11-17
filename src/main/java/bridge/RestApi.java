package bridge;

public class RestApi implements Api {

    @Override
    public void send(String formattedMessage) {
        System.out.println(formattedMessage + " została przesłana przy pomocy REST Api");
    }
}
