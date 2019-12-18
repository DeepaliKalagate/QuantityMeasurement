package com;

public class Length
{
    private static final double FEET_TO_INCH = 12.0;
    private static final double INCH_TO_FEET = 1.0;
    private static final double FEET_TO_YARD = 3 ;
    private static final double YARD_TO_INCHES = 36.0;
    private  Unit unit;
    private  double value;

    public Length(Unit unit, double value)
    {
        this.unit = unit;
        this.value = value;
    }

    public boolean compare(Length thatLength)
    {
        Double firstValue = this.unit.getUnitValue()*this.value;
        Double secoundValue=thatLength.unit.getUnitValue()*thatLength.value;
        return (firstValue.compareTo(secoundValue)==0);

    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 &&
                unit == length.unit;
    }
}
