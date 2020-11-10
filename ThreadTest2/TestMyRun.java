package ThreadTest2;

public class TestMyRun {
    public static void main(String[] args) {
        //创建线程对象
        MyRunnable myRunnable = new MyRunnable();
        //创建线程，传递对象
        Thread my1 = new Thread(myRunnable, "线程一");
        Thread my2 = new Thread(myRunnable, "线程二");
        new Thread(new Runnable() {//匿名内部类
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i + Thread.currentThread().getName()+"aaaaa"+i);
                }
            }
        },"线程三").start();
        my1.start();
        my2.start();

    }
}
