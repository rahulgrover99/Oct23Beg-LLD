package synchronizedIntro;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{

    private SharedVariable sharedVariable;

    public Subtractor(SharedVariable sharedVariable) {
        this.sharedVariable = sharedVariable;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            // Critical section
            synchronized (sharedVariable) {
                sharedVariable.i -= i;
            }
            System.out.println("Subtractor worked: "  + i);
        }
    }
}
