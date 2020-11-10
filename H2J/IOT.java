package H2J;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOT {
    public static void main(String[] args) throws IOException   {
        File file = new File("d:/io_test.txt");
        FileOutputStream out = new FileOutputStream(file);
        byte[] b =new byte[102400];
        for(int i=0;;i++) {
            var f=new File("d:/io_test"+(i+1)+".txt");
            if(!f.exists()) {
                break;
            }
            if(f.length()<102400) b=new byte[(int)f.length()];
            FileInputStream in = new FileInputStream(f);
            while(in.read(b)!=-1) {
                out.write(b);
            }

        }

        out.close();



    }

}

