package com.solvd.construction.models.organisations;

import com.solvd.construction.models.machines.Crane;
import com.solvd.construction.models.machines.Excavator;
import com.solvd.construction.models.machines.Lorry;
import com.solvd.construction.models.people.Architect;
import com.solvd.construction.models.people.Constructor;
import com.solvd.construction.models.people.Director;
import com.solvd.construction.models.projects.Project;

public class BuildingCompany {

    private String name;
    private Architect [] architects;
    private Constructor [] constructors;
    private Director director;
    private Crane [] cranes;
    private Excavator [] excavators;
    private Lorry [] lorries;
    private Project [] projects;


    public BuildingCompany(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Architect[] getArchitects() {
        return architects;
    }

    public void setArchitects(Architect[] architects) {
        this.architects = architects;
    }

    public Constructor[] getConstructors() {
        return constructors;
    }

    public void setConstructors(Constructor[] constructors) {
        this.constructors = constructors;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
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
}
