package com;

public class QuantityConverter
{
    private double value;
    private Quantity quantity;

    public QuantityConverter(Quantity quantity, double value)
    {
        this.quantity=quantity;
        this.value = value;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityConverter that = (QuantityConverter) o;
        return Double.compare(that.value, value) == 0 &&
                quantity == that.quantity;
    }

    public boolean compare(QuantityConverter that)
    {
        double volume1 = (this.quantity.getVolumeValue(this.value));
        double volume2 = (that.quantity.getVolumeValue(that.value));
        return Double.compare(volume1, volume2)==0;
    }

    public double addVolume(QuantityConverter that)
    {
        double volume1 = (this.quantity.getVolumeValue(this.value));
        double volume2 = (that.quantity.getVolumeValue(that.value));
        double result= Double.sum(volume1, volume2);
        return result/1000;

    }
}
