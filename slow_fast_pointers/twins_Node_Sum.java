package slow_fast_pointers;

public class twins_Node_Sum {
    //Leetcode 2130

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode reverseLL(ListNode curr) {
        ListNode prev = null;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public static int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // find middle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // reverse second half
        ListNode p2 = reverseLL(slow);
        ListNode p1 = head;

        int max = 0;

        while (p2 != null) {
            max = Math.max(max, p1.val + p2.val);
            p1 = p1.next;
            p2 = p2.next;
        }

        return max;
    }

    public static void main(String[] args) {

        // Create linked list: 5 → 4 → 2 → 1
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(4);

        System.out.println(pairSum(head));  // Output: 6  (5+1 or 4+2)
    }
}
