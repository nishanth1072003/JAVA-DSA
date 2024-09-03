class ListNode {
    int val;
    ListNode next;

    public ListNode(int x) {
        val = x;
        next = null;
    }
}

public class detectandremovecycle {
    public ListNode detectAndRemoveCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean hasCycle = false;

        // Detect cycle using Floyd's algorithm
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                hasCycle = true;
                break;
            }
        }

        // If there is a cycle, find the start of the cycle and remove it
        if (hasCycle) {
            slow = head;
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }

            // Now 'slow' points to the start of the cycle
            removeCycle(head, fast);
        }

        return head;
    }

    private void removeCycle(ListNode head, ListNode cycleStart) {
        ListNode ptr1 = head;
        ListNode ptr2 = cycleStart;

        // Move both pointers until they meet at the cycle start node
        while (ptr1.next != ptr2.next) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        // Set the next pointer of the node where the cycle begins to null
        ptr2.next = null;
    }

    public static void main(String[] args) {
        // Example usage:
        Solution solution = new Solution();

        // Create a linked list with a cycle
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = head.next; // Creates a cycle (4 points back to 2)

        // Detect and remove the cycle
        ListNode modifiedHead = solution.detectAndRemoveCycle(head);

        // Display the modified linked list
        while (modifiedHead != null) {
            System.out.print(modifiedHead.val + " ");
            modifiedHead = modifiedHead.next;
        }
    }
}
