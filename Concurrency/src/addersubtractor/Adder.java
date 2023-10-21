package addersubtractor;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{

    private SharedVariable sharedVariable;
    private Lock lock;

    public Adder(SharedVariable sharedVariable, Lock lock) {
        this.sharedVariable = sharedVariable;
        this.lock = lock;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            // Critical section
            lock.lock();
            sharedVariable.i += i;
            lock.unlock();
            System.out.println("Adder worked: "  + i);
        }
    }
}
