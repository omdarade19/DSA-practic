package Hashing;
import java.util.LinkedList;

class HashMapImplementation {

    static class Node {
        int key;
        int value;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Node>[] buckets;
    private int capacity;


    public HashMapImplementation(int capacity) {
        this.capacity = capacity;
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    // Hash function
    private int hash(int key) {
        return key % capacity;
    }

    // Put function
    public void put(int key, int value) {
        int index = hash(key);
        LinkedList<Node> bucket = buckets[index];

        for (Node node : bucket) {
            if (node.key == key) {
                node.value = value;
                return;
            }
        }

        bucket.add(new Node(key, value));
    }

    // Get function
    public int get(int key) {
        int index = hash(key);
        LinkedList<Node> bucket = buckets[index];

        for (Node node : bucket) {
            if (node.key == key) {
                return node.value;
            }
        }
        return -1;
    }

    // Remove function
    public void remove(int key) {
        int index = hash(key);
        LinkedList<Node> bucket = buckets[index];

        Node toRemove = null;
        for (Node node : bucket) {
            if (node.key == key) {
                toRemove = node;
                break;
            }
        }
        if (toRemove != null) {
            bucket.remove(toRemove);
        }
    }


    public void display() {
        for (int i = 0; i < capacity; i++) {
            System.out.print("Bucket " + i + ": ");
            for (Node node : buckets[i]) {
                System.out.print("[" + node.key + "=" + node.value + "] ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        HashMapImplementation map = new HashMapImplementation(5);

        map.put(1, 10);
        map.put(2, 20);
        map.put(3, 30);
        map.put(6, 60);

        System.out.println("Value for key 2: " + map.get(2));

        map.display();

        map.remove(2);
        System.out.println("After removing key 2:");
        map.display();
    }
}
