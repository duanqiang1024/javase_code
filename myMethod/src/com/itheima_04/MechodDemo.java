package com.itheima_04;

public class MechodDemo {
    public static void main(String[] args) {

        int x = sum(1, 2);
        double y = sum(1.0, 2.0);
        int z = sum(1, 2, 3);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }

    //方法1
    public static int sum(int a, int b) {
        return a + b;
    }

    //方法2
    public static double sum(double a, double b) {
        return a + b;
    }

    //方法3
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
}
