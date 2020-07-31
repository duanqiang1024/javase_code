package com.itheima_02;

public class Zi extends Fu{

    public int height = 178;
    public int age = 30;

    public void show(){
        int age = 20;
        System.out.println("局部："+ age);
        System.out.println("本类："+ this.age);
        System.out.println("父部："+ super.age);
        System.out.println(height);
    }
}
