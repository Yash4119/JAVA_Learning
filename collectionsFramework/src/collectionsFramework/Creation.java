package collectionsFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Creation {

	public static void main(String[] args) {
		Collection<String> c = new ArrayList<>();
		
		c.add("Yash");
		c.add("Programmer");
		c.add("Yash");
		c.add("Programmer");
		
		c.stream()
			.forEach(e -> System.out.println(e.getClass()));
		
		Collection<String> st = new HashSet<>(c);
		
		System.out.println(st);
	}

}
