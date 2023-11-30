package com.solvd.construction.models.building;

import java.util.Objects;

public abstract class Building {

    private String area;
    private int constructionYear;
    private int floorsNumber;
    private String floorsHeight;
    private String type;


    public Building(String area, int constructionYear, int floorsNumber, String floorsHeight, String type) {
        this.area = area;
        this.constructionYear = constructionYear;
        this.floorsNumber = floorsNumber;
        this.floorsHeight = floorsHeight;
        this.type = type;
    }

    public Building (String area, int floorsNumber, String floorsHeight){
        this.area = area;
        this.floorsNumber = floorsNumber;
        this.floorsHeight = floorsHeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return constructionYear == building.constructionYear && floorsNumber == building.floorsNumber && Objects.equals(area, building.area) && Objects.equals(floorsHeight, building.floorsHeight) && Objects.equals(type, building.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(area, constructionYear, floorsNumber, floorsHeight, type);
    }

    @Override
    public String toString() {
        return "Building{" +
                "area='" + area + '\'' +
                ", constructionYear=" + constructionYear +
                ", floorsNumber=" + floorsNumber +
                ", floorsHeight='" + floorsHeight + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getConstructionYear() {
        return constructionYear;
    }

    public void setConstructionYear(int constructionYear) {
        this.constructionYear = constructionYear;
    }

    public int getFloorsNumber() {
        return floorsNumber;
    }

    public void setFloorsNumber(int floorsNumber) {
        this.floorsNumber = floorsNumber;
    }

    public String getFloorsHeight() {
        return floorsHeight;
    }

    public void setFloorsHeight(String floorsHeight) {
        this.floorsHeight = floorsHeight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}