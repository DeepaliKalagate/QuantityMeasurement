package com;

import org.junit.Assert;
import org.junit.Test;

public class QuantityConverterTest
{
    @Test
    public void given0Feetand0Feet_ShouldReturnEqual()
    {
        QuantityConverter quantityConverter1 = new QuantityConverter(Quantity.FEET,0.0);
        QuantityConverter quantityConverter2 = new QuantityConverter(Quantity.FEET,0.0);
        Assert.assertEquals(quantityConverter1, quantityConverter2);
    }

    @Test
    public void given0Feetand1Feet_ShouldReturnNotEqual()
    {
        QuantityConverter quantityConverter1 = new QuantityConverter(Quantity.FEET,0.0);
        QuantityConverter quantityConverter2 = new QuantityConverter(Quantity.FEET,1.0);
        boolean equals = quantityConverter1.equals(quantityConverter2);
        Assert.assertFalse(equals);
    }

    @Test
    public void given0Inchand0Inch_ShouldReturnEqual()
    {
        QuantityConverter inch1 = new QuantityConverter(Quantity.INCH,0.0);
        QuantityConverter inch2 = new QuantityConverter(Quantity.INCH,0.0);
        Assert.assertEquals(inch1,inch2);
    }

    @Test
    public void given0Inchand1Inch_ShouldReturnNotEqual()
    {
        QuantityConverter inch1 = new QuantityConverter(Quantity.INCH,0.0);
        QuantityConverter inch2 = new QuantityConverter(Quantity.INCH,1.0);
        Assert.assertNotEquals(inch1,inch2);
    }

    @Test
    public void given1Inchand1Feet_ShouldReturnNotEqual()
    {
        QuantityConverter inch1 = new QuantityConverter(Quantity.INCH,1.0);

        QuantityConverter quantityConverter1 = new QuantityConverter(Quantity.FEET,1.0);
        Assert.assertNotEquals(inch1, quantityConverter1);
    }

    @Test
    public void given0Feetand0Inch_ShouldReturnEqualLength()
    {
        QuantityConverter inch1 = new QuantityConverter(Quantity.INCH,0.0);
        QuantityConverter feet1 = new QuantityConverter(Quantity.FEET,0.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertTrue(compareCheck);
    }


    @Test
    public void given1Feetand1Inch_ShouldReturnNotEqualLength()
    {
        QuantityConverter inch1 = new QuantityConverter(Quantity.INCH,1.0);
        QuantityConverter feet1 = new QuantityConverter(Quantity.FEET,1.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1Feetand1Feet_Whencompared_ItShouldReturnEqualLength()
    {
        QuantityConverter feet1 = new QuantityConverter(Quantity.FEET,1.0);
        QuantityConverter feet2 = new QuantityConverter(Quantity.FEET,1.0);
        boolean compareCheck = feet1.compare(feet2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1Feetand12Inch_ShouldReturnEqualLength()
    {
        QuantityConverter inch1 = new QuantityConverter(Quantity.INCH,12.0);
        QuantityConverter feet1 = new QuantityConverter(Quantity.FEET,1.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given12Inchesand1Feet_ShouldReturnEqualLength()
    {
        QuantityConverter feet1 = new QuantityConverter(Quantity.FEET,1.0);
        QuantityConverter inch1 = new QuantityConverter(Quantity.INCH,12.0);
        boolean compareCheck = inch1.compare(feet1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1Inchand1Inch_Whencompared_ItShouldReturnEqualLength()
    {
        QuantityConverter inch1 = new QuantityConverter(Quantity.INCH,1.0);
        QuantityConverter inch2 = new QuantityConverter(Quantity.INCH,1.0);
        boolean compareCheck = inch1.compare(inch2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given12Inchesand1Feet_Whencompared_ItShouldReturnEqualLength()
    {
        QuantityConverter inch1 = new QuantityConverter(Quantity.INCH,12.0);
        QuantityConverter feet1 = new QuantityConverter(Quantity.FEET,1.0);
        boolean compareCheck = inch1.compare(feet1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1CMand1CM_Whencompared_ItShouldReturnFalse()
    {
        QuantityConverter centimeter1 = new QuantityConverter(Quantity.INVALID_ENUM,12.0);
        QuantityConverter centimeter2 = new QuantityConverter(Quantity.INVALID_ENUM,1.0);
        boolean compareCheck = centimeter1.compare(centimeter2);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1Feetand1Feet_ShouldReturnEqualLength()
    {
        QuantityConverter feet1 = new QuantityConverter(Quantity.FEET,1.0);
        boolean equals = feet1.equals(feet1);
        Assert.assertTrue(equals);
    }

    @Test
    public void given1Feetand1FeetNull_ShouldReturnNotEqualLength()
    {
        QuantityConverter feet1 = new QuantityConverter(Quantity.FEET,1.0);
        QuantityConverter feet2=null;
        boolean equals = feet1.equals(feet2);
        Assert.assertFalse(equals);
    }

    @Test
    public void given3Feetand1Yard_ShouldReturnEqualLength()
    {
        QuantityConverter feet1 = new QuantityConverter(Quantity.FEET,3.0);
        QuantityConverter yard1=new QuantityConverter(Quantity.YARD, 1.0);
        boolean equals = feet1.compare(yard1);
        Assert.assertTrue(equals);
    }

    @Test
    public void given1Feetand1Yard_ShouldReturnNotEqualLength()
    {
        QuantityConverter feet1 = new QuantityConverter(Quantity.FEET,1.0);
        QuantityConverter yard1=new QuantityConverter(Quantity.YARD, 1.0);
        boolean equals = feet1.compare(yard1);
        Assert.assertFalse(equals);
    }

    @Test
    public void given1Inchand1Yard_ShouldReturnNotEqualLength()
    {
        QuantityConverter inch1 = new QuantityConverter(Quantity.INCH,1.0);
        QuantityConverter yard1=new QuantityConverter(Quantity.YARD, 1.0);
        boolean equals = inch1.compare(yard1);
        Assert.assertFalse(equals);
    }

    @Test
    public void given1Yardand36Inches_ShouldReturnEqualLength()
    {
        QuantityConverter yard1 = new QuantityConverter(Quantity.YARD,1.0);
        QuantityConverter inch1=new QuantityConverter(Quantity.INCH, 36.0);
        boolean equals = yard1.compare(inch1);
        Assert.assertTrue(equals);
    }

    @Test
    public void given36Inchesand1Yard_ShouldReturnEqualLength()
    {
        QuantityConverter inch1=new QuantityConverter(Quantity.INCH, 36.0);
        QuantityConverter yard1 = new QuantityConverter(Quantity.YARD,1.0);
        boolean equals = inch1.compare(yard1);
        Assert.assertTrue(equals);
    }

    @Test
    public void given1Yardand3Feet_ShouldReturnEqualLength()
    {
        QuantityConverter yard1 = new QuantityConverter(Quantity.YARD,1.0);
        QuantityConverter feet1=new QuantityConverter(Quantity.FEET, 3.0);
        boolean equals = yard1.compare(feet1);
        Assert.assertTrue(equals);
    }

    @Test
    public void given2Inchand5Cm_ShouldReturnEqualLength()
    {
        QuantityConverter inch1 = new QuantityConverter(Quantity.INCH,2.0);
        QuantityConverter centimeter1=new QuantityConverter(Quantity.CENTIMETER, 5.0);
        boolean equals = inch1.compare(centimeter1);
        Assert.assertTrue(equals);
    }

    @Test
    public void given5cmand2Inch_ShouldReturnEqualLength()
    {
        QuantityConverter centimeter1=new QuantityConverter(Quantity.CENTIMETER, 5.0);
        QuantityConverter inch1 = new QuantityConverter(Quantity.INCH,2.0);
        boolean equals = centimeter1.compare(inch1);
        Assert.assertTrue(equals);
    }

    @Test
    public void given2Inchesand2Inches_ShouldReturn4Inches()
    {
        QuantityConverter inch1=new QuantityConverter(Quantity.INCH, 2.0);
        QuantityConverter inch2 = new QuantityConverter(Quantity.INCH,2.0);
        double addValuesResult = inch1.addValues(inch2);
        Assert.assertEquals(4.0,addValuesResult,0.0);
    }

    @Test
    public void given1Feetand2Inches_ShouldReturn14Inches()
    {
        QuantityConverter feet1=new QuantityConverter(Quantity.FEET, 1.0);
        QuantityConverter inch1 = new QuantityConverter(Quantity.INCH,2.0);
        double addValuesResult = feet1.addValues(inch1);
        Assert.assertEquals(14.0,addValuesResult,0.0);
    }

    @Test
    public void given1Feetand1Feet_ShouldReturn24Inches()
    {
        QuantityConverter feet1=new QuantityConverter(Quantity.FEET, 1.0);
        QuantityConverter feet2 = new QuantityConverter(Quantity.FEET,1.0);
        double addValuesResult = feet1.addValues(feet2);
        Assert.assertEquals(24.0,addValuesResult,0.0);
    }

    @Test
    public void given2Inchesand2nhalfCm_ShouldReturn3Inches()
    {
        QuantityConverter inch1=new QuantityConverter(Quantity.INCH, 2.0);
        QuantityConverter centimeter1 = new QuantityConverter(Quantity.CENTIMETER,2.5);
        double addValuesResult = inch1.addValues(centimeter1);
        Assert.assertEquals(3.0,addValuesResult,0.0);
    }
}
