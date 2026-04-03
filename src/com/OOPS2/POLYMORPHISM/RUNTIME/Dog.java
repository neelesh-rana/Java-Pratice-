package com.OOPS2.POLYMORPHISM.RUNTIME;

public class Dog extends  Animal {

    @Override
    void sound() {
        System.out.println("Dog makes the sound as woof woof  ");
    }


    void bark(){
        System.out.println("woof woof is the dog sound ");
    }
}
