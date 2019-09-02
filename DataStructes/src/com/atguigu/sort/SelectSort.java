package com.atguigu.sort;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class SelectSort {

    public static void main(String[] args) {
//        int[] arr = {101, 34, 119, 1};
//        System.out.println("排序前");
//        System.out.println(Arrays.toString(arr));
        int[] arr = new int[80000];
        for (int i = 0; i < 80000; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(8000000);
        }
        long start = System.currentTimeMillis();
        selectSort(arr);
        System.out.println("耗费的时间=" + (System.currentTimeMillis() - start));
        System.out.println("排序后");
        System.out.println(Arrays.toString(arr));


    }

    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    minIndex = j;
                    min = arr[j];
                }
            }
            if (minIndex != i) {
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
//            System.out.println("第" + (i + 1) + "轮后");
//            System.out.println(Arrays.toString(arr));
        }
    }
}
