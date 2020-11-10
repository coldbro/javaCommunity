package ThreadTest2;
/*
 wait()等待
 notify()唤醒当个线程
 notifyAll()唤醒全部线程
 wait(),等待需要被唤醒
 sleep()休眠，一定时间后会醒来
* */
public class TestBook {
    public static void main(String[] args) {
        Book book = new Book();
        Production p = new Production(book);
        Consumption c = new Consumption(book);
        Thread threadp = new Thread(p);
        Thread threadc = new Thread(c);
        threadp.start();
        threadc.start();

    }
}
