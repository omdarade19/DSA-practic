package slow_fast_pointers;

public class palindromLL {
    // leetcode 234

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

        public Node reverseList(Node curr) {
            Node prev = null;

            while (curr != null) {
                Node next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            return prev;
        }

        public boolean isPalindrome(Node head) {

            Node slow = head,
                    fast = head;

            while(fast != null && fast.next != null ){
                slow = slow.next;
                fast = fast.next.next;

            }

            Node p2 = reverseList(slow);
            Node p1 = head;

            while(p1 != null && p2 != null){
                if(p1.data != p2.data){
                    return false;
                }
                p1 = p1.next;
                p2 = p2.next;
            }

            return true;
        }

    public static void main(String[] args) {
        palindromLL list = new palindromLL();

        // Create linked list: 1 -> 2 -> 3 -> 2 -> 1
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        System.out.println(list.isPalindrome(head));  // Expected: true
    }

}

