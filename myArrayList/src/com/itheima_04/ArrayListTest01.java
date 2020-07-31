package com.itheima_04;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;

public class ArrayListTest01 {

    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();

        //往集合中添加字符串对象
        array.add("风清扬");
        array.add("左冷禅");
        array.add("岳不群");

        System.out.println(array.size());

        for (int i = 0;i<array.size();i++){
            System.out.println(array.get(i));
        }

    }
}
