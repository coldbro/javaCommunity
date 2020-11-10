package ThreadTest1;

public class TestDemo7 {
    public static void main(String[] args) {
        Mystop mystop1 = new Mystop();
        Mystop mystop2 = new Mystop();
        mystop1.setName("老马");
        mystop2.setName("小马");
//        try {
//            Thread.sleep(1200);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        mystop1.start();
//        mystop1.stop();//线程终止，过时但还可以用的方法
        mystop1.interrupt();//线程中断，抛出异常但是不会停止下来
        mystop2.start();

    }
}
