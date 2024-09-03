import java.util.*;

public class linkedlist {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // addfirst()
    public static void addfirst(int data) {
        // step1(refer notes)
        Node node = new Node(data);
        if (head == null) {
            head = tail = node;
        }
        // step2
        node.next = head;   
        // step3
        head = node;
    }

    // addlast()
    public static void addlast(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = tail = node;
            tail.next = null;  // Set tail.next to null for the first element
        } else {
            tail.next = node;
            tail = node;
        }
    }

    // print()
    public static void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        linkedlist ll = new linkedlist();
        /* 
        ll.head=new Node(1);
        ll.head.next=new Node(2);
        */
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addlast(3);
        ll.addlast(4);
        ll.print();  
    }
}
