package Linked.j.s;

import java.util.Scanner;

class SinglyCircularList {
	// Node Class
	static class Node {

		// List class fields:
		private int data;
		private Node next;

		// list class method
		public Node() {
			data = 0;
			next = null;
		}

		public Node(int val) {
			data = val;
			next = null;
		}

	}

	private Node head;

	public SinglyCircularList() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void Display() {
		// special case:
		if (isEmpty())
			return;

		System.out.println("List: ");

		// General case
		Node trav = head;
		do {
			System.out.println(trav.data);
			trav = trav.next;

		} while (trav != head);
	}

	public void addLast(int val) {

//	create new node add init it
		Node newNode = new Node(val);

		// sprical case: 1 if list is empry or head = null
		if (isEmpty()) {
			head = newNode;
			newNode.next = head;
		}

//	traverse till last node
		Node trav = head;
		while (trav.next != head) {
			trav = trav.next;
		}

		// newnode next to head
		newNode.next = head;

		// last node's trav to new node
		trav.next = newNode;

	}

	public void addFirst(int val) {
		Node newNode = new Node(val);
		// sprical case: 1 if list is empry or head = null
		if (isEmpty()) {
			head = newNode;
			newNode.next = head;
		}

//		traverse till last node
		Node trav = head;
		while (trav.next != head) {
			trav = trav.next;
		}

		// newnode next to head
		newNode.next = head;

		// last node's trav to new node
		trav.next = newNode; // 72 to 90 same as addLast

		// make head-> newnode
		head = newNode;
	}

	public void AddatPos(int val, int pos) {
		// Special case 1:if list is empty add at first
		// special case 2: if pos<=1,add node ar start
		if (head == null || pos <= 1)
			addFirst(val);
		// else add node at given pos
		else {

			// Allocate and initialize
			Node newNode = new Node(val);
			// Traverse till pos-1;
			Node trav = head;
			for (int i = 1; i < pos - 1; i++) {
				if (trav.next == head)
					break;
				trav = trav.next;
			}
			// new nodes next should point to trav
			newNode.next = trav.next;
			// trav next should point to new node
			trav.next = newNode;
		}
	}

	public void DeleteFirst() {
		// special case 1: if list is empty trow exception
		if (isEmpty()) {
			throw new RuntimeException("empty list!!");
		}
		// special case 2: if list has only one node
		if (head.next == head) {
			head = null;
		}
		// trav till last node
		Node trav = head;

		while (trav.next != head) {
			trav = trav.next;
		}
		// take head to next node
		head = head.next;
		// the last node trav to new head
		trav.next = head;
	}

	public void DeleteAtPos(int pos) {

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
			if (trav == head) {
				throw new RuntimeException("invalis position");
			}
			temp = trav;
			trav = trav.next;
		}
		// trav is node to be deleted $ temp is node before that
		temp.next = trav.next;
		// trav node will be auto garbage collected

	}

	public void DelAll() {
//		convert it innto singly list 
		head.next = null;
//		make head null
		head = null;
	}

	public void DeleteLast() {
		if (head == null) {
			throw new RuntimeException("List is empty");
		}
		
		Node trav = head;
		while (trav.next.next != head) {
			trav = trav.next;
			}
		// delete last node
		trav.next = null;

	}

}

public class SinglyCir {
	public static void main(String[] args) {
		int ch, val, pos;
		SinglyCircularList SL = new SinglyCircularList();
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
//				break;
			case 8:// Delete All
				SL.DelAll();
				break;

			}
		} while (ch != 0);
		sc.close();

	}
}
