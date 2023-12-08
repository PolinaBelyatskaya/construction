package com.solvd.construction.models.buildings;

import java.time.LocalDate;

public class ShoppingCenter extends Building{

    private int shopsNumber;
    private int utilityRoomsNumber;

    public ShoppingCenter(int shopsNumber, int utilityRoomsNumber, int floorsNumber, int floorsHeight, int area, LocalDate constructionYear, String address) {
        super (floorsNumber, floorsHeight, area, constructionYear, address);
        this.shopsNumber = shopsNumber;
        this.utilityRoomsNumber = utilityRoomsNumber;
    }

    public ShoppingCenter(String address, int floorsNumber){
        super (address, floorsNumber);
    }

    public int getShopsNumber() {
        return shopsNumber;
    }

    public void setShopsNumber(int shopsNumber) {
        this.shopsNumber = shopsNumber;
    }

    public int getUtilityRoomsNumber() {
        return utilityRoomsNumber;
    }

    public void setUtilityRoomsNumber(int utilityRoomsNumber) {
        this.utilityRoomsNumber = utilityRoomsNumber;
    }

}

