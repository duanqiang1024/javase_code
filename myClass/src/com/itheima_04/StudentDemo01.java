package com.itheima_04;

public class StudentDemo01 {
    public static void main(String[] args) {
        Student s = new Student();

        //
        s.name = "林青霞";
        s.setAge(30);
        System.out.println(s.getAge());

        s.show();


    }
}
