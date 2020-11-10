package ThreadTest2;

/*
    创建十个线程，五个线程++，五个线程--
    每次运行结果都不一样，因为无法保证每个线程都执行。
    要考虑线程安全问题
    是否是多线程
    是否有共享数据
    是否有多条语句操作共享的数据
    解决方法:把多条语句操作共享数据的代码锁起来，让任意时刻只能有一个线程执行
* */
public class ThreadCase {
    static int num = 0;

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (num % 2 == 0) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        num++;
                    }
                }, "线程" + i).start();
            } else {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        num--;
                    }
                }, "线程" + i).start();

            }
        }
        System.out.println(num);
    }
}
