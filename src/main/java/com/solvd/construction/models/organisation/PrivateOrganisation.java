package com.solvd.construction.models.organisation;

public class PrivateOrganisation extends Organisation {

    private String propertyType;

    public PrivateOrganisation (String name, String budget, String propertyType){
        super(name, budget);
        this.propertyType = propertyType;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }
}
