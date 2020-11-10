package TcpPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {//创建socket类型的对象，并提供IP地址和端口号
            Socket s = new Socket("localhost", 1999);
            //使用输入输出进行通信
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader br2 = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintStream ps = new PrintStream(s.getOutputStream());
            while (true) {
                System.out.println("输入要发送的内容：");
                String str = br.readLine();
                ps.println(str);
                System.out.println("成功发生数据到服务器");

                if ("bye".equalsIgnoreCase(str)) {
                    break;
                }
                String str2 = br2.readLine();
                System.out.println("服务器发来的消息是" + str2);
            }
            br.close();
            br2.close();
            ps.close();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
