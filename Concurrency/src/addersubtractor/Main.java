package addersubtractor;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SharedVariable sharedVariable = new SharedVariable();
        Lock lock = new ReentrantLock();
        Adder adder = new Adder(sharedVariable, lock);
        Subtractor subtractor = new Subtractor(sharedVariable, lock);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(sharedVariable.i);
    }
}
