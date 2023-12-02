package com.solvd.construction.models.people;

import com.solvd.construction.models.machines.Crane;

public class Constructor {
    private String firstName;
    private String lastName;
    private String sex;
    private float salaryPerHour;



    public Constructor(String firstName, String lastName, String sex, float salaryPerHour) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.salaryPerHour = salaryPerHour;

    }

    public Constructor(String firstName, String lastName) { //?? can we not duplicate this. statement?

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public float getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(float salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public static void build(Crane crane){
        //is it the right way to link exact machine here?
        //can I not have logic inside the method?
    }
}