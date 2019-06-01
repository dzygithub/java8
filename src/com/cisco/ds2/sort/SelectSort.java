package com.cisco.ds2.sort;

public class SelectSort {


    /**
     * select sort
     * @param data
     */
    public static void selectSortOrder(Integer[] data) {
        Integer temp;
        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] > data[j]) {
                    temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
    }
}
