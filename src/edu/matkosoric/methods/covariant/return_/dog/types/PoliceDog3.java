package edu.matkosoric.methods.covariant.return_.dog.types;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

import edu.matkosoric.methods.covariant.return_.PoliceDog;
import edu.matkosoric.methods.covariant.return_.covariant.return_.types.Methamphetamine;

public class PoliceDog3 extends PoliceDog {

    public PoliceDog3 () {
        super("");
    }

    // 3rd overridden method
    public Methamphetamine sniffingBaggage (String baggageOwner) {
        if (baggageOwner == "Marilyn Monroe")
            return new Methamphetamine();
        else return null;  }



}
