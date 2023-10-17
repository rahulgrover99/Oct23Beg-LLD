package mergesort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>> {

    List<Integer> array;
    ExecutorService executorService;

    public MergeSorter(List<Integer> array, ExecutorService executorService) {
        this.array = array;
        this.executorService = executorService;
    }

    @Override
    public List<Integer> call() throws Exception {

        System.out.println("SORTER CALLED FOR: " + array + " USING THREAD: " + Thread.currentThread().getName() );
        if (array.size() <= 1) return array;

        int mid = array.size() / 2;

        List<Integer> leftArray = new ArrayList<>();
        for (int i = 0; i < mid; i++) {
            leftArray.add(array.get(i));
        }

        List<Integer> rightArray = new ArrayList<>();
        for (int i = mid; i < array.size(); i++) {
            rightArray.add(array.get(i));
        }

        MergeSorter simpleSorter1 = new MergeSorter(leftArray, executorService);
        MergeSorter simpleSorter2 = new MergeSorter(rightArray, executorService);

        Future<List<Integer>> futureSortedLeftList = executorService.submit(simpleSorter1);
        Future<List<Integer>>  futureSortedRightList = executorService.submit(simpleSorter2);

        List<Integer> sortedLeftList = futureSortedLeftList.get();
        List<Integer> sortedRightList = futureSortedRightList.get();


        List<Integer> sortedArray = new ArrayList<>();
        int i = 0, j = 0;

        while (i < sortedLeftList.size() && j < sortedRightList.size()) {
            if (sortedLeftList.get(i) < sortedRightList.get(j)) {
                sortedArray.add(sortedLeftList.get(i));
                i++;
            } else {
                sortedArray.add(sortedRightList.get(j));
                j++;
            }
        }

        while (i < sortedLeftList.size()) {
            sortedArray.add(sortedLeftList.get(i));
            i++;
        }

        while (j < sortedRightList.size()) {
            sortedArray.add(sortedRightList.get(j));
            j++;
        }

        return sortedArray;
    }
}
