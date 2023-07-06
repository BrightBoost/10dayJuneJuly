import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.*;
import org.junit.jupiter.params.ParameterizedTest;
import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Product Parametrized Test")
class ProductParametrizedTest {

    @DisplayName("Test selling product")
    @ParameterizedTest
    @MethodSource("provideProductParameters")
    void testSellProduct(int productId, String productName, int initialQuantity, int quantityToSell, int expectedQuantity) {
        Product product = new Product(productId, productName, initialQuantity, null);
        product.sellProduct(quantityToSell);
        assertEquals(expectedQuantity, product.getQuantity());
    }

    private static Stream<Arguments> provideProductParameters() {
        return Stream.of(
                Arguments.of(1, "Product A", 10, 5, 5),
                Arguments.of(2, "Product B", 20, 10, 10),
                Arguments.of(3, "Product C", 30, 15, 15)
        );
    }
}
