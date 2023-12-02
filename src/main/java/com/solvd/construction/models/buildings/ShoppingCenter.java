package com.solvd.construction.models.buildings;

import java.time.LocalDate;

public class ShoppingCenter {

    private int shopsNumber;
    private int utilityRoomsNumber;
    private int floorsNumber;
    private int floorsHeight;
    private int area;
    private LocalDate constructionYear;
    private String address;

    public ShoppingCenter(int shopsNumber, int utilityRoomsNumber, int floorsNumber, int floorsHeight, int area, LocalDate constructionYear, String address) {
        this.shopsNumber = shopsNumber;
        this.utilityRoomsNumber = utilityRoomsNumber;
        this.floorsNumber = floorsNumber;
        this.floorsHeight = floorsHeight;
        this.area = area;
        this.constructionYear = constructionYear;
        this.address = address;

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

    public int getFloorsNumber() {
        return floorsNumber;
    }

    public void setFloorsNumber(int floorsNumber) {
        this.floorsNumber = floorsNumber;
    }

    public int getFloorsHeight() {
        return floorsHeight;
    }

    public void setFloorsHeight(int floorsHeight) {
        this.floorsHeight = floorsHeight;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public LocalDate getConstructionYear() {
        return constructionYear;
    }

    public void setConstructionYear(LocalDate constructionYear) {
        this.constructionYear = constructionYear;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

