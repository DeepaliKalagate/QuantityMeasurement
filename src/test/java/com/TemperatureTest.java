package com;
import org.junit.Assert;
import org.junit.Test;

public class TemperatureTest
{
    @Test
    public void given1Celcius_ShouldReturnInCelcius()
    {
        Double temperature = Temperature.CELCIUS.getTemperatureValue(1.0);
        Assert.assertEquals(1.0, temperature, 0.0);
    }

    @Test
    public void given1Farheniet_ShouldReturnInCelcius()
    {
        Double temperature = Temperature.FARHENHEIT.getTemperatureValue(1.0);
        Assert.assertEquals(1.0, temperature, 0.0);
    }
}
