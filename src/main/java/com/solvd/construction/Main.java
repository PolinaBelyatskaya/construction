package com.solvd.construction;

import com.solvd.construction.models.building.ApartmentHouse;
import com.solvd.construction.models.building.ShoppingCenter;
import com.solvd.construction.models.constructionengineering.Color;
import com.solvd.construction.models.constructionengineering.Crane;
import com.solvd.construction.models.constructionengineering.Excavator;
import com.solvd.construction.models.constructionengineering.Lorry;
import com.solvd.construction.models.organisation.PrivateOrganisation;
import com.solvd.construction.models.organisation.StateOrganisation;
import com.solvd.construction.models.people.Architect;
import com.solvd.construction.models.people.Constructor;
import com.solvd.construction.models.people.Sex;

public class Main {
    public static void main(String[] args) {

        ApartmentHouse apartmentHouse = new ApartmentHouse("700m2", 2020, 20, "3m", "civilianConstruction", 100, 20);

        ApartmentHouse apartmentHouse1 = new ApartmentHouse("500m2", 5, "3m");
        apartmentHouse1.setConstructionYear(2014);
        apartmentHouse1.setApartmentsNumber(15);
        apartmentHouse1.setType("residentialConstruction");

        ShoppingCenter shoppingCenter = new ShoppingCenter("1000m2", 3, "5m", 200);
        shoppingCenter.setConstructionYear(202);
        shoppingCenter.setType("publicConstruction");

        Crane crane = new Crane("Volvo", 10 / 5, 200);
        crane.setMaximumHeight(10 / 5);

        Excavator excavator = new Excavator();
        excavator.setBrand("Hyundai");
        excavator.setColor(Color.YELLOW);
        excavator.setCargoCapacity(100);
        excavator.setPricePerHour(500);
        excavator.setWeight(500);
        excavator.setMaximumHeight(10);
        excavator.setMaximumDepth(5);

        Lorry lorry = new Lorry("Man", 500, 100);
        lorry.setColor(Color.BLACK);

        PrivateOrganisation privateOrganisation = new PrivateOrganisation("Avant-garde");
        privateOrganisation.setBudget(10000);

        StateOrganisation stateOrganisation = new StateOrganisation("Ministry of Architecture and Construction", 50000,"closed joint stock company", "full");

        Architect architect = new Architect("Ilya", "Fedorov", Sex.MALE, 32, 1, 10/5, "bachelor");

        Constructor constructor = new Constructor("Dmitry", "Soloviev", Sex.MALE, 40);
        constructor.setUserId(2);
    }
}