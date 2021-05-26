package nl.belastingdienst.trainees.temperature;

import org.junit.Assert;
import org.junit.Test;

import io.testsmith.temperature.TemperatureConverter;


public class TemperatuurConversieTest {

    @Test
    public void CaculateFahrenheitToCelsius() {
        int celsius = TemperatureConverter.toCelsius(50);
        Assert.assertEquals("50 fahrenheit is 10 celsius", celsius, 10);
    }

    @Test
    public void CaculateCelsiusToFahrenheit() {
        int fahrenheit = TemperatureConverter.toFahrenheit(10);
        Assert.assertEquals("10 celsius is 50 fahrenheit", fahrenheit, 50);
    }
}
