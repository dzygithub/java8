package com.cisco.ds2.sort;

public class InsertSort {

    /**
     * data = new Integer[]{1, 4, 3, 2, 6, 8, 3, 4, 9, 3, 1, 7};
     * assume the first item is the proper location. then verify from the second , if less than first item, then the first item
     * will be move to right. and the first location will be fixed with the second item.
     */
    public static void insertSortOrder(Integer[] arr) {
        Integer target;
        int i, j;
        for (i = 1; i < arr.length; i++) {
            target = arr[i];
            j = i;
            while (j > 0 && target < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = target;
        }
    }

    public static void insertSortOrder1(Integer[] a) {
        int n = a.length;
        int i, j;
        Integer target;
        for (i = 1; i < n; i++) {
            /**
             * temp为本次循环待插入有序列表中的数
             */
            target = a[i];
            int low = 0;
            int high = i - 1;
            /**
             * 寻找temp插入有序列表的正确位置，使用二分查找法
             */
            while (low <= high) {
                /**
                 * 有序数组的中间坐标，此时用于二分查找，减少查找次数
                 */
                int mid = (low + high) / 2;
                /**
                 * 若有序数组的中间元素大于待排序元素，则有序序列向中间元素之前搜索，否则向后搜索
                 */
                if (a[mid] > target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            for (j = i - 1; j >= low; j--) {
                /**
                 * 元素后移，为插入target做准备
                 */
                a[j + 1] = a[j];
            }
            /**
             * 插入temp
             */
            a[low] = target;
        }

    }
}
