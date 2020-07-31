package com.itheima_01;

import javax.swing.plaf.TableHeaderUI;

/*
 生产者，消费者 练习
* */
public class BoxDemo {
    public static void main(String[] args) {

        //创建奶箱对象，这是共享数据区域
        Box b = new Box();

        //创建生产者对象，把奶箱对象作为构造方法参数传递，因为在这个类中，要调用存储奶箱的操作
        Producer p = new Producer(b);
       //创建生产者对象，把奶箱对象作为构造方法参数传递，因为在这个类中，要调用存储奶箱的操作
        Customer c = new Customer(b);

        //创建2个线程对象，分别把生产者对象和消费者对象作为构造方法参数传递
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);

        //启动线程
        t1.start();
        t2.start();

    }
}
