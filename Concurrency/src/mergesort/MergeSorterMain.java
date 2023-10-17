package mergesort;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MergeSorterMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();

        List<Integer> array = List.of(8, 5, 7, 1, 2, 4, 3, 6);

        MergeSorter mergeSorter = new MergeSorter(array, executorService);
        List<Integer> sortedArray = executorService.submit(mergeSorter).get();

        System.out.println(sortedArray);
    }
}
