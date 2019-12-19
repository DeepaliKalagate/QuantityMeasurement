package com;

import org.junit.Assert;
import org.junit.Test;

public class WeightConverterTest {

    @Test
    public void given1Kilogramand1Kilogram_ShouldReturnEqualWeight()
    {
        WeightConverter weightConverter1 = new WeightConverter(Weight.KILOGRAM, 1.0);
        WeightConverter weightConverter2 = new WeightConverter(Weight.KILOGRAM, 1.0);
        boolean equals = weightConverter1.equals(weightConverter2);
        Assert.assertTrue(equals);
    }

    @Test
    public void given1Gramand1Gram_ShouldReturnEqualWeight()
    {
        WeightConverter gram1 = new WeightConverter(Weight.GRAM, 1000.0);
        WeightConverter gram2 = new WeightConverter(Weight.GRAM, 1000.0);
        boolean equals = gram1.equals(gram2);
        Assert.assertTrue(equals);
    }
}
