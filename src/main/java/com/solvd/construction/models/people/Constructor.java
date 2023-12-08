package com.solvd.construction.models.people;

import com.solvd.construction.models.machines.Crane;
import com.solvd.construction.models.machines.Machine;

import java.math.BigDecimal;

public class Constructor extends Employee {

    private Machine[] machines;

    public Constructor(String firstName, String lastName, String sex, BigDecimal salaryPerHour,int hoursOfWork) {
        super (firstName, lastName, sex, salaryPerHour, hoursOfWork);

    }

    public Constructor(String firstName, String lastName, BigDecimal salaryPerHour, int hoursOfWork) {
        super (firstName, lastName, salaryPerHour, hoursOfWork);

    }

    public Machine[] getMachines() {
        return machines;
    }

    public void setMachines(Machine[] machines) {
        this.machines = machines;
    }

    public static void build(Crane crane){
        //is it the right way to link exact machine here?
        //can I not have logic inside the method?
    }

    @Override
    public void work(){
        System.out.println( toString() + "I work with help of machines");
    }
}