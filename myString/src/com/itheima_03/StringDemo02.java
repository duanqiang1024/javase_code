package com.itheima_03;

import java.util.Scanner;

public class StringDemo02 {
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串字符：");
        String line = sc.nextLine();

        int bignumber = 0;
        int smallnumber = 0;
        int num = 0;

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                bignumber++;
            }else if (ch >='a'&& ch<= 'z'){
                smallnumber ++;
            }else if (ch>= '0'&& ch<='9'){
                num++;
            }


        }

        System.out.println("大写字母:"+bignumber);
        System.out.println("小写字母:"+smallnumber);
        System.out.println("数字:"+num);
    }
}
