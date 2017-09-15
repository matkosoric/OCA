package edu.matkosoric.methods.covariant.return_.dog.types;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

import edu.matkosoric.methods.covariant.return_.PoliceDog;
import edu.matkosoric.methods.covariant.return_.covariant.return_.types.Cocain;

public class PoliceDog2 extends PoliceDog {

    public PoliceDog2 () {
        super("");
    }

    // 2nd overridden method
    public Cocain sniffingBaggage (String baggageOwner) {
        if (baggageOwner == "Robert Downey Jr.")
            return new Cocain();
        else return null;
    }

}
