package com.itheima_01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class TeacherTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入分数");
        int score = sc.nextInt();

        Teacher t = new Teacher();
        try {
            t.checkScore(score);
        } catch (ScoreException e) {
            e.printStackTrace();
        }

//        Collection<String> c= new ArrayList<String>();
        Collection<String> c = new ArrayList<>();

    }
}
