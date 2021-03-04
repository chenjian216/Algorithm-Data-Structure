package algorithm;

public class InsertSort {
    private InsertSort() {}

    private static <E> void swap(int i, int j, E[] arr) {
        E temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     *
     * 冒泡排序，不多解释，时间复杂度为O(n^2)
     */
    public static <E extends Comparable<E>> E[] sortV1(E[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j > 0; j -- ) {
                if(arr[j].compareTo(arr[j-1]) < 0) {
                    swap(j, j-1, arr);
                }
            }
        }
        return arr;
    }
}
