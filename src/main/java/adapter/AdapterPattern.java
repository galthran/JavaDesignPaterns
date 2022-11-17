package adapter;

public class AdapterPattern {

    public static void main(String[] args) {
        AmazonItem amazonItem = new GofBook();
        Adapter adapter = new DollarAdapter(amazonItem);

        System.out.println("final price: " + adapter.convert());
    }
}
