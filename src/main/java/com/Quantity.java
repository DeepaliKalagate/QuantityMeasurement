package com;
public enum Quantity
{
    FEET(12.0),INCH(1.0),CENTIMETER(1.0/2.5),YARD(36.0),
    INVALID_ENUM(1.0);

    private final double conversionFactor;

     Quantity(double conversionFactor)
     {
        this.conversionFactor = conversionFactor;
    }

    public double getUnitValue(double value)
    {
         return this.conversionFactor*value;
    }
}
