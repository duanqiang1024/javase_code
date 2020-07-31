package com.itheima_03;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;
import java.util.SplittableRandom;

/*字符串反转
 * */
public class StringDemo03 {
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");

        String line = sc.nextLine();
        //调用方法
        System.out.println("反转后的前:" + line);
        line = reverse(line);
        System.out.println("反转后的为:" + line);
        //测试此字符串是否以制定的后缀结尾
        System.out.println(line.endsWith("ba"));

    }

    public static String reverse(String s){
        //循环，从后往前
        String ss = "";
        for(int i = s.length()-1; i >=0 ; i--){
            ss += s.charAt(i);
        }
        return ss;

    }
}
