package com.OOPS2.POLYMORPHISM.MANYFORMS;

public class Main {
    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();

        shapes.area();

        circle.area();
        triangle.area();
        square.area();



        Shapes sh= new Circle();
        sh.area();




    }
}
