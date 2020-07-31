package com.itheima_05;

public class ArgsDemo01 {
    public static void main(String[] args) {
        int i = 10;
        System.out.println(i);
        change(i);
        System.out.println(i);
    }
    public static void change(int number){
        number = 20;
    }
}
