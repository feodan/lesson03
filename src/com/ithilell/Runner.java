package com.ithilell;

public class Runner {

    public static void main(String[] args) {
        Employee e1 = new Driver();
        Driver d1 = new Driver();
        Employee e2= new Employee();

        e1.work();
        d1.work();
        e2.work();

        int[] arr = {1,2,3};
        int length = arr.length;
    }
}

class Employee {
    private Long ig;
    private String firstName;
    private String lastName;

    public Employee() {
    }

    public Employee(Long ig, String firstName, String lastName) {
        this.ig = ig;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private String fullName() {
        return this.firstName + " " + this.lastName;
    }

    public void hello() {
        System.out.println("Hello, my name is " + fullName());
    }

    void work() {
        System.out.println("Employee.....");
    }

    public Long getIg() {
        return ig;
    }

    public void setIg(Long ig) {
        this.ig = ig;
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
}

class Driver extends Employee{

    private String driverLicence;

    public String getDriverLicence() {
        return driverLicence;
    }

    public void setDriverLicence(String driverLicence) {
        this.driverLicence = driverLicence;
    }

    void work() {
        System.out.println("Driving......");
    }
}

class Programmer extends Employee{

    private String language;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    void work() {
        System.out.println("Programming......");
    }
}