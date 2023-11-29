package com.solvd.construction.models.organisation;

public class StateOrganisation extends Organisation {

    private String propertyType;

    public StateOrganisation (){}

    public StateOrganisation (String name, String budget, String propertyType){
        super (name, budget);
        this.propertyType = propertyType;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }
}
