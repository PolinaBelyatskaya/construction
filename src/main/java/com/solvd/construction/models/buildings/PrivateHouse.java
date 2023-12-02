package com.solvd.construction.models.buildings;

import java.time.LocalDate;

public class PrivateHouse {

    private int roomsNumber;
    private int floorsNumber;
    private int floorsHeight;
    private int area;
    private LocalDate constructionYear;
    private String address;

    public PrivateHouse(int roomsNumber, int utilityRoomsNumber, int floorsNumber, int floorsHeight, int area, LocalDate constructionYear, String address) {
        this.roomsNumber = roomsNumber;
        this.floorsNumber = floorsNumber;
        this.floorsHeight = floorsHeight;
        this.area = area;
        this.constructionYear = constructionYear;
        this.address = address;

    }

    public int getRoomsNumber() {
        return roomsNumber;
    }

    public void setRoomsNumber(int roomsNumber) {
        this.roomsNumber = roomsNumber;
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

