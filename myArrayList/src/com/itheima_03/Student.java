package com.itheima_03;

public class Student {
    private String name;
    private String age;

    public Student() {}

    public Student(String name,String age){
        this.age = age;
        this.name = name;

    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return  name;
    }

    public  void setAge(String age){
        this.age = age;
    }

    public  String getAge(){
        return age;
    }
}
