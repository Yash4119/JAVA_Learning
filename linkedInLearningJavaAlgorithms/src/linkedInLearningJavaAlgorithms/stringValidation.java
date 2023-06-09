package linkedInLearningJavaAlgorithms;

//import java.util.Scanner;

public class stringValidation {

	public static void validateString(String s) {
		if(s.chars().allMatch(Character::isUpperCase)) {
			System.out.println(s + " is a UpperCase String");
		}
		else if(s.chars().allMatch(Character::isLowerCase)) {
			System.out.println(s + " is s LowerCase String");
		}
		else {
			System.out.println("It is a combination");
		}
	}
	
	public static Boolean validatePassword(String s) {
		return s.chars().anyMatch(Character::isUpperCase) &&
				s.chars().anyMatch(Character::isLowerCase) &&
				s.chars().anyMatch(Character::isDigit);
	
	}
	
	public static String normalizeString(String s) {
		return s.toLowerCase().trim().replace(",", "").replace(" ", "");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the string that you want to validate :- ");
//		String s = sc.next();
//		
//		validateString(s);
//		
//		System.out.println("Good Password should have \n1. UpperCase Letter \n 2. "
//				+ "LowerCase Letter \n 3. Special Symbols \n 4. A digit");
//		System.out.println("Enter the string that you want to validate :- ");
//		String str = sc.next();
//		
//		if(validatePassword(str)) {
//			System.out.println("Complex");
//		}
//		else {
//			System.out.println("Not Complex");
//		}
		
		System.out.println(normalizeString("Hello Buddy, What are you doing"));
		
//		sc.close();
	}

}
