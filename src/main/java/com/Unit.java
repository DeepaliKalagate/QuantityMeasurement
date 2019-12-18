package com;

public enum Unit
{
    FEET(12.0),INCH(1.0),CENTIMETER(12.0),YARD(36.0);

    private final double value;

     Unit(double value)
     {
        this.value = value;
    }
    public double getUnitValue()
    {
        return this.value;
    }
}
