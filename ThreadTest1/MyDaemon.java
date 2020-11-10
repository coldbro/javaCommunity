package ThreadTest1;

//setDaemon将指定线程标记为守护线程或者后台线程,当运行的线程都是守护线程时，Java虚拟机退出
// 可以理解为主线程消亡后守护线程也消亡
//该方法必须在启动线程前调用
public class MyDaemon extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i+"-----"+getName());
        }
    }
}
