package edu.matkosoric.methods.covariant.return_;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class PoliceDog {

    String name;

    // constructor
    public PoliceDog(String name) {
        this.name = name;
    }

    // overloaded method must return either the same data type, or it's subclass

    public static void main(String[] args) {

        PoliceDog buster = new PoliceDog("Buster");

        buster.training();
        buster.running();


        // calling original method
        if (buster.sniffingBaggage("ordinary person")!= null) {
            System.out.println("Buster found: " + buster.sniffingBaggage("ordinary person").substanceName);
        }
        if (buster.sniffingBaggage("drug smuggler")!= null) {
            System.out.println("Buster found: " + buster.sniffingBaggage("drug smuggler").substanceName);
        }

        // calling first overloaded method
        if (buster.sniffingBaggage(222) != null) {
            System.out.println("Buster found: " + buster.sniffingBaggage(222).substanceName);
        }
        if (buster.sniffingBaggage(453) != null) {
            System.out.println("Buster found: " + buster.sniffingBaggage(453).substanceName);
        }


        // calling second overloaded method
        if (buster.sniffingBaggage(false) != null) {
            System.out.println("Buster found: " + buster.sniffingBaggage(false).substanceName);
        }
        if (buster.sniffingBaggage(true) != null) {
            System.out.println("Buster found: " + buster.sniffingBaggage(true).substanceName);
        }


        // calling third overloaded method
        if (buster.sniffingBaggage("John Doe", "Retail Store") != null) {
            System.out.println("Buster found: " + buster.sniffingBaggage("John Doe", "Retail Store").substanceName);
        }
        if (buster.sniffingBaggage("John Doe", "Wall Street") != null) {
            System.out.println("Buster found: " + buster.sniffingBaggage("John Doe", "Wall Street").substanceName);
        }


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

    // 1st overloaded method
    public Heroin sniffingBaggage (int baggageID) {
        if (baggageID == 453)
            return new Heroin();
        else return null;
    }

    // 2st overloaded method
    public Methamphetamine sniffingBaggage (boolean evidence) {
        if (evidence == true)
            return new Methamphetamine();
        else return null;
    }
    // 3rd overloaded method
    public Cocain sniffingBaggage (String baggageOwner, String workingLocation) {
        if (workingLocation == "Wall Street")
            return new Cocain();
        else return null;
    }

}

// top class
class HardDrugs {
    String substanceName = "illegal substance";
    double weight = 0.0;
}


// covariant return type
class Heroin extends HardDrugs{
    String substanceName = "Heroin";
}

// covariant return type
class Methamphetamine extends HardDrugs{
    String substanceName = "Methamphetamine";
}

// covariant return type
class Cocain extends HardDrugs{
    String substanceName = "Cocain";
}