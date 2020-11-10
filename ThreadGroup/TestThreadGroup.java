package ThreadGroup;

/*
线程组，把多个线程组合到一起
它可以对一批线程进行分类管理，java允许程序直接对线程进行控制
* */
public class TestThreadGroup {
    public static void main(String[] args) {
//        method1();
        method2();
    }

    public static void method1() {
        MyRunnable m1 = new MyRunnable();
        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m1);
        //返回该线程所属的线程组
        ThreadGroup threadGroup1 = t1.getThreadGroup();
        ThreadGroup threadGroup2 = t2.getThreadGroup();
//getName，返回该线程名称
        System.out.println(threadGroup1.getName());
        System.out.println(threadGroup2.getName());
        //线程默认情况下属于main线程组
        //默认情况下，所有的线程都属于同一个线程组
        //如何修改线程所在的线程组

    }

    public static void method2() {
        ThreadGroup tg = new ThreadGroup("这是一个新的线程组");
        MyRunnable m1 = new MyRunnable();
        Thread t1 = new Thread(tg,m1,"线程一");
        Thread t2 = new Thread(tg,m1,"线程二");
        //返回该线程所属的线程组
        ThreadGroup threadGroup1 = t1.getThreadGroup();
        ThreadGroup threadGroup2 = t2.getThreadGroup();
//getName，返回该线程名称
        System.out.println(threadGroup1.getName());
        System.out.println(threadGroup2.getName());
        //线程默认情况下属于main线程组
        //默认情况下，所有的线程都属于同一个线程组
        //如何修改线程所在的线程组
        // 创建一个线程组
//        创建其他线程的时候，把其他线程组指定为我们新建的线程组
        tg.setDaemon(true);//通过组名称设置后台线程，表示该组线程都是后台线程


    }
}
