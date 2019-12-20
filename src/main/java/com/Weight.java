package com;

public enum Weight implements QuantityInterface
{
    KILOGRAM(1.0),TONNE(1000.0),GRAM(1.0/1000.0);

    public Double conversionFactor;

    Weight(Double conversionFactor)
    {
        this.conversionFactor = conversionFactor;
    }

    @Override
    public Double getConvertValue(Double value) {
        return this.conversionFactor*value;
    }
}
