package com.solvd.construction.models.projects;

import com.solvd.construction.models.people.Architect;
import com.solvd.construction.models.people.Customer;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Project {

    private String name;
    private int budget;
    private Customer customer;
    private LocalDate startDate;
    private LocalDate deadline;

    public Project(String name, Customer customer){
        this.name = name;
        this.customer = customer;
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    //public float calculateExpencese (Architect architect){
      //  return architect.getSalaryPerHour()*architect.getHoursOfWork();
    //}

    public BigDecimal calculateExpence (Architect architect, BigDecimal salary, int hour){
        salary = architect.getSalaryPerHour();
        hour = architect.getHoursOfWork();
        BigDecimal expense = salary.multiply(BigDecimal.valueOf(hour));
        return expense;
    }

    //is it overloading?
}
