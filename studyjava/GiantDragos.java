package studyjava;

public class GiantDragos {

    //私有化构造方法使得该类无法在外部通过new 进行实例化
    private GiantDragos() {

    }

    //准备一个类属性，指向一个实例化对象。 因为是类属性，所以只有一个
    private static GiantDragos instance = new GiantDragos();

    //public static 方法，提供给调用者获取12行定义的对象
    public static GiantDragos getInstance() {
        return instance;
    }
}

class GD {
    private GD() {

    }

    private static GD gtest;

    public static GD getGtest() {
        if (null == gtest) {
            GD gd = new GD();
        }
            return gtest;
    }
}