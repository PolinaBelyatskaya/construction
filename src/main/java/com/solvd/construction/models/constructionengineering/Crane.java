package com.solvd.construction.models.constructionengineering;

public class Crane extends ConstructionEngineering {

    private float maximumHeight;

    public Crane (String brand, Color color, float cargoCapacity, float pricePerHour, int weight, float maximumHeight){
        super(brand, color, cargoCapacity, pricePerHour, weight);
        this.maximumHeight = maximumHeight;
    }

    public Crane (String brand, float cargoCapacity, int weight){
        super(brand, cargoCapacity, weight);
    }

    public float getMaximumHeight() {
        return maximumHeight;
    }

    public void setMaximumHeight(float maximumHeight) {
        this.maximumHeight = maximumHeight;
    }
}
