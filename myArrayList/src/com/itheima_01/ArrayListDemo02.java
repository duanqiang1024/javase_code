package com.itheima_01;

import java.util.ArrayList;

public class ArrayListDemo02 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<Object> array = new ArrayList<>();
        //添加元素
        array.add("Hello");
        array.add("World");
        array.add("Java");

        //  System.out.println(array.remove("Hello"));
        // System.out.println(array.remove(1));


        // System.out.println(array.set(1,"你好"));
        System.out.println(array.get(1));


        System.out.println("array:" + array);
    }
}
