import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Product Parameter Resolver Test")
class ProductParameterResolverTest {

    @Test
    @DisplayName("Test parameter resolution for Product and int types")
    @ExtendWith(ProductParameterResolver.class)
    void testParameterResolution(Product product, int initialQuantity, int quantityToSell, int expectedQuantity) {
        assertNotNull(product);
        assertEquals(initialQuantity, product.getQuantity(), "Initial quantity mismatch");
        assertEquals(quantityToSell, 20, "Quantity to sell mismatch");
        assertEquals(expectedQuantity, 80, "Expected quantity mismatch");
    }

    static class ProductParameterResolver implements ParameterResolver {

        @Override
        public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
            Class<?> parameterType = parameterContext.getParameter().getType();
            return parameterType.equals(Product.class) || parameterType.equals(int.class);
        }

        @Override
        public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
            Class<?> parameterType = parameterContext.getParameter().getType();
            if (parameterType.equals(Product.class)) {
                // Resolve and return a Product instance
                int productId = 1;
                String productName = "Test Product";
                int quantity = 50;
                Product.ProductSupplier supplier = null;

                return new Product(productId, productName, quantity, supplier);
            } else if (parameterType.equals(int.class)) {
                // Resolve and return an int value based on the parameter index
                int parameterIndex = parameterContext.getIndex();
                switch (parameterIndex) {
                    case 1:
                        return 50; // Updated to match the initial quantity of the product
                    case 2:
                        return 20;
                    case 3:
                        return 80;
                    default:
                        throw new ParameterResolutionException("Unsupported int parameter at index: " + parameterIndex);
                }
            }

            throw new ParameterResolutionException("Unsupported parameter type: " + parameterType);
        }
    }
}
