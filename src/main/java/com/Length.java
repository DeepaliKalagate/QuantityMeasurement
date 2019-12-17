package com;

public class Length {
    private static final double FEET_TO_INCH = 12.0;
    private static final double INCH_TO_FEET = 1.0;
    private static final double FEET_TO_YARD = 3 ;
    private final Unit unit;
    private final double value;
    public Length(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }
    public boolean compare(Length thatLength) {
        if (this.unit.equals(Unit.FEET) && thatLength.unit.equals(Unit.FEET))
            return Double.compare(this.value, thatLength.value) == 0;
        if (this.unit.equals(Unit.FEET) && thatLength.unit.equals(Unit.INCH))
            return Double.compare(this.value * FEET_TO_INCH, thatLength.value) == 0;
        if (this.unit.equals(Unit.INCH) && thatLength.unit.equals(Unit.INCH))
            return Double.compare(this.value, thatLength.value) == 0;
        if (this.unit.equals(Unit.INCH) && thatLength.unit.equals(Unit.FEET))
            return Double.compare(this.value * INCH_TO_FEET, thatLength.value*FEET_TO_INCH) == 0;
        if (this.unit.equals(Unit.FEET) && thatLength.unit.equals(Unit.YARD))
            return Double.compare(this.value , thatLength.value * FEET_TO_YARD) == 0;

        return false;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 &&
                unit == length.unit;
    }
}
