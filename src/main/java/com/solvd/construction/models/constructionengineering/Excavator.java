package com.solvd.construction.models.constructionengineering;

public class Excavator extends ConstructionEngineering {

    private float maximumHeight;
    private float maximumDepth;

    public Excavator(String brand, Color color, float cargoCapacity, float pricePerHour, float maximumHeight, float maximumDepth) {
        super(brand, color, cargoCapacity, pricePerHour);
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
