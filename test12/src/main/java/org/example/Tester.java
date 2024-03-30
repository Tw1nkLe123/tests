package org.example;

public class    Tester {
    private String name;
    private String surname;
    private int expirienceInYears;
    private String englishLevel;
    private double salary;

    public Tester(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }


    public Tester(String name, String surname, int expirienceInYears) {
        this(name, surname);
        this.expirienceInYears = expirienceInYears;
    }


    public Tester(String name, String surname, int expirienceInYears, String englishLevel) {
        this(name, surname, expirienceInYears);
        this.englishLevel = englishLevel;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setName(int expirienceInYears) {
        this.expirienceInYears = expirienceInYears;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void printTesterInfo(Tester tester) {
        System.out.println("Name: " + tester.name);
        System.out.println("Surname: " + tester.surname);
        System.out.println("Experience in Years: " + tester.expirienceInYears);
        System.out.println("English Level: " + tester.englishLevel);
        System.out.println("Salary: " + tester.salary);
    }
}
