package com.atguigu.sort;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class InsertSort {

    public static void main(String[] args) {
//        int[] arr = {101, 34, 119, 1, -1, 89};
        int[] arr = new int[80000];
        for (int i = 0; i < 80000; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(8000000);
        }
        long start = System.currentTimeMillis();
        insertSort(arr);
        System.out.println("耗费的时间=" + (System.currentTimeMillis() - start));
        System.out.println(Arrays.toString(arr));
    }

    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int insertVal = arr[i];
            int insertIndex = i - 1;
            while (insertIndex >= 0 && insertVal < arr[insertIndex]) {
                arr[insertIndex + 1] = arr[insertIndex];
                insertIndex--;
            }
            if (insertIndex + 1 != i) {
                arr[insertIndex + 1] = insertVal;
            }
        }
    }
}
