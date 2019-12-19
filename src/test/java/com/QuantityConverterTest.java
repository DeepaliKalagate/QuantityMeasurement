package com;

import org.junit.Assert;
import org.junit.Test;

public class QuantityConverterTest {

    @Test
    public void given1Gallonand1Gallon_ShouldReturnEqualQuantity()
    {
        QuantityConverter gallon1 = new QuantityConverter(Quantity.GALLON,1.0);
        QuantityConverter gallon2=new QuantityConverter(Quantity.GALLON, 1.0);
        boolean equals = gallon1.equals(gallon2);
        Assert.assertTrue(equals);
    }

    @Test
    public void given1Gallonand3Litres_ShouldReturnEqualQuantity()
    {
        QuantityConverter gallon1 = new QuantityConverter(Quantity.GALLON,1.0);
        QuantityConverter litre1=new QuantityConverter(Quantity.LITRE, 3.7850);
        boolean equals = gallon1.compare(litre1);
        Assert.assertTrue(equals);
    }

    @Test
    public void given1Litreand1000Mililiter_ShouldReturnEqualQuantity()
    {
        QuantityConverter litre1 = new QuantityConverter(Quantity.LITRE,1.0);
        QuantityConverter mililitre1=new QuantityConverter(Quantity.MILI_LITER, 1000.0);
        boolean equals = litre1.compare(mililitre1);
        Assert.assertTrue(equals);
    }

    @Test
    public void given1Gallonand3785Mililiter_ShouldReturnEqualQuantity()
    {
        QuantityConverter gallon1 = new QuantityConverter(Quantity.GALLON,1.0);
        QuantityConverter mililitre1=new QuantityConverter(Quantity.MILI_LITER, 3785.0);
        boolean equals = gallon1.compare(mililitre1);
        Assert.assertTrue(equals);
    }
}
