package com.solvd.construction.models.machines;

public class Crane {

    private String brand;
    private int pricePerHour;
    private float maximumHeight;


    public Crane(String brand, int pricePerHour, float maximumHeight) {
        this.brand = brand;
        this.pricePerHour = pricePerHour;
        this.maximumHeight = maximumHeight;
    }

    public Crane(String brand){

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

    public void lift(){}

    public void lift (Lorry lorry){}

}





