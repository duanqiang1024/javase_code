package com.itheima_02;

import java.util.Scanner;

/*
StringBuilder   reverse方法实现反转
* */
public class StringBuilderDemo02 {
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);

        System.out.println("请录入字符串");
        String line = sc.nextLine();
        //调用方法
        String s = myReverse(line);
        System.out.println("反转后的字符串为：" + s);


    }

    public static String myReverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String ss = sb.toString();

        return ss;
    }
}
