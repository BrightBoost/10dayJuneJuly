import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Execution(ExecutionMode.CONCURRENT)
public class ParallelExecutionTest {

    private static AtomicInteger counter = new AtomicInteger(0);

    @Test
    public void test1() {
        // Increment the counter
        counter.incrementAndGet();
        // Verify that the counter value is greater than 0
        assertTrue(counter.get() > 0, "Counter should be incremented");
    }

    @Test
    public void test2() {
        // Increment the counter
        counter.incrementAndGet();
        // Verify that the counter value is greater than 0
        assertTrue(counter.get() > 0, "Counter should be incremented");
    }

    @Test
    public void test3() {
        // Increment the counter
        counter.incrementAndGet();
        // Verify that the counter value is greater than 0
        assertTrue(counter.get() > 0, "Counter should be incremented");
    }
}
