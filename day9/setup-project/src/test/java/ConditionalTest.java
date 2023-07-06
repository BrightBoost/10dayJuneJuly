import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConditionalTest {

    private Product product;

    @BeforeEach
    public void setUp() {
        // Create a stub implementation of ProductSupplier
        Product.ProductSupplier supplier = productId -> 0;

        // Create the Product object with the supplier and initial quantity of 10
        product = new Product(1, "Test Product", 10, supplier);
    }

    @Test
    public void testSellProductWhenQuantityGreaterThanZero() {
        // Check initial quantity
        assertEquals(10, product.getQuantity(), "Initial quantity should be 10");

        // Sell 5 products
        product.sellProduct(5);

        // Check if quantity is reduced by 5
        assertEquals(5, product.getQuantity(), "Quantity should be reduced by 5");

        // Additional condition: Quantity should be greater than zero
        assertTrue(product.getQuantity() > 0, "Quantity should be greater than zero");
    }
}
