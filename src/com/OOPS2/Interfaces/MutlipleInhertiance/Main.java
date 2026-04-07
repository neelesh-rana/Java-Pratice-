package com.OOPS2.Interfaces.MutlipleInhertiance;

public class Main {

    public static void main(String[] args) {

        SmartPhones smartphone = new SmartPhones();
        smartphone.takephoto();
        smartphone.recordvideo();

        smartphone.playmusic();
        smartphone.stopmusics();

        smartphone.makephonecalls(903900221);
        smartphone.endphonecall(927289292);
    }
}
