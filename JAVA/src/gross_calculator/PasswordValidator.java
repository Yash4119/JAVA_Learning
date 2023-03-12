package gross_calculator;

import java.util.Scanner;
public class PasswordValidator {

    public static void main(String [] args){
        String currUserName = "Johndoe";
        String currPassword = "Abc_1234";
        Scanner sc = new Scanner(System.in);
        /*
        Check to be applied are :-
            1. Minimum number of character 8
            2. At least one uppercase character
            3. At least one special character
            4. no userName in the password
            5. should not be the old password
        */
        Boolean valid = true;
        do{
            System.out.println("Enter the new Password :- ");
            String newPassword = sc.next();

            valid = check(newPassword,currPassword, currUserName);
        }while(!valid);

        System.out.println("Successfully Done!!");
    }

    public static Boolean check(String newPass, String currPass, String user){
        Boolean valid = true;
        if(newPass.length() < 8){
            System.out.println("Password length must be greater than 8");
            valid = false;
        }
        if(newPass.matches("[a-zA-Z0-9]*")){
            System.out.println("Password must contain atleast one special character");
            valid = false;
        }
        if(newPass.equals(newPass.toLowerCase())){
            System.out.println("Password must have atleast one Uppercase character");
            valid = false;
        }
        if(newPass.toLowerCase().contains(user.toLowerCase())){
            System.out.println("Dont enter username in your password");
            valid  = false;
        }
        if(newPass.toLowerCase().equals(currPass.toLowerCase())){
            System.out.println("Enter som other password other than the ola password");
            valid = false;
        }

        return valid;
    }

}
