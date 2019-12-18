package com;
public enum Unit
{
    FEET(12.0),INCH(1.0),CENTIMETER(1.0/2.5),YARD(36.0);

    private final double value;

     Unit(double value)
     {
        this.value = value;
    }

    public boolean getUnitValue(Length length1, Length length2)
    {
         return Double.compare(length1.unit.value*length1.value,length2.unit.value*length2.value)==0;
    }
}
