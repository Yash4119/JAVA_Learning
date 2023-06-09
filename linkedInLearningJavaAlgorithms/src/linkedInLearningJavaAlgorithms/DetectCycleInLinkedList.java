package linkedInLearningJavaAlgorithms;

import java.util.HashMap;

public class DetectCycleInLinkedList {

	public static Boolean detectCycle(Node n1) {
		HashMap<Node, Integer>mp = new HashMap<>();
		
		Node temp = n1;
		
		while(temp!=null) {
			if(!mp.containsKey(temp))mp.put(temp, 1);
			else {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1 = new Node(1),n2 = new Node(2),n3 = new Node(3),n4 = new Node(4),n5 = new Node(5);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
//		n5.next = n1;
		
		System.out.println(detectCycle(n1));
		
	}

}
