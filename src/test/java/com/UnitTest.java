package com;

import org.junit.Assert;
import org.junit.Test;

public class UnitTest
{
    @Test
    public void given1Feet_ShouldReturnInInches()
    {
        double unitValue = Unit.FEET.getUnitValue(1.0);
        Assert.assertEquals(12.0,unitValue,0.0);
    }

    @Test
    public  void given12Inch_ShouldReturn12Inch()
    {
        double unitValue = Unit.INCH.getUnitValue(12.0);
        Assert.assertEquals(12.0,unitValue,0.0);
    }

    @Test
    public  void given1cm_ShouldReturnInInches()
    {
        double unitValue = Math.round(Unit.INCH.getUnitValue(1.0));
        Assert.assertEquals(1.0,unitValue,0.0);

    }

}
