public class Node {
    int data;
    Node next;
    double random;

    // Default constructor automatically
    // added by java.

    Node() {
        this.data = 0;
        this.next = null;
    }

    Node(int data) {
        this.data = data;
    }

    Node(double random, int data) {
        this.random = random;
        this.data = data;
    }

}
