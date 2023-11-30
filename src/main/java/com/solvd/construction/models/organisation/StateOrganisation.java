package com.solvd.construction.models.organisation;

public class StateOrganisation extends Organisation {

    private String propertyRight;

    public StateOrganisation (String name, int budget, String type, String propertyRight){
        super (name, budget, type);
        this.propertyRight = propertyRight;
    }

    public String getPropertyRight() {
        return propertyRight;
    }

    public void setPropertyRight(String propertyRight) {
        this.propertyRight = propertyRight;
    }
}
