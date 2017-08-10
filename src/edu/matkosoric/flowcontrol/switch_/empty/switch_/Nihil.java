package edu.matkosoric.flowcontrol.switch_.empty.switch_;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Nihil {

    public static void main(String[] args) {

        // switch statement must have a body, although that body can be empty or effectively empty

        switch (8) {
        }

        switch (6) {
            default:
        }

        switch (5) {
            case 4:
        }

//        switch (2) ;                  // does not compile

//        switch (3) {break;}           // does not compile



    }

}
