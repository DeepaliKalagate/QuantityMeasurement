package com;

public class VolumeConverter
{
    private double value;
    private Volume volume;

    public VolumeConverter(Volume volume, double value)
    {
        this.volume = volume;
        this.value = value;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VolumeConverter that = (VolumeConverter) o;
        return Double.compare(that.value, value) == 0 &&
                volume == that.volume;
    }

    public boolean compare(VolumeConverter that)
    {
        double volume1 = (this.volume.getVolumeValue(this.value));
        double volume2 = (that.volume.getVolumeValue(that.value));
        return Double.compare(volume1, volume2)==0;
    }

    public double addVolume(VolumeConverter that)
    {
        double volume1 = (this.volume.getVolumeValue(this.value));
        double volume2 = (that.volume.getVolumeValue(that.value));
        double result= Double.sum(volume1, volume2);
        return result/1000;

    }
}
