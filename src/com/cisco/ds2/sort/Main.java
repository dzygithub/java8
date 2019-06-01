package com.cisco.ds2.sort;

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
    }
}
