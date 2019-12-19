package com;

public enum Temperature
{
    CELCIUS(1.0),FARHENHEIT(33.8);
    public final double conversionFactor;

    Temperature(double conversionFactor)
    {
        this.conversionFactor = conversionFactor;
    }

    public double getTemperatureValue(double value)
    {
        return this.conversionFactor*value;
    }
}
