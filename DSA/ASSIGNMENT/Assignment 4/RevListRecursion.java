package Linked.j.s;

class SinglyRev1 {
	static class Node {
		private int data;
		private Node next;

		public Node() {
			this.data = 0;
			this.next = null;

		}

		public Node(int val) {
			this.data = val;
			this.next = null;

		}

	}

	private Node head;

	public SinglyRev1() {
		head = null;

	}

	public void addlast(int val) {
		Node NewNode = new Node( val); 
		if (head ==null)
			head = NewNode;
		else {
			Node trav = head;
			while (trav.next!=null) 
				trav = trav.next;
			trav.next=NewNode;
			
		}
	}
	public void display() {
		System.out.println("List :");
		Node trav = head;
		while (trav != null) {
			System.out.print(trav.data + " -> ");
			trav = trav.next;
		}

		System.out.println("");
	}
   public int findMisd() {
	   Node fast =head;
	   Node slow = head;
	   while(fast!=null && fast.next!=null) {
		   slow =slow.next;
		   fast= fast.next.next;
		   
	   }
	   return slow.data;
   }
	
}
public class RevListRecursion {
	public static void main(String[] args) {
		SinglyRev1 list = new SinglyRev1();
		list.addlast(6);
		list.addlast(12);
		list.addlast(8);
		list.addlast(9);
		list.addlast(100);
		list.display();
		System.out.println("Middle = "+list.findMisd());
				
	}

}
