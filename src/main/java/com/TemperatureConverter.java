package com;

import java.util.Objects;

public class TemperatureConverter {
    private double value;
    private Temperature temperature;

    public TemperatureConverter(Temperature temperature, double value)
    {
        this.temperature = temperature;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TemperatureConverter that = (TemperatureConverter) o;
        return Double.compare(that.value, value) == 0 &&
                temperature == that.temperature;
    }
}
