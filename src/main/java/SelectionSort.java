import utils.ArrayGenerator;

public class SelectionSort {
    private SelectionSort() {}

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
