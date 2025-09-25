import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {

    TemperatureConverter tc = new TemperatureConverter();

    @Test
    public void fahrenheitToCelsius() {
        assertEquals(10.0, tc.fahrenheitToCelsius(50.0), 0.0001);
    }

    @Test
    public void celsiusToFahrenheit() {
        assertEquals(95.0, tc.celsiusToFahrenheit(35.0), 0.0001);
    }

    @Test
    public void isExtremeTemperature() {
        assertTrue(tc.isExtremeTemperature(55));
    }

    @Test
    public void kelvinToCelsius(){
        assertEquals(26.85, tc.kelvinToCelsius(300), 0.0001);
    }
}