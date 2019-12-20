package com;
import org.junit.Assert;
import org.junit.Test;

public class QuantityEnumTypesTest
{
    @Test
    public void given1Feet_ShouldReturnInInches()
    {
        double unitValue = QuantityEnumTypes.FEET.getUnitValue(1.0);
        Assert.assertEquals(12.0, unitValue, 0.0);
    }

    @Test
    public void given12Inch_ShouldReturn12Inch()
    {
        double unitValue = QuantityEnumTypes.INCH.getUnitValue(12.0);
        Assert.assertEquals(12.0, unitValue, 0.0);
    }

    @Test
    public void given1cm_ShouldReturnInInches()
    {
        double unitValue = Math.round(QuantityEnumTypes.CENTIMETER.getUnitValue(1.0));
        Assert.assertEquals(0.0, unitValue, 0.0);
    }

    @Test
    public void given1Yard_ShouldReturnInInches()
    {
        double unitValue = QuantityEnumTypes.YARD.getUnitValue(1.0);
        Assert.assertEquals(36.0, unitValue, 0.0);
    }

    @Test
    public void given1Gallon_ShouldReturnInlitre()
    {
        double volume = QuantityEnumTypes.GALLON.getUnitValue(1.0);
        Assert.assertEquals(3.78, volume, 0.0);
    }

    @Test
    public void given1Litre_ShouldReturnlitre()
    {
        double volume = QuantityEnumTypes.LITRE.getUnitValue(1.0);
        Assert.assertEquals(1.0, volume, 0.0);
    }

    @Test
    public void given1Mililitre_ShouldReturnInlitre()
    {
        double volume = QuantityEnumTypes.MILI_LITER.getUnitValue(1000.0);
        Assert.assertEquals(1.0, volume, 0.0);
    }

    @Test
    public void given1Kilogram_ShouldReturnInKilogram()
    {
        double weightValue = QuantityEnumTypes.KILOGRAM.getUnitValue(1.0);
        Assert.assertEquals(1.0, weightValue, 0.0);
    }

    @Test
    public void given1Tonne_ShouldReturnInKilogram()
    {
        double weightValue = QuantityEnumTypes.TONNE.getUnitValue(1.0);
        Assert.assertEquals(1000.0, weightValue, 0.0);
    }

    @Test
    public void given1000Gram_ShouldReturnInKilogram()
    {
        double weightValue = QuantityEnumTypes.GRAM.getUnitValue(1000.0);
        Assert.assertEquals(1.0, weightValue, 0.0);
    }
}
