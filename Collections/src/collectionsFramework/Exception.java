package collectionsFramework;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exception {

    public static void main(String[] args){
        /*
        * An exception is the unwanted termination of a program
        * Exceptions can be handled to avoid abrupt termination of programs.
        *
        * Try
        * Catch
        * Finally
        * Throw
        * Throws
        * */

//        File file = new File("resources/nonexistent.txt");
        Scanner sc = new Scanner(System.in);
//        Try-with-resource block
        try(sc){
            int n = sc.nextInt();
            if(n==0){
                throw new ArithmeticException("Divide by zero");
            }
            n = 100 / n;
//            file.createNewFile();
        }
        catch(ArithmeticException e){
            System.out.println("Error :- "+ e.getMessage());
            e.printStackTrace();
        }
        finally {
            System.out.println("Inside the finally block");
        }

        System.out.println("Successfully Ended");

        /*Stack Trace is an interactive log of the method calls that led to a thrown exception

        Two types of exceptions
        1. Checked                  => eg. Input mismatch exception
        2. Unchecked Exceptions     => eg. IOException

            3 Ways to handel Multiple Exceptions
        1. Polymorphism handles a hierarchy of exceptions
        2. Series of catch block handles different exceptions in different ways
        3. Multiple catch block handles unrelated exceptions in the same way
        * */

        /*
        *       ## Try-with-resources ##
        * Declaration of resources that should be automatically closed after the execution of a try block
        * */

    }

}
