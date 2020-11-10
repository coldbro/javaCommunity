package UdpTest;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class TestReceive {
    public static void main(String[] args) {
        //创建DatagramSocket类型的对象并提供端口号
        try {
            DatagramSocket ds = new DatagramSocket(4567);
            byte[] data = new byte[1024];
            //创建DatagramPacket类型的对象，用于接收数据内容
            DatagramPacket dp = new DatagramPacket(data, data.length);
            //接收数据并保存到数据报中，使用receive()方法
            ds.receive(dp);
            System.out.println("接收到的的数据是"+new String(data,0,dp.getLength())+"!");
            //关闭套接字
            ds.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
