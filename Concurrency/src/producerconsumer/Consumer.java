package producerconsumer;

import java.util.Queue;

public class Consumer implements Runnable {

    private Queue<Object> queue;

    public Consumer(Queue<Object> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while(true) {
            synchronized (queue) {
                if (queue.size() > 0) {
                    System.out.println("Object removed by thread: " + Thread.currentThread().getName());
                    System.out.println("[CONSUMER] size " + queue.size());
                    queue.remove();
                }
            }

        }
    }
}
