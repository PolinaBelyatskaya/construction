package com.solvd.construction.models.organisation;

public abstract class Organisation {

    private String name;
    private int budget;
    private String type;

    public Organisation(String name, int budget, String type) {
        this.name = name;
        this.budget = budget;
        this.type = type;
    }

    public Organisation(String name) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
