package com.solvd.construction.models.constructionengineering;

public class Crane extends ConstructionEngineering {

    private float maximumHeight;

    public Crane (String brand, Color color, float cargoCapacity, float pricePerHour, float maximumHeight){
        super(brand, color, cargoCapacity, pricePerHour);
        this.maximumHeight = maximumHeight;
    }

    public float getMaximumHeight() {
        return maximumHeight;
    }

    public void setMaximumHeight(float maximumHeight) {
        this.maximumHeight = maximumHeight;
    }
}
