package com.OOPS2.Constructor;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        if (name == null || name.isEmpty()) {
            this.name = "Unknown";
        } else {
            this.name = name;
        }

        if (age < 0) {
            this.age = 18;
        } else {
            this.age = age;
        }
    }

    public void display() {
        System.out.println(name + " - " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student("neelesh ", 21);
        s1.display(); //
    }
}
