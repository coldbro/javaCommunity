package Net;

import java.io.*;
import java.net.Socket;

/*客户端建立思路：
1创建TCP客户端socket服务，使用的是socket对象
2如果连接成功，说明数据传输通道建立
通道就是socket流，是底层建立好的
是流就应该有输入输出
想要获取输入或输入流的对象，可以找socket获取
可以通过getOutputstream()和getInputstream()来获取两个字节流
3使用输入流，讲过数据写入
4关闭资源
* */
public class Client {
    public static void main(String[] args) {


//    Socket(String host,int port);
//    创建socket对象，指定服务器的IP地址和端口号
        try {
            Socket s = new Socket("localhost", 1234);
            //建立连接后通过Socket中的IO流进行数据传输
            //向服务器发生 你好，服务器
            //如果想要使用字符流，需要使用OutputstreamWriter/InputStreamWritezh转换流
            //使用字符缓冲输出流，给服务器发消息
            BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bw .write("你好服务器");
            bw.newLine();
//            bw.flush();//刷新缓冲区
            //解决阻塞状态的方法
            s.shutdownOutput();
            BufferedReader br =new BufferedReader(new InputStreamReader(s.getInputStream()));
            String string = br.readLine();
            System.out.println("服务器发的消息是"+string);
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}