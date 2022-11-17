package adapter;

import java.math.BigDecimal;

public class DollarAdapter implements Adapter {

    private static final BigDecimal RATE = BigDecimal.valueOf(1.1);

    private final AmazonItem amazonItem;

    public DollarAdapter(AmazonItem amazonItem){
        this.amazonItem = amazonItem;
    }

    @Override
    public String convert() {
        String[] splitPrice = amazonItem.getPrice().split(" ");

        if("euro".equalsIgnoreCase(splitPrice[1])) {
            BigDecimal price = new BigDecimal(splitPrice[0]);
            return price.multiply(RATE) + " $";
        }

        return amazonItem.getPrice();
    }
}
