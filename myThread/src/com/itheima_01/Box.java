package com.itheima_01;

public class Box {
    //定义一个成员变量，标识第X瓶奶
    private int milk;
    //定义一个成员变量，标识奶箱状态
    private boolean status = false;

    //提供存储牛奶的和获取牛奶的操作
    public synchronized void put(int milk) {
        //如果有牛奶，等待消费
        if (status) {

            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.milk = milk;
        System.out.println("送奶工将第 " + this.milk + " 瓶奶放入奶箱");
        //生产完毕，修改奶箱状态
        status = true;

        //唤醒其他等待线程
        notifyAll();
    }

    public synchronized  void get() {
        //如果没有牛奶，则等待生产
        if (!status) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //如果有牛奶，就消费牛奶
        System.out.println("用户拿到第 " + this.milk + "瓶奶");

        //消费完毕后，修改奶箱状态
        status = false;
        //唤醒其他等待线程
        notifyAll();
    }
}
