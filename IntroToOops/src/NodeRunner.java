public class NodeRunner {
    public static void main(String[] args) {
        Node head = new Node(5);

        Node n1 = new Node(10);

        Node n2 = new Node( 15);

        head.next = n1;
        n1.next = n2;

        Node n4 = new Node(n1);

        n1.next.data = 100;

        // Value would be changed to 100;
        System.out.println(n4.next.data);
    }
}
