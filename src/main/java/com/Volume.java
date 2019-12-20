package com;

public enum Volume implements QuantityInterface
{
    GALLON(3.78), LITRE(1.0),MILI_LITER(1.0/1000.0);

    public Double conversionFactor;

    Volume(Double conversionFactor)
    {
        this.conversionFactor = conversionFactor;
    }

    @Override
    public Double getConvertValue(Double value)
    {
        return this.conversionFactor*value;
    }
}
