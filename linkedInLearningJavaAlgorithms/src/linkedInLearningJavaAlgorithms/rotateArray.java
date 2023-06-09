package linkedInLearningJavaAlgorithms;

public class rotateArray {
	
	public static void reverse(int [] arr, int s, int e) {
		while(s<e) {
			int temp = arr[s];
			arr[s] = arr[e];
			arr[e] = temp;
			s++;
			e--;
		}
	}

	public static void rotateLeft(int arr[], int k) {
		int n = arr.length;
		k = k%n;
		
//		1 2 3 4 5
//		2 3 4 5 1
		
		reverse(arr,0,k-1);
		reverse(arr,k,n-1);
		reverse(arr,0,n-1);
		
	}
	
	public static void rotateRight(int arr[], int k) {
		int n = arr.length;
		k = k%n;
		
//		1 2 3 4 5
//		5 1 2 3 4
		
		reverse(arr,0,n-k-1);
		reverse(arr,n-k,n-1);
		reverse(arr,0,n-1);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		
		System.out.println("Before");
		for(int it:arr) {
			System.out.print(it+" ");
		}
		System.out.println();
		
//		rotateLeft(arr,1);
//		
//		System.out.println("After");
//		for(int it:arr) {
//			System.out.print(it+" ");
//		}
//		System.out.println();
		
		rotateRight(arr,1);
		
		System.out.println("After");
		for(int it:arr) {
			System.out.print(it+" ");
		}
	}

}
