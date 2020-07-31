package com.itheima_02;

public class StudentDemo {

    public static void main(String[] args) {

        //使用对象

        Student st = new Student();

        System.out.println(st);

        System.out.println(st.age);
        System.out.println(st.name);

        st.age = 30;
        st.name = "林青霞";

        System.out.println(st.age);
        System.out.println(st.name);

        st.study();
        st.doHomework();
    }
}
