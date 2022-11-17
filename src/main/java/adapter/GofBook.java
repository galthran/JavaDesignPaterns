package adapter;

public class GofBook implements AmazonItem {

    @Override
    public String getPrice() {
        return "10 euro";
    }
}
