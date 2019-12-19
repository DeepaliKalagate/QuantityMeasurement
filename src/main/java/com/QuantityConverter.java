package com;

public class QuantityConverter
{

    public Quantity quantity;
    public double value;

    public QuantityConverter(Quantity quantity, double value)
    {
        this.quantity = quantity;
        this.value = value;
    }

    public boolean compare(QuantityConverter thatQuantityConverter)
    {
        double unitValue1 = this.quantity.getUnitValue(this.value);
        double unitValue2 = thatQuantityConverter.quantity.getUnitValue(thatQuantityConverter.value);
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
        QuantityConverter quantityConverter = (QuantityConverter) o;
        return Double.compare(quantityConverter.value, value) == 0 &&
                quantity == quantityConverter.quantity;
    }

    public double addValues(QuantityConverter thatQuantityConverter)
    {
        double unitValue1 = this.quantity.getUnitValue(this.value);
        double unitValue2 = thatQuantityConverter.quantity.getUnitValue(thatQuantityConverter.value);
        return Double.sum(unitValue1,unitValue2);
    }

}
