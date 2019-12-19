package com;

public class WeightConverter {
    private double value;
    private Weight weight;

    public WeightConverter(Weight weight, double value)
    {
        this.weight = weight;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WeightConverter that = (WeightConverter) o;
        return Double.compare(that.value, value) == 0 &&
                weight == that.weight;
    }

    public boolean compareWeight(WeightConverter that) {
        double weightValue = this.weight.getWeightValue(this.value);
        double weightValue1 = that.weight.getWeightValue(that.value);
        return Double.compare(weightValue,weightValue1)==0;

    }

    public double addWeight(WeightConverter that) {
        double weightValue = this.weight.getWeightValue(this.value);
        double weightValue1 = that.weight.getWeightValue(that.value);
        return Double.sum(weightValue,weightValue1);

    }
}
