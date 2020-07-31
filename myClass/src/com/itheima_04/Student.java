package com.itheima_04;

public class Student {
    //成员变量
    String name;
    private int age;

    //提供GET/SET方法
    public void setAge(int a) {
        if (a < 0 || a > 120) {
            System.out.println("设置年龄有误");
        } else {
            age = a;
        }
    }

    //GET方法
    public int getAge() {
        return age;
    }

    //方法
    public void show() {
        System.out.println(name + ", " + age);
    }

}
