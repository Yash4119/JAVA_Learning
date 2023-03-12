package collectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class HashMap {
	public static void main(String args[]) {
		Map<String, Integer> mp = new TreeMap<>();
		
		mp.put("Yash", 3);
		mp.put("Teja", 7);
		mp.put("Swami", 13);
		
		for(java.util.Map.Entry<String, Integer> it : mp.entrySet()) {
			System.out.println("Student Name is "+ it.getKey() + " And Roll No is "+ it.getValue());
		}
		
		ArrayList<Integer> arr = new ArrayList<>(List.of(3,1234,1,23,45,3465,1,32,35));
		
		arr.sort(Comparator.naturalOrder());
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		
		System.out.println(Collections.binarySearch(arr, 455));
		System.out.println(Collections.min(arr));
		System.out.println(Collections.max(arr));
		
	}
}
