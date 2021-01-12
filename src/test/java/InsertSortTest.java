import org.junit.Test;

import static org.junit.Assert.*;

public class InsertSortTest {
    @Test
    public void sortV1_should_return_sorted_array() {
        Integer[] data = {10, 4, 6, 3, 1, 5};
        Integer[] result = InsertSort.sortV1(data);
        assertArrayEquals(result, new Integer[]{1, 3, 4, 5, 6, 10});
    }
}