package com.solvd.construction.models.constructionengineering;

public class Excavator extends ConstructionEngineering {

    private float maximumHeight;
    private float maximumDepth;

    public Excavator(){

        super ();
    }

    public Excavator(String brand, Color color, float cargoCapacity, float pricePerHour, int weight, float maximumHeight, float maximumDepth) {
        super(brand, color, cargoCapacity, pricePerHour, weight);
        this.maximumHeight = maximumHeight;
        this.maximumDepth = maximumDepth;
    }

    public Excavator (String brand, float cargoCapacity, int weight){
        super(brand, cargoCapacity, weight);
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
