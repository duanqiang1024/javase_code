package com.itheima_01;

import java.util.ArrayList;

public class ArrayListDemo01 {
    public static void main(String[] args) {
        //
        ArrayList<Object> array = new ArrayList<>();

        array.add("Hello");
        array.add("World");
        array.add("Java");
        array.add(1,"你好01");
        array.add(4,"你好04");

        System.out.println("array:"+array);
    }
}
