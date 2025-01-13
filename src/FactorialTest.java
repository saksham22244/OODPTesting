import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {
    // Test for factorial of 0
    @Test
    public void testFactorialOfZero() {
        assertEquals(1, Factorial.factorial(0), "Factorial of 0 should be 1.");
    }

    // Test for factorial of a positive number
    @Test
    public void testFactorialOfPositiveNumber() {
        assertEquals(120, Factorial.factorial(5), "Factorial of 5 should be 120.");
    }

    // Test for factorial of 1
    @Test
    public void testFactorialOfOne() {
        assertEquals(1, Factorial.factorial(1), "Factorial of 1 should be 1.");
    }

    // Test for large number factorial
    @Test
    public void testFactorialOfLargeNumber() {
        assertEquals(2432902008176640000L, Factorial.factorial(20), "Factorial of 20 should match.");
    }

    // Test for negative input
    @Test
    public void testFactorialOfNegativeNumber() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Factorial.factorial(-5);
        });
        assertEquals("Number must be non-negative.", exception.getMessage());
    }
}







