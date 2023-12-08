package com.solvd.construction.models.people;

public class Customer extends Person {

    private int budget;


    public Customer(String firstName, String lastName, int budget) {
        super (firstName,lastName);
        this.budget = budget;
    }


    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}

