package com;

import org.junit.Assert;
import org.junit.Test;

public class WeightTest
{
    @Test
    public void given1Kilogram_ShouldReturnInKilogram()
    {
        Double weightValue = Weight.KILOGRAM.getConvertValue(1.0);
        Assert.assertEquals(1.0, weightValue, 0.0);
    }

    @Test
    public void given1Tonne_ShouldReturnInKilogram()
    {
        Double weightValue = Weight.TONNE.getConvertValue(1.0);
        Assert.assertEquals(1000.0, weightValue, 0.0);
    }

    @Test
    public void given1000Gram_ShouldReturnInKilogram()
    {
        Double weightValue = Weight.GRAM.getConvertValue(1000.0);
        Assert.assertEquals(1.0, weightValue, 0.0);
    }
}
