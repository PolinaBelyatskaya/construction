package com.solvd.construction.models.building;

public class ShoppingCenter extends Building {

    private int shopsNumber;

    public ShoppingCenter() {
    }

    public ShoppingCenter(String area, int constructionYear, int floorsNumber, String floorsHeight, String type, int shopsNumber) {
        super(area, constructionYear, floorsNumber, floorsHeight, type);
        this.shopsNumber = shopsNumber;
    }

    public int getShopsNumber() {
        return shopsNumber;
    }

    public void setShopsNumber(int shopsNumber) {
        this.shopsNumber = shopsNumber;
    }
}

