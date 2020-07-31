package com.itheima_01;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class ClinetDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端Socket对象（Socket）

       // Socket s = new Socket(InetAddress.getByName  ("192.168.153.1"), 100000);
        Socket s = new Socket("192.168.0.110", 9999);
        //获取输出流，写数据
        OutputStream os = s.getOutputStream();
        os.write("hello，tcp,我来了".getBytes());

        s.close();
    }
}
