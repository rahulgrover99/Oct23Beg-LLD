package semaphores;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable{

    private Queue<Object> store;
    int maxSize;
    Semaphore producerSemaphore;
    Semaphore consumerSemaphore;

    public Producer(Queue<Object> store, int maxSize, Semaphore producerSemaphore, Semaphore consumerSemaphore) {
        this.store = store;
        this.maxSize = maxSize;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }

    @Override
    public void run() {
        while(true) {
            try {
                producerSemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (store.size() < maxSize) {
                System.out.println("Object added by " + Thread.currentThread().getName());
                System.out.println("SIZE: " + store.size());
                store.add(new Object());
            }
            consumerSemaphore.release();

        }
    }
}
