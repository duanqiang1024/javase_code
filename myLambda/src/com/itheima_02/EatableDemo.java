package com.itheima_02;

/*
 * Lambda 表达式，(形式参数)->
      练习：
              1,定义一个接口
              2，定义一个测试类 EatableDemo,提供2个方法
                     一个方法是：useEatable
                     一个方法是主方法，在主方法中调用useEable方法
 * */
public class EatableDemo {
    public static void main(String[] args) {
        //一，接口方式实现 在主方法中调用useEatable
        Eatable e = new EatableImpl();

        useEatable(e);

        //二，匿名内部类
        useEatable(new Eatable() {
            @Override
            public void eat() {
                System.out.println("好好锻炼");
            }
        });

        //Lambda表达式
        useEatable(() -> {
            System.out.println("坚持就是胜利");
        });
    }

    public static void useEatable(Eatable e) {
        e.eat();
    }
}
