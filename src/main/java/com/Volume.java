package com;

public enum Volume
{
    GALLON(3.78), LITRE(1.0),MILI_LITER(1.0/1000.0);

    private final double conversionFactor;
    Volume(double conversionFactor)
    {
        this.conversionFactor = conversionFactor;
    }

    public double getVolumeValue(double value)
    {
        return this.conversionFactor*value;
    }
}
