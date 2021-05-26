package io.testsmith.temperature;

import org.junit.Assert;
import org.junit.Test;

public class TemperatureConverterTest {

    @Test
    public void calculateCelsius() {
        Assert.assertEquals(-15, TemperatureConverter.toCelsius(4));
    }

    @Test
    public void calculateFahrenheit() {
        Assert.assertEquals(39, TemperatureConverter.toFahrenheit(4));
    }
}
