package com.solvd.construction.models.organisations;

public class BuildingCompany {

    private String name;
    private String [] listOfArchitects; // = new String[3]{"Architect 1", "Architect 2", "Architect 3"}; //?should we set it in constructor?
    private String [] listOfConstructors = new String[]{"Constructor 1", "Constructor 2"};
    private String [] listOfDirectors = new String[3];
    private String [] listOfMachines = new String[50];
    private String [] listOfProjects = new String [5];

    //listOfArchitects = new String [10]; - can we do it like this, on the separate line and live in the field
    //only private String [] ListOfEmployees; ??

    public BuildingCompany(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getListOfArchitects() {
        return listOfArchitects;
    }

    public void setListOfArchitects(String[] listOfArchitects) {
        this.listOfArchitects = listOfArchitects;
    }

    public String[] getListOfConstructors() {
        return listOfConstructors;
    }

    public void setListOfConstructors(String[] listOfConstructors) {
        this.listOfConstructors = listOfConstructors;
    }

    public String[] getListOfDirectors() {
        return listOfDirectors;
    }

    public void setListOfDirectors(String[] listOfDirectors) {
        this.listOfDirectors = listOfDirectors;
    }

    public String[] getListOfMachines() {
        return listOfMachines;
    }

    public void setListOfMachines(String[] listOfMachines) {
        this.listOfMachines = listOfMachines;
    }

    public String[] getListOfProjects() {
        return listOfProjects;
    }

    public void setListOfProjects(String[] listOfProjects) {
        this.listOfProjects = listOfProjects;
    }
}
