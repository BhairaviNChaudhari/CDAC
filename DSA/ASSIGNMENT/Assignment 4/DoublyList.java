package Linked.j.s;

import java.util.Scanner;

import Linked.j.s.SinglyList.Node;


class DoublyL {
	// node class
	static class Node {
		// node class fields
		private int data;
		private Node next;
		private Node prev;

		// node class methods
		public Node() {
			data = 0;
			next = null;
			prev = null;

		}

		public Node(int val) {
			data = val;
			next = null;
			prev = null;
		}
	}

	// list class field
	private Node head;

	// list class methods
	public DoublyL() {
		head = null;
	}

	public void displayForward() {
		System.out.println("Fwd List: ");
		Node trav = head;
		while (trav != null) {
			System.out.println(trav.data);
			trav = trav.next;
		}
	}

	public void displayReverse() {
		//if empty return
		if(head==null) {
			return;
		}
		System.out.println("Rev List: ");
		// traverse till last node
		Node trav = head;
		while (trav.next != null)
			trav = trav.next;
		// print all nodes in rev direction
		while (trav != null) {
			System.out.println(trav.data);
			trav = trav.prev;
		}
	}
	public boolean isEmpty() {
		return head==null;
		
	}

	public void addLast(int val) {
		// create new node and initialize
		Node newNode = new Node(val);
		// Special 1: if list is empty ,make new node as first node
		if(isEmpty()) {
			head = newNode;
		}
		
		// general: add node at end
		else {

			// traverse till last node
			Node trav = head;
			while (trav.next != null)
				trav = trav.next;
			// add new node after trav(trav.next)
			trav.next = newNode;
			//newnode previous to last node trav;
			newNode.prev = trav;
		}
	}
	void addFirst(int val) {
		// create new node;
		Node NewNode = new Node(val);
		//special 1:  if list is empty make new node as fist node
		if (isEmpty()) {
			head = NewNode;
		}
		//general 1: ad node at the start 
		else {
		// new node next should point to head;
		NewNode.next = head;
		//new node prev to head
		head.prev = NewNode;
		//head prev should point to new node
		// head should point to new node
		head = NewNode;
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
			Node temp, trav = head;
			for (int i = 1; i < pos - 1; i++) {
				if (trav.next == null)
					break;
				trav = trav.next;
			}
			//take temp pointer to node after trav
			temp=trav.next;
			// new nodes next should point to trav
			NewNode.next = temp;
			NewNode.prev= trav; 
			// trav next should point to new node
			trav.next = NewNode;
			//temp prev to new node
			temp.prev = NewNode;
			
			if(temp!=null)  //adding to the last
				temp.prev=NewNode;
		
		
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
				trav = trav.next;
			}
			// trav's prev node's next to trav's next node
			 trav.prev.next = trav.next; 
			// trav next  nodes prev to travs prev node 
			 if(trav.next!=null)//special 3 : while deleting last node ,skip next line
			 trav.next.prev=trav.prev;
            //trav node will be auto garbage collected
		
	}
		
	void DeleteFirst(){
		// Special case 1: if list is emty ,throw exception
				if (head == null)
					throw new RuntimeException("List is empty");
				// general case :make head pointing to the next node.
				//if list has single node make head null;
				if( head.next==null) {
					head=null;
				}
				else {
				head = head.next;
				// note:the old first node will be garbage collected
		       //second node  prev should be null
				head.prev=null;
				}
	}
		
	
	void DeleteLast() {
		
	}
	

}

public class DoublyList {
	public static void main(String[] args) {
		int ch, val, pos;
		DoublyL SL = new DoublyL();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println(
					"\n\n0.Exit\n1.Display\n2.Add First\n3. Add last \n4. Add At Pos\n5.Del First \n6.Del Last\n7.Del At Pos \n8. Delete All");
			ch = sc.nextInt();
			switch (ch) {
			case 1: // Display
				SL.displayForward();
				SL.displayReverse();

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
//				break;
			case 6:// Del Last
//				SL.DeleteLast();
//				break;
			case 7:// Del at Pos
				System.out.println("Enter Position: ");
				pos = sc.nextInt();
				SL.DeleteAtPos(pos);
				break;
			case 8:// Delete All
//				SL.DelAll();
//				break;

			}
		} while (ch != 0);
		sc.close();

	}

}
