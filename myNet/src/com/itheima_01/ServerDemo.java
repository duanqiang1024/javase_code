package com.itheima_01;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {

        //创建服务器端Socket对象
        ServerSocket ss = new ServerSocket(9999);
        //侦听要连接的
        Socket s = ss.accept();

        //获取输入流，读取数据，并把数据给显示台
        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String data = new String(bys,0,len);
        System.out.println("数据是："+data);

        s.close();
        ss.close();
    }
}
