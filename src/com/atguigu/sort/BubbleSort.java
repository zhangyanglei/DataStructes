package com.atguigu.sort;

import java.util.Arrays;
import java.util.Timer;
import java.util.concurrent.ThreadLocalRandom;

public class BubbleSort {

    public static void main(String[] args) {
//        int[] arr = {3, 9, -1, 10, 20};
//        System.out.println("排序前");
//        System.out.println(Arrays.toString(arr));

        int[] arr = new int[80000];
        for (int i = 0; i < 80000; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(8000000);
        }
        long start = System.currentTimeMillis();
        bubbleSort(arr);
        System.out.println("耗费的时间=" + (System.currentTimeMillis() - start));
        System.out.println("排序后");
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        int temp = 0;
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    flag = true;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
//            System.out.println("第" + (i + 1) + "趟排序后的数组");
//            System.out.println(Arrays.toString(arr));
            if (!flag) {
                break;
            } else {
                flag = false;
            }
        }
    }

}
