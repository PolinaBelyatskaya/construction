package com.solvd.construction.models.people;

public class Customer {

    private String firstName;
    private String lastName;
    private int budget;


    public Customer(String firstName, String lastName, int budget) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.budget = budget;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}

