package Net2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(5555);
            System.out.println("等待客户端上传文件:");
            Socket s = ss. accept();
            InputStream is =s.getInputStream();
            //创建字节输出流，向指定服务器中输入用户上传的文件
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("6.txt"));
            byte [] by=new byte[1024*8];
            BufferedInputStream bis =new BufferedInputStream(s.getInputStream());
            int num = 0 ;
            while((num=bis.read())!=-1){
                bos.write(by,0,num);
            }
            bos.close();
            bis.close();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
