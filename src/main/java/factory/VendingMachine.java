package factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class VendingMachine {

    private static final Map<String, Supplier<Snack>> snackMap = new HashMap<>();

    static {
        snackMap.put("Chips", Chips::new);
        snackMap.put("Drink", Drink::new);
        snackMap.put("ChocolateBar", ChocolateBar::new);
    }

    Snack getSnack(String snackType) {
        if(snackMap.containsKey(snackType)) {
            return snackMap.get(snackType).get();
        } else {
            throw new IllegalArgumentException("Invalid snackType");
        }
    }
}
