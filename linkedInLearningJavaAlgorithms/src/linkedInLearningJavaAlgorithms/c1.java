package linkedInLearningJavaAlgorithms;

import java.util.Scanner;

public class c1 {

	public static String reverse(String s) {
		
		if(s==null || s.isEmpty()) {
			return s;
		}
		
		StringBuilder str = new StringBuilder();
		
		String arr[] = s.split(" ");
		
		for(String st : arr) {
			for(int i=st.length()-1;i>=0;i--) {
				str.append(st.charAt(i));
			}
			str.append(" ");
		}
		
		str.deleteCharAt(str.length()-1);
		
//		for(int i=s.length()-1;i>=0;i--) {
//			str.append(s.charAt(i));
//		}
		
		return str.toString();
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the string you want to reverse :- ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(reverse(s));
		
		sc.close();
	}

}
