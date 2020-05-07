package com.how2java.springboot.socket;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author shkstart
 * @create 2020-04-30 10:30
 */
public class Server {


    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(8888);
            System.out.println("监听在端口号：8888");
            Socket s = ss.accept();
            InputStream is = s.getInputStream();
            DataInputStream dataInputStream = new DataInputStream(is);
//            String msg = dataInputStream.readUTF();
            byte[] bytes = new byte[2000];
            dataInputStream.read(bytes);// 把输入流的数据写入bytes数组中。再依次读取出来即可

            String string = new String(bytes,0,bytes.length);
//            byte bytes = dataInputStream.readByte();
//
            System.out.println(string);
            dataInputStream.close();
            is.close();
            s.close();
            ss.close();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

        }
    }

}
