package com.dailydawn.struct;

/**
 * @author <a href="https://dailydawn.github.io/">DAilyDAwn</a>
 * @CreateDate 2023/3/1
 * @ProjectDetails [九九乘法表]
 */
public class for3 {
    public static void main(String[] args) {
        int c;
        for (int a = 1; a < 10; a++) {
            for (int b = 1; b <= a; b++) {
                c = a * b;
                System.out.print(a + "x" + b + "=" + c + " ");
            }
            System.out.println();
        }
    }
}
