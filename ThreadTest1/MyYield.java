package ThreadTest1;

public class MyYield extends Thread {
    public void run() {
        for(int i = 0;i<10;i++){
            System.out.println(i +"---"+getName());
            Thread.yield();//线程礼让暂停当前执行的线程，并执行其他线程，但并不能保证一人一次。
        }
    }
}
