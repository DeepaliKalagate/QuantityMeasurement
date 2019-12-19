package com;

import org.junit.Assert;
import org.junit.Test;

public class QuantityConverterTest {

    @Test
    public void given1Gallonand1Gallon_ShouldReturnEqualLength()
    {
        QuantityConverter gallon1 = new QuantityConverter(Quantity.GALLON,1.0);
        QuantityConverter gallon2=new QuantityConverter(Quantity.GALLON, 1.0);
        boolean equals = gallon1.equals(gallon2);
        Assert.assertTrue(equals);
    }

    @Test
    public void given1Gallonand3Litres_ShouldReturnCompareLength()
    {
        QuantityConverter gallon1 = new QuantityConverter(Quantity.GALLON,1.0);
        QuantityConverter litre1=new QuantityConverter(Quantity.LITRE, 3.7850);
        boolean equals = gallon1.compare(litre1);
        Assert.assertTrue(equals);
    }
}
