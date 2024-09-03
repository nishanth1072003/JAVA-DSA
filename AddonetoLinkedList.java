import java.util.*;
/*
 * 
 * Number is represented in linked list such that each digit corresponds to a node in linked list. Add 1 to it. 
 * For example 1999 is represented as (1-> 9-> 9 -> 9) and adding 1 to it should change it to (2->0->0->0) 

Below are the steps : 

Reverse given linked list. For example, 1-> 9-> 9 -> 9 is converted to 9-> 9 -> 9 ->1.
Start traversing linked list from leftmost node and add 1 to it. If there is a carry, move to the next node. Keep moving to the next node while there is a carry.
Reverse modified linked list and return head.
 */

public class AddonetoLinkedList {
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    private static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        return prev;
    }

    public static Node addOne(Node head) {
        head = reverse(head);
        Node curr = head;
        int carry = 1;
        while (curr != null) {
            int sum = curr.val + carry;
            curr.val = sum % 10;
            carry = sum / 10;
            if (carry == 0) {
                break;
            }
            if (curr.next == null && carry > 0) {
                curr.next = new Node(carry);
                carry = 0;
            }
            curr = curr.next;
        }
        head = reverse(head);
        return head;

    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create the linked list 1 -> 2 -> 3 (representing the number 123)
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        System.out.print("Original List: ");
        printList(head);

        // Add 1 to the linked list
        head = addOne(head);

        System.out.print("List after adding 1: ");
        printList(head);
    }

}
