package Linked.j.s;

	import java.util.Scanner;

	// Node class representing each node of the linked list
	class Node {
	    int value;
	    Node next;

	    // Constructor to initialize the node with a value
	    public Node(int value) {
	        this.value = value;
	        this.next = null;
	    }
	}

	// LinkedList class to handle insertion and cycle detection
	class LinkedList {
	    Node head = null;

	    // Insert node at the end of the list
	    public void insertNode(int value) {
	        Node newNode = new Node(value);
	        if (head == null) {
	            head = newNode;
	        } else {
	            Node temp = head;
	            while (temp.next != null) {
	                temp = temp.next;
	            }
	            temp.next = newNode;
	        }
	    }

	    // Create a cycle in the list at a given position
	    public void createCycle(int pos) {
	        if (pos == -1) {
	            return;
	        }
	        Node temp = head;
	        Node cycleNode = null;
	        int count = 0;
	        while (temp.next != null) {
	            if (count == pos) {
	                cycleNode = temp;
	            }
	            temp = temp.next;
	            count++;
	        }
	        temp.next = cycleNode; // Creating the cycle
	    }

	    public boolean detectCycle() {
	        if (head == null) {
	            return false;
	        }
	        Node slow = head;
	        Node fast = head;
	        while (fast != null && fast.next != null) {
	            slow = slow.next;            // Move slow pointer by 1 step
	            fast = fast.next.next;       // Move fast pointer by 2 steps
	            if (slow == fast) {          // If they meet, there's a cycle
	                return true;
	            }
	        }
	        return false; // No cycle detected
	    }
	}

	// Main class to take user input and test the cycle detection
	public class cycle_detect {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        LinkedList list = new LinkedList();

	        System.out.println("Enter the number of nodes in the linked list:");
	        int n = scanner.nextInt();

	        // Inserting nodes into the linked list
	        System.out.println("Enter the values for the linked list:");
	        for (int i = 0; i < n; i++) {
	            int value = scanner.nextInt();
	            list.insertNode(value);
	        }

	   
	        System.out.println("Enter the position to create a cycle (-1 for no cycle):");
	        int pos = scanner.nextInt();
	        list.createCycle(pos);
	        if (list.detectCycle()) {
	            System.out.println("Cycle Detected");
	        } else {
	            System.out.println("No Cycle Detected");
	        }

	        scanner.close();
	    }
	}



