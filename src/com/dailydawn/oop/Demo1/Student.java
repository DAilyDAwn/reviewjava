package com.dailydawn.oop.Demo1;

/**
 * @author <a href="https://dailydawn.github.io/">DAilyDAwn</a>
 * @CreateDate 2023/3/5
 * @ProjectDetails [简单定义几个学生属性并实例化输出]
 */
public class Student {
    String name;
    String sex;
    int age;

    public Student() {
    }

    public Student(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
