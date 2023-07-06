import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductDITest {

    @Test
    void testRestockFromSupplier() {
        // Create a test-specific supplier implementation
        Product.ProductSupplier supplier = new Product.ProductSupplier() {
            @Override
            public int getAdditionalQuantity(int productId) {
                // Return a hardcoded additional quantity for testing purposes
                return 10;
            }
        };

        // Create a product
        Product product = new Product(1, "Product 1", 20, supplier);

        // Invoke the restockFromSupplier method
        product.restockFromSupplier();

        // Assert that the quantity has increased by the additional quantity
        assertEquals(30, product.getQuantity());
    }

    // Additional test methods, if any
}
