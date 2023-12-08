package com.solvd.construction.models.people;

import java.math.BigDecimal;

public class Director extends Employee {


    private String degree;


    public Director(String firstName, String lastName, String sex, BigDecimal salaryPerHour, int hoursOfWork, String degree) {
        super(firstName, lastName, sex, salaryPerHour, hoursOfWork);

        this.degree = degree;
    }

    public Director(String firstName, String lastName, BigDecimal salaryPerHour, int hoursOfWork) {
        super(firstName, lastName, salaryPerHour, hoursOfWork);

    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    @Override
    public void work(){
        System.out.println( toString() + "I coordinate the work");
    }
}
