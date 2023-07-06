import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(ProductTest.ProductParameterResolver.class)
class ProductRepeatedTest {

    @RepeatedTest(5)
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

    @RepeatedTest(5)
    void testRestockFromSupplierRepitionInfo(Product product, RepetitionInfo repetitionInfo) {
        // Create a test-specific supplier implementation
        Product.ProductSupplier supplier = new Product.ProductSupplier() {
            @Override
            public int getAdditionalQuantity(int productId) {
                // Return a hardcoded additional quantity for testing purposes
                return 10;
            }
        };

        // Create a product
        Product innerProduct = new Product(1, "Product 1", 20, supplier);

        // Invoke the restockFromSupplier method
        innerProduct.restockFromSupplier();

        // Assert that the quantity has increased by the additional quantity
        assertEquals(30, innerProduct.getQuantity());
        System.out.println("Nr.: " + repetitionInfo.getCurrentRepetition());
    }

    // Additional test methods, if any
}
