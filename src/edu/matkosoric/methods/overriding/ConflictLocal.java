package edu.matkosoric.methods.overriding;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

import edu.matkosoric.methods.overriding.returning.Battle;

public class ConflictLocal extends Conflict{

    public Battle initiateAttack () {
        return new Battle();
    }

    // byte as a return type in overriding method will not be accepted
    // since primitive return type must remain the same in overriding methods.
    // only proper objects can have a covariant return type.
//    public byte calculateEnemyDistance () {
//        return 100;
//    }

}
