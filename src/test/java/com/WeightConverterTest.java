package com;

import org.junit.Assert;
import org.junit.Test;

public class WeightConverterTest {

    @Test
    public void given1Kilogramand1Kilogram_ShouldReturnEqualQuantity()
    {
        WeightConverter weightConverter1 = new WeightConverter(Weight.KILOGRAM, 1.0);
        WeightConverter weightConverter2 = new WeightConverter(Weight.KILOGRAM, 1.0);
        boolean equals = weightConverter1.equals(weightConverter2);
        Assert.assertTrue(equals);
    }

}
