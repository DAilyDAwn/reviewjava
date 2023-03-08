package com.dailydawn.scanner;

import java.util.Scanner;

/**
 * @author <a href="https://dailydawn.github.io/">DAilyDAwn</a>
 * @CreateDate 2023/2/27
 * @ProjectDetails [输入多个数字求其和与平均数，每输入一个数用回车确认，通过输入非数字结束输入并输出]
 */
public class SumAverage {
    public static void main(String[] args) {
        int count = 0;
        double sum = 0;
        double average;

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextDouble()) {
            sum += scanner.nextDouble();
            ++count;
        }
        average = sum / count;

        System.out.println("和为：" + sum + "平均值为：" + average);

        scanner.close();
    }
}

