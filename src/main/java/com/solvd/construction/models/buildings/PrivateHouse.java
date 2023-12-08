package com.solvd.construction.models.buildings;

import java.time.LocalDate;

public class PrivateHouse extends Building {

    private int roomsNumber;

    public PrivateHouse(int roomsNumber, int utilityRoomsNumber, int floorsNumber, int floorsHeight, int area, LocalDate constructionYear, String address) {
        super (floorsNumber, floorsHeight, area, constructionYear, address);
        this.roomsNumber = roomsNumber;

    }

    public PrivateHouse(String address, int floorsNumber){
        super (address, floorsNumber);
    }

    public int getRoomsNumber() {
        return roomsNumber;
    }

    public void setRoomsNumber(int roomsNumber) {
        this.roomsNumber = roomsNumber;
    }


}

