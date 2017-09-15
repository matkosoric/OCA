package edu.matkosoric.methods.covariant.return_;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

import edu.matkosoric.methods.covariant.return_.covariant.return_.types.Cocain;
import edu.matkosoric.methods.covariant.return_.covariant.return_.types.Heroin;
import edu.matkosoric.methods.covariant.return_.covariant.return_.types.Methamphetamine;
import edu.matkosoric.methods.covariant.return_.dog.types.PoliceDog1;
import edu.matkosoric.methods.covariant.return_.dog.types.PoliceDog2;
import edu.matkosoric.methods.covariant.return_.dog.types.PoliceDog3;

public class PoliceDog {

    // overridden method must return either the same data type, or it's subclass

    String name;

    // constructor
    public PoliceDog(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        PoliceDog buster = new PoliceDog("Buster");

        buster.training();
        buster.running();

        PoliceDog1 rex = new PoliceDog1();
        HardDrugs inspection1 = rex.sniffingBaggage("ordinary person");
        System.out.println(inspection1 instanceof Heroin);
        HardDrugs inspection2 = rex.sniffingBaggage("Kurt Cobain");
        System.out.println(inspection2 instanceof Heroin);

        PoliceDog2 tom = new PoliceDog2();
        HardDrugs inspection3 = tom.sniffingBaggage("ordinary person");
        System.out.println(inspection3 instanceof Cocain);
        HardDrugs inspection4 = tom.sniffingBaggage("Robert Downey Jr.");
        System.out.println(inspection4 instanceof Cocain);

        PoliceDog3 pam = new PoliceDog3();
        HardDrugs inspection5 = pam.sniffingBaggage("ordinary person");
        System.out.println(inspection5 instanceof Methamphetamine);
        HardDrugs inspection6 = pam.sniffingBaggage("Marilyn Monroe");
        System.out.println(inspection6 instanceof Methamphetamine);

    }

    // activities of a police dog
    public void training () {
        System.out.println(this.name + " is training.");
    }

    public void running () {
        System.out.println(this.name + " is running.");
    }

    // original method
    public HardDrugs sniffingBaggage (String baggageOwner) {
        if (baggageOwner == "drug smuggler")
            return new HardDrugs();
        else return null;
    }
}


