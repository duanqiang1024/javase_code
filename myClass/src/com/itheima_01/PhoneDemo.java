package com.itheima_01;

public class PhoneDemo {
    public static void main(String[] args) {

        // 创建对象
        Phone p = new Phone();

        //使用成员变量
        System.out.println(p.brand);
        System.out.println(p.price);

        p.brand = "华为P30";
        p.price = 4030;

        System.out.println(p.brand);
        System.out.println(p.price);

        //使用成员方法
        p.call();
        p.sengMessage();

    }
}
