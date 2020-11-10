package ThreadTest1;

public class TestDemo5 {
    public static void main(String[] args) {
        MyJoin myJoin1 = new MyJoin();
        MyJoin myJoin2 = new MyJoin();
        MyJoin myJoin3 = new MyJoin();
        myJoin1.start();
        try {
            myJoin1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myJoin2.start();
        myJoin3.start();
    }
}
