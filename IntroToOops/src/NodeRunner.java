public class NodeRunner {
    public static void main(String[] args) {
        Node n1 = new Node();
        System.out.println(n1.data);
        System.out.println(n1.next);

        Node n2 = new Node( 1);
        System.out.println(n2.data);
        System.out.println(n2.next);
        System.out.println(n2.random);
    }
}
