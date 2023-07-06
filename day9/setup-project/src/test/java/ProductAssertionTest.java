import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductAssertionTest {

    @Test
    public void testSellProductNegativeQuantity() {
        // Create a product with a custom supplier that returns a constant additional quantity of 0
        Product product = new Product(1, "Widget", 100, new Product.ProductSupplier() {
            @Override
            public int getAdditionalQuantity(int productId) {
                return 0;
            }
        });

        assertThrows(RuntimeException.class, () -> product.sellProduct(120));
    }

    // Inner interface and its implementation within the Product class
    public static interface ProductSupplier {
        int getAdditionalQuantity(int productId);
    }
}
