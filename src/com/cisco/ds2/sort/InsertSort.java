package com.cisco.ds2.sort;

public class InsertSort {

    public InsertSort() {
    }

    /**
     * insert sort
     * @param data
     */
    public static void insertSortOrder(Integer[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] > data[j]) {
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
    }
}
