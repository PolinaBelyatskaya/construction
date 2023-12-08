package com.solvd.construction.models.organisations;

import com.solvd.construction.models.people.Employee;
import com.solvd.construction.models.people.Person;

import java.math.BigDecimal;

public class Accounting {

    public BigDecimal calculateMonthlySalary (Employee employee){
       return employee.getSalaryPerHour().multiply(BigDecimal.valueOf(21));
    }
}
