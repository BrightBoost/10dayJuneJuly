import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleMultiplierTest {

    @Test
    public void testPositiveNumbers() {
        // Arrange
        SimpleMultiplier multiplier = new SimpleMultiplier();
        int a = 4;
        int b = 5;
        int expectedProduct = 20;

        // Act
        int actualProduct = multiplier.multiply(a, b);

        // Assert
        assertEquals(expectedProduct, actualProduct);
    }

    @Test
    public void testNegativeNumbers() {
        // Arrange
        SimpleMultiplier multiplier = new SimpleMultiplier();
        int a = -4;
        int b = 5;
        int expectedProduct = -20;

        // Act
        int actualProduct = multiplier.multiply(a, b);

        // Assert
        assertEquals(expectedProduct, actualProduct);
    }

    @Test
    public void testZero() {
        // Arrange
        SimpleMultiplier multiplier = new SimpleMultiplier();
        int a = 0;
        int b = 5;
        int expectedProduct = 0;

        // Act
        int actualProduct = multiplier.multiply(a, b);

        // Assert
        assertEquals(expectedProduct, actualProduct);
    }

    @Test
    public void testLargeNumbers() {
        // Arrange
        SimpleMultiplier multiplier = new SimpleMultiplier();
        int a = 100;
        int b = 1000;
        long expectedProduct = 100000L;

        // Act
        long actualProduct = multiplier.multiply(a, b);

        // Assert
        assertEquals(expectedProduct, actualProduct);
    }

}
