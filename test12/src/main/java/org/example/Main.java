package org.example;

public class Main {
    public static void main(String[] args) {
        Tester tester = new Tester("John", "Doe", 5, "Intermediate");
        tester.setSalary(50000);
        Tester.printTesterInfo(tester);
    }
}

