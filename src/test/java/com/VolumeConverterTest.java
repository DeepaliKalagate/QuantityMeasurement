package com;

import org.junit.Assert;
import org.junit.Test;

public class VolumeConverterTest {

    @Test
    public void given1Gallonand1Gallon_ShouldReturnEqualQuantity()
    {
        VolumeConverter gallon1 = new VolumeConverter(Volume.GALLON,1.0);
        VolumeConverter gallon2=new VolumeConverter(Volume.GALLON, 1.0);
        boolean equals = gallon1.equals(gallon2);
        Assert.assertTrue(equals);
    }

    @Test
    public void given1Gallonand3Litres_ShouldReturnEqualQuantity()
    {
        VolumeConverter gallon1 = new VolumeConverter(Volume.GALLON,1.0);
        VolumeConverter litre1=new VolumeConverter(Volume.LITRE, 3.7850);
        boolean equals = gallon1.compare(litre1);
        Assert.assertTrue(equals);
    }

    @Test
    public void given1Litreand1000Mililiter_ShouldReturnEqualQuantity()
    {
        VolumeConverter litre1 = new VolumeConverter(Volume.LITRE,1.0);
        VolumeConverter mililitre1=new VolumeConverter(Volume.MILI_LITER, 1000.0);
        boolean equals = litre1.compare(mililitre1);
        Assert.assertTrue(equals);
    }

    @Test
    public void given1Gallonand3785Mililiter_ShouldReturnEqualQuantity()
    {
        VolumeConverter gallon1 = new VolumeConverter(Volume.GALLON,1.0);
        VolumeConverter mililitre1=new VolumeConverter(Volume.MILI_LITER, 3785.0);
        boolean equals = gallon1.compare(mililitre1);
        Assert.assertTrue(equals);
    }

    @Test
    public void given1GallonandRound4liter_ShouldReturnRound8Litres()
    {
        VolumeConverter gallon1 = new VolumeConverter(Volume.GALLON,1.0);
        VolumeConverter litre1=new VolumeConverter(Volume.LITRE, 3.78);
        double equals = gallon1.addVolume(litre1);
        Assert.assertEquals(7.57,equals,0.50);
    }

    @Test
    public void given1LitreandRound1000Mililiter_ShouldReturnRound8Litres()
    {
        VolumeConverter litre1 = new VolumeConverter(Volume.LITRE,1.0);
        VolumeConverter mililitre1=new VolumeConverter(Volume.MILI_LITER, 1000.0);
        double equals = litre1.addVolume(mililitre1);
        Assert.assertEquals(2.0,equals,0.0);
    }
}
