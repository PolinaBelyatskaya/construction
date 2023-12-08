package com.solvd.construction.models.machines;

public abstract class Machine {

    private String brand;
    private int pricePerHour;
    protected static int machineCount = 0;

    public Machine(String brand, int pricePerHour) {
        this.brand = brand;
        this.pricePerHour = pricePerHour;
    }

    public Machine(String brand) {
        this.brand = brand;
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

}
