class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {
    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);


        Node newNode = new Node(25);

        Node t = head;

        for (int i = 1; i < 2; i++) {
            t = t.next;
        }

        // Insert between
        newNode.next = t.next;
        t.next = newNode;

        // Traversal
        t = head;

        while (t != null) {
            System.out.println(t.data);
            t = t.next;
        }
    }
}
