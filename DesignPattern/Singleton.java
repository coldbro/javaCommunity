package DesignPattern;

/*单例模式的特点：
    1单例类只能有一个实例
    2单例类必须自己创建自己的唯一实例
    3单例类必须给所有其他对象提供这一实例
单例模式的关键有两点
    1构造方法为私有，这样外界就不能随意调用
    2get的方法为静态，由类直接调用
* */
//public class Singleton {
//    //饿汉式，自己创建自己的实例,浪费自己的内存空间
//    private static Singleton singleton = new Singleton();
//
//    //构造私有化
//    private Singleton() {
//    }
//    //给外界提供公共方法来创建对象
//    public static Singleton getInstance() {
//        return singleton;
//
//    }
//}
//---------------------------------------------
//public class Singleton {
//    //懒汉式
//    //可能发生线程安全问题，所有要在公共方法上加synchronized
//    private static Singleton singleton = null;
//
//    private Singleton() {
//    }
////给外界提供公共方法创建对象
//    public static synchronized Singleton getInstance() {
//        if(singleton ==null){
//            singleton =new Singleton();
//        }
//        return singleton;
//    }
//}
//------------------------------------------------
public class Singleton {
    //懒汉式
    //可能发生线程安全问题，所有要在公共方法上加synchronized
    private static Singleton singleton = null;

    private Singleton() {
    }

    //给外界提供公共方法创建对象
    public static synchronized Singleton getInstance() {
        if (singleton == null) {
        //双重锁，判断两次
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}