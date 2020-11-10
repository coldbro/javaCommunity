package ThreadCaseFilm;

/* 电影院卖100张票，三个售票窗口，模拟售票详情
 * */
public class Mycinema extends Thread {
    static int poll = 10000000 ;
     static  Object object = new Object();
    @Override
    public void run() {
        while (true) {
            synchronized (object) {//同步代码块的对象可以是哪些
                if (poll > 0) {
                    try {
                        sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName() + "正在售出第" + (poll--) + " 张票");
                }
            }
        }
    }
}
