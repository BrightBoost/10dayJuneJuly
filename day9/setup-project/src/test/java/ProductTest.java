import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {

    private static Product.ProductSupplier supplier;

    @BeforeEach
    void setUp() {
        supplier = productId -> 0;
    }

    @Test
    void testAddStock(Product product) {
        product.addStock(100);
        assertEquals(150, product.getQuantity(), "Stock should be increased by 100");
    }

    @Test
    void testSellProduct(Product product) {
        product.sellProduct(20);
        assertEquals(30, product.getQuantity(), "Stock should be decreased by 20");
    }

    // Additional test methods...

    @AfterEach
    void tearDown() {
        supplier = null;
    }

    @Nested
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    @ExtendWith(ProductParameterResolver.class)
    class ProductParameterizedTests {

        @Test
        void testAddStockWithParameter(Product product) {
            product.addStock(100);
            assertEquals(150, product.getQuantity(), "Stock should be increased by 100");
        }

        @Test
        void testSellProductWithParameter(Product product) {
            product.sellProduct(20);
            assertEquals(30, product.getQuantity(), "Stock should be decreased by 20");
        }
    }

    static class ProductParameterResolver implements ParameterResolver {

        @Override
        public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
            return parameterContext.getParameter().getType().equals(Product.class);
        }

        @Override
        public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
            int productId = 1;
            String productName = "Test Product";
            int quantity = 50;
            Product.ProductSupplier supplier = null;

            return new Product(productId, productName, quantity, supplier);
        }
    }
}
