package com.itheima_04;

import java.util.ArrayList;

public class ArrayListTest02 {
    public static void main(String[] args) {
        //创建学生类的集合对象
        ArrayList<Student> array = new ArrayList<Student>();

        //创建学生对象
        Student s1 = new Student("林青霞", 30);
        Student s2 = new Student("风清扬", 35);
        Student s3 = new Student("任我行", 45);

        //添加对象
        array.add(s1);
        array.add(s2);
        array.add(s3);

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getName() + "," + s.getAge());
        }

    }
}
