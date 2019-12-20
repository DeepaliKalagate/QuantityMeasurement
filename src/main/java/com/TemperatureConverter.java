package com;
public class TemperatureConverter
{
    private double value;
    private Temperature temperature;

    public TemperatureConverter(Temperature temperature, double value)
    {
        this.temperature = temperature;
        this.value = value;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TemperatureConverter that = (TemperatureConverter) o;
        return Double.compare(that.value, value) == 0 &&
                temperature == that.temperature;
    }

    public boolean  compare(TemperatureConverter that)
    {

        if (this.temperature.equals(Temperature.CELCIUS))
        {
            Double number = this.value * 9 / 5 + 32;
            Double value = that.value;
            return Double.compare(number, value) == 0;
        }
        Double number = this.value;
        Double value = that.value * 9 / 5 + 32;
        return Double.compare(number, value) == 0;
    }
}