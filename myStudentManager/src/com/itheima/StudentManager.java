package com.itheima;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        //创建学生对象，由于存储学生数据
        ArrayList<Student> array = new ArrayList<>();

        //用while循环完成再次回到主界面
        while (true) {

            //用输出语句完成主界面的编写
            System.out.println("------------欢迎来到学生管理系统------------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择");

            //用Scanner实现键盘录入
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            //用Switch语句完成操作的选择
            switch (line) {
                case "1":
//                  System.out.println("添加学生");
                    addStudent(array);
                    break;
                case "2":
//                    System.out.println("删除学生");
                    deleteStuent(array);
                    break;
                case "3":
//                    System.out.println("修改学生");
                    updateStudent(array);
                    break;
                case "4":
//                    System.out.println("查看所有学生");
                    findAllStudent(array);
                    break;
                case "5":
                    System.out.println("谢谢使用");
                    System.exit(0);//JVM退出
            }
        }

    }

    //定义一个方法，用于添加学生
    public static void addStudent(ArrayList<Student> array) {
        //键盘录入方法
        Scanner sc = new Scanner(System.in);
        String sid = null;


        //判断学号是否已经被使用
        while (true) {
            System.out.println("请输入学生学号：");
            sid = sc.nextLine();
            boolean flag = isUsed(array, sid);
            if (flag) {
                System.out.println("输入的学号已存在，请重新输入");
            } else {
                break;
            }
        }

        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生居住地：");
        String address = sc.nextLine();

        //创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        //将学生对象添加到集合中
        array.add(s);
        //给出添加成功提示
        System.out.println("添加学生成功");
    }

    //定义一个方法，用于判断学号是否已经被使用
    public static boolean isUsed(ArrayList<Student> array, String sid) {
        boolean flag = false;

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    //定义一个方法，用于查看学生信息
    public static void findAllStudent(ArrayList<Student> array) {

        //判断是否有有信息输出
        if (array.size() == 0) {
            System.out.println("无信息，请重新选择");
            return;
        }
        //显示信息
        System.out.println("学号\t\t姓名\t\t年龄\t\t居住地");
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getSid() + "\t" + s.getName() + "\t" + s.getAge() + "岁\t\t" + s.getAddress());
        }

    }

    //定义一个方法，用于删除学生对象
    public static void deleteStuent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请删除要删除的学生学号");
        String sid = sc.nextLine();

        int index = -1;

        //循环遍历
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                index = i;
//                array.remove(i);
                break;
            }
        }

        if (index == -1) {
            System.out.println("删除信息不存在，请重新输入");
        } else {
            array.remove(index);
            System.out.println("删除学生成功");
        }

    }

    //定义一个方法，用于更新学生对象
    public static void updateStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改学生的学号：");
        String sid = sc.nextLine();
        int index = -1;
        //循环集合遍历
        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            if (student.getSid().equals(sid)) {
                index = i;
//                array.set(i,s);
                break;
            }
        }

        if (index == -1) {
            System.out.println("修改信息不存在，请重新输入");
        } else {
            //输入学生信息
            System.out.println("请输入学生姓名：");
            String name = sc.nextLine();
            System.out.println("请输入学生年龄：");
            String age = sc.nextLine();
            System.out.println("请输入学生地址：");
            String address = sc.nextLine();

            //创建学生对象
            Student s = new Student();
            s.setSid(sid);
            s.setName(name);
            s.setAge(age);
            s.setAddress(address);
            array.set(index, s);
            System.out.println("修改学生信息成功");
        }


    }


}
