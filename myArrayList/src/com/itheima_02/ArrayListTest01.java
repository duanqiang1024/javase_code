package com.itheima_02;

import java.util.ArrayList;

public class ArrayListTest01 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<String> array = new ArrayList<>();


        array.add("林青霞");
        array.add("风清扬");
        array.add("任我行");

        for(int i =0 ;i<array.size();i++){
            String s = array.get(i);

            System.out.println(s);
        }

    }
}
