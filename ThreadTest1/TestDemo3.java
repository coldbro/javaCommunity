package ThreadTest1;

public class TestDemo3 {
    public static void main(String[] args) {
        MySleep mySleep1 = new MySleep();
        MySleep mySleep2 =new MySleep();//休眠，过一段时间才执行

        mySleep1.start();
//        try {
//            mysleep1.join();//join，线程执行完以后才能执行下一个线程
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        mySleep2.start();
    }
}
