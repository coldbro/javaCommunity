package ThreadCaseFilm;

public class Mycinema2 implements Runnable {
    static int poll = 100;
    Object object = new Object();

    @Override
    public void run() {

        while (true) {
            synchronized (object) {//同步代码块的对象可以是哪些
                if (poll > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在售出第" + (poll--) + " 张票");
                }
            }
        }
    }
}

