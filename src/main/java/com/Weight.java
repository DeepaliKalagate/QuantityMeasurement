package com;

public enum Weight {

        KILOGRAM(1.0),TONNE(1000.0),GRAM(1.0/1000.0),INVALID_ENUM(1.0);

        private final double conversionFactor;

        Weight(double conversionFactor)
        {
            this.conversionFactor = conversionFactor;
        }

        public double getWeightValue(double value)
        {
            return this.conversionFactor*value;
        }
}
