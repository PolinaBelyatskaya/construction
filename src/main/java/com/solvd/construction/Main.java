package com.solvd.construction;

import com.solvd.construction.models.buildings.ApartmentHouse;
import com.solvd.construction.models.buildings.PrivateHouse;
import com.solvd.construction.models.buildings.ShoppingCenter;
import com.solvd.construction.models.machines.Crane;
import com.solvd.construction.models.machines.Excavator;
import com.solvd.construction.models.machines.Lorry;
import com.solvd.construction.models.organisations.Accounting;
import com.solvd.construction.models.organisations.BuildingCompany;
import com.solvd.construction.models.people.*;
import com.solvd.construction.models.projects.Project;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        ApartmentHouse apartmentHouse = new ApartmentHouse("Main street, 25", 10);
        apartmentHouse.setApartmentsNumber(100);
        apartmentHouse.setUtilityRoomsNumber(10);
        apartmentHouse.setArea(1000);
        apartmentHouse.setFloorsHeight(3);
        LocalDate constructionYear = LocalDate.of(2023, 01, 19); //have to create the link
        System.out.println(apartmentHouse.toString());


        ShoppingCenter shoppingCenter = new ShoppingCenter(200, 20, 3, 5, 2000, LocalDate.of(2014, 9, 13), "Main street, 45");

        PrivateHouse privateHouse = new PrivateHouse(5, 2, 2, 3, 150, LocalDate.of(2001, 07, 21), "5th Ave, 12");

        Crane crane1 = new Crane("XCMG");
        crane1.setPricePerHour(200);
        crane1.setMaximumHeight(20);

        Crane crane2 = new Crane("LIEBHERR");
        Crane crane3 = new Crane("ZOOMLION");

        Crane[] cranes = new Crane[3];
        cranes[0] = crane1;
        cranes[1] = crane2;
        cranes[2] = crane3;

        Excavator excavator1 = new Excavator("Hyundai", 100, 3 / 5, 2);
        Excavator excavator2 = new Excavator("MAN");

        Excavator[] excavators = new Excavator[]{excavator1, excavator2};

        Lorry lorry1 = new Lorry("MAN");
        lorry1.setPricePerHour(50);
        lorry1.setCargoCapacity(500);

        Lorry lorry2 = new Lorry("Volvo");
        Lorry[] lorries = new Lorry[]{lorry1, lorry2};

        Architect architect1 = new Architect("John", "Smith", BigDecimal.valueOf(10), 40);
        architect1.setSex("Male");
        architect1.setType("landscape");


        Architect architect2 = new Architect("Tom", "Johnson", BigDecimal.valueOf(15), 40);

        //Architect[] architects;
        // architects = new Architect[2];
        // architects[0] = architect1;
        // architects[1] = architect2;


        Director director = new Director("Tom", "Jackson", BigDecimal.valueOf(30), 40);
        System.out.println(director);

        Constructor constructor1 = new Constructor("Jack", "Johns", "Male", BigDecimal.valueOf(9), 40);
        Constructor constructor2 = new Constructor("Jake", "Snow", BigDecimal.valueOf(10), 40);
        Constructor.build(crane1);

        //Constructor[] constructors = new Constructor[2];
        //constructors[0] = constructor1;
        //constructors[1] = constructor2;

        Employee[] employees = new Employee[50];
        employees[0] = architect1;
        employees[1] = architect2;
        employees[2] = constructor1;
        employees[3] = constructor2;
        employees[4] = director;

        Customer customer1 = new Customer("Tony", "Simpson", 40000);

        Customer customer2 = new Customer("Taylor", "Williams", 50000);
        customer2.setSex("male");


        Project project1 = new Project("Shopping center construction", new Customer("Jack", "Johns", 10000));
        project1.setBudget(5000);
        project1.setStartDate(LocalDate.of(2023, 06, 16));
        project1.setDeadline(LocalDate.of(2025, 01, 01));

        Project project2 = new Project("Apartment house construction", customer1);

        Project[] projects = new Project[]{project1, project2};

        project1.calculateExpence(architect1, BigDecimal.valueOf(10), 40);

        BuildingCompany buildingCompany = new BuildingCompany("Avant-garde");

        buildingCompany.setEmployees(employees);
        buildingCompany.setCranes(cranes);
        buildingCompany.setExcavators(excavators);
        buildingCompany.setLorries(lorries);
        buildingCompany.setProjects(projects);

        Accounting accounting = new Accounting();


        //public BigDecimal calculateMonthlySalary(architect1) {
        //return architect1.getSalaryPerHour().multiply(BigDecimal.valueOf(21));
    }
    }
}