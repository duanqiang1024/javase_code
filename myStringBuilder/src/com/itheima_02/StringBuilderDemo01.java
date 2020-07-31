package com.itheima_02;
/*
* StringBuilde 和 String 互换*/
public class StringBuilderDemo01 {
    public static void main(String[] args) {
        //StringBuilder 转换为String
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        System.out.println("sb:"+sb);

        String s = sb.toString();
        System.out.println("s:"+s);
       //String转换为StringBuilder
        String s1 = "hello world";

        StringBuilder sb1 = new StringBuilder(s);
        System.out.println("sb1:"+sb1);

    }
}
