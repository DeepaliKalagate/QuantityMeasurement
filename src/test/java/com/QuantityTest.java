package com;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTest
{
    @Test
    public void given1Gallon_ShouldReturnInMililitre()
    {
        double volume =Quantity.GALLON.getVolumeValue(1.0);
        Assert.assertEquals(3785.0, volume, 0.0);
    }
}
