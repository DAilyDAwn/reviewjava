package com.dailydawn.javadatastructure;

import java.util.Arrays;

/**
 * @author <a href="https://dailydawn.github.io/">DAilyDAwn</a>
 * @CreateDate 2023/3/8
 * @ProjectDetails [快速排序: 设置第一个值为k基准值，i是0，j是array.length - 1，先从后向前j--找比k小的值并覆盖i下标对应元素，再从前往后i++找比k大的值并覆盖j下标对应元素，直至i == j为第一次排序，再对k左右两边的元素递归排序]
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] a = {49, 38, 65, 97, 76, 13, 27, 49};
        sort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] arr, int low, int high) {
        int i = low;
        int j = high;
        //设置递归条件
        if (low < high) {
            //k基准值每次对应每组的第一个值
            int k = arr[i];
            //循环直至i == j时结束
            while (i < j) {
                //从后往前找比k小的
                while (i < j && k <= arr[j]) {
                    j--;
                }
                //找到后因为i没有变动，arr[i]被存在k中，所以覆盖掉arr[i]
                arr[i] = arr[j];
                //从前往后找比k大的
                while (i < j && k >= arr[i]) {
                    i++;
                }
                //找到后因为j没有变动，所以覆盖掉老的arr[j]，新的arr[j]已排到k前
                arr[j] = arr[i];
            }
            //最后覆盖i == j所指元素
            arr[i] = k;
            //递归执行k前半部和后半部
            sort(arr, low, i - 1);
            sort(arr, i + 1, high);
        }
    }

}