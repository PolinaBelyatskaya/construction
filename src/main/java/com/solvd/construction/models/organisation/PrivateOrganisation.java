package com.solvd.construction.models.organisation;

public class PrivateOrganisation extends Organisation {

    private static final Provision PROVISION = Provision.SELF;
    private static int amount = 0;

    private String tax;

    public PrivateOrganisation(String name, int budget, String type, String tax) {
        super(name, budget, type);
        this.tax = tax;
        amount++;
    }

    public PrivateOrganisation(String name) {
        super(name);
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    //public static void setAmount (int amount){
     //   PrivateOrganisation.amount = amount;
    //}

    public static Provision getProvision() {
        return PROVISION;
    }

    public int getSum (int i, int n){
        int sum = i + n;
        return sum;
    }
}
