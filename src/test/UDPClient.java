package test;

import java.io.IOException;
import java.net.*;

/**
 * @Auther: hsx
 * @Date: 2020/1/19
 * @Description: test
 * @version: 1.0
 */
public class UDPClient {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket =new DatagramSocket();
        byte[] buf ="hello world".getBytes();
        //将IP封装为InetAddress对象
        InetAddress address =InetAddress.getByName("127.0.0.1");
        //将要发送数据封装成DatagramPacket对象，填写上ip地址与端口号
        DatagramPacket packet =new DatagramPacket(buf,buf.length,address,65001);
        socket.send(packet);

        byte[] data =new byte[100];
        //创建DatagramPacket对象来存储服务端发送的数据
        DatagramPacket receivedPacket = new DatagramPacket(data,data.length);
        socket.receive(receivedPacket);
        //将数据取出来并打印
        String content = new String(receivedPacket.getData(),0,receivedPacket.getLength());
        System.out.println(content);
    }
}
