package algorithm;

public class SelectionSort {
    private SelectionSort() {}

    /**
     *
     * 解题思路：
     * 声明一个新数组 tempData，从原数组第一个开始，寻找剩下的元素中最小的暂存在 minNumber 中
     * 每次便利一边之后将 minNumber 按顺序插入 tempData中
     * 时间复杂度为 (n-1) + (n-2) + (n-3) ... + 1 -> n(n-1)/2 -> O(n^2)
     */
    public static Integer[] sortV1(Integer[] data) {
        if(data.length == 0) return data;
        Integer minNumber = data[0];
        int index = 0;
        Integer[] tempData = new Integer[data.length];
        for(int j = 0; j < tempData.length; j ++) {
            for(int i = 0; i < data.length; i++) {
                if(data[i] != null && data[i] <= minNumber) {
                    minNumber = data[i];
                    index = i;
                }
            }
            tempData[j] = minNumber;
            data[index] = null;
            for(int i = 0; i < data.length; i++) {
                if(data[i] != null) {
                    minNumber = data[i];
                    break;
                }
            }
        }
        return tempData;
    }

    /**
     *
     * 解题思路：
     * 从输入图数组中第一个元素开始循环，依次与后面元素作比较，记录下最小元素的index，
     * 循环一次完成后将最小元素与当前元素交换位置，直到所有元素都遍历一遍
     * 时间复杂度为 (n-1) + (n-2) + (n-3) ... + 1 -> n(n-1)/2 -> O(n^2)
     */
    public static Integer[] sortV2(Integer[] data) {
        for(int j = 0; j < data.length; j++) {
            int minIndex = j;
            for(int i = j; i < data.length; i++) {
                if(data[i] < data[minIndex]) {
                    minIndex = i;
                }
            }
            int temp = data[j];
            data[j] = data[minIndex];
            data[minIndex] = temp;
        }
        return data;
    }
}
