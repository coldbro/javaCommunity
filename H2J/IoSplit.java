package H2J;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class IoSplit {
    public static void main(String[] args) {
        try{
            var file = new File("d:/iotest24545.txt");
            byte[] mes = new byte[1024*1000];
            for(int i = 0 ; i<mes.length;i++){
                mes[i]= (byte)(Math.random()*100);
            }
            var foo = new FileOutputStream(file);
            foo.write(mes);
            foo.close();
            var fi = new FileInputStream(file);
            var messplit = new byte[1024*100];
            int len  ;
            int n = 0;
            while ((len= fi.read(messplit))!=-1) {
                var file2 = new File("d:/io_test" + (n + 1) + ".txt");
                var fos = new FileOutputStream(file2);
                fos.write(messplit, 0, len);
                System.out.println("输出子文件:"+file2.getAbsolutePath()+","+"其大小是:"+file2.length());
                n++;
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
