package linkedInLearningJavaAlgorithms;

import java.util.LinkedList;
import java.util.Queue;

public class NBinaryNumbers {

	public static void printBinary(int n) {
		if(n<=0) {
			System.out.println();
			return;
		}
		
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		
		for(int i=0;i<n;i++) {
			int curr = q.remove();
			
			System.out.println(curr);
			
			q.add(curr*10);
			q.add(curr*10+1);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Print the first n binary numbers
		
		printBinary(10);
		
	}

}
