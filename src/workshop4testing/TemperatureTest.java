package workshop4testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TemperatureTest {

	@Test 
    void TestCeslsiusToFahrenheit() {
        Temperature temperature=new Temperature();
        assertEquals(89.6,temperature.CelsiusToFahrenheit(32),0.001);
        assertEquals(118.4,temperature.CelsiusToFahrenheit(48),0.001);
        assertEquals(73.4,temperature.CelsiusToFahrenheit(23),0.001);
        assertEquals(96.8,temperature.CelsiusToFahrenheit(36),0.001);
        System.out.println("This method checks the conversion for a range of celsius value");

        
    }
}