package com.OOPS2.ABSTRACT.Ex1;

public class Circle extends  Shape {

    double radius ;
    Circle ( double radius){
        this.radius = radius;

    }

    @Override
    double area() {
        return 3.14*radius *radius;

    }


}
