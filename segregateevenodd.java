public class segregateevenodd {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode oddEvenList(ListNode head) {
        ListNode evenHead = null;
        ListNode evenTail = null;
        ListNode oddHead = null;
        ListNode oddTail = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode temp = curr;
            curr = curr.next;
            temp.next = null;

            if (temp.val % 2 == 0) {
                if (evenTail == null) {
                    evenHead = temp;
                    evenTail = temp;
                } else {
                    evenTail.next = temp;
                    evenTail = temp;
                }
            } else {
                if (oddTail == null) {
                    oddHead = temp;
                    oddTail = temp;
                } else {
                    oddTail.next = temp;
                    oddTail = temp;
                }
            }
        }

        // Connect even and odd lists
        if (evenHead != null) {
            evenTail.next = oddHead;
            return evenHead;
        } else {
            return oddHead;
        }
    }

    public static void main(String[] args) {
        segregateevenodd solution = new segregateevenodd();

        // Example linked list: 1 -> 3 -> 5 -> 2 -> 4
        ListNode head = solution.new ListNode(1);
        head.next = solution.new ListNode(3);
        head.next.next = solution.new ListNode(5);
        head.next.next.next = solution.new ListNode(2);
        head.next.next.next.next = solution.new ListNode(4);

        // Call the oddEvenList function
        ListNode result = solution.oddEvenList(head);

        // Print the result
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
