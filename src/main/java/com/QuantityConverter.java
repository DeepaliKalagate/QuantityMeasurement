package com;

import java.util.Objects;

public class QuantityConverter {
    private double value;
    private Quantity quantity;

    public QuantityConverter(Quantity quantity, double value)
    {
        this.quantity=quantity;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityConverter that = (QuantityConverter) o;
        return Double.compare(that.value, value) == 0 &&
                quantity == that.quantity;
    }
}
