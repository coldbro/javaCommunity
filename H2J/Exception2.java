package H2J;
/*
假设有一个方法 public int method()， 会返回一个整数
在这个方法中有try catch 和 finally.
try 里返回 1
catch 里 返回 2
finally 里 返回3
那么，这个方法到底返回多少？
 */
public class Exception2 {
    public static void main(String[] args) {
       int x =  method();
        System.out.println(x);
    }
    public  static   int method(){
        try{
            return 1;
        }catch (Exception e){
            return 2;
        }
        finally {
            return 3;
        }

    }

}
