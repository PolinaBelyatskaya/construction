package com.solvd.construction.models.building;

public class ApartmentHouse extends Building {

    private int apartmentsNumber;
    private int utilityRoomsNumber;

    public ApartmentHouse (String area, int constructionYear, int floorsNumber, String floorsHeight, String type, int apartmentsNumber, int utilityRoomsNumber) {
        super(area, constructionYear, floorsNumber, floorsHeight, type);
        this.apartmentsNumber = apartmentsNumber;
        this.utilityRoomsNumber = utilityRoomsNumber;
    }

    public ApartmentHouse (String area, int floorsNumber, String floorsHeight){
        super(area, floorsNumber, floorsHeight);
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
}
