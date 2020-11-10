package ThreadTest2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyLock implements Runnable {
    int poll = 100;
    Lock lock = new ReentrantLock();//声明lock锁。
    //LOCK 接口
    //Reentrantlock类
    @Override
    public void run() {
        while (true) {
//            synchronized (MyLock.class) {
            lock.lock();//加锁
            if (poll > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "正在售出第" + (poll--) + " 张票");
            }
            lock.unlock();//释放锁

//            }
        }

    }
}
