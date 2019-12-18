package com;
public enum Unit
{
    FEET(12.0),INCH(1.0),CENTIMETER(1.0/2.5),YARD(36.0),INVALID_ENUM(1.0);

    private final double conversionFactor;

     Unit(double conversionFactor)
     {
        this.conversionFactor = conversionFactor;
    }

//    public double addUnitValues(Length length1, Length length2)
//    {
//        return Double.sum(length1.unit.conversionFactor *length1.value,length2.unit.conversionFactor *length2.value);
//    }

    public double getUnitValue(double value)
    {
         return this.conversionFactor*value;
    }
}
