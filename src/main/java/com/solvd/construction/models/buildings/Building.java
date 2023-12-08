package com.solvd.construction.models.buildings;

import java.time.LocalDate;

public class Building {

    private int floorsNumber;
    private int floorsHeight;
    private int area;
    private LocalDate constructionYear;
    private String address;

    //private static String address = new String(); //?? can we create it like this? Address can not be static?

    public Building(int floorsNumber, int floorsHeight, int area, LocalDate constructionYear, String address){
        this.floorsNumber = floorsNumber;
        this.floorsHeight = floorsHeight;
        this.area = area;
        this.constructionYear = constructionYear;
        this.address = address;

    }

    public Building(String address, int floorsNumber){
        this.address = address;
        this.floorsNumber = floorsNumber;
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
