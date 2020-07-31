package com.itheima_03;

/*测试类
 * */
public class PersonDemo {
    public static void main(String[] args) {
        //创建对象
        PingPangPlayer ppp = new PingPangPlayer();
        ppp.setName("王浩");
        ppp.setAge(30);
        System.out.println(ppp.getName() + "," + ppp.getAge());
        ppp.eat();
        ppp.speak();
        ppp.study();
        System.out.println("---------------");

        BasketballPlayer bp = new BasketballPlayer("姚明",30);
        System.out.println(bp.getName()+","+bp.getAge());
        bp.eat();
        bp.study();


    }
}
