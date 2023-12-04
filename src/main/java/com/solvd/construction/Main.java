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
import com.solvd.construction.models.people.Customer;
import com.solvd.construction.models.people.Director;
import com.solvd.construction.models.projects.Project;
import org.apache.commons.lang3.arch.Processor;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        ApartmentHouse apartmentHouse = new ApartmentHouse(100, 10);
        apartmentHouse.setUtilityRoomsNumber(10);
        apartmentHouse.setArea(1000);
        apartmentHouse.setFloorsHeight(3);
        LocalDate.of(2023, 01, 19); //- is it the right way to set the date?
        System.out.println (apartmentHouse.toString());
        //how to set address?

        ShoppingCenter shoppingCenter = new ShoppingCenter(200, 20, 3, 5, 2000, LocalDate.of(2014, 9, 13), "Main street, 45");

        PrivateHouse privateHouse = new PrivateHouse(5, 2, 2, 3, 150, LocalDate.of(2001, 07, 21), "5th Ave, 12");

        Crane crane1 = new Crane("XCMG");
        crane1.setPricePerHour(200);
        crane1.setMaximumHeight(20);

        Crane crane2 = new Crane("LIEBHERR");
        Crane crane3 = new Crane ("ZOOMLION");

        Crane[] cranes = new Crane[3];
        cranes [0] = crane1;
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

        Architect architect1 = new Architect("John", "Smith");
        architect1.setSex("Male");
        architect1.setDegree("Bachelor");
        architect1.setSalaryPerHour(10);
        architect1.setHoursOfWork(40);

        Architect architect2 = new Architect("Tom", "Johnson");

        Architect[] architects;
        architects = new Architect[2];
        architects[0] = architect1;
        architects[1] = architect2;


        Director director = new Director("Tom", "Jackson", "Male", 30, "Master");
        System.out.println(director);

        Constructor constructor1 = new Constructor("Jack", "Johns", "Male", 9);
        Constructor constructor2 = new Constructor("Jake", "Snow");
        Constructor.build(crane1);

        Constructor[] constructors = new Constructor[2];
        constructors[0] = constructor1;
        constructors[1] = constructor2;

        Customer customer = new Customer("Tony", "Simpson", 40000);


        Project project1 = new Project("Shopping center construction", new Customer("Jack", "Johns", 10000));
        project1.setBudget(5000);
        project1.setStartDate(LocalDate.of(2023, 06, 16));
        project1.setDeadline(LocalDate.of(2025, 01, 01));

        Project project2 = new Project("Apartment house construction", customer);

        Project[] projects = new Project[]{project1, project2};

        project1.calculateExpence(architect1, 10, 40);

        BuildingCompany buildingCompany = new BuildingCompany("Avant-garde");


        buildingCompany.setArchitects(architects);
        buildingCompany.setConstructors(constructors);
        buildingCompany.setDirector(director);
        buildingCompany.setCranes(cranes);
        buildingCompany.setExcavators(excavators);
        buildingCompany.setLorries(lorries);
        buildingCompany.setProjects(projects);

    }
}