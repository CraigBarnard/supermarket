package kata.supermarket;

import java.math.BigDecimal;
import java.util.Objects;

public class Product {
    private final String productCode;
    private final BigDecimal pricePerUnit;
    private ItemDiscount discount;

    public Product(final String productCode, final BigDecimal pricePerUnit) {
        this.productCode = productCode;
        this.pricePerUnit = pricePerUnit;
    }
    public Product(final String productCode,final BigDecimal pricePerUnit, ItemDiscount discount) {
        this.productCode = productCode;
        this.pricePerUnit = pricePerUnit;
        this.discount = discount;
    }

    BigDecimal pricePerUnit() {
        return pricePerUnit;
    }

    public Item oneOf() {
        return new ItemByUnit(this);
    }

    public BigDecimal discount(int quantity) {
        if (this.discount == null) {
            return BigDecimal.ZERO;
        }

        return this.discount.discountPrice(this, quantity);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Product)) {
            return false;
        }

        return this.productCode.equals(((Product) o).productCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productCode, pricePerUnit, discount);
    }
}
