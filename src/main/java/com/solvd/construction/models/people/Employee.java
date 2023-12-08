package com.solvd.construction.models.people;

import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class Employee extends Person {

    private BigDecimal salaryPerHour;
    private int hoursOfWork;
    protected static int userCount = 0; // do we need getters/setters and include it in constructor?

    public Employee (String firstName, String lastName, String sex, BigDecimal salaryPerHour, int hoursOfWork){
        super(firstName, lastName, sex);
        this.salaryPerHour = salaryPerHour;
        this.hoursOfWork = hoursOfWork;
    }

    public Employee(String firstName, String lastName, BigDecimal salaryPerHour, int hoursOfWork){
        super(firstName, lastName);
        this.salaryPerHour = salaryPerHour;
        this.hoursOfWork= hoursOfWork;
    }

    public BigDecimal getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(BigDecimal salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public int getHoursOfWork() {
        return hoursOfWork;
    }

    public void setHoursOfWork(int hoursOfWork) {
        this.hoursOfWork = hoursOfWork;
    }

    public abstract void work();
}
