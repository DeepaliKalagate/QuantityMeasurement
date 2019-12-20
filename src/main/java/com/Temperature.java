package com;
public enum Temperature
{
    CELCIUS(1),FARHENHEIT(1.0);
    public final double conversionFactor;

    Temperature(double conversionFactor)
    {
        this.conversionFactor = conversionFactor;
    }
    public double getTemperatureValue(double value)
    {
       return  this.conversionFactor*value;
    }
}
