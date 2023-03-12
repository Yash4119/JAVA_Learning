package collectionsFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
	public static void main(String args[]) {
		Set<String> st = new HashSet<>();
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(123,21,4,346,33));
		
		st.add("Yash");
		st.add("omkar");
		st.add("Teja");
		st.add("omkar");
		
		st.stream()
			.map(ele-> ele)
			.forEach(System.out::println);
		
		NavigableSet<Integer> st2 = new TreeSet<>(arr);
		
		st2.stream()
			.forEach(System.out::println);
		
		st2.headSet(100)
			 .stream()
			.forEach(System.out::println);
		
		st2.descendingSet()
			.stream()
			.forEach(System.out::println);
		
		st2.tailSet(12)
			.stream()
			.forEach(System.out::println);
		
		st2.subSet(10,50)
			.stream()
			.forEach(System.out::println);
	}
}
