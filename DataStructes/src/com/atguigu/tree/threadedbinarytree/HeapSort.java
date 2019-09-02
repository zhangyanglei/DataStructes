package com.atguigu.tree.threadedbinarytree;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class HeapSort {

    public static void main(String[] args) {
//        int[] arr = {4, 6, 8, 5, 9};
        int[] arr = new int[8000000];
        for (int i = 0; i < 8000000; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(8000000);
        }
        long start = System.currentTimeMillis();
        heapSort(arr);
        System.out.println("耗费的时间=" + (System.currentTimeMillis() - start));
    }

    public static void heapSort(int[] arr) {
        int temp;
        System.out.println("堆排序");
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            adjustHeap(arr, i, arr.length);
        }
        for (int j = arr.length - 1; j > 0; j--) {
            temp = arr[j];
            arr[j] = arr[0];
            arr[0] = temp;
            adjustHeap(arr, 0, j);
        }

    }


    /**
     * @param arr 待调整的数组
     * @param i 表示非叶子节点在数组中索引
     * @param length 表示多少个元素继续调整, length 是在逐渐的减少
     */
    public static void adjustHeap(int[] arr, int i, int length) {
        int temp = arr[i];
        for (int k = 2 * i + 1; k < length; k = k * 2 + 1) {
            if (k + 1 < length && arr[k] < arr[k + 1]) {
                k++;
            }
            if (arr[k] > temp) {
                arr[i] = arr[k];
                i = k;
            } else {
                break;
            }
        }
        arr[i] = temp;
    }

}
