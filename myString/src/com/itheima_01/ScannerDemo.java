package com.itheima_01;

import java.util.Scanner;

/*
* Scanner ：
*        用于获取键盘录入数据（基本数据类型、字符串数据）
*
* */
public class ScannerDemo {
    public static void main(String[] args) {

        //创建对象
        Scanner sc  = new Scanner(System.in);

        //接收数据
        System.out.println("请输入一个字符串：");
       //String line =  sc.nextLine();
        //Ctrl  + Alt + A
        String line = sc.nextLine();

        //输出结果
        System.out.println("您输入的结果是："+ line);

    }

}
