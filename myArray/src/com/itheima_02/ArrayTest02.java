package com.itheima_02;

public class ArrayTest02 {
    public static void main(String[] args) {
        int[] arr = new int[2];
        int[] arr2 = new int[3];

        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);

        arr[0] = 10;
        arr[1] = 20;

        arr2[0] = 100;
        arr2[1] = 200;
        arr2[2] = 300;
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);


    }
}
