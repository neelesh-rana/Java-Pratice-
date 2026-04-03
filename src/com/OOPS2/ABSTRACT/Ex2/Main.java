package com.OOPS2.ABSTRACT.Ex2;

public class Main {


    static void main() {
        Employee e1 = new FreelanceEmployee("Arjun ", 101, 60000, 3 );
        Employee e2 = new PartTimeEmployee("Sara ", 102, 500 , 80 );
        Employee e3 = new  FULLTimeEmployee("Neelesh  ", 100, 899999);

        e1.display();
        e2.display();
        e3.display();
    }
}
