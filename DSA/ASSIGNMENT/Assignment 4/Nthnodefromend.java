package Linked.j.s;

import java.util.Scanner;

class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}

class LinkedList {
    Node head = null;

    // Insert node at the end
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

    // Function to find nth node from the end
    public void findNthFromEnd(int n) {
        Node first = head;
        Node second = head;
        int count = 0;

        while (count < n) {
            if (second == null) {
                System.out.println("n is greater than the length of the list");
                return;
            }
            second = second.next;
            count++;
        }

        while (second != null) {
            first = first.next;
            second = second.next;
        }

        System.out.println("The " + n + "th node from the end is: " + first.value);
    }
}

public class Nthnodefromend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList list = new LinkedList();

        // Input for the linked list
        System.out.println("Enter the number of nodes:");
        int n = scanner.nextInt();
        System.out.println("Enter the values of the linked list:");
        for (int i = 0; i < n; i++) {
            list.insertNode(scanner.nextInt());
        }

        // Input for the nth position
        System.out.println("Enter the position (n) from the end:");
        int nth = scanner.nextInt();

        // Find the nth node from the end
        list.findNthFromEnd(nth);

        scanner.close();
    }
}
