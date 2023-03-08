package com.dailydawn.javadatastructure;

import java.util.Arrays;

/**
 * @author <a href="https://dailydawn.github.io/">DAilyDAwn</a>
 * @CreateDate 2023/3/9
 * @ProjectDetails [二分查找 (二分查找需要原数组就有序）]
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {1, 6, 15, 18, 27, 50};
        System.out.println(search(a, 6, 0, a.length - 1));
        System.out.println(recursivelySearch(a, 6, 0, a.length - 1));
        System.out.println(Arrays.binarySearch(a, 6));
    }
    //非递归
    public static int search(int[] arr, int a, int low, int high) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a < arr[mid]) {
                high = mid - 1;
            }
            else if (a > arr[mid]) {
                low = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    //递归
    public static int recursivelySearch(int[] arr, int a, int low, int high) {
        int mid = (low + high) / 2;
        if (low > high){
            return -1;
        }
        if (a < arr[mid]) {
            return search(arr, a, low, mid - 1);
        }
        else if (a > arr[mid]) {
            return search(arr, a, mid + 1, high);
        }
        else {
            return mid;
        }
    }

}
