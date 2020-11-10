package H2J;
import java.io.FileNotFoundException;
public class Exce3 {
    public static void main(String[] args){
    try {
    throwCheck(2);
    }catch (Throwable e){
    e.printStackTrace();
    }
    throwRun(-3);
    }
    public static void throwCheck(int a) throws Throwable{
    if(a > 0)
    {throw new Exception("a");
    }
    }
    public static void throwRun(int a){
if(a > -1){
throw new RuntimeException("a > -1");
}
}
}