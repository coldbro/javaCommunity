package ThreadTest1;

public class MyJoin extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i+"===="+getName());//join，线程执行完以后才能执行下一个线程

        }
    }
}
