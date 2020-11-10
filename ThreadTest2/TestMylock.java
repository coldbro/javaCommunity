package ThreadTest2;

public class TestMylock {
    public static void main(String[] args) {
        MyLock myLock = new MyLock();
        Thread m1 =new Thread(myLock,"线程一");
        Thread m2 =new Thread(myLock,"线程二");
        Thread m3 =new Thread(myLock,"线程三");
        m1.start();
        m2.start();
        m3.start();
    }
}
