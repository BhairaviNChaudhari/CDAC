package Linked.j.s;
import java.util.Scanner;
class LinkedListRemoveDuplicates {
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

    // Remove duplicates from sorted linked list
    public void removeDuplicates() {
        Node current = head;

        while (current != null && current.next != null) {
            if (current.value == current.next.value) {
                current.next = current.next.next; // Skip duplicate
            } else {
                current = current.next;
            }
        }
    }

    // Print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedListRemoveDuplicates list = new LinkedListRemoveDuplicates();

        System.out.println("Enter the number of nodes:");
        int n = scanner.nextInt();
        System.out.println("Enter the sorted values of the linked list:");
        for (int i = 0; i < n; i++) {
            list.insertNode(scanner.nextInt());
        }

        System.out.println("Original List:");
        list.printList();

        // Remove duplicates and print the updated list
        list.removeDuplicates();
        System.out.println("List after removing duplicates:");
        list.printList();

        scanner.close();
    }
}
