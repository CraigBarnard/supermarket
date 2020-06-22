package kata.supermarket;

import java.math.BigDecimal;

public interface Item {
    BigDecimal price();
    default BigDecimal discount(int quantity) {
        return BigDecimal.ZERO;
    }
}
