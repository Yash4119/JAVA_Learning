package gross_calculator;
import java.util.Random;
public class DecisionStructures {

    public static void main(String [] args){
//        Decision Structures
        /*
        * 1. If statements
        * 2. If else Statements
        * 3. If else if else Statements
        * */

        /*  Switch Case
        *   Switch Case statement checks for equality
        *
        *   switch(choice){
        *       case op1:
        *           {Statements
         *           break;}
        *       case op2:
        *           {Statements
         *           break;}
        *       default:
        *           {Statements
         *           break;}
        *   }
        * */

//        Switch Expression Statements
        /*
        * string message = switch(choice){
        *                       case op1 -> {Statements}
        *                       case op2, op3 -> {Statements}
        *                       default -> {statements}
        *                  }
        * Switch Expression statements do not require the break statements
        * */

        /*  Relational Operators
        * 1. Less than                  ->  <
        * 2. Greater than               ->  >
        * 3. less than or equal to      ->  <=
        * 4. greater than or equal to   ->  >=
        * 5. assignment                 ->  =
        * 6. equality                   ->  ==
        * 7. Not equal to               ->  !=
        * */

        /*  Logical Operators
        *  1. AND  -> &&
        *  2. OR   -> ||
        *  3. NOT  -> !
        *  4. XOR  -> ^
        * */

        /*  Short Circuiting
        *   Short Circuiting is a concept in which two conditions are compared and if 1st statement is found
        *   to be True then in case of OR statements without looking for the 2nd condition
        *   This is called as short circuiting.
        * */

        /*  Looping Statements
        *   1. For Loops
        *   2. For Each Loops
        *   3. While Loops
        *   4. Do While Loops
        *   5. Nested Loops
        * */

        /* Roll the Die game*/

        Random rnd = new Random();
        int pos = 0;
        int rolls = 5;

        while(pos < 20){
            System.out.println("You have "+ rolls +" rolls left to to reach 20");
            int die = rnd.nextInt(6) + 1;
            pos += die;
            System.out.println("You got "+ die +" And you are at Position "+pos);
            System.out.println();

            if(pos >= 20){
                break;
            }
        }

        if(pos == 20){
            System.out.println("Congratulations!!, You Won");
        }
        else{
            System.out.println("Try Next Time");
        }

    }
/*
*
* The concept of having multiple methods with the same name but different signatures is called as method overloading
* */
}
