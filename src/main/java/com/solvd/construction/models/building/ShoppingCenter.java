package com.solvd.construction.models.building;

public class ShoppingCenter extends Building {

    private int shopsNumber;

    public ShoppingCenter(String area, int floorsNumber, String floorsHeight,int shopsNumber) {
        super(area, floorsNumber, floorsHeight);
        this.shopsNumber = shopsNumber;
    }

    public int getShopsNumber() {
        return shopsNumber;
    }

    public void setShopsNumber(int shopsNumber) {
        this.shopsNumber = shopsNumber;
    }
}

