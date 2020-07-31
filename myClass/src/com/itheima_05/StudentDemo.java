package com.itheima_05;

public class StudentDemo {
    public static void main(String[] args) {
        //创建对象
        Student s = new Student();
        //使用set方法给成员变量赋值
        s.setAge(20);
        s.setName("林青霞");

        //调动show方法
        s.show();

    }
}
