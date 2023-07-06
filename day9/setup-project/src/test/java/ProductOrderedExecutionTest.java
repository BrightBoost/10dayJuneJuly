import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ProductOrderedExecutionTest {
    private static Product product;

    @BeforeEach
    public void setUp() {
        // Create a stub implementation of ProductSupplier
        Product.ProductSupplier supplier = new Product.ProductSupplier() {
            @Override
            public int getAdditionalQuantity(int productId) {
                // Provide implementation or return a default value
                return 0;
            }
        };

        // Create the Product object with the supplier
        product = new Product(1, "Test Product", 50, supplier);
    }



    @AfterEach
    public void tearDown() {
        // Clean up any resources after each test method
        product = null;
    }

    @Test
    @Order(1)
    public void testAddStock() {
        product.addStock(100);
        assertEquals(150, product.getQuantity(), "Stock should be increased by 100");
    }

    @Test
    @Order(2)
    public void testSellProduct() {
        product.sellProduct(20);
        assertEquals(30, product.getQuantity(), "Stock should be decreased by 20");
    }

    @Test
    @Order(3)
    public void testGetProductId() {
        assertEquals(1, product.getProductId(), "Product ID should match");
    }

    @Test
    @Order(4)
    public void testGetProductName() {
        assertEquals("Test Product", product.getProductName(), "Product name should match");
    }

    @Test
    @Order(5)
    public void testGetQuantity() {
        Product product = new Product(1, "Product 1", 20, null);
        product.addStock(20);
        product.sellProduct(10);
        assertEquals(30, product.getQuantity());
    }

}
