package com.itheima_01;

/*
需求：启动一个线程，在控制台说出一句话，多线程启动了
*/
public class LambdaDemo {
    public static void main(String[] args) {
        //一 实现类的方式，实现去需求
//        MyRunnable mr = new MyRunnable();
//        Thread th = new Thread(mr);
//        th.start();

        //二 匿名内类的方式改进
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("多线程启动了");
//            }
//        }).start();

        //三 Lambda表达式进行改进
        new Thread(() -> {
            System.out.println("多线程启动了");
        }).start();
    }
}
