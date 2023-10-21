package producerconsumer;

import java.util.Queue;

public class Producer implements Runnable{

    private Queue<Object> store;
    int maxSize;

    public Producer(Queue<Object> store, int maxSize) {
        this.store = store;
        this.maxSize = maxSize;
    }

    @Override
    public void run() {
        // Busy Waiting
        while(true) {
            synchronized (store) {
                if (store.size() < maxSize) {
                    System.out.println("Object added by " + Thread.currentThread().getName());
                    System.out.println("SIZE: " + store.size());
                    store.add(new Object());
                }
            }

        }
    }
}
