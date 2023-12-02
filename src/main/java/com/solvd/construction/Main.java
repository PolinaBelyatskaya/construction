package com.solvd.construction;

import com.solvd.construction.models.buildings.ApartmentHouse;
import com.solvd.construction.models.buildings.PrivateHouse;
import com.solvd.construction.models.buildings.ShoppingCenter;
import com.solvd.construction.models.machines.Crane;
import com.solvd.construction.models.machines.Excavator;
import com.solvd.construction.models.machines.Lorry;
import com.solvd.construction.models.organisations.BuildingCompany;
import com.solvd.construction.models.people.Architect;
import com.solvd.construction.models.people.Constructor;
import com.solvd.construction.models.people.Director;
import com.solvd.construction.models.projects.Project;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        ApartmentHouse apartmentHouse = new ApartmentHouse(100, 10, 20, 3, 1000, LocalDate.of(2020, 01, 01));
        System.out.println (apartmentHouse.toString());
        //how to set address?

        ShoppingCenter shoppingCenter = new ShoppingCenter(200, 20, 3, 5,2000, LocalDate.of(2014, 9, 13),"Main street, 45");

        PrivateHouse privateHouse = new PrivateHouse(5,2,2,3,150, LocalDate.of(2001, 07,21), "5th Ave, 12");

        Crane crane = new Crane("Volvo");
        crane.setPricePerHour(200);
        crane.setMaximumHeight(20);

        Excavator excavator = new Excavator("Hyundai",100,3/5, 2);


        Lorry lorry = new Lorry("Man");
        lorry.setPricePerHour(50);
        lorry.setCargoCapacity(500);

        BuildingCompany buildingCompany = new BuildingCompany("Avant-garde");
        String [] listOfArchitects = new String[]{"Architect 1", "Architect 2", "Architect 3"};
        //listOfConstructors[0] = "Constructor 1"; //???

        //?how to set all arrays?

        Architect architect = new Architect("John", "Smith");
        architect.setSex("Male");
        architect.setDegree("Bachelor");
        architect.setSalaryPerHour(10);
        architect.setHoursOfWork(40);

        Director director = new Director("Tom", "Jackson", "Male", 30, "Master");
        System.out.println(director);

        Constructor constructor = new Constructor("Jack", "Johns", "Male", 9);
        Constructor.build(crane);

        Project project = new Project(20000, LocalDate.of(2025, 01, 01));

        project.calculateExpence(architect, 10,40);

    }
}