package com.itheima_05;
/*
* 应用类型的参数，形式参数的改变，影响实际参数的值
* */
public class ArgsDemo02 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        System.out.println(arr[1]);
        change(arr);
        System.out.println(arr[1]);
    }

    public static void change(int[] arr) {

        arr[1] = 200;
    }
}
