package Net2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost",5555);
            //读取本地文件
            BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
            BufferedInputStream  bis = new BufferedInputStream(new FileInputStream("d://ioutf.txt"));
            //创建缓冲区

            byte[] by =new byte[1024*8];
            int n =0;
//            读取本地文件
            while((n= bis.read())!=-1){
                //将读取的数据写入指定服务器
                bos.write(by,0,n);
            }
            bos.close();
            bis.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
