package kata.supermarket;

import java.math.BigDecimal;

public class BuyOneGetOneFree implements ItemDiscount {

    @Override
    public BigDecimal discountPrice(Product product, int quantity) {
        BigDecimal reduction = BigDecimal.ZERO;
        while(quantity >= 2) {
            reduction = reduction.add(product.pricePerUnit());
            quantity -= 2;
        }
        return reduction;
    }
}
