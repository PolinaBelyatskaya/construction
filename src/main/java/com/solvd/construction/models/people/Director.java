package com.solvd.construction.models.people;

public class Director {

    private String firstName;
    private String lastName;
    private String sex;
    private float salaryPerHour;
    private String degree;


    public Director(String firstName, String lastName, String sex, float salaryPerHour, String degree) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.salaryPerHour = salaryPerHour;
        this.degree = degree;
    }

    public Director(String firstName, String lastName) { //?? can we not duplicate this. statement?

    }
}
