package com;

public enum Quantity
{
    GALLON(3785.0), LITRE(1000.0),MILI_LITER(1.0);

    private final double conversionFactor;
    Quantity(double conversionFactor)
    {
        this.conversionFactor = conversionFactor;
    }

    public double getVolumeValue(double value)
    {
        return this.conversionFactor*value;
    }
}
