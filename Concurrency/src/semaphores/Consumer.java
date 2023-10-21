package semaphores;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {

    private Queue<Object> queue;
    private Semaphore consumerSemaphore;
    private Semaphore producerSemaphore;

    public Consumer(Queue<Object> queue, Semaphore consumerSemaphore, Semaphore producerSemaphore) {
        this.queue = queue;
        this.consumerSemaphore = consumerSemaphore;
        this.producerSemaphore = producerSemaphore;
    }

    @Override
    public void run() {
        while(true) {

            try {
                consumerSemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (queue.size() > 0) {
                System.out.println("Object removed by thread: " + Thread.currentThread().getName());
                System.out.println("[CONSUMER] size " + queue.size());
                queue.remove();
            }

            producerSemaphore.release();

        }
    }
}
