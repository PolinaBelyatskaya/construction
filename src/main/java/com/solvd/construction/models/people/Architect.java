package com.solvd.construction.models.people;

public class Architect {

    private String firstName;
    private String lastName;
    private String sex;
    private float salaryPerHour;
    private String degree;
    private static int userId = 0; //do we need getters and setters?
    private int hoursOfWork;


   public Architect(String firstName, String lastName, String sex, float salaryPerHour, String degree) {

       this.firstName = firstName;
      this.lastName = lastName;
       this.sex = sex;
       this.salaryPerHour = salaryPerHour;
       this.degree = degree;
       userId++;
    }

  public Architect(String firstName, String lastName) { //?? can we not duplicate this. statement?

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

    public float getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(float salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public int getHoursOfWork() {
        return hoursOfWork;
    }

    public void setHoursOfWork(int hoursOfWork) {
        this.hoursOfWork = hoursOfWork;
    }


}
