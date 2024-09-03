import java.util.*;

public class findmiddle {

    private static class Node {
        int data;
        Node next;

        Node(int val) {
            this.data = val;
            this.next = null;
        }

    }

    public static Node middle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null & fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        Node middlenode = middle(head);
        System.out.print(middlenode.data);
    }

}
