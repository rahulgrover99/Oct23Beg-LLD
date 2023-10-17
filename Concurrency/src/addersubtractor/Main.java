package addersubtractor;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        SharedVariable sharedVariable = new SharedVariable();
        Adder adder = new Adder(sharedVariable);
        Subtractor subtractor = new Subtractor(sharedVariable);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(sharedVariable.i);
    }
}
