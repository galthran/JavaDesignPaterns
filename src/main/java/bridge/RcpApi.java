package bridge;

public class RcpApi implements Api {

    @Override
    public void send(String formattedMessage) {
        System.out.println(formattedMessage + " została przesłana przy pomocy RCP Api");
    }
}
