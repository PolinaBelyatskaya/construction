package com.solvd.construction.models.people;

public abstract class Person {

    private String firstName;
    private String lastName;
    private String sex;

    public Person (String firstName, String lastName, String sex){
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
    }

    public Person (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "I," + firstName + lastName + ", work";
    }

    public void work (){
        System.out.println(toString() + "I work");
    }
}
