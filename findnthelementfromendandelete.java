public class findnthelementfromendanddelete {

    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    private Node head;
    private int length;

    public findnthelementfromendanddelete() {
        this.head = null;
        this.length = 0;
    }

    public void addNode(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        length++;
    }

    public void calculateLength() {
        length = 0;
        Node current = head;

        // Calculate the length of the linked list
        while (current != null) {
            length++;
            current = current.next;
        }
    }

    public void printLinkedList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        FindNthElementFromEndAndDelete linkedList = new FindNthElementFromEndAndDelete();

        // Add elements to the linked list
        linkedList.addNode(1);
        linkedList.addNode(2);
        linkedList.addNode(3);
        linkedList.addNode(4);
        linkedList.addNode(5);

        // Print the linked list
        linkedList.printLinkedList();

        // Calculate the length of the linked list
        linkedList.calculateLength();

        // Print the length
        System.out.println("Length of the linked list: " + linkedList.length);
    }
}
