import org.junit.Test;

import static org.junit.Assert.*;

public class SelectSortTest {
    @Test
    public void sortV1_should_return_sorted_array() {
        Integer[] data = {10, 4, 6, 3, 1, 5};
        Integer[] result = SelectSort.sortV1(data);
        assertArrayEquals(result, new Integer[]{1, 3, 4, 5, 6, 10});
    }

    @Test
    public void sortV2_should_return_sorted_array() {
        int[] data = {10, 4, 6, 3, 1, 5};
        int[] result = SelectSort.sortV2(data);
        assertArrayEquals(result, new int[]{1, 3, 4, 5, 6, 10});
    }
}