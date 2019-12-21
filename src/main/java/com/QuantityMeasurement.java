package com;
import java.util.Objects;

public class QuantityMeasurement
{
    public Double value;
    public QuantityInterface quantity;

    public QuantityMeasurement(QuantityInterface quantity, Double value)
    {
        this.quantity = quantity;
        this.value = value;
    }

    public boolean compare(QuantityMeasurement that) throws QuantityException
    {
        if(!this.quantity.getClass().equals(that.quantity.getClass()))
            throw new QuantityException("Enum class Should be Same",QuantityException.ExceptionType.UNIT_NOT_COMPARABLE);
        Double unitValue1 = Math.floor(this.quantity.getConvertValue(this.value));
        Double unitValue2 = Math.floor(that.quantity.getConvertValue(that.value));
        return Double.compare(unitValue1,unitValue2)==0;
    }

    public double addValues(QuantityMeasurement that) throws QuantityException
    {
        if(!this.quantity.getClass().equals(that.quantity.getClass()))
            throw new QuantityException("Enum class should be same",QuantityException.ExceptionType.UNIT_NOT_COMPARABLE);
        Double unitValue1 = this.quantity.getConvertValue(this.value);
        Double unitValue2 = that.quantity.getConvertValue(that.value);
        return Double.sum(unitValue1,unitValue2);
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Objects.equals(value, that.value) &&
                Objects.equals(quantity, that.quantity);
    }
}
