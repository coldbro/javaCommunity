package ThreadTest2;
/*
    死锁：
    美国人吃饭要一把刀一把叉
    中国人要两根筷子
    但是现在，美国人有一把叉子一根筷子
    中国人有一根筷子一把刀
    都在互相等待
    陷入死锁

* */
public class TestDeadLock {
    public static void main(String[] args) {
        DeadLock deadLock1 = new DeadLock(true);
        deadLock1.start();
        DeadLock deadLock2 = new DeadLock(false);
        deadLock2.start();
    }
}
