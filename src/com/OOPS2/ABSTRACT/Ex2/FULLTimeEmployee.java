package com.OOPS2.ABSTRACT.Ex2;

public class FULLTimeEmployee  extends Employee{

    double monthlySalary;

    public FULLTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
       return  monthlySalary;

    }
}
