package com;

public class QuantityMeasurement {

    public QuantityEnumTypes quantity;
    public double value;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Double.compare(that.value, value) == 0 &&
                quantity == that.quantity;
    }

    public QuantityMeasurement(QuantityEnumTypes quantity, double value)
    {
        this.quantity = quantity;
        this.value = value;
    }

    public boolean compare(QuantityMeasurement that)
    {
        double unitValue1 = Math.floor(this.quantity.getUnitValue(this.value));
        double unitValue2 = Math.floor(that.quantity.getUnitValue(that.value));
        return Double.compare(unitValue1,unitValue2)==0;
    }

    public double addValues(QuantityMeasurement thatQuantityConverter)
    {
        double unitValue1 = this.quantity.getUnitValue(this.value);
        double unitValue2 = thatQuantityConverter.quantity.getUnitValue(thatQuantityConverter.value);
        return Double.sum(unitValue1,unitValue2);
    }
}
