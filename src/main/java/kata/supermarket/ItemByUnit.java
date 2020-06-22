package kata.supermarket;

import java.math.BigDecimal;
import java.util.Objects;

public class ItemByUnit implements Item {

    private final Product product;

    ItemByUnit(final Product product) {
        this.product = product;
    }

    public BigDecimal price() {
        return product.pricePerUnit();
    }

    @Override
    public BigDecimal discount(int quantity) {
        return this.product.discount(quantity);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ItemByUnit)) {
            return false;
        }

        return this.product.equals(((ItemByUnit) o).product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product);
    }
}
