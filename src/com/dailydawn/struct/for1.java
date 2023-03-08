package com.dailydawn.struct;

/**
 * @author <a href="https://dailydawn.github.io/">DAilyDAwn</a>
 * @CreateDate 2023/3/1
 * @ProjectDetails [计算0-100奇数和偶数的和]
 */
public class for1 {
    public static void main(String[] args) {
        int oddSum = 0;
        int evenSum = 0;

        for (int count = 0; count <= 100; count++) {
            if (count % 2 == 1) {
                oddSum += count;
            } else {
                evenSum += count;
            }
        }
        System.out.println("奇数和：" + oddSum + "偶数和：" + evenSum);
    }
}
