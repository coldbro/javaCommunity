package ThreadTest1;

public class TestDemo2 {
    public static void main(String[] args) {
    MyPriority myPriority1 =new MyPriority("线程一1");
    MyPriority myPriority2 =new MyPriority("线程二2");

     myPriority1.setPriority(10);//java抢占式线程调度，线程执行是随机性的，并不是优先级越大，就先执行
     myPriority2.setPriority(2);
     myPriority1.start();
     myPriority2.start();
    }
}
