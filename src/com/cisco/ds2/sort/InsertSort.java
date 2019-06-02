package com.cisco.ds2.sort;

import java.util.Arrays;

public class InsertSort {

    /**
     * data = new Integer[]{1, 4, 3, 2, 6, 8, 3, 4, 9, 3, 1, 7};
     * assume the first item is the proper location. then verify from the second , if less than first item, then the first item
     * will be move to right. and the first location will be fixed with the second item.
     */
    public static void insertSortOrder(Integer[] arr) {
        Integer target;
        for (int i = 1, j = i; i < arr.length; j = ++i) {
            target = arr[i];
            while (j > 0 && target < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = target;
        }
    }

    public static void insertSortOrder1(Integer[] a) {
        Integer target;
        int low, high, mid;
        for (int i = 1, j = i; i < a.length; j = ++i) {
            target = a[i];
            low = 0;
            high = i - 1;
            while (low <= high) {
                mid = (low + high) / 2;
                if (a[mid] > target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            while (j > low) {
                a[j] = a[j - 1];
                j--;
            }
            a[low] = target;
        }

    }

    public static void main(String[] args) {
        Integer[] data = new Integer[]{1, 4, 3, 2, 6, 8, 3, 4, 9, 3, 1, 7};
        InsertSort.insertSortOrder1(data);
        Arrays.stream(data).forEach(System.out::print);
    }
}
