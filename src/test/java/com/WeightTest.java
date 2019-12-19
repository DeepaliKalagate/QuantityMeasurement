package com;

import org.junit.Assert;
import org.junit.Test;

public class WeightTest
{

    @Test
    public void given1Kilogram_ShouldReturnInKilogram()
    {
        double weightValue = Weight.KILOGRAM.getWeightValue(1.0);
        Assert.assertEquals(1.0, weightValue, 0.0);
    }

    @Test
    public void given1Tonne_ShouldReturnInKilogram()
    {
        double weightValue = Weight.TONNE.getWeightValue(1.0);
        Assert.assertEquals(1000.0, weightValue, 0.0);
    }
}
