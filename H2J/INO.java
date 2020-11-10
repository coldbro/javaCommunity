package H2J;

import java.io.File;

public class INO {
    public static void main(String[] args) {
        var f1 = new File("d:/绝对路径");
        System.out.println("f1的绝对路径是"+f1.getAbsolutePath());
        var f2 = new File("相对路径");
        System.out.println("这是相对路径f2"+f2.getAbsolutePath());
        File f3 = new File("d:/LOLFolder");
        System.out.println("f3的绝对路径：" + f3.getAbsolutePath());
        // 相对路径,相对于工作目录，如果在eclipse中，就是项目目录
        File f4 = new File("LOL.exe");
        System.out.println("f4的绝对路径：" + f4.getAbsolutePath());
        var f5 = new File(f1,"F1作为父类的路径");
        System.out.println("f5的绝对路径"+f5.getAbsolutePath());
    }
}
