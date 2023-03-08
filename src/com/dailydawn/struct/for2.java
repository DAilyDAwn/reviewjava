package com.dailydawn.struct;

/**
 * @author <a href="https://dailydawn.github.io/">DAilyDAwn</a>
 * @CreateDate 2023/3/1
 * @ProjectDetails [用for循环输出1-1000之间能被5整除的数并每行输出3个]
 */
public class for2 {
    public static void main(String[] args) {
        int tag = 0;
        for (int c = 1; c <= 1000; c++){
            if (c % 5 == 0) {
                System.out.print(c + ",");
                tag++;
            }
            if (tag == 3) {
                System.out.println();
                tag = 0;
            }
        }
    }
}
