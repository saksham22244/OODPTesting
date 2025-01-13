import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TemperatureTest{

    // Test the Celsius to Fahrenheit conversion
    @Test
    public void testCelsiusToFahrenheit() {
        Temperature converter = new Temperature();

        // Test case 1: Convert 0°C to Fahrenheit
        double result1 = converter.celsiusToFahrenheit(0);
        assertEquals(32.0, result1, 0.001, "0°C should be 32°F");

        // Test case 2: Convert 100°C to Fahrenheit
        double result2 = converter.celsiusToFahrenheit(100);
        assertEquals(212.0, result2, 0.001, "100°C should be 212°F");

        // Test case 3: Convert -40°C to Fahrenheit
        double result3 = converter.celsiusToFahrenheit(-40);
        assertEquals(-40.0, result3, 0.001, "-40°C should be -40°F");
    }

    // Test the Fahrenheit to Celsius conversion
    @Test
    public void testFahrenheitToCelsius() {
        Temperature converter = new Temperature();

        // Test case 1: Convert 32°F to Celsius
        double result1 = converter.fahrenheitToCelsius(32);
        assertEquals(0.0, result1, 0.001, "32°F should be 0°C");

        // Test case 2: Convert 212°F to Celsius
        double result2 = converter.fahrenheitToCelsius(212);
        assertEquals(100.0, result2, 0.001, "212°F should be 100°C");

        // Test case 3: Convert -40°F to Celsius
        double result3 = converter.fahrenheitToCelsius(-40);
        assertEquals(-40.0, result3, 0.001, "-40°F should be -40°C");
    }
}





