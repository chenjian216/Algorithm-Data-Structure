package algorithm;

import org.junit.Test;
import algorithm.utils.ArrayGenerator;

import static org.junit.Assert.*;

public class SelectSortTest {
    @Test
    public void sortV1_should_return_sorted_array() {
        Integer[] data = {10, 4, 6, 3, 1, 5};
        Integer[] result = SelectionSort.sortV1(data);
        assertArrayEquals(result, new Integer[]{1, 3, 4, 5, 6, 10});
    }

    @Test
    public void sortV2_should_return_sorted_array() {
        Integer[] data = {10, 4, 6, 3, 1, 5};
        Integer[] result = SelectionSort.sortV2(data);
        assertArrayEquals(result, new Integer[]{1, 3, 4, 5, 6, 10});
    }

    @Test
    public void should_record_sortV2_performance() {
        int n = 10000;
        Integer[] arr = ArrayGenerator.generateRandomArray(n, n);

        long startTime = System.nanoTime();
        SelectionSort.sortV2(arr);
        long endTime = System.nanoTime();

        double time = (endTime - startTime) / 1000000000.0;

        assertTrue(SortingHelper.isSorted(arr));
        System.out.println(time + " s");

    }
}