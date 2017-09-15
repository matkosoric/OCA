package edu.matkosoric.methods.covariant.return_.dog.types;

import edu.matkosoric.methods.covariant.return_.PoliceDog;
import edu.matkosoric.methods.covariant.return_.covariant.return_.types.Heroin;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class PoliceDog1 extends PoliceDog {

    public PoliceDog1 () {
        super("");
    }

    // 1st overridden method
    public Heroin sniffingBaggage (String baggageOwner) {
        if (baggageOwner == "Kurt Cobain")
            return new Heroin();
        else return null;
    }
}
