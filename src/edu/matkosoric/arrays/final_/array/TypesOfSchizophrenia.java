package edu.matkosoric.arrays.final_.array;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

public class TypesOfSchizophrenia {

    public static void main(String[] args) {


        // although array object might be final, its elements still can be altered without any exceptions

        final String [] typesOfSchizophrenia = new String[]{"Paranoid", "Catatonic", "Disorganised", "Undifferentiated", "Residual"  };

        typesOfSchizophrenia[4] = "empty";

        for (String type : typesOfSchizophrenia)
            System.out.println(type);

    }
}
