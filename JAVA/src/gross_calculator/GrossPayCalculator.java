package gross_calculator;

import java.util.Scanner;

public class GrossPayCalculator {

//    Local Variable Type Inference
    public static void func1(){
//        for type inference of local variables use the var keyword
//        One condition is that the variable must be declared its value at declaration.

        var num = 10;
        var str = "Yash Jayram Ambekar";

        System.out.println(num + " " + str);
    }

    public static void main(String [] args){
        System.out.println("Hello World");

//        Get the number of hours worked
        int hrs = 0;
        System.out.println("Enter the Amount of hours you worked :- ");
        Scanner sc = new Scanner(System.in);
//        Always have a good habit to close the Scanner object
        hrs = sc.nextInt();

//        Get the hourly pay rate
        double payRate = 0.0;
        System.out.println("Enter Your Pay Rate :- ");
        payRate = sc.nextDouble();

//        Multiply hours and pay rate
        double payment = hrs * payRate;

//        Display Result
        System.out.println("The Gross pay of Employee is : " + payment);

        func1();

        sc.close();

    }
}

//  Conventions for naming variables in java
/*
* 1. name of variables should start with lowercase letters
* 2. variables should be named in camelcase
*
*   Hard Rules for naming variables
* 1. variable names shouldn't contain spaces, cannot begin with numbers, cannot contain special characters, cannot use reserved keywords
* 2. can contain numbers in between or at end, can contain underscore but camelcase is preferred.
* */

//  Primitive data types in java
/*
* 1. byte
* 2. short
* 3. int
* 4. long
* 5. float
* 6. double
* 7. boolean
* 8. char
* */

/*  Arithmetic Operators
 1. Addition +
 2. Subtraction -
 3. Multiplication *
 4. Division /
 5. Modulo(Remainder) %
 6. Exponentiation ^
/
 */

