package com.solvd.construction.models.people;

public class Constructor extends Employee {

    public Constructor (){}

    public Constructor (String firstName, String lastName, Sex sex, int age, int userId, float salaryPerHour){
        super(firstName, lastName, sex, age, userId, salaryPerHour);
    }
}
