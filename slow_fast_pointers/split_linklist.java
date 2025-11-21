package slow_fast_pointers;

public class split_linklist {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Pair<A, B> {
        A first;
        B second;

        Pair(A first, B second) {
            this.first = first;
            this.second = second;
        }
    }

    static Node createCircular(int[] arr) {
        if (arr.length == 0) return null;

        Node head = new Node(arr[0]);
        Node curr = head;

        for (int i = 1; i < arr.length; i++) {
            curr.next = new Node(arr[i]);
            curr = curr.next;
        }
        curr.next = head;
        return head;
    }
    static Pair<Node, Node> splitList(Node head) {
        if (head == null || head.next == head) {
            return new Pair<>(head, null);
        }

        Node slow = head;
        Node fast = head;

        while (fast.next != head && fast.next.next != head) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node head1 = head;
        Node head2 = slow.next;

        slow.next = head1;

        if (fast.next == head)
            fast.next = head2;
        else
            fast.next.next = head2;

        return new Pair<>(head1, head2);
    }

    static void printCircular(Node head, String tag) {
        System.out.print(tag + ": ");
        if (head == null) {
            System.out.println("EMPTY");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6}; // test case

        Node head = createCircular(arr);

        Pair<Node, Node> result = splitList(head);

        printCircular(result.first, "First Half");
        printCircular(result.second, "Second Half");
    }
}
