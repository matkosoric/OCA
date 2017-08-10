package edu.matkosoric.inheritance.importing2.lake;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

import edu.matkosoric.inheritance.importing2.river.River;


//public class Lake extends River {         // does not compile
//}


// importing a class does not annihilate access modifiers.
// since River constructor has a default access,
// it can be called only from the same package.
// class Lake is not in the same package,
// but has to call River constructor due to the extending.
// it can not do that, so it is unable to extend River class.