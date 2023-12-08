package com.solvd.construction.models.buildings;

import java.time.LocalDate;

public class ApartmentHouse extends Building{

    private int apartmentsNumber;
    private int utilityRoomsNumber;



    public ApartmentHouse(int floorsNumber, int floorsHeight, int area, LocalDate constructionYear, String address, int apartmentsNumber, int utilityRoomsNumber) {
        super (floorsNumber, floorsHeight, area, constructionYear, address);
        this.apartmentsNumber = apartmentsNumber;
        this.utilityRoomsNumber = utilityRoomsNumber;
    }

    public ApartmentHouse(String address, int floorsNumber){
        super (address, floorsNumber);
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


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

   // @Override
    //public String toString() {
     //   return super.toString();
    //}


    @Override
    public String toString() {
        return "ApartmentHouse{" +
                "apartmentsNumber=" + apartmentsNumber +
                ", utilityRoomsNumber=" + utilityRoomsNumber +
                '}';
    }
}

