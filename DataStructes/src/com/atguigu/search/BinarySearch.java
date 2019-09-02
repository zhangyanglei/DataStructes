package com.atguigu.search;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch {

    public static void main(String[] args) {
//        int[] arr = {1, 8, 10, 891, 1000, 1234};
        int[] arr = {1, 8, 10, 89, 1000, 1000, 1000, 1000, 1234};
//        int resIndex = binarySearch(arr, 0, arr.length - 1, 88);
        List<Integer> resIndexList = binarySearch2(arr, 0, arr.length - 1, 1000);
//        System.out.println("resIndex=" + resIndex);
        System.out.println("resIndex=" + resIndexList);
    }

    public static int binarySearch(int[] arr, int left, int right, int findVal) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        int midVal = arr[mid];
        if (findVal > midVal) {
            return binarySearch(arr, mid + 1, right, findVal);
        } else if (findVal < midVal) {
            return binarySearch(arr, left, mid - 1, findVal);
        } else {
            return mid;
        }
    }

    public static List<Integer> binarySearch2(int[] arr, int left, int right, int findVal) {
        if (left > right) {
            return new ArrayList<>();
        }
        int mid = (left + right) / 2;
        int midVal = arr[mid];
        if (findVal > midVal) {
            return binarySearch2(arr, mid + 1, right, findVal);
        } else if (findVal < midVal) {
            return binarySearch2(arr, left, mid - 1, findVal);
        } else {
            List<Integer> resIndexList = new ArrayList<>();
            int temp = mid - 1;
            while (findVal == arr[temp] && temp >= 0) {
                resIndexList.add(temp--);
            }
            resIndexList.add(mid);
            temp = mid + 1;
            while (findVal == arr[temp] && temp <= arr.length - 1) {
                resIndexList.add(temp++);
            }
            return resIndexList;
        }
    }

}
