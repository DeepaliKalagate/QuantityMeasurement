package com;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTest
{
    @Test
    public void given0Feetand0Feet_ShouldReturnEqual()
    {
        Length length1 = new Length(Length.Unit.FEET,0.0);
        Length length2 = new Length(Length.Unit.FEET,0.0);
        Assert.assertEquals(length1, length2);
    }

    @Test
    public void given0Feetand1Feet_ShouldReturnNotEqual()
    {
        Length length1 = new Length(Length.Unit.FEET,0.0);
        Length length2 = new Length(Length.Unit.FEET,1.0);
        boolean equals = length1.equals(length2);
        Assert.assertFalse(equals);
    }

    @Test
    public void given0Inchand0Inch_ShouldReturnEqual()
    {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,0.0);
        Assert.assertEquals(inch1,inch2);
    }

    @Test
    public void given0Inchand1Inch_ShouldReturnNotEqual()
    {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,1.0);
        Assert.assertNotEquals(inch1,inch2);
    }

    @Test
    public void given1Inchand1Feet_ShouldReturnNotEqual()
    {
        Length inch1 = new Length(Length.Unit.INCH,1.0);
        Length length1 = new Length(Length.Unit.FEET,1.0);
        Assert.assertNotEquals(inch1,length1);
    }

    @Test
    public void given0Feetand0Inch_ShouldReturnEqualLength()
    {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1Feetand1Inch_ShouldReturnNotEqualLength()
    {
        Length inch1 = new Length(Length.Unit.INCH,1.0);
        Length feet1 = new Length(Length.Unit.FEET,1.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1Feetand1Feet_Whencompared_ItShouldReturnEqualLength()
    {
        Length feet1 = new Length(Length.Unit.FEET,1.0);
        Length feet2 = new Length(Length.Unit.FEET,1.0);
        boolean compareCheck = feet1.compare(feet2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1Feetand12Inch_ShouldReturnEqualLength()
    {
        Length inch1 = new Length(Length.Unit.INCH,12.0);
        Length feet1 = new Length(Length.Unit.FEET,1.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given12Inchesand1Feet_ShouldReturnEqualLength()
    {
        Length feet1 = new Length(Length.Unit.FEET,1.0);
        Length inch1 = new Length(Length.Unit.INCH,12.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1Inchand1Inch_Whencompared_ItShouldReturnEqualLength()
    {
        Length inch1 = new Length(Length.Unit.INCH,1.0);
        Length inch2 = new Length(Length.Unit.INCH,1.0);
        boolean compareCheck = inch1.compare(inch2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given12Inchesand1Feet_Whencompared_ItShouldReturnEqualLength()
    {
        Length inch1 = new Length(Length.Unit.INCH,12.0);
        Length feet1 = new Length(Length.Unit.FEET,1.0);
        boolean compareCheck = inch1.compare(feet1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1CMand1CM_Whencompared_ItShouldReturnFalse()
    {
        Length centimeter1 = new Length(Length.Unit.CENTIMETER,12.0);
        Length centimeter2 = new Length(Length.Unit.CENTIMETER,1.0);
        boolean compareCheck = centimeter1.compare(centimeter2);
        Assert.assertFalse(compareCheck);
    }
}
