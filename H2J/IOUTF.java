package H2J;

import java.io.*;
import java.nio.charset.Charset;

public class IOUTF {
    public static void main(String[] args) {
        var fi = new File("d:/ioutf.txt");
        try( var fos = new FileOutputStream(fi)){
            byte[] b = {(byte)0xE5,(byte)0xb1,(byte)0x8c};
            fos.write(b);
        }catch (IOException e ){e.printStackTrace();}
        try(var isr = new InputStreamReader(new FileInputStream(fi), Charset.forName("UTF-8") )){
            char[] chars = new char[(int)fi.length()];
            isr.read(chars);
            String str = new String(chars);
            System.out.println(str);
        }catch (IOException e ){e.printStackTrace();}

    }
}
