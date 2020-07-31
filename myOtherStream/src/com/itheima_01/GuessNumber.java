package com.itheima_01;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private GuessNumber() {
    }

    public static void start() {
        //要完成猜数字的游戏，首先需要设置一个要猜的数字，使用随机数字生成该数字，范围1-100
        Random r = new Random();
        int number = r.nextInt(100) + 1;

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你要猜的数字");
            int guessNumer = sc.nextInt();

            //比较输入的数字和系统产生的数据，需要分支语句
            if (guessNumer > number) {
                System.out.println("你猜的数字" + guessNumer + "大了");
            } else if (guessNumer < number) {
                System.out.println("你猜的数字" + guessNumer + "小了");
            } else if (guessNumer == number) {
                System.out.println("恭喜你猜中了");
                break;
            }

        }

    }
}
