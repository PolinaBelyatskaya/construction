package com.solvd.construction.models.machines;

public class Excavator extends Machine{

    private float maximumHeight;
    private float maximumDepth;


    public Excavator(String brand, int pricePerHour, float maximumHeight, float maximumDepth) {
        super (brand, pricePerHour);
        this.maximumHeight = maximumHeight;
        this.maximumDepth = maximumDepth;
    }

    public Excavator(String brand){
        super (brand);
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