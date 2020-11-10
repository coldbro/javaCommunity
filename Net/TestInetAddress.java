package Net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestInetAddress {
    public static void main(String[] args) {
        try {
            // 获取本机的主机地址和IP地址信息
            InetAddress inetAddress =InetAddress.getLocalHost();
            System.out.println(inetAddress);//自动调用toString，字符串格式：主机名/IP地址
            //拆分地址信息，分别获得主机名和IP地址，分别打印
            System.out.println(inetAddress.getHostName());
            System.out.println(inetAddress.getHostAddress());
            //根据主机名称获得IP地址
            System.out.println(InetAddress.getByName("LAPTOP-NBFJ0IUK"));
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
