package com.itheima_05;

public class ArrayTest01 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        System.out.println("数组长度为："+ arr.length);
        for(int i = 0 ; i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static class ArrayTest02 {
        public static void main(String[] args) {
            int[] arr = {10, 22, 44, 5, 92, 42, 69};
            int min = arr[0];
            int max = arr[0];

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            System.out.println("最小值：" + min);
            System.out.println("最小值：" + max);
        }
    }
}
