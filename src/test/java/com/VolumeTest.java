package com;

import org.junit.Assert;
import org.junit.Test;

public class VolumeTest
{
    @Test
    public void given1Gallon_ShouldReturnInMililitre()
    {
        double volume = Volume.GALLON.getVolumeValue(1.0);
        Assert.assertEquals(3785.0, volume, 0.0);
    }

    @Test
    public void given1Litre_ShouldReturnInMililitre()
    {
        double volume = Volume.LITRE.getVolumeValue(1.0);
        Assert.assertEquals(1000.0, volume, 0.0);
    }

    @Test
    public void given1Mililitre_ShouldReturnInMililitre()
    {
        double volume = Volume.MILI_LITER.getVolumeValue(1.0);
        Assert.assertEquals(1.0, volume, 0.0);
    }
}
