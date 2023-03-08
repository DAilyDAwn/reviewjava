package com.dailydawn.javadatastructure;

import java.util.Arrays;

/**
 * @author <a href="https://dailydawn.github.io/">DAilyDAwn</a>
 * @CreateDate 2023/3/8
 * @ProjectDetails [简单选择排序]
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] a = {18, 1, 6, 27, 15};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
    
    public static void sort(int[] arr) {
        int min;
        int k;
        for (int i = 0; i < arr.length - 1; i++) {
            min = arr[i];
            k = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    k = j;
                }
            }
            arr[k] = arr[i];
            arr[i] = min;
        }
    }
}
