package com;

import org.junit.Assert;
import org.junit.Test;

public class TemperatureConverterTest {

    @Test
    public void given1Celciusand1Celcius_ShouldReturnEqualTemperature() {
        TemperatureConverter temperatureConverter = new TemperatureConverter(Temperature.CELCIUS, 1.0);
        TemperatureConverter temperatureConverter1 = new TemperatureConverter(Temperature.CELCIUS, 1.0);
        boolean equals = temperatureConverter.equals(temperatureConverter1);
        Assert.assertTrue(equals);
    }

    @Test
    public void given1Farhenietand1Farheniet_ShouldReturnEqualTemperature() {
        TemperatureConverter temperatureConverter = new TemperatureConverter(Temperature.FARHENHEIT, 1.0);
        TemperatureConverter temperatureConverter1 = new TemperatureConverter(Temperature.FARHENHEIT, 1.0);
        boolean equals = temperatureConverter.equals(temperatureConverter1);
        Assert.assertTrue(equals);
    }
}
