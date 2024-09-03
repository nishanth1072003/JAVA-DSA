import java.util.*;

public class lengthofloop {
    // Node class definition
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Method to detect cycle and return the length of the loop
    public static int detectCycleAndGiveLength(Node head) {
        Node slow = head;
        Node fast = head;

        // Step 1: Detect loop using Floyd’s Cycle Detection Algorithm
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                // Loop detected, calculate the length of the loop
                return countLength(slow);
            }
        }
        // If no loop is detected
        return 0;
    }

    // Helper method to count the length of the loop
    private static int countLength(Node loopNode) {
        int length = 1;
        Node current = loopNode.next;

        while (current != loopNode) {
            length++;
            current = current.next;
        }
        return length;
    }

    public static void main(String[] args) {
        // Example: Creating a linked list with a loop
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = head.next; // Creates a loop

        int loopLength = detectCycleAndGiveLength(head);

        if (loopLength > 0) {
            System.out.println("Loop detected with length: " + loopLength);
        } else {
            System.out.println("No loop detected.");
        }
    }
}
