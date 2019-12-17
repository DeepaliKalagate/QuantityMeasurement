package com;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {
    @Test
    public void given0Feetand0Feet_ShouldReturnEqual() {
        Length length1 = new Length(Length.Unit.FEET,0.0);
        Length length2 = new Length(Length.Unit.FEET,0.0);
        Assert.assertEquals(length1, length2);
    }

    @Test
    public void given0Feetand1Feet_ShouldReturnNotEqual() {
        Length length1 = new Length(Length.Unit.FEET,0.0);
        Length length2 = new Length(Length.Unit.FEET,1.0);
        boolean equals = length1.equals(length2);
        Assert.assertFalse(equals);
    }

    @Test
    public void given0Inchand0Inch_ShouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,0.0);
        Assert.assertEquals(inch1,inch2);
    }

    @Test
    public void given0Inchand1Inch_ShouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,1.0);
        Assert.assertNotEquals(inch1,inch2);
    }
    @Test
    public void given1Inchand1Feet_ShouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH,1.0);
        Length length1 = new Length(Length.Unit.FEET,1.0);
        Assert.assertNotEquals(inch1,length1);
    }
}
