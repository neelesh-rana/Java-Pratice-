package com.OOPS2.Interfaces.Ex1;

public interface Animal {

    void eat();
    void sleep();



     static  void info(){
        System.out.println("All the information about the annimals ");
    }


    public  default void run(){
        System.out.println("the animals are runnninng ");
    }

}
