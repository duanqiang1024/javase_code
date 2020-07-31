package com.itheima_03;

public class MethodTest01 {
    public static void main(String[] args) {
        int max = getMax(5, 2);
        System.out.println("max=" + max);
        System.out.println("------------" );
        System.out.println("max=" + getMax(100, 208));
    }

    public static int getMax(int a, int b) {

        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
