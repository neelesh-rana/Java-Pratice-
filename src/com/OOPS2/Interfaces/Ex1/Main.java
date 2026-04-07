package com.OOPS2.Interfaces.Ex1;

public class Main {


    public static void main(String[] args) {



        Dog dog =  new Dog();
        dog.eat();
        dog.sleep();
        Animal.info();
        dog.run(); // this can be called by the chidern class because it is declared as default class without creating any contrtos in child class





        Cat cat = new Cat();
        cat.eat();
        cat.sleep();




    }
}
