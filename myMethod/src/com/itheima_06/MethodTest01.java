package com.itheima_06;

public class MethodTest01 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66};

        pringArray(arr);
    }

    //方法
    public static void pringArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }

        }
        System.out.println("]");
    }
}
