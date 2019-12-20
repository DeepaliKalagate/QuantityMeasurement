package com;
public enum Quantity implements QuantityInterface
{
    FEET(12.0),INCH(1.0),CENTIMETER(1.0/2.5),YARD(36.0);

    private final Double conversionFactor;
    public Double value;

    Quantity(Double conversionFactor)
    {
        this.conversionFactor = conversionFactor;
    }

    @Override
    public Double getConvertValue(Double value)

    {
        return this.conversionFactor*value;
    }
}
