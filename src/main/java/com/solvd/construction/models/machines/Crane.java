package com.solvd.construction.models.machines;

public class Crane extends Machine{

    private float maximumHeight;


    public Crane(String brand, int pricePerHour, float maximumHeight) {
        super (brand, pricePerHour);
        this.maximumHeight = maximumHeight;
    }

    public Crane(String brand){
        super(brand);
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





