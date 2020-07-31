package com.itheima;
/*
* 不死神兔
* */
public class Test01 {
    public static void main(String[] args) {
        int[] arr = new int[20];

        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }
        printArray(arr);

    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            if (i == arr.length - 1) {

                System.out.println(arr[i]);

            } else {
                System.out.println(arr[i] + ", ");
            }

            sum += arr[i];
        }


        System.out.print("]");
        System.out.println("总数为" + sum);
    }
}
