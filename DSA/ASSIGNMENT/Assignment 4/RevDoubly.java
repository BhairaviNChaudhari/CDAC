package Linked.j.s;

class DoublyLinkedListReverse {
    DoublyNode head = null;

    // Insert node at the end
    public void insert(int value) {
        DoublyNode newNode = new DoublyNode(value);
        if (head == null) {
            head = newNode;
        } else {
            DoublyNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    // Reverse the doubly linked list
    public void reverse() {
        DoublyNode current = head;
        DoublyNode temp = null;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev; // Move to the previous node in the original list
        }

        if (temp != null) {
            head = temp.prev; // Update head to the last node of the original list
        }
    }

    // Traverse and print the list
    public void traverse() {
        DoublyNode temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class RevDoubly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoublyLinkedListReverse dll = new DoublyLinkedListReverse();

        System.out.println("Enter the number of nodes:");
        int n = scanner.nextInt();
        System.out.println("Enter the values to insert:");
        for (int i = 0; i < n; i++) {
            dll.insert(scanner.nextInt());
        }

        System.out.println("Original List:");
        dll.traverse();

        // Reverse and print the reversed list
        dll.reverse();
        System.out.println("Reversed List:");
        dll.traverse();

        scanner.close();
    }
}
