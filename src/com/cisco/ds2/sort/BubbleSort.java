package com.cisco.ds2.sort;

import java.util.Arrays;


/**
 * ascending order
 */
public class BubbleSort {

    /**
     * bubble sort
     * @param data
     */
    public static void bubbleSortOrder(Integer[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1 - i; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;

                }
            }
        }
    }

    /**
     * select sort
     * @param data
     */
    public static void selectSortOrder(Integer[] data) {
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

    public static void main(String[] args) {
        Integer[] data = {1, 4, 3, 2, 6, 8, 3, 4, 9, 3, 1, 7};
        BubbleSort.bubbleSortOrder(data);
        Arrays.asList(data).stream().forEach(d -> System.out.print(d));
        System.out.println(" ");
        data = new Integer[]{1, 4, 3, 2, 6, 8, 3, 4, 9, 3, 1, 7};
        BubbleSort.selectSortOrder(data);
        Arrays.asList(data).stream().forEach(d -> System.out.print(d));
    }
}
