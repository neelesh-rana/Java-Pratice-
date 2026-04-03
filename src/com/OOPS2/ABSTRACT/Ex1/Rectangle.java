package com.OOPS2.ABSTRACT.Ex1;

public class Rectangle extends  Shape{
    double width , height ;


    Rectangle (double width, double height){
        this.height=height;
        this.width=width;

    }

    @Override
    double area() {
        return width*height;

    }


}
