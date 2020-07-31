package com.itheima;

import java.util.Scanner;

public class DebugTest01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个值");
        int a = sc.nextInt();

        System.out.println("请输入第二个值");

        int b = sc.nextInt();
        int max = getMax(a, b);
        System.out.println("最大值是" + max);

    }

    //方法
    public static int getMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
