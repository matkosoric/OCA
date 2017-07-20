package edu.matkosoric.inheritance.inheriting.static_;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

public class Doors implements PlayingMusicInstruments{

    // static interface methods can be accessed only through the interface name

    public static void main(String[] args) {

        Doors d = new Doors();
        d.playingDrums();
        d.playingKeyboard();
//        d.playingGuiter();      // does not compile

        PlayingMusicInstruments.playingGuitar();

    }
}



interface PlayingMusicInstruments {
    default void playingDrums () {System.out.println("Playing drums!");}
    default void playingKeyboard () {System.out.println("Playing keyboard!");}
    static void playingGuitar() {System.out.println("Playing guitar!");}
}
