package collectionsFramework;

import java.util.*;

public class Queue {
	public static void main(String args[]) {
		
		Deque<String> dq = new ArrayDeque<>();
		
		dq.addFirst("Yash");
		dq.addLast("Omkar");
		dq.addAll(List.of("Teja","Swami","Sakore"));

		System.out.println(dq.peekFirst());
		while(!dq.isEmpty()) {
			System.out.println(dq.removeLast());
		}
		
//		Stack using Dequeue
		
		Deque<Integer> d = new ArrayDeque<>();
		d.push(1);
		d.push(3);
		d.push(5);
		
		while(!d.isEmpty()) {
			System.out.println(d.peek());
			d.pop();
		}
		
	}
}
