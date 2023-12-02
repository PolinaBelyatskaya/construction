package com.solvd.construction.models.machines;

public class Excavator {

    private String brand;
    private int pricePerHour;
    private float maximumHeight;
    private float maximumDepth;


    public Excavator(String brand, int pricePerHour, float maximumHeight, float maximumDepth) {
        this.brand = brand;
        this.pricePerHour = pricePerHour;
        this.maximumHeight = maximumHeight;
        this.maximumDepth = maximumDepth;
    }

    public Excavator(String brand){

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(int pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public float getMaximumHeight() {
        return maximumHeight;
    }

    public void setMaximumHeight(float maximumHeight) {
        this.maximumHeight = maximumHeight;
    }

    public float getMaximumDepth() {
        return maximumDepth;
    }

    public void setMaximumDepth(float maximumDepth) {
        this.maximumDepth = maximumDepth;
    }
}