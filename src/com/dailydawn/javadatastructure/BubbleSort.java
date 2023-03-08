package com.dailydawn.javadatastructure;

/**
 * @author <a href="https://dailydawn.github.io/">DAilyDAwn</a>
 * @CreateDate 2023/3/4
 * @ProjectDetails [冒泡排序]
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] a = new int[]{4,2,7,1,7,4};
        new BubbleSort().sort(a);
        for (int i : a) {
            System.out.println(i);
        }
    }

    public void sort(int[] array) {
        //添加标志位优化冒泡排序，使不完全倒序的数组不必走完全程
        boolean flag = false;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                int temp = array[j];
                if (temp > array[j + 1]) {
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }
}


