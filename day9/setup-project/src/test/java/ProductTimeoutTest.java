import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.*;
import java.util.concurrent.TimeUnit;

@DisplayName("Product Timeout Test")
class ProductTimeoutTest {

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    void testProductProcessingTimeout() throws InterruptedException {
        // Simulate a short operation that completes within the timeout
        Thread.sleep(1000);

        // Assertions
        Assertions.assertTrue(true, "This test completes within the timeout");
    }
}
