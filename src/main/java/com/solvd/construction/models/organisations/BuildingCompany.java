package com.solvd.construction.models.organisations;

import com.solvd.construction.models.machines.Crane;
import com.solvd.construction.models.machines.Excavator;
import com.solvd.construction.models.machines.Lorry;
import com.solvd.construction.models.people.Architect;
import com.solvd.construction.models.people.Constructor;
import com.solvd.construction.models.people.Director;
import com.solvd.construction.models.people.Employee;
import com.solvd.construction.models.projects.Project;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Objects;

public class BuildingCompany {

    private String name;
    private Employee[] employees;
    private Crane[] cranes;
    private Excavator[] excavators;
    private Lorry[] lorries;
    private Project[] projects;


    public BuildingCompany(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public Crane[] getCranes() {
        return cranes;
    }

    public void setCranes(Crane[] cranes) {
        this.cranes = cranes;
    }

    public Excavator[] getExcavators() {
        return excavators;
    }

    public void setExcavators(Excavator[] excavators) {
        this.excavators = excavators;
    }

    public Lorry[] getLorries() {
        return lorries;
    }

    public void setLorries(Lorry[] lorries) {
        this.lorries = lorries;
    }

    public Project[] getProjects() {
        return projects;
    }

    public void setProjects(Project[] projects) {
        this.projects = projects;
    }

    public BigDecimal calculateWeekSalary(Architect architect) {
        return architect.getSalaryPerHour().multiply(BigDecimal.valueOf(5));
    }

    public BigDecimal calculateWeekSalary(Constructor cOnstructor) {
        return cOnstructor.getSalaryPerHour().multiply(BigDecimal.valueOf(5));

    }

   // @Override
    //public boolean equals(Object object) {
      //  if (object == this) return true;
        //if (object == null) return false;
        //if (object.getClass() != this.getClass()) return false;


        //BuildingCompany buildingCompany = (BuildingCompany) object;
        //return this.name.equals(buildingCompany.name);
    //}


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BuildingCompany that = (BuildingCompany) o;
        return Objects.equals(name, that.name) && Arrays.equals(employees, that.employees) && Arrays.equals(cranes, that.cranes) && Arrays.equals(excavators, that.excavators) && Arrays.equals(lorries, that.lorries) && Arrays.equals(projects, that.projects);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name);
        result = 31 * result + Arrays.hashCode(employees);
        result = 31 * result + Arrays.hashCode(cranes);
        result = 31 * result + Arrays.hashCode(excavators);
        result = 31 * result + Arrays.hashCode(lorries);
        result = 31 * result + Arrays.hashCode(projects);
        return result;
    }

    // @Override
    //public int hashcode() {
     //   return Objects.hash(this.name);
    //}

    public BigDecimal calculateMonthlySalary(Employee employee){

        return employee.getSalaryPerHour().multiply(BigDecimal.valueOf(21));


    }
}
