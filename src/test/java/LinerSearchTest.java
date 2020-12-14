import org.junit.Test;

import static org.junit.Assert.*;

public class LinerSearchTest {

    @Test
    public void search_should_get_index_of_target() {
        int[] data = {12, 234, 32, 5, 2, 16, 95, 4};
        assertEquals(LinerSearch.searchIntArray(data, 16), 5);
    }

    @Test
    public void search_should_return_negative_one_when_target_not_found() {
        int[] data = {12, 234, 32, 5, 2, 16, 95, 4};
        assertEquals(LinerSearch.searchIntArray(data, 100), -1);
    }

    @Test
    public void search_should_support_string_array() {
        String[] data = {"12", "1234", "143"};
        assertEquals(LinerSearch.search(data, "1234"), 1);
    }
}