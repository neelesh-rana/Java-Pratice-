package com.OOPS2.ABSTRACT.Ex2;

 abstract  public class Employee {
    String name;
    int id;


    Employee(String name  , int id ){
        this.name=name ;
        this.id=id;

    }


    abstract  double calculateSalary();



    void display(){
        System.out.println("ID : "+id +" | Name : "+name +" | Salary :"+calculateSalary());
    }
}
