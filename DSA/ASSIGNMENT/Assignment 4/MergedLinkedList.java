package Linked.j.s;
import java.util.Scanner;

//Node class representing each node of the linked list
class Node {
 int value;
 Node next;

 public Node(int value) {
     this.value = value;
     this.next = null;
 }
}

//LinkedList class for inserting and merging
class LinkedList {
 Node head = null;

 // Insert a node at the end of the linked list
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

 // Function to merge two sorted linked lists
 public static Node mergeSortedLists(Node l1, Node l2) {
     // Dummy node to form the merged list
     Node dummy = new Node(-1);
     Node current = dummy;

     // Traverse both lists
     while (l1 != null && l2 != null) {
         if (l1.value <= l2.value) {
             current.next = l1;
             l1 = l1.next;
         } else {
             current.next = l2;
             l2 = l2.next;
         }
         current = current.next;
     }

     // Attach the remaining nodes of l1 or l2
     if (l1 != null) {
         current.next = l1;
     } else if (l2 != null) {
         current.next = l2;
     }

     // Return the merged list starting from the next of dummy node
     return dummy.next;
 }

 // Print the linked list
 public static void printList(Node head) {
     Node temp = head;
     while (temp != null) {
         System.out.print(temp.value + " ");
         temp = temp.next;
     }
     System.out.println();
 }
}

//Main class to take user input and merge the lists
public class MergeLinkedLists {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     LinkedList list1 = new LinkedList();
     LinkedList list2 = new LinkedList();

     // Input for the first list
     System.out.println("Enter the number of nodes in the first linked list:");
     int n1 = scanner.nextInt();
     System.out.println("Enter the values for the first linked list:");
     for (int i = 0; i < n1; i++) {
         int value = scanner.nextInt();
         list1.insertNode(value);
     }

     // Input for the second list
     System.out.println("Enter the number of nodes in the second linked list:");
     int n2 = scanner.nextInt();
     System.out.println("Enter the values for the second linked list:");
     for (int i = 0; i < n2; i++) {
         int value = scanner.nextInt();
         list2.insertNode(value);
     }

     // Merge the two lists
     Node mergedHead = LinkedList.mergeSortedLists(list1.head, list2.head);

     // Output the merged list
     System.out.println("Merged List:");
     LinkedList.printList(mergedHead);

     scanner.close();
 }
}

