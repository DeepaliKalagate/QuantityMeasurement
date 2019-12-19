package com;

public enum QuantityEnumTypes {

    FEET(12.0),INCH(1.0),CENTIMETER(1.0/2.5),YARD(36.0),
    INVALID_ENUM(1.0),
    GALLON(3.78), LITRE(1.0),MILI_LITER(1.0/1000.0),
    KILOGRAM(1.0),TONNE(1000.0),GRAM(1.0/1000.0);


    private final double conversionFactor;
    public double value;

    QuantityEnumTypes(double conversionFactor)
    {
        this.conversionFactor = conversionFactor;
    }

    public double getUnitValue(double value)
    {
        return this.conversionFactor*value;
    }

}
