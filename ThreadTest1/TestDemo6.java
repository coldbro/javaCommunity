package ThreadTest1;

public class TestDemo6 {
    public static void main(String[] args) {
        MyDaemon myDaemon1 = new MyDaemon();
        MyDaemon myDaemon2 = new MyDaemon();
        myDaemon1.setName("小明");
        myDaemon2.setName("小王");
        myDaemon1.setDaemon(true);
        myDaemon2.setDaemon(true);
        myDaemon1.start();
        myDaemon2.start();
        Thread.currentThread().setName("小明小王守护我");
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+i);
        }
    }

}
