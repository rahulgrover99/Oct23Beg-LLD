package mergesort;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SimpleCallableMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();

        Future<Integer> integerFuture =
                executorService.submit(new SimpleCallable());

        System.out.println(integerFuture);

        // Before this both threads working in parallel.
        // Main thread will wait for the other thread to complete.
        System.out.println(integerFuture.get());

        executorService.shutdown();

    }
}
