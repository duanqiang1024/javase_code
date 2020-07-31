package com.itheima_02;

public class ArrayTest03 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        int[] arr2= arr;
        arr2[0] = 111;
        arr2[1] = 222;
        arr2[2] = 333;
        System.out.println(arr);
        System.out.println(arr2);
        System.out.println(arr[0]);
        System.out.println(arr2[0]);
        System.out.println(arr[2]);
        System.out.println(arr2[2]);


    }
}
