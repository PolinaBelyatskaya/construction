package com.solvd.construction.models.people;

public abstract class Employee {

    private String firstName;
    private String lastName;
    private Sex sex;
    private int age;
    private int userId;
    private float salaryPerHour;

    public Employee (){}

    public Employee(String firstName, String lastName, Sex sex, int age, int userId, float salaryPerHour){
        this(firstName, lastName, sex, age, userId);
        this.salaryPerHour = salaryPerHour;
    }

    public Employee(String firstName, String lastName, Sex sex, int age, int userId){
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.userId = userId;
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

    public void setSex(Sex sex) {
        this.sex = sex;
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
