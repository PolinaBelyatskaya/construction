package com.solvd.construction.models.people;

public abstract class Employee {

    private String firstName;
    private String lastName;
    private Sex sex;
    private int age;
    private int userId;
    private float salaryPerHour;


    public Employee(String firstName, String lastName, Sex sex, int age, int userId, float salaryPerHour){
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.userId = userId;
        this.salaryPerHour = salaryPerHour;
    }

    public Employee(String firstName, String lastName, Sex sex, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
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

    public Sex getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public float getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(float salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }
}
