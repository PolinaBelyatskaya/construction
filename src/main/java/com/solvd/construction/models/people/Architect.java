package com.solvd.construction.models.people;

public class Architect extends Employee {

    public Architect() {
    }

    public Architect(String firstName, String lastName, Sex sex, int age, int userId, float salaryPerHour) {
        super(firstName, lastName, sex, age, userId, salaryPerHour);
    }

    public Architect(String firstName, String lastName, Sex sex, int age, int userId) {
        super(firstName, lastName, sex, age, userId);
    }

}
