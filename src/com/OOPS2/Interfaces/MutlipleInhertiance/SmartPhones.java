package com.OOPS2.Interfaces.MutlipleInhertiance;

public class SmartPhones  implements  Camera, Musics , Phone{


    @Override
    public void takephoto() {
        System.out.println("the smartphonne is able to the photos through the caamera \n");
    }

    @Override
    public void recordvideo() {

        System.out.println("It can also take the videos apart from photos \n");
    }

    @Override
    public void playmusic() {

        System.out.println("Music is getting palyed in this smartphone \n ");
    }

    @Override
    public void stopmusics() {

        System.out.println("music has stopped being played  \n");
    }

    @Override
    public void makephonecalls(int num ) {


        System.out.println("making a call on  "+num+ "\n");

    }

    @Override
    public void endphonecall(int num ) {

        System.out.println("call  ended from  this "+num + " number \n");
    }
}
