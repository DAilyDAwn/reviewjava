package com.dailydawn.oop.Demo1;

/**
 * @author <a href="https://dailydawn.github.io/">DAilyDAwn</a>
 * @CreateDate 2023/3/5
 * @ProjectDetails [简单定义几个学生属性并实例化输出]
 */
public class Application {
    public static void main(String[] args) {
        Student student = new Student();
        Student xiaoming = new Student("小明", "男", 100);
        Student xiaohong = new Student("小红", "女", 0);

        System.out.println(student);
        System.out.println(xiaoming);
        System.out.println(xiaohong);
    }
}
