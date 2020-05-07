package rongqi.socket;

import org.junit.Test;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author gaocy
 * @create 2020-05-07 15:07
 */
public class SocketClient {

    @Test
    public void demo(){
        try {
            //连接到本机的8888端口   10.1.198.67:22023
            Socket s = new Socket("10.1.198.67",22023);
            System.out.println(s);
            s.close();
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
