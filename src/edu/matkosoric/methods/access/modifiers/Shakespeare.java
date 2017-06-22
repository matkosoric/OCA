package edu.matkosoric.methods.access.modifiers;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

public class Shakespeare {

    public String tragedy1 = "Hamlet";
    protected String tragedy2 = "Macbeth";
    String tragedy3 = "Romeo and Juliet";
    private String tragedy4 = "Othello";

    public static void main(String[] args) {

//        access modifiers can not be used within methods

//        public String comedy1 = "Tempest";                          // does not compile
//        protected String comedy2 = "Much Ado about Nothing";        // does not compile
        String comedy3 = "Winter's Tale";
//        private String comedy4 = "All's Well That Ends Well";       // does not compile

         new Shakespeare().writingHistories();

    }

    public void writingHistories() {

//        access modifiers can not be used within methods
//        public String history1 = "Henry V";             // does not compile
//        protected String history2 = "Pericles";         // does not compile
        String history3 = "King John";
//        private String history4 = "Richard III";        // does not compile

    }

}
