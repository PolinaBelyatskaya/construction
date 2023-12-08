package com.solvd.construction.models.people;

import java.math.BigDecimal;

public class Architect extends Employee {

    private String type;

   public Architect(String firstName, String lastName, String sex, BigDecimal salaryPerHour, int hoursOfWork) {
       super (firstName, lastName, sex, salaryPerHour, hoursOfWork);
    }

  public Architect(String firstName, String lastName, BigDecimal salaryPerHour, int hoursOfWork) {
       super(firstName, lastName, salaryPerHour, hoursOfWork);

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void work(){
        System.out.println( toString() + "I work with blueprints");
    }

}
