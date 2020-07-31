package com.itheima_03;

public class MethodDemo {
    public static void main(String[] args) {
        boolean flag = isEventNum(10);
        System.out.println(flag);
    }

    //方法
    public static boolean isEventNum(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
