package edu.matkosoric.methods.overriding;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

import edu.matkosoric.methods.overriding.returning.War;

public class Conflict {

    public static void main(String[] args) {


    }

    public War initiateAttack () {
        return new War( );
    }

    public short calculateEnemyDistance () {
        return 100;
    }

}
