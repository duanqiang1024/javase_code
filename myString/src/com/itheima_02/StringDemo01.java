package com.itheima_02;

/*
 * string 构造方法
 * */
public class StringDemo01 {
    public static void main(String[] args) {
        //空白对象
        String s1 = new String();
        System.out.println("s1" + s1);

        //数组内容
        char[] chs = {'a', 'b', 'c'};
        String s2 = new String(chs);
        System.out.println("s2:" + s2);

        //字节内容
        byte[] bys = {61, 62, 63,64};
        String s3 = new String(bys);
        System.out.println("s3:" + s3);

        //直接赋值
        String s4 = "abcdefg";
        System.out.println("s4:" + s4);
    }
}
