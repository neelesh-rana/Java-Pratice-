package com.OOPS;


class Student {
    String name;
    int age;
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Neelesh";
        s.age = 21;

        System.out.println(s.name + " " + s.age);
    }
}
