package com.solvd.construction.models.constructionengineering;

public abstract class ConstructionEngineering {

    private String brand;
    private Color color;
    private float cargoCapacity;
    private float pricePerHour;
    private int weight;

    public ConstructionEngineering(){

    }

    public ConstructionEngineering (String brand, Color color, float cargoCapacity, float pricePerHour, int weight){
        this.brand = brand;
        this.color = color;
        this.cargoCapacity = cargoCapacity;
        this.pricePerHour = pricePerHour;
        this.weight = weight;
    }

    public ConstructionEngineering (String brand, float cargoCapacity, int weight){
        this.brand = brand;
        this.cargoCapacity = cargoCapacity;
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public float getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(float cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public float getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(float pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
