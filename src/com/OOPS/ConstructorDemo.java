package com.OOPS;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Person p = new Person("Neelesh");
        System.out.println(p.name);
    }
}
