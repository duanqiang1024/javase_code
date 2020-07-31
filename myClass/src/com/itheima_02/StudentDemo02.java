package com.itheima_02;

public class StudentDemo02 {
    public static void main(String[] args) {
        //创建对象
        Student s1 = new Student();
        s1.name  = "林青霞";
        s1.age = 30;
        System.out.println(s1);
        System.out.println(s1.name+", "+s1.age);

        s1.doHomework();
        s1.study();


        Student s2  =new Student();
        s2.name  = "风清扬";
        s2.age = 35;
        System.out.println(s2);
        System.out.println(s2.name+", "+s2.age);

        s2.doHomework();
        s2.study();


    }
}
