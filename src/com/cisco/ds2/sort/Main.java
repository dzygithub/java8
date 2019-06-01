package com.cisco.ds2.sort;

import com.cisco.ds2.utils.MyDate;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Integer[] data = {1, 4, 3, 2, 6, 8, 3, 4, 9, 3, 1, 7};
        BubbleSort.bubbleSortOrder(data);
        Arrays.asList(data).stream().forEach(d -> System.out.print(d));
        System.out.println(" ");

        data = new Integer[]{1, 4, 3, 2, 6, 8, 3, 4, 9, 3, 1, 7};
        SelectSort.selectSortOrder(data);
        Arrays.asList(data).stream().forEach(d -> System.out.print(d));

        System.out.println(" ");
        data = new Integer[]{1, 4, 3, 2, 6, 8, 3, 4, 9, 3, 1, 7};
        InsertSort.insertSortOrder(data);
        Arrays.asList(data).stream().forEach(d -> System.out.print(d));

        System.out.println(" ");
        data = new Integer[]{1, 4, 3, 2, 6, 8, 3, 4, 9, 3, 1, 7};
        InsertSort.insertSortOrder1(data);
        Arrays.asList(data).stream().forEach(d -> System.out.print(d));
        System.out.println("\n===========================================================");

        int number = 100000;
        Integer[] inte = new Integer[number];
        for (int i = 0; i < number; i++) {
            inte[i] = (int) (Math.random() * number);
        }

        Integer[] inte1 = Arrays.copyOf(inte, inte.length);
        MyDate myDate = new MyDate();
        long time1 = myDate.getEpochMilli();
        BubbleSort.bubbleSortOrder(inte1);
        long time2 = myDate.getEpochMilli();
        System.out.println(String.format("\nbubble sort time interval: %d", time2 - time1));

        inte1 = Arrays.copyOf(inte, inte.length);
        time1 = myDate.getEpochMilli();
        SelectSort.selectSortOrder(inte1);
        time2 = myDate.getEpochMilli();
        System.out.println(String.format("\nselect sort time interval: %d", time2 - time1));

        inte1 = Arrays.copyOf(inte, inte.length);
        time1 = myDate.getEpochMilli();
        InsertSort.insertSortOrder(inte1);
        time2 = myDate.getEpochMilli();
        System.out.println(String.format("\ninsert sort time interval: %d", time2 - time1));

        inte1 = Arrays.copyOf(inte, inte.length);
        time1 = myDate.getEpochMilli();
        InsertSort.insertSortOrder1(inte1);
        time2 = myDate.getEpochMilli();
        System.out.println(String.format("\ninsert sort1 time interval: %d", time2 - time1));

        inte1 = Arrays.copyOf(inte, inte.length);
        time1 = myDate.getEpochMilli();
        MergeSort.mergeSort(inte1, 0, inte1.length - 1);
        time2 = myDate.getEpochMilli();
        System.out.println(String.format("\nmerge sort time interval: %d", time2 - time1));

        inte1 = Arrays.copyOf(inte, inte.length);
        time1 = myDate.getEpochMilli();
        Arrays.sort(inte1);
        time2 = myDate.getEpochMilli();
        System.out.println(String.format("\nArrays sort time interval: %d", time2 - time1));
        for (int i = 0; i < 5; i++) {
            System.out.println(inte1[i] + " ");
        }
    }
}
