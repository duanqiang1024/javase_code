package com.itheima_02;

public class MethodTest01 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        //调用方法
        getMax(x, y);
        getMax(10, 30);

    }

    //方法
    public static void getMax(int a, int b) {
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
