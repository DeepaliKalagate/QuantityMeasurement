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
        double unitValue1 = this.unit.getUnitValue(this.value);
        double unitValue2 = thatLength.unit.getUnitValue(thatLength.value);
        return Double.compare(unitValue1,unitValue2)==0;
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

    public double addValues(Length thatLength)
    {
        double unitValue1 = this.unit.getUnitValue(this.value);
        double unitValue2 = thatLength.unit.getUnitValue(thatLength.value);
        return Double.sum(unitValue1,unitValue2);
    }
}
