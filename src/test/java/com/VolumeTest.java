package com;

import org.junit.Assert;
import org.junit.Test;

public class VolumeTest
{
    @Test
    public void given1Gallon_ShouldReturnInlitre()
    {
        Double volume = Volume.GALLON.getConvertValue(1.0);
        Assert.assertEquals(3.78, volume, 0.0);
    }

    @Test
    public void given1Litre_ShouldReturnlitre()
    {
        Double volume = Volume.LITRE.getConvertValue(1.0);
        Assert.assertEquals(1.0, volume, 0.0);
    }

    @Test
    public void given1Mililitre_ShouldReturnInlitre()
    {
        Double volume = Volume.MILI_LITER.getConvertValue(1000.0);
        Assert.assertEquals(1.0, volume, 0.0);
    }
}
