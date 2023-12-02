package com.solvd.construction.models.buildings;

import java.time.LocalDate;

public class ApartmentHouse {

    private int apartmentsNumber;
    private int utilityRoomsNumber;
    private int floorsNumber;
    private int floorsHeight;
    private int area;
    private LocalDate constructionYear;
    private static String address = new String(); //?? can we create it like this? Address can not be static?

    public ApartmentHouse(int apartmentsNumber, int utilityRoomsNumber, int floorsNumber, int floorsHeight, int area, LocalDate constructionYear) {
        this.apartmentsNumber = apartmentsNumber;
        this.utilityRoomsNumber = utilityRoomsNumber;
        this.floorsNumber = floorsNumber;
        this.floorsHeight = floorsHeight;
        this.area = area;
        this.constructionYear = constructionYear;

    }

    public int getApartmentsNumber() {
        return apartmentsNumber;
    }

    public void setApartmentsNumber(int apartmentsNumber) {
        this.apartmentsNumber = apartmentsNumber;
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

    public static String getAddress() {
        return address;
    }

    public static void setAddress(String address) {
        ApartmentHouse.address = address;
    }
}

