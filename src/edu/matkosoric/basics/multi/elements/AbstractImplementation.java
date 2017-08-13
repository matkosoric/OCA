package edu.matkosoric.basics.multi.elements;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class AbstractImplementation extends FreeToTravel {

    // abstract class can 'implement' interfaces without specifying methods code, since it is abstract
    // but first next concrete class in inheritance structure will have to implement those methods.

    @Override
    public boolean beingFree() {
        return false;
    }

    @Override
    public long milesToTravel() {
        return 0;
    }
}

interface Freedom {
    boolean beingFree();
}

interface Travel {
    long milesToTravel();
}

abstract class FreeToTravel implements Freedom, Travel {
    // this abstract class does not have to implement interface methods
}