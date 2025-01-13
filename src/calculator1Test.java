import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class calculator1Test {

    // Test the add method of the Calculator class
    @Test
    public void testAdd() {
        calculator1 calculator = new calculator1();

        // Test case 1: Adding two positive numbers
        int result1 = calculator.add(5, 3);
        assertEquals(8, result1, "Adding 5 + 3 should return 8");

        // Test case 2: Adding a positive number and zero
        int result2 = calculator.add(5, 0);
        assertEquals(5, result2, "Adding 5 + 0 should return 5");

        // Test case 3: Adding two negative numbers
        int result3 = calculator.add(-4, -6);
        assertEquals(-10, result3, "Adding -4 + -6 should return -10");

        // Test case 4: Adding a negative number and a positive number
        int result4 = calculator.add(-4, 6);
        assertEquals(2, result4, "Adding -4 + 6 should return 2");
    }
}



