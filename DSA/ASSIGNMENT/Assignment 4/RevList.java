package Linked.j.s;
//wihout recurasion
class SinglyRev {
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

	public SinglyRev() {
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

	

	public void reverse() {
		//consider current list as old and new list as empty
		Node oldhead=head;
		head = null;
		while(oldhead!=null) {
		//delete 1st(temp) from old list 
		Node temp=oldhead;
		oldhead=oldhead.next;
		
		//addfirst(temp) to new list
		temp.next=head;
		head=temp;
		}//repeat until od list is finisheds
	}
}
public class RevList {
	public static void main(String[] args) {
		SinglyRev list = new SinglyRev();
		list.addlast(6);
		list.addlast(12);
		list.addlast(8);
		list.addlast(9);
		list.addlast(100);
		list.display();
		list.reverse();
		list.display();
		
	}

}
