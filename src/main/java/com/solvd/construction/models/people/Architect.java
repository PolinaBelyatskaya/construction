package com.solvd.construction.models.people;

public class Architect extends Employee {

    private String degree;

    public Architect(String firstName, String lastName, Sex sex, int age, int userId, float salaryPerHour, String degree) {
        super(firstName, lastName, sex, age, userId, salaryPerHour);
        this.degree = degree;
    }

    public Architect(String firstName, String lastName, Sex sex, int age) {

        super(firstName, lastName, sex, age);
    }

}
