package com.OOPS2.ABSTRACT.Ex1;

public class Main {
    public static void main(String[] args) {

        Circle c = new Circle(5);

        System.out.println(c.radius);

        Rectangle r = new Rectangle(10,3);
        System.out.println(r.area());


//        Shape shape = new Shape() ;     error beacsue the abstract class cannot be called


        //to acess we can use the child class
         r.decribe();





//  another way to acesss it using this polyorphism
//        Shape s = new Rectangle(10,20);
//        System.out.println(s.area());
//        Shape cr = new Circle(2);
//        System.out.println(cr.area());

    }

}
