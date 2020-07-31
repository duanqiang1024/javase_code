package com.itheima_01;

public class StringBuilderDemo02 {
    public static void main(String[] args) {
        //创建对象
        StringBuilder sb = new StringBuilder();
        System.out.println("sb:"+sb);
        sb.append("hello");
        sb.append("world");
        sb.append("java");
        sb.append("100");

        System.out.println("sb:"+sb);

        //链式编程
        StringBuilder sb2 = new StringBuilder();

        sb2.append("hello").append("world").append("java").append("100");

        System.out.println("sb2:"+sb2);

        //反转
        sb2.reverse();
        System.out.println("sb2:"+sb2);
    }
}
