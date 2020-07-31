package com.itheima_02;
/*
*服务器：接收数据，给出反馈
* */

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建服务器端的Socket对象（ServerSocket ）
        ServerSocket ss = new ServerSocket(9999);

        //创建服务器监听
        Socket s = ss.accept();

        //获取输入流，读数据，并发数据显示在控制台
        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String data = new String(bys,0,len);
        System.out.println("服务器："+data);
        //给出反馈
        OutputStream os = s.getOutputStream();
        os.write("数据已收到".getBytes());

        ss.close();


    }
}
