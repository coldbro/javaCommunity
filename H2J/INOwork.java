package H2J;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class INOwork {
    public static void main(String[] args) {
        try {
            var fil = new File("d:/1155544.txt");
            byte[] fb = {88, 89};
            FileOutputStream fos = new FileOutputStream(fil);
            fos.write(fb);
            fos.close();
            //            if(!fil.exists()){fil.getParentFile().mkdirs();}
            //如果没有这个文件则自动创建，但是如果d:/adf/how2不存在，则会提示异常
            //1、midir()可创件文件夹，如果父文件夹不存在，则报错
            //
            //File f = new File(“wawa1/wawa2/lol2.txt");
            //if(!f.exists()){
            //    f.mkdir();
            //}
            //运行结果：wawa2文件夹不存在，报错。
            //2、midirs（）创建文件夹，如果父文件夹不存在，则创建父文件夹。
            //
            //File f = new File(“wawa1/wawa2/lol2.txt");
            //if(!f.exists()){
            //    f.mkdirs();
            //}
            //运行结果：这段代码会创建文件夹“/wawa1/wawa2/lol2.txt/”
            //
            //
            //
            //但是，这里显然无法达到创建文件夹的同时创建.txt文件。这里要用到.getParentFile()方法（以文件形式返回获取所在文件夹，）
            //
            //
            //
            //File f = new File(“wawa1/wawa2/lol2.txt");
            //if(!f.exists()){
            //    f.getParentFile().mkdirs();
            //}
            //运行结果：创建“wawa1/wawa2/lol2.txt”

        }
        catch (IOException e){
            e.printStackTrace();
            System.out.println("problem");
        }
    }

    }

