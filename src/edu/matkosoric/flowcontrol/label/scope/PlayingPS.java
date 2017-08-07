package edu.matkosoric.flowcontrol.label.scope;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class PlayingPS {

    public static void main(String[] args) {

        int lifes = 10;

        GAMEOVER:
        for (int lostLifes = 0; lostLifes < lifes; lostLifes++)
            if (lostLifes == 5) break GAMEOVER;


        int pointsGoal = 30;
        int collectedPoints = 0;

        do {
//            if (collectedPoints == pointsGoal) break GAMEOVER;      // does not compile
            collectedPoints++;
        } while (collectedPoints < 200);

    }
}
