import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductAssumptionTest {

    @Test
    public void testProductNameNotNullOrEmpty() {
        assertThrows(IllegalArgumentException.class, () -> new Product(1, null, 100, null));
        assertThrows(IllegalArgumentException.class, () -> new Product(1, "", 100, null));
    }

    @Test
    public void testQuantityNonNegative() {
        Product product = new Product(1, "Widget", 100, null);

        // Add negative quantity
        assertThrows(IllegalArgumentException.class, () -> product.addStock(-50));

        // Sell more than available quantity
        assertThrows(RuntimeException.class, () -> product.sellProduct(120));
    }
}
