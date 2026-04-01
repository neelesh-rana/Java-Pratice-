package com.OOPS;


class Car {
    String brand;

    void start() {
        System.out.println(brand + " started");
    }
}

public class CarDemo {
    public static void main(String[] args) {
        Car c = new Car();
        c.brand = "BMW";
        c.start();
    }
}
