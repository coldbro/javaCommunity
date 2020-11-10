package ThreadTest1;
public class TestDemo1 extends Thread{
    public static void main(String[] args) {
        MyThread my1 = new MyThread("线程一");
        MyThread my2 = new MyThread();
        my2.setName("线程二");
//        mythread.run();
//        mythread.run();
//        mythread.start();
//        mythread.start();
        my1.start();
        my2.start();

        //System.out.println(Thread.currentThread().getName());//currentThread()类方法获取当前线程对象。
    }



}