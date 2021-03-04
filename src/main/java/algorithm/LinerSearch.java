package algorithm;

public class LinerSearch {
    private LinerSearch() {}

    public static int searchIntArray(int[] data, int target) {
        for(int i = 0; i< data.length; i++)
            if(data[i] == target) return i;
        return -1;
    }

    public static <T> int search(T[] data, T target) {
        for(int i = 0; i < data.length; i++)
            if(data[i].equals(target)) return i;
        return -1;
    }
}
