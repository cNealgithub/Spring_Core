package com.springcore.AutoWire.ViaAnnotation;

public class Bluetooth {
    private String series;
    private double version;

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }
    public Bluetooth(){
        super();
    }

    @Override
    public String toString() {
        return "Bluetooth{" +
                "series='" + series + '\'' +
                ", version=" + version +
                '}';
    }
}
