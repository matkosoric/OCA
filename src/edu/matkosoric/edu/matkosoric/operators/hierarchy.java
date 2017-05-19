package edu.matkosoric.edu.matkosoric.operators;

/**
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

public class hierarchy {

    public static void main(String[] args) {

        // java operators have different levels of execution priority.
        // they form a hierarchy, which simply means that some operations have a priority over other.
        // that priority can be changed with the use of parentheses ()

/**
      ()                  Parentheses
      []                  Array subscript
      ·                   Member selection

      ++                  Unary post-increment
      --                  Unary post-decrement

      ++                  Unary pre-increment
      --                  Unary pre-decrement
      +                   Unary plus
      -                   Unary minus
      !                   Unary logical negation
      ~                   Unary bitwise complement
      (type)              Unary type cast

      *                   Multiplication
      /                   Division
      %                   Modulus

      +                   Addition
      -                   Subtraction

      <<                  Bitwise left shift
      >>                  Bitwise right shift with sign extension
      >>>                 Bitwise right shift with zero extension

      <                   Relational less than
      <=                  Relational less than or equal
      >                   Relational greater than
      >=                  Relational greater than or equal
      instanceof          Type comparison (objects only)

      ==                  Relational is equal to
      !=                  Relational is not equal to

      &                   Bitwise AND

      ^                   Bitwise exclusive OR

      |                   Bitwise inclusive OR

      &&                  Logical AND

      ||                  Logical OR

      ? :                 Ternary conditional

      =                   Assignment
      +=                  Addition assignment
      -=                  Subtraction assignment
      *=                  Multiplication assignment
      /=                  Division assignment
      %=                  Modulus assignment

 */

        // following statements are valid without parentheses
        //

        int i = 5 % + 4 - 3 * 2 + 4 - 8 - 1 + 3 / 4 % 4 + 1 / 2;
        boolean k = 234 <= 271;
        boolean a = 65 <= 27 ? 53 != 88 || true ^ !!!false & !true && true : !true ^ 6-2*8+3/1 == 82 / 19;



    }

}
