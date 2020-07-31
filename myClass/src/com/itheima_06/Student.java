package com.itheima_06;

public class Student {
    private String name;
    private int age;

    //无参构造方法
    public  Student() {}
   //string 类型构造方法
    public Student(String name) {
        this.name = name;
    }
   //int 类型构造方法
    public Student(int age) {
        this.age = age;
    }
    //String ， int 类型的构造方法
    public Student(String name,int age){
        this.name = name;
        this.age = age;

    }

    public void show() {
        System.out.println(name + "," + age);
    }
}
