public class Node {
    int data;
    Node next;

    // Default constructor automatically
    // added by java.

    Node() {
        this.data = 0;
        this.next = null;
    }

    Node(int data) {
        this.data = data;
    }

    // Shallow copy since simply copying the reference.
    Node(Node otherNode) {
        this.data = otherNode.data;
//        this.next = otherNode.next;
        if (otherNode.next != null){
            this.next = new Node(otherNode.next);
        }

    }


}
