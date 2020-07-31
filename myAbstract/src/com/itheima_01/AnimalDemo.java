package com.itheima_01;

/* 测试类 */
public class AnimalDemo {
    public static void main(String[] args) {
        //创建对象，按照多态的方式
        Animal a = new Cat();
        a.setAge(5);
        a.setName("加菲猫");

        System.out.println(a.getName() + "," + a.getAge());
        a.eat();

        System.out.println("-------------");

        a = new Cat("唐老鸭",3);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();


    }
}
