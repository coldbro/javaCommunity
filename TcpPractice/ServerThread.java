package TcpPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class ServerThread extends Thread{
    private  Socket s;
    public ServerThread(Socket s){
        this.s =s;

    }

    public ServerThread() {
    }

    @Override
    public void run(){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            //用来接受客户端发来的消息
            PrintStream ps = new PrintStream(s.getOutputStream());
            //向客户端发生字符串内容"i receive"
            while (true) {
                ps.println("i receive");
                String str = br.readLine();

                if ("bye".equalsIgnoreCase(str)) {
                    System.out.println("客户端"+s.getInetAddress()+"下线了");
                    break;
                }
                System.out.println("客户端"+s.getInetAddress()+"发来的消息" + str);
            }
            ps.close();
            br.close();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
