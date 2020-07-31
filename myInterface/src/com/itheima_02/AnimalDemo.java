package com.itheima_02;

/*测试类*/
public class AnimalDemo {
    public static void main(String[] args) {
        //
        Jumpping j = new Cat();
        j.jump();

        Animal a = new Cat();
        a.setAge(5);
        a.setName("加菲猫");
        System.out.println(a.getName() + "," + a.getAge());
        System.out.println("-------------");

        Cat c = new Cat();
        c.setName("加菲猫");
        System.out.println(c.getName() + "," + c.getAge());
        c.eat();
        c.jump();


    }
}
