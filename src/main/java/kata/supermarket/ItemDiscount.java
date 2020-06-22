package kata.supermarket;

import java.math.BigDecimal;

public interface ItemDiscount {

    BigDecimal discountPrice(Product product, int quantity);
}
