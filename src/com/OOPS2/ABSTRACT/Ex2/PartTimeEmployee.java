package com.OOPS2.ABSTRACT.Ex2;

public class PartTimeEmployee extends  Employee {
    double hourlyRate;
    int hoursWorked;


    public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }


    @Override
    double calculateSalary() {
        return hourlyRate*hoursWorked;
    }
}
