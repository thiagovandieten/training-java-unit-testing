package io.testsmith.temperature;

public class TemperatureConverter {

    public static int toCelsius(int fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static int toFahrenheit(int celsius) {
        return celsius * 9 / 5 + 32;
    }

}
