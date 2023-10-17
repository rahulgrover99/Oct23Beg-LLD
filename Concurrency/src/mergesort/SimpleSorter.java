package mergesort;

import java.util.ArrayList;
import java.util.List;

public class SimpleSorter {
    List<Integer> array;

    public SimpleSorter(List<Integer> array) {
        this.array = array;
    }

    List<Integer> call() {
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

        SimpleSorter simpleSorter1 = new SimpleSorter(leftArray);
        SimpleSorter simpleSorter2 = new SimpleSorter(rightArray);

        List<Integer> sortedLeftList = simpleSorter1.call();
        List<Integer> sortedRightList = simpleSorter2.call();

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
