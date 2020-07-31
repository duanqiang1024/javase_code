package com.itheima_03;

import java.util.Scanner;

public class StringDemo01 {
    public static void main(String[] args) {
        //键盘录入一个字符串
        Scanner sc  = new Scanner(System.in);

        System.out.println("请输入一个字符串");
        String line  = sc.nextLine();

        for (int i = 0;i<line.length();i++){
            System.out.println(line.charAt(i));
        }

        Integer i1 = Integer.valueOf(100);
        System.out.println(i1);
        Integer i2  =Integer.valueOf("1000");
        System.out.println(i2);
    }
}
