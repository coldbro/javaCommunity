package Net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
建立TCP服务器端思路：
    1创建服务器socket服务，通过Serversocket对象
    2服务器端必须对外提供一个端口，否则客户端无法连接
    3获取连接过来的客户端对象
    4通过客户端对象获取socket流读取客户端发来的数据打印
    5关闭资源，关闭流，关闭服务器
* */
public class Server {
    public static void main(String[] args) {
        //创建ServerSocket类型对象，指定接口
        try {
            ServerSocket ss=new ServerSocket(1234);
            System.out.println("等待客户端连接");
            //等待客户端连接，使用accept();
            Socket s =ss.accept();//进行阻塞
            System.out.println("客户端连接成功");
            //使用字符缓冲输入流接受客户消息
            BufferedReader br =new BufferedReader(new InputStreamReader(s.getInputStream()));
            String str =br.readLine();
            System.out.println("客户端发来的消息是"+str);
            BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bw.write("客户端你好啊");
            bw.newLine();
            bw.flush();
            bw.close();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
