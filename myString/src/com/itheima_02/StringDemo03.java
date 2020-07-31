package com.itheima_02;

/*
 * 账户登录测试*/

import java.util.Scanner;

public class StringDemo03 {
    private String pwd;

    public static void main(String[] args) {
        //账户密码
        String username = "itheima";
        String password = "czbk";
        //循环遍历
        for (int i = 0; i < 5; i++) {
            //键盘录入要录入的数据
            Scanner sc = new Scanner(System.in);

            System.out.println("请输入用户名：");
            String name = sc.nextLine();

            System.out.println("请输入密码");
            String pwd = sc.nextLine();


            //比较
            if (name.equals(username) && pwd.equals(password)) {
                System.out.println("登录成功");
                break;
            } else {

                if (4 - i == 0) {
                    System.out.println("您的账户被锁定，请联系管理员");
                } else {
                    System.out.println("登录失败，您还有" + (4 - i) + "次机会");
                }
            }

        }


    }
}
