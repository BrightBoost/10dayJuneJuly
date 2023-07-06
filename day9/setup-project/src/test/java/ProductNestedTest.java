import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductNestedTest {

    @Test
    void testGetQuantity() {
        Product product = new Product(1, "Product 1", 20, null);
        assertEquals(20, product.getQuantity());
    }

    @Nested
    class ProductStockTests {

        private Product product;

        @BeforeEach
        void setup() {
            product = new Product(1, "Product 1", 20, null);
            product.addStock(20);
        }

        @Test
        void testAddStock() {
            product.addStock(10);
            assertEquals(50, product.getQuantity());
        }

        @Test
        void testSellProduct() {
            product.sellProduct(10);
            assertEquals(30, product.getQuantity());
        }

        @AfterEach
        void teardown() {
            // Cleanup code specific to the nested test class, if any
        }
    }

    // Additional test methods, if any

}
