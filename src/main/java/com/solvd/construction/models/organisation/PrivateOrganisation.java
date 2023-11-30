package com.solvd.construction.models.organisation;

public class PrivateOrganisation extends Organisation {

    private String tax;

    public PrivateOrganisation (String name, int budget, String type, String tax){
        super(name, budget, type);
        this.tax = tax;
    }

    public PrivateOrganisation (String name){
        super (name);
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }
}
