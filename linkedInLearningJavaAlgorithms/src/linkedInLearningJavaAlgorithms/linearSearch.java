package linkedInLearningJavaAlgorithms;

import java.util.Arrays;
import java.util.OptionalInt;

public class linearSearch {
	
	public static OptionalInt search(int arr[], int target) {
//		for(int it: arr) {
//			if(it==target) {
//				return target;
//			}
//		}
//		
//		return null;
		
		return Arrays.stream(arr).filter(x -> x==target).findFirst();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7,8};
		
		System.out.println(search(arr,4).getAsInt());

		search(arr,9).ifPresent(System.out::println);
	}

}
