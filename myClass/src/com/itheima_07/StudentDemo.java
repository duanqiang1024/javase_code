package com.itheima_07;
/*
* 创建对象并为成员变量赋值的两种方式
*   1.使用无参构造方法创建对象后使用setXxx()
*   2.使用代参构造方法直接创建带有属性值的对象
* */
public class StudentDemo {
    public static void main(String[] args) {
        //使用无参构造方法创建对象后使用setXxx()
        Student s1  =  new Student();
        s1.setName("林青霞");
        s1.setAge(20);
        s1.show();

        Student s2 = new Student("张曼玉",22);
        s2.show();

        //使用代参构造方法直接创建带有属性值的对象

    }
}
