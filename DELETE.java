public class DELETE {
    // Node class
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // LinkedList class
    static class LinkedList {
        Node head;

        // Constructor
        public LinkedList() {
            this.head = null;
        }

        // Method to add a new node at the end of the linked list
        public void append(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }

            Node last = head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = newNode;
        }

        // Method to delete a node with a given key
        public void deleteNode(int key) {
            Node temp = head, prev = null;

            // Check if the head itself contains the key
            if (temp != null && temp.data == key) {
                head = temp.next;
                return;
            }

            // Search for the node with the given key
            while (temp != null && temp.data != key) {
                prev = temp;
                temp = temp.next;
            }

            // If the node with the given key is not found
            if (temp == null)
                return;

            // Skip the node with the given key by updating the 'next' pointer of the
            // previous node
            prev.next = temp.next;
        }

        // Method to print the linked list
        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        // Appending nodes to the linked list
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);

        // Printing the original linked list
        System.out.println("Original Linked List:");
        linkedList.printList();

        // Deleting nodes with the given keys
        linkedList.deleteNode(2);
        linkedList.deleteNode(4);

        // Printing the modified linked list
        System.out.println("Modified Linked List:");
        linkedList.printList();
    }
}
