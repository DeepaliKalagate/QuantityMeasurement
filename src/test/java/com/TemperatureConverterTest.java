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

    @Test
    public void given212Farhenietand100Celcius_ShouldReturnEqualTemperature() {
        TemperatureConverter celcius1 = new TemperatureConverter(Temperature.CELCIUS, 100.0);
        TemperatureConverter farheniet1 = new TemperatureConverter(Temperature.FARHENHEIT, 212.0);
        boolean equals = celcius1.compare(farheniet1);
        Assert.assertTrue(equals);
    }

    @Test
    public void given100Celciusand212Farheniet_ShouldReturnEqualTemperature() {
        TemperatureConverter farheniet1 = new TemperatureConverter(Temperature.FARHENHEIT, 212.0);
        TemperatureConverter celcius1 = new TemperatureConverter(Temperature.CELCIUS, 100.0);
        boolean equals = farheniet1.compare(celcius1);
        Assert.assertTrue(equals);
    }
}
