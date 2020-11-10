package ThreadTest2;

//第二种实现线程的方法
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i+"======"+ Thread.currentThread().getName());
        }
    }
}
