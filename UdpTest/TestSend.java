package UdpTest;

import java.net.*;

//发送端
public class TestSend {
    public static void main(String[] args) {

        try {//创建DatagramSocket对象
            DatagramSocket ds = new DatagramSocket();
            byte[] data = "hello".getBytes();
            InetAddress ia = InetAddress.getLocalHost();
            // 创建DatagramPacket类型的对象，提供接收方的端口号和IP地址
            DatagramPacket dp = new DatagramPacket(data, data.length, ia, 4567);
            //发送数据内容
            ds.send(dp);
            System.out.println("成功发送数据");
            ds.close();//关闭套接字

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
