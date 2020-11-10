package ThreadTest1;

public class MyPriority extends Thread {
    public MyPriority() {
    }

    public MyPriority(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + i);
        }
    }
}
