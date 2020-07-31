package com.itheima_01;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = new int[3];
        //输出数组名
        System.out.println(arr);
        //输出数组中的元素
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        arr[0] = 100;
        arr[2] = 200;
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

    }
}
