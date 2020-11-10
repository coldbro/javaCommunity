package ThreadTest1;

public class TestDemo4 {
    public static void main(String[] args) {
        MyYield myYield1 = new MyYield();
        MyYield myYield2 = new MyYield();
        MyYield myYield3  =new MyYield();
            myYield1.setName("刘备");
            myYield2.setName("关羽");
            myYield3.setName("张飞");
            myYield1.start();
            myYield2.start();
            myYield3.start();
    }
}
