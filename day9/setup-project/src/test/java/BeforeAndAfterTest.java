import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BeforeAndAfterTest {

    private StringBuilder stringBuilder;

    @BeforeEach
    public void setUp() {
        stringBuilder = new StringBuilder("Hello");
    }

    @AfterEach
    public void tearDown() {
        stringBuilder = null;
    }

    @Test
    public void testAppend() {
        stringBuilder.append(" World");
        assertEquals("Hello World", stringBuilder.toString());
    }

    @Test
    public void testLength() {
        assertEquals(5, stringBuilder.length());
    }
}
