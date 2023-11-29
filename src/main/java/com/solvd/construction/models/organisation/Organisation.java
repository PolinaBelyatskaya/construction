package com.solvd.construction.models.organisation;

public abstract class Organisation {

    private String name;
    private String budget;

    public Organisation (){}

    public Organisation(String name, String budget){
        this.name = name;
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }
}
