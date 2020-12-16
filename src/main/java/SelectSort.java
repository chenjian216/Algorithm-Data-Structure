import utils.ArrayGenerator;

public class SelectSort {
    private SelectSort() {}

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
}
