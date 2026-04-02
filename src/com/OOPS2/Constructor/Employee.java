package com.OOPS2.Constructor;

class Employee {
    String name;
    int salary;

    public Employee() {
        this("Default", 10000); // calls another constructor
    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.println(name + " - " + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.display();
    }
}