package com.itheima_06;

/*
* 反转案例
* */
public class ArrayTest01 {
    public static void main(String[] args) {
        int[] arr = {10, 22, 33, 44, 50, 66};

        for (int start = 0, end = arr.length - 1; start <= end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

        }
        //
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i]+", ");
            }
        }
        System.out.println("]");
    }
}
