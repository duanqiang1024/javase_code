package com.itheima_03;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 1、定义学生类
 * 2、创集合对象
 * 3、键盘录入学生对象所需数据
 * 4、创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
 * 5、往集合中添加学生对象
 * 6、遍历集合，采用通用遍历格式实现
 * */
public class ArrayListTest01 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<Student> array = new ArrayList<>();
        //调用方法
     /*   Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();

        //创建学生对象，把键盘录入的的数据赋值给学生对象的成员变量
        Student s = new Student();
        s.setAge(age);
        s.setName(name);

        //往集合中添加学生对象
        array.add(s);*/

        addStudent(array);
        addStudent(array);
        addStudent(array);
        //遍历集合，采用通用遍历的方式实现
        for (int i = 0; i < array.size(); i++) {
            Student ss = array.get(i);
            System.out.println(ss.getName() + "," + ss.getAge());
        }

    }

    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();

        //创建学生对象，把键盘录入的的数据赋值给学生对象的成员变量
        Student s = new Student();
        s.setAge(age);
        s.setName(name);

        //往集合中添加学生对象
        array.add(s);
    }
}
