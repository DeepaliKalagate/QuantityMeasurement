package com;
public enum Temperature
{
    CELCIUS(1.0),FARHENHEIT(1.0);
    public final Double conversionFactor;

    Temperature(Double conversionFactor)
    {
        this.conversionFactor = conversionFactor;
    }
    public Double getTemperatureValue(Double value)
    {
      return  this.conversionFactor*value;
    }
}
