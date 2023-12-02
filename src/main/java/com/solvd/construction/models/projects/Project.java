package com.solvd.construction.models.projects;

import com.solvd.construction.models.people.Architect;

import java.time.LocalDate;

public class Project {

    private int budget;
    private String [] listOfCustomers = new String [30]; //?should we set it in constructor?
    private LocalDate deadline;

    public Project(int budget, LocalDate deadline){
        this.budget = budget;
        this.deadline = deadline;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public String[] getListOfCustomers() {
        return listOfCustomers;
    }

    public void setListOfCustomers(String[] listOfCustomers) {
        this.listOfCustomers = listOfCustomers;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public float calculateExpencese (Architect architect){
        return architect.getSalaryPerHour()*architect.getHoursOfWork();
    }

    public float calculateExpence (Architect architect, float salary, int hour){
        salary = architect.getSalaryPerHour();
        hour = architect.getHoursOfWork();
        float expense = salary*hour;
        return expense;
    }

    //is it overloading?
}
