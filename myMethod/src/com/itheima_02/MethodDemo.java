package com.itheima_02;

public class MethodDemo {
    public static void main(String[] args) {
        //调用方法
        isEvenNumber(88);
    }

    //方法
    public static void isEvenNumber(int number) {
        if (number % 2 == 0) {
            System.out.println("是偶数");
        } else {
            System.out.println("是奇数");
        }
    }
}