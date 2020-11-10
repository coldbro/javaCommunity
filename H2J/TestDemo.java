package H2J;

public class TestDemo {
    public static void main(String[] args) {
//        TestDemo2 td2 = new TestDemo2();
//        Thread t1= new Thread(td2,"线程一");
//        t1.start();
        TestDemo3 td3 = new TestDemo3();
        td3.setName("xiancheg");
        td3.start();
    }
}
