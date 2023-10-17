package mergesort;

import java.util.ArrayList;
import java.util.List;

public class SimpleSorterMain {
    public static void main(String[] args) {
        List<Integer> array = List.of(8, 5, 7, 1, 2, 4, 3, 6);

        SimpleSorter simpleSorter = new SimpleSorter(array);
        List<Integer> sortedArray = simpleSorter.call();

        System.out.println(sortedArray);
    }
}
