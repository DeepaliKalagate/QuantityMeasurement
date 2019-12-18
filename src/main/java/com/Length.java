package com;

public class Length
{
    public   Unit unit;
    public double value;

    public Length(Unit unit, double value)
    {
        this.unit = unit;
        this.value = value;
    }

    public boolean compare(Length thatLength)
    {
        boolean unitValue = unit.getUnitValue(this, thatLength);
        return unitValue;
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
