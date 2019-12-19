package com;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {

    @Test
    public void given1Feet_ShouldReturnInInches() {
        double unitValue = Quantity.FEET.getUnitValue(1.0);
        Assert.assertEquals(12.0, unitValue, 0.0);
    }

    @Test
    public void given12Inch_ShouldReturn12Inch() {
        double unitValue = Quantity.INCH.getUnitValue(12.0);
        Assert.assertEquals(12.0, unitValue, 0.0);
    }

    @Test
    public void given1cm_ShouldReturnInInches() {
        double unitValue = Math.round(Quantity.CENTIMETER.getUnitValue(1.0));
        Assert.assertEquals(0.0, unitValue, 0.0);
    }

    @Test
    public void given1Yard_ShouldReturnInInches() {
        double unitValue = Quantity.YARD.getUnitValue(1.0);
        Assert.assertEquals(36.0, unitValue, 0.0);

    }

}
