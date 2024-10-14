package Linked.j.s;

import java.util.Scanner;

class SinglyList {
	// Static member class of singly linked list
	static class Node {
		private int data;
		private Node next;

		// node class methods
		public Node() {
			data = 0;
			next = null;
		}

		public Node(int val) {
			data = val;
			next = null;
		}

	}

	// list class field
	private Node head;
	// List class methods

	public SinglyList() { // constructor
		head = null;
	}

	void Display() {
		System.out.println("List: ");
		Node trav = head;
		while (trav != null) {
			System.out.println(trav.data);
			trav = trav.next;
		}
		System.out.println(" ");
	}

	void addFirst(int val) {
		// create new node;
		Node NewNode = new Node(val);
		// new node next should point to head;
		NewNode.next = head;
		// head should point to new node
		head = NewNode;

	}

	void addLast(int val) {
		// create new node and initialize
		Node NewNode = new Node(val);
		// Special 1: if list is empty ,make new node as first node
		if (head == null) {
			head = NewNode;
		}
		// general: add node at end
		else {

			// traverse till last node
			Node trav = head;
			while (trav.next != null)
				trav = trav.next;
			// add new node after trav(trav.next)
			trav.next = NewNode;
		}
	}

	public void AddatPos(int val, int pos) {
		// Special case 1:if list is empty add at first
		// special case 2: if pos<=1,add node ar start
		if (head == null || pos <= 1)
			addFirst(val);
		// else add node at given pos
		else {

			// Allocate and initialize
			Node NewNode = new Node(val);
			// Traverse till pos-1;
			Node trav = head;
			for (int i = 1; i < pos - 1; i++) {
				if (trav.next == null)
					break;
				trav = trav.next;
			}
			// new nodes next should point to trav
			NewNode.next = trav.next;
			// trav next should point to new node
			trav.next = NewNode;
		}
	}

	void DeleteFirst() {
		// Special case 1: if list is emty ,throw exception
		if (head == null)
			throw new RuntimeException("List is empty");
		// general case :make head pointing to the next node.
		head = head.next;
		// note:the old first node will be garbage collected
	}

	void DeleteLast() {
		if (head == null) {
			throw new RuntimeException("List is empty");
		}
		
		Node trav = head;
		while (trav.next.next != null) {
			trav = trav.next;
			}
		// delete last node
		trav.next = null;
	}


	void DeleteAtPos(int pos) {
		// Special case 1: if pos==1 ,delete first node
		if (pos == 1)
			DeleteFirst();
		// Special case 2: if list is empty or pos<1,then throw exception;
		if (head == null || pos <= 1) {
			throw new RuntimeException("List is empty or invalid pos");
		}

		// take temp pointer traversing behind trav;
		Node temp = null, trav = head;
		// traverse till pos;
		for (int i = 0; i < pos; i++) {
			// Special case 3: if pos is beyond list length.then throw exception.
			if (trav == null) {
				throw new RuntimeException("invalis position");
			}
			temp = trav;
			trav = trav.next;
		}
		// trav is node to be deleted $ temp is node before that
		temp.next = trav.next;
		// trav node will be auto garbage collected

	}

	void DelAll() {
		head = null;
		// all node will be garbage collected
	}

}

public class Singly {
	public static void main(String[] args) {
		int ch, val, pos;
		SinglyList SL = new SinglyList();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println(
					"\n\n0.Exit\n1.Display\n2.Add First\n3. Add last \n4. Add At Pos\n5.Del First \n6.Del Last\n7.Del At Pos \n8. Delete All");
			ch = sc.nextInt();
			switch (ch) {
			case 1: // Display
				SL.Display();
				break;
			case 2:// Add First
				System.out.println("Enter at first : ");
				val = sc.nextInt();
				SL.addFirst(val);
				break;
			case 3:// Add last
				System.out.println("Enter At Last: ");
				val = sc.nextInt();
				SL.addLast(val);
				break;
			case 4:// Add At Pos
				System.out.println("Enter Element: ");
				val = sc.nextInt();
				System.out.println("Enter Position: ");
				pos = sc.nextInt();
				SL.AddatPos(val, pos);
				break;
			case 5:// Del First
				try {
					SL.DeleteFirst();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 6:// Del Last
				SL.DeleteLast();
				break;
			case 7:// Del at Pos
				System.out.println("Enter Position: ");
				pos = sc.nextInt();
				SL.DeleteAtPos(pos);
				break;
			case 8:// Delete All
				SL.DelAll();
				break;

			}
		} while (ch != 0);
		sc.close();

	}
}
