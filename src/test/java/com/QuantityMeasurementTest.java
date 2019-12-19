package com;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest
{
    @Test
    public void given0Feetand0Feet_ShouldReturnEqual()
    {
        QuantityMeasurement QuantityMeasurement1 = new QuantityMeasurement(QuantityEnumTypes.FEET,0.0);
        QuantityMeasurement QuantityMeasurement2 = new QuantityMeasurement(QuantityEnumTypes.FEET,0.0);
        Assert.assertEquals(QuantityMeasurement1, QuantityMeasurement2);
    }

    @Test
    public void given0Feetand1Feet_ShouldReturnNotEqual()
    {
        QuantityMeasurement QuantityMeasurement1 = new QuantityMeasurement(QuantityEnumTypes.FEET,0.0);
        QuantityMeasurement QuantityMeasurement2 = new QuantityMeasurement(QuantityEnumTypes.FEET,1.0);
        boolean equals = QuantityMeasurement1.equals(QuantityMeasurement2);
        Assert.assertFalse(equals);
    }

    @Test
    public void given0Inchand0Inch_ShouldReturnEqual()
    {
        QuantityMeasurement inch1 = new QuantityMeasurement(QuantityEnumTypes.INCH,0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(QuantityEnumTypes.INCH,0.0);
        Assert.assertEquals(inch1,inch2);
    }

    @Test
    public void given0Inchand1Inch_ShouldReturnNotEqual()
    {
        QuantityMeasurement inch1 = new QuantityMeasurement(QuantityEnumTypes.INCH,0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(QuantityEnumTypes.INCH,1.0);
        Assert.assertNotEquals(inch1,inch2);
    }

    @Test
    public void given1Inchand1Feet_ShouldReturnNotEqual()
    {
        QuantityMeasurement inch1 = new QuantityMeasurement(QuantityEnumTypes.INCH,1.0);

        QuantityMeasurement QuantityMeasurement1 = new QuantityMeasurement(QuantityEnumTypes.FEET,1.0);
        Assert.assertNotEquals(inch1, QuantityMeasurement1);
    }

    @Test
    public void given0Feetand0Inch_ShouldReturnEqualLength()
    {
        QuantityMeasurement inch1 = new QuantityMeasurement(QuantityEnumTypes.INCH,0.0);
        QuantityMeasurement feet1 = new QuantityMeasurement(QuantityEnumTypes.FEET,0.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertTrue(compareCheck);
    }


    @Test
    public void given1Feetand1Inch_ShouldReturnNotEqualLength()
    {
        QuantityMeasurement inch1 = new QuantityMeasurement(QuantityEnumTypes.INCH,1.0);
        QuantityMeasurement feet1 = new QuantityMeasurement(QuantityEnumTypes.FEET,1.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1Feetand1Feet_Whencompared_ItShouldReturnEqualLength()
    {
        QuantityMeasurement feet1 = new QuantityMeasurement(QuantityEnumTypes.FEET,1.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(QuantityEnumTypes.FEET,1.0);
        boolean compareCheck = feet1.compare(feet2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1Feetand12Inch_ShouldReturnEqualLength()
    {
        QuantityMeasurement inch1 = new QuantityMeasurement(QuantityEnumTypes.INCH,12.0);
        QuantityMeasurement feet1 = new QuantityMeasurement(QuantityEnumTypes.FEET,1.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given12Inchesand1Feet_ShouldReturnEqualLength()
    {
        QuantityMeasurement feet1 = new QuantityMeasurement(QuantityEnumTypes.FEET,1.0);
        QuantityMeasurement inch1 = new QuantityMeasurement(QuantityEnumTypes.INCH,12.0);
        boolean compareCheck = inch1.compare(feet1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1Inchand1Inch_Whencompared_ItShouldReturnEqualLength()
    {
        QuantityMeasurement inch1 = new QuantityMeasurement(QuantityEnumTypes.INCH,1.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(QuantityEnumTypes.INCH,1.0);
        boolean compareCheck = inch1.compare(inch2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given12Inchesand1Feet_Whencompared_ItShouldReturnEqualLength()
    {
        QuantityMeasurement inch1 = new QuantityMeasurement(QuantityEnumTypes.INCH,12.0);
        QuantityMeasurement feet1 = new QuantityMeasurement(QuantityEnumTypes.FEET,1.0);
        boolean compareCheck = inch1.compare(feet1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1CMand1CM_Whencompared_ItShouldReturnFalse()
    {
        QuantityMeasurement centimeter1 = new QuantityMeasurement(QuantityEnumTypes.INVALID_ENUM,12.0);
        QuantityMeasurement centimeter2 = new QuantityMeasurement(QuantityEnumTypes.INVALID_ENUM,1.0);
        boolean compareCheck = centimeter1.compare(centimeter2);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1Feetand1Feet_ShouldReturnEqualLength()
    {
        QuantityMeasurement feet1 = new QuantityMeasurement(QuantityEnumTypes.FEET,1.0);
        boolean equals = feet1.equals(feet1);
        Assert.assertTrue(equals);
    }

    @Test
    public void given1Feetand1FeetNull_ShouldReturnNotEqualLength()
    {
        QuantityMeasurement feet1 = new QuantityMeasurement(QuantityEnumTypes.FEET,1.0);
        QuantityMeasurement feet2=null;
        boolean equals = feet1.equals(feet2);
        Assert.assertFalse(equals);
    }

    @Test
    public void given3Feetand1Yard_ShouldReturnEqualLength()
    {
        QuantityMeasurement feet1 = new QuantityMeasurement(QuantityEnumTypes.FEET,3.0);
        QuantityMeasurement yard1=new QuantityMeasurement(QuantityEnumTypes.YARD, 1.0);
        boolean equals = feet1.compare(yard1);
        Assert.assertTrue(equals);
    }

    @Test
    public void given1Feetand1Yard_ShouldReturnNotEqualLength()
    {
        QuantityMeasurement feet1 = new QuantityMeasurement(QuantityEnumTypes.FEET,1.0);
        QuantityMeasurement yard1=new QuantityMeasurement(QuantityEnumTypes.YARD, 1.0);
        boolean equals = feet1.compare(yard1);
        Assert.assertFalse(equals);
    }

    @Test
    public void given1Inchand1Yard_ShouldReturnNotEqualLength()
    {
        QuantityMeasurement inch1 = new QuantityMeasurement(QuantityEnumTypes.INCH,1.0);
        QuantityMeasurement yard1=new QuantityMeasurement(QuantityEnumTypes.YARD, 1.0);
        boolean equals = inch1.compare(yard1);
        Assert.assertFalse(equals);
    }

    @Test
    public void given1Yardand36Inches_ShouldReturnEqualLength()
    {
        QuantityMeasurement yard1 = new QuantityMeasurement(QuantityEnumTypes.YARD,1.0);
        QuantityMeasurement inch1=new QuantityMeasurement(QuantityEnumTypes.INCH, 36.0);
        boolean equals = yard1.compare(inch1);
        Assert.assertTrue(equals);
    }

    @Test
    public void given36Inchesand1Yard_ShouldReturnEqualLength()
    {
        QuantityMeasurement inch1=new QuantityMeasurement(QuantityEnumTypes.INCH, 36.0);
        QuantityMeasurement yard1 = new QuantityMeasurement(QuantityEnumTypes.YARD,1.0);
        boolean equals = inch1.compare(yard1);
        Assert.assertTrue(equals);
    }

    @Test
    public void given1Yardand3Feet_ShouldReturnEqualLength()
    {
        QuantityMeasurement yard1 = new QuantityMeasurement(QuantityEnumTypes.YARD,1.0);
        QuantityMeasurement feet1=new QuantityMeasurement(QuantityEnumTypes.FEET, 3.0);
        boolean equals = yard1.compare(feet1);
        Assert.assertTrue(equals);
    }

    @Test
    public void given2Inchand5Cm_ShouldReturnEqualLength()
    {
        QuantityMeasurement inch1 = new QuantityMeasurement(QuantityEnumTypes.INCH,2.0);
        QuantityMeasurement centimeter1=new QuantityMeasurement(QuantityEnumTypes.CENTIMETER, 5.0);
        boolean equals = inch1.compare(centimeter1);
        Assert.assertTrue(equals);
    }

    @Test
    public void given5cmand2Inch_ShouldReturnEqualLength()
    {
        QuantityMeasurement centimeter1=new QuantityMeasurement(QuantityEnumTypes.CENTIMETER, 5.0);
        QuantityMeasurement inch1 = new QuantityMeasurement(QuantityEnumTypes.INCH,2.0);
        boolean equals = centimeter1.compare(inch1);
        Assert.assertTrue(equals);
    }

    @Test
    public void given2Inchesand2Inches_ShouldReturn4Inches()
    {
        QuantityMeasurement inch1=new QuantityMeasurement(QuantityEnumTypes.INCH, 2.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(QuantityEnumTypes.INCH,2.0);
        double addValuesResult = inch1.addValues(inch2);
        Assert.assertEquals(4.0,addValuesResult,0.0);
    }

    @Test
    public void given1Feetand2Inches_ShouldReturn14Inches()
    {
        QuantityMeasurement feet1=new QuantityMeasurement(QuantityEnumTypes.FEET, 1.0);
        QuantityMeasurement inch1 = new QuantityMeasurement(QuantityEnumTypes.INCH,2.0);
        double addValuesResult = feet1.addValues(inch1);
        Assert.assertEquals(14.0,addValuesResult,0.0);
    }

    @Test
    public void given1Feetand1Feet_ShouldReturn24Inches()
    {
        QuantityMeasurement feet1=new QuantityMeasurement(QuantityEnumTypes.FEET, 1.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(QuantityEnumTypes.FEET,1.0);
        double addValuesResult = feet1.addValues(feet2);
        Assert.assertEquals(24.0,addValuesResult,0.0);
    }

    @Test
    public void given2Inchesand2nhalfCm_ShouldReturn3Inches()
    {
        QuantityMeasurement inch1=new QuantityMeasurement(QuantityEnumTypes.INCH, 2.0);
        QuantityMeasurement centimeter1 = new QuantityMeasurement(QuantityEnumTypes.CENTIMETER,2.5);
        double addValuesResult = inch1.addValues(centimeter1);
        Assert.assertEquals(3.0,addValuesResult,0.0);
    }

    @Test
    public void given1Gallonand1Gallon_ShouldReturnEqualQuantity()
    {
        QuantityMeasurement gallon1 = new QuantityMeasurement(QuantityEnumTypes.GALLON,1.0);
        QuantityMeasurement gallon2=new QuantityMeasurement(QuantityEnumTypes.GALLON, 1.0);
        boolean equals = gallon1.equals(gallon2);
        Assert.assertTrue(equals);
    }

    @Test
    public void given1Gallonand3Litres_ShouldReturnEqualQuantity()
    {
        QuantityMeasurement gallon1 = new QuantityMeasurement(QuantityEnumTypes.GALLON,1.0);
        QuantityMeasurement litre1=new QuantityMeasurement(QuantityEnumTypes.LITRE, 3.78);
        boolean equals = gallon1.compare(litre1);
        Assert.assertTrue(equals);
    }

    @Test
    public void given1Litreand1000Mililiter_ShouldReturnEqualQuantity()
    {
        QuantityMeasurement litre1 = new QuantityMeasurement(QuantityEnumTypes.LITRE,1.0);
        QuantityMeasurement mililitre1=new QuantityMeasurement(QuantityEnumTypes.MILI_LITER, 1000.0);
        boolean equals = litre1.compare(mililitre1);
        Assert.assertTrue(equals);
    }

    @Test
    public void given1Gallonand3785Mililiter_ShouldReturnEqualQuantity()
    {
        QuantityMeasurement gallon1 = new QuantityMeasurement(QuantityEnumTypes.GALLON,1.0);
        QuantityMeasurement mililitre1=new QuantityMeasurement(QuantityEnumTypes.MILI_LITER, 3785.0);
        boolean equals = gallon1.compare(mililitre1);
        Assert.assertTrue(equals);
    }

    @Test
    public void given1GallonandRound4liter_ShouldReturnRound8Litres()
    {
        QuantityMeasurement gallon1 = new QuantityMeasurement(QuantityEnumTypes.GALLON,1.0);
        QuantityMeasurement litre1=new QuantityMeasurement(QuantityEnumTypes.LITRE, 3.78);
        double equals = gallon1.addValues(litre1);
        Assert.assertEquals(7.57,equals,0.50);
    }

    @Test
    public void given1LitreandRound1000Mililiter_ShouldReturnRound8Litres()
    {
        QuantityMeasurement litre1 = new QuantityMeasurement(QuantityEnumTypes.LITRE,1.0);
        QuantityMeasurement mililitre1=new QuantityMeasurement(QuantityEnumTypes.MILI_LITER, 1000.0);
        double equals = litre1.addValues(mililitre1);
        Assert.assertEquals(2.0,equals,0.0);
    }

    @Test
    public void given1Kilogramand1Kilogram_ShouldReturnEqualQuantityEnumTypes()
    {
        QuantityMeasurement QuantityMeasurement1 = new QuantityMeasurement(QuantityEnumTypes.KILOGRAM, 1.0);
        QuantityMeasurement QuantityMeasurement2 = new QuantityMeasurement(QuantityEnumTypes.KILOGRAM, 1.0);
        boolean equals = QuantityMeasurement1.equals(QuantityMeasurement2);
        Assert.assertTrue(equals);
    }

    @Test
    public void given1Gramand1Gram_ShouldReturnEqualQuantityEnumTypes()
    {
        QuantityMeasurement gram1 = new QuantityMeasurement(QuantityEnumTypes.GRAM, 1000.0);
        QuantityMeasurement gram2 = new QuantityMeasurement(QuantityEnumTypes.GRAM, 1000.0);
        boolean equals = gram1.equals(gram2);
        Assert.assertTrue(equals);
    }

    @Test
    public void given1Tonneand1Tonne_ShouldReturnEqualQuantityEnumTypes()
    {
        QuantityMeasurement tonne1 = new QuantityMeasurement(QuantityEnumTypes.TONNE, 1.0);
        QuantityMeasurement tonne2 = new QuantityMeasurement(QuantityEnumTypes.TONNE, 1.0);
        boolean equals = tonne1.equals(tonne2);
        Assert.assertTrue(equals);
    }

    @Test
    public void given1Kilogramand1000Grams_ShouldReturnEqualQuantityEnumTypes()
    {
        QuantityMeasurement kilogram1 = new QuantityMeasurement(QuantityEnumTypes.KILOGRAM, 1.0);
        QuantityMeasurement gram1 = new QuantityMeasurement(QuantityEnumTypes.GRAM, 1000.0);
        boolean equals = kilogram1.compare(gram1);
        Assert.assertTrue(equals);
    }

    @Test
    public void given1Tonneand1000Kilograms_ShouldReturnEqualQuantityEnumTypes()
    {
        QuantityMeasurement tonne1 = new QuantityMeasurement(QuantityEnumTypes.TONNE, 1.0);
        QuantityMeasurement kilogram1 = new QuantityMeasurement(QuantityEnumTypes.KILOGRAM, 1000.0);
        boolean equals = tonne1.compare(kilogram1);
        Assert.assertTrue(equals);
    }

    @Test
    public void given1Tonneand1000Grams_ShouldReturn1001KilogramQuantityEnumTypes()
    {
        QuantityMeasurement tonne1 = new QuantityMeasurement(QuantityEnumTypes.TONNE, 1.0);
        QuantityMeasurement gram1 = new QuantityMeasurement(QuantityEnumTypes.GRAM, 1000.0);
        double result = tonne1.addValues(gram1);
        Assert.assertEquals(1001.0,result,0.0);
    }
}

