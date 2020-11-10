package TcpPractice;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
    要求客户端发送的内容由用户手动输入，使用BufferReader类
    要求服务器收到客户端的消息之后，向客户端发生"I receive！"
    要求服务器和客户端可以不断地进行通信，当客户端发生"bye"的时候结束通话
    要求服务器能够同时支持多给客户端的连接，而且能够和多个客户端同时聊天
    * */
public class Server {
    public static void main(String[] args) {
        try {//创建serversocket类型的对象，并绑定端口
            ServerSocket ss = new ServerSocket(1999);
//            Socket s = ss.accept();//等待客户端的连接请求
//            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
//            //用来接受客户端发来的消息
//            PrintStream ps = new PrintStream(s.getOutputStream());
//            //向客户端发生字符串内容"i receive"
//            while (true) {
//                ps.println("i receive");
//                String str = br.readLine();
//
//                if ("bye".equalsIgnoreCase(str)) {
//                    System.out.println("客户端"+s.getInetAddress()+"下线了");
//                    break;
//                }
//                System.out.println("客户端"+s.getInetAddress()+"发来的消息" + str);
//            }
//            ps.close();
//            br.close();
//            s.close();
            while(true){
                System.out.println("等待客户端的连接");
                Socket s = ss.accept();//等待客户端的连接请求
                System.out.println("客户端"+s.getInetAddress()+"连接成功");
                //只要有新的客户端接入，就创建一个新线程为之服务，主线程仍然接待
                new ServerThread(s).start();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
