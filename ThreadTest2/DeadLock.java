package ThreadTest2;

/*同步的弊端
1 效率低
2 如果出现同步嵌套，会出现死锁问题
死锁问题：是指两个或两个以上的的线程在执行的过程中，因争夺资源而产生的一种互相等待的现象
* */
public class DeadLock extends Thread {
    private boolean flag;

    public DeadLock() {
    }

    public DeadLock(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag) {
            synchronized (LockObject.object1) {
                System.out.println("一根筷子");
                synchronized (LockObject.object2) {
                    System.out.println("一把刀");
                }
            }
        } else {
            synchronized (LockObject.object2) {
                System.out.println("一根chazi");
                synchronized (LockObject.object1) {
                    System.out.println("一根筷子");
                }
            }
        }
    }

}
