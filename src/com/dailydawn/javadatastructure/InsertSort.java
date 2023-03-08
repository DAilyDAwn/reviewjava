package com.dailydawn.javadatastructure;

import java.util.Arrays;

/**
 * @author <a href="https://dailydawn.github.io/">DAilyDAwn</a>
 * @CreateDate 2023/3/8
 * @ProjectDetails [直接插入排序（从右到左地进行比较）]
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] a = new int[]{49, 38, 65, 97, 76, 13, 27, 49};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            //设置temp记录当前需要被排序的元素
            int temp = arr[i];
            //设置j记录当前已排好序的最后一位元素
            int j = i - 1;
            //当temp被排序元素小于已排好序的最后一位元素时，循环的将已排序元素后移一位，直至找到大于的元素
            while (j >= 0 && temp < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }
}
