package com.OOPS2.POLYMORPHISM.RUNTIME;

import javax.lang.model.element.AnnotationMirror;

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();//UpCasting
        a.sound();

//        a.bark();      cannot be called because not present in the parent class


        if(a instanceof  Dog){  //DownCasting
            Dog d = (Dog) a;
            d.bark();
        }


//        Dog d = (Dog) a;   //Down Casting
//        d.bark();
    }
}
