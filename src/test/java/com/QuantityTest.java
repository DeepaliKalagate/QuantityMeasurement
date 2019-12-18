package com;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTest
{
    @Test
    public void given0Feetand0Feet_ShouldReturnEqual()
    {
        Length length1 = new Length(Unit.FEET,0.0);
        Length length2 = new Length(Unit.FEET,0.0);
        Assert.assertEquals(length1, length2);
    }

    @Test
    public void given0Feetand1Feet_ShouldReturnNotEqual()
    {
        Length length1 = new Length(Unit.FEET,0.0);
        Length length2 = new Length(Unit.FEET,1.0);
        boolean equals = length1.equals(length2);
        Assert.assertFalse(equals);
    }

    @Test
    public void given0Inchand0Inch_ShouldReturnEqual()
    {
        Length inch1 = new Length(Unit.INCH,0.0);
        Length inch2 = new Length(Unit.INCH,0.0);
        Assert.assertEquals(inch1,inch2);
    }

    @Test
    public void given0Inchand1Inch_ShouldReturnNotEqual()
    {
        Length inch1 = new Length(Unit.INCH,0.0);
        Length inch2 = new Length(Unit.INCH,1.0);
        Assert.assertNotEquals(inch1,inch2);
    }

    @Test
    public void given1Inchand1Feet_ShouldReturnNotEqual()
    {
        Length inch1 = new Length(Unit.INCH,1.0);

        Length length1 = new Length(Unit.FEET,1.0);
        Assert.assertNotEquals(inch1,length1);
    }

    @Test
    public void given0Feetand0Inch_ShouldReturnEqualLength()
    {
        Length inch1 = new Length(Unit.INCH,0.0);
        Length feet1 = new Length(Unit.FEET,0.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertTrue(compareCheck);
    }


    @Test
    public void given1Feetand1Inch_ShouldReturnNotEqualLength()
    {
        Length inch1 = new Length(Unit.INCH,1.0);
        Length feet1 = new Length(Unit.FEET,1.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1Feetand1Feet_Whencompared_ItShouldReturnEqualLength()
    {
        Length feet1 = new Length(Unit.FEET,1.0);
        Length feet2 = new Length(Unit.FEET,1.0);
        boolean compareCheck = feet1.compare(feet2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1Feetand12Inch_ShouldReturnEqualLength()
    {
        Length inch1 = new Length(Unit.INCH,12.0);
        Length feet1 = new Length(Unit.FEET,1.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given12Inchesand1Feet_ShouldReturnEqualLength()
    {
        Length feet1 = new Length(Unit.FEET,1.0);
        Length inch1 = new Length(Unit.INCH,12.0);
        boolean compareCheck = inch1.compare(feet1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1Inchand1Inch_Whencompared_ItShouldReturnEqualLength()
    {
        Length inch1 = new Length(Unit.INCH,1.0);
        Length inch2 = new Length(Unit.INCH,1.0);
        boolean compareCheck = inch1.compare(inch2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given12Inchesand1Feet_Whencompared_ItShouldReturnEqualLength()
    {
        Length inch1 = new Length(Unit.INCH,12.0);
        Length feet1 = new Length(Unit.FEET,1.0);
        boolean compareCheck = inch1.compare(feet1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1CMand1CM_Whencompared_ItShouldReturnFalse()
    {
        Length centimeter1 = new Length(Unit.CENTIMETER,12.0);
        Length centimeter2 = new Length(Unit.CENTIMETER,1.0);
        boolean compareCheck = centimeter1.compare(centimeter2);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1Feetand1Feet_ShouldReturnEqualLength()
    {
        Length feet1 = new Length(Unit.FEET,1.0);
        boolean equals = feet1.equals(feet1);
        Assert.assertTrue(equals);
    }

    @Test
    public void given1Feetand1FeetNull_ShouldReturnNotEqualLength()
    {
        Length feet1 = new Length(Unit.FEET,1.0);
        Length feet2=null;
        boolean equals = feet1.equals(feet2);
        Assert.assertFalse(equals);
    }

    @Test
    public void given3Feetand1Yard_ShouldReturnEqualLength()
    {
        Length feet1 = new Length(Unit.FEET,3.0);
        Length yard1=new Length(Unit.YARD, 1.0);
        boolean equals = feet1.compare(yard1);
        Assert.assertTrue(equals);
    }

    @Test
    public void given1Feetand1Yard_ShouldReturnNotEqualLength()
    {
        Length feet1 = new Length(Unit.FEET,1.0);
        Length yard1=new Length(Unit.YARD, 1.0);
        boolean equals = feet1.compare(yard1);
        Assert.assertFalse(equals);
    }

    @Test
    public void given1Inchand1Yard_ShouldReturnNotEqualLength()
    {
        Length inch1 = new Length(Unit.INCH,1.0);
        Length yard1=new Length(Unit.YARD, 1.0);
        boolean equals = inch1.compare(yard1);
        Assert.assertFalse(equals);
    }

    @Test
    public void given1Yardand36Inches_ShouldReturnEqualLength()
    {
        Length yard1 = new Length(Unit.YARD,1.0);
        Length inch1=new Length(Unit.INCH, 36.0);
        boolean equals = yard1.compare(inch1);
        Assert.assertTrue(equals);
    }

    @Test
    public void given36Inchesand1Yard_ShouldReturnEqualLength()
    {
        Length inch1=new Length(Unit.INCH, 36.0);
        Length yard1 = new Length(Unit.YARD,1.0);
        boolean equals = inch1.compare(yard1);
        Assert.assertTrue(equals);
    }

    @Test
    public void given1Yardand3Feet_ShouldReturnEqualLength()
    {
        Length yard1 = new Length(Unit.YARD,1.0);
        Length feet1=new Length(Unit.FEET, 3.0);
        boolean equals = yard1.compare(feet1);
        Assert.assertTrue(equals);
    }

    @Test
    public void given2Inchand5Cm_ShouldReturnEqualLength()
    {
        Length inch1 = new Length(Unit.INCH,2.0);
        Length centimeter1=new Length(Unit.CENTIMETER, 5.0);
        boolean equals = inch1.compare(centimeter1);
        Assert.assertTrue(equals);
    }

    @Test
    public void given5cmand2Inch_ShouldReturnEqualLength()
    {
        Length centimeter1=new Length(Unit.CENTIMETER, 5.0);
        Length inch1 = new Length(Unit.INCH,2.0);
        boolean equals = centimeter1.compare(inch1);
        Assert.assertTrue(equals);
    }

    @Test
    public void given2Inchesand2Inches_ShouldReturn4Inches()
    {
        Length inch1=new Length(Unit.INCH, 2.0);
        Length inch2 = new Length(Unit.INCH,2.0);
        double addValuesResult = inch1.addValues(inch2);
        Assert.assertEquals(4.0,addValuesResult,0.0);
    }
}
