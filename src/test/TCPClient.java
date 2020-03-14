package test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Auther: hsx
 * @Date: 2020/1/19
 * @Description: test
 * @version: 1.0
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        Socket socket =new Socket("127.0.0.1",65000);
        OutputStream os =socket.getOutputStream();
        InputStream is =socket.getInputStream();
        os.write(new String("hello world").getBytes());
        int ch=0;
        byte[] buff =new byte[1024];
        ch=is.read(buff);
        String content =new String(buff,0,ch);
        System.out.println(content);
        is.close();
        os.close();
        socket.close();
    }
}
