package com.itheima_03;

public class PingPangPlayer extends Player implements SpeakEnglish{
    public PingPangPlayer() {
    }

    public PingPangPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员练习打乒乓球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃大白菜喝小米粥");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球运动员说英语");
    }
}
