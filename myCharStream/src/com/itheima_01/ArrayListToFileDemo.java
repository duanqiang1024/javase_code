package com.itheima_01;

import java.io.*;
import java.util.ArrayList;

public class ArrayListToFileDemo {
    public static void main(String[] args) throws IOException {

        //创建集合
        ArrayList<Student> array = new ArrayList<>();
        //创建学生对象
        Student s1 = new Student("itheima01", "林青霞", 30, "西安");
        Student s2 = new Student("itheima02", "张曼玉", 35, "武汉");
        Student s3 = new Student("itheima03", "王祖贤", 33, "郑州");

        array.add(s1);
        array.add(s2);
        array.add(s3);
       //字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("myCharStream\\student.txt"));

        //遍历集合
        for(Student s :array){
            StringBuilder sb  = new StringBuilder();
            sb.append(s.getSid()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getAddress());

            //调节字符缓冲流输出对象的方法写数据
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }
//释放资源
        bw.close();


    }
}
