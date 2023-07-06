import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DisabledTest {

    @Disabled("This test is currently disabled")
    @Test
    public void testDisabledMethod() {
        // Test logic goes here
        // This code will not be executed because the test is disabled
        assertEquals(2, 1 + 1, "This test should be disabled");
    }
}
