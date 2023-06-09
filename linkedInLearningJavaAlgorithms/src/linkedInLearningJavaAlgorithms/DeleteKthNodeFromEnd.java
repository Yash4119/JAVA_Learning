package linkedInLearningJavaAlgorithms;

public class DeleteKthNodeFromEnd {
	
	public static int length(Node head) {
		Node temp = head;
		int len=0;
		while(temp!=null) {
			len++;
			temp = temp.next;
		}
		
		return len;
	}
	
	public static void display(Node head) {
		Node curr = head;
		while(curr!=null) {
			if(curr.next!=null)System.out.print(curr.data + "->");
			else System.out.println(curr.data);
			curr = curr.next;
		}
		System.out.println();
	}

	public static Node deleteKthNode(Node head, int k) {
		
		int n = length(head);
		
		int pos = n-k+1;
		Node curr = head, prev=null;
			
		for(int i=1;i<pos;i++) {
			prev = curr;
			curr = curr.next;
		}
			
		if(prev==null) {
			head = head.next;
		}
		else {
			prev.next = curr.next;
		}
		
		return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node head = new Node(5);
		head.next = new Node(6);
		head.next.next = new Node(7);
		head.next.next.next = new Node(8);
		
		System.out.println("Original");
		display(head);
		
		head = deleteKthNode(head,4);
		display(head);
		head = deleteKthNode(head,1);
		display(head);
		
	}

}
